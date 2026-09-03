package com.empresa.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.empresa.model.Departamento;
import com.empresa.model.Municipio;
import com.empresa.service.DepartamentoService;

import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

@Named("deptBean")
@ViewScoped
public class DepartamentoBean implements Serializable {

	private static final long serialVersionUID = 1951928169041881857L;

	private List<Municipio> listaMunicipios = new ArrayList<>();

	private final DepartamentoService departamentoService = new DepartamentoService();

	@PostConstruct
	public void init() {
		try {
			List<Departamento> departamentos = departamentoService
					.procesarMunicipios(getClass().getClassLoader().getResourceAsStream("dep_muni.json"));
			
			System.out.println("cantidad:" + departamentos.size());
			
			for (Departamento d : departamentos) {
				listaMunicipios.addAll(d.getMunicipios());
			}

		} catch (Exception e) {
			System.out.println("error en archivo: " + e.getMessage());
		}

	}

	public List<Municipio> getListaMunicipios() {
		return listaMunicipios;
	}

	public void setListaMunicipios(List<Municipio> listaMunicipios) {
		this.listaMunicipios = listaMunicipios;
	}
	
	

}
