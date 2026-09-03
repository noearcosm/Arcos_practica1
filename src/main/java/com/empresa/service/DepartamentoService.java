package com.empresa.service;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.empresa.model.Departamento;
import com.empresa.model.Municipio;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DepartamentoService {

	public List<Departamento> procesarMunicipios(InputStream inputStream) throws Exception{
		
		ObjectMapper mapper = new ObjectMapper();
		JsonNode root = mapper.readTree(inputStream);
		
		Map<String, Departamento> mapaDepartamentos =new HashMap<>();
		
		for(JsonNode node : root) {
			String codDpto = node.get("cod_dpto").asText();
			String nombreDpto = node.get("dpto").asText();
			
			Departamento dpto = mapaDepartamentos.get(codDpto);
			
			if(dpto == null) {
				dpto = new Departamento(codDpto,nombreDpto);
				mapaDepartamentos.put(codDpto, dpto);
			}
			
			Municipio m = new Municipio(node.get("cod_mpio").asText(),
					node.get("nom_mpio").asText(),
					node.get("tipo_municipio").asText(),
					Double.valueOf(node.get("longitud").asText().replace(",",".")),
					Double.valueOf(node.get("latitud").asText().replace(",", ".")));
			dpto.agregarMunicipio(m);
		
		}
		
		return new ArrayList<>(mapaDepartamentos.values());
	}
}
