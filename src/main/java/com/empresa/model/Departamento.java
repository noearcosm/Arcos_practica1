package com.empresa.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Departamento implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3706860211636927954L;
	private String codDpto;
	private String nombre;
	private List<Municipio> municipios = new ArrayList<>();
	
	public Departamento() {
	
	}

	public Departamento(String codDpto, String nombre) {
		super();
		this.codDpto = codDpto;
		this.nombre = nombre;
	}

	public String getCodDpto() {
		return codDpto;
	}

	public void setCodDpto(String codDpto) {
		this.codDpto = codDpto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Municipio> getMunicipios() {
		return municipios;
	}

	public void setMunicipios(List<Municipio> municipios) {
		this.municipios = municipios;
	}
	
	public void agregarMunicipio(Municipio nuevo) {
		this.municipios.add(nuevo);
		nuevo.setDepartamento(this);
	}

	@Override
	public int hashCode() {
		return Objects.hash(codDpto, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Departamento other = (Departamento) obj;
		return Objects.equals(codDpto, other.codDpto) && Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return  nombre;
	}
	
	
}
