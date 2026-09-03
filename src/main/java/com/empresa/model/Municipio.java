package com.empresa.model;

import java.io.Serializable;
import java.util.Objects;

public class Municipio implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -140231354819325671L;
	private String codMpio;
	private String nombre;
	private String tipoMunicipio;
	private Double longitud;
	private Double latitud;
	private Departamento departamento;
	
	public Municipio() {
		
	}

	public Municipio(String codMpio, String nombre, String tipoMunicipio, Double longitud, Double latitud) {
		
		this.codMpio = codMpio;
		this.nombre = nombre;
		this.tipoMunicipio = tipoMunicipio;
		this.longitud = longitud;
		this.latitud = latitud;
	}

	public String getCodMpio() {
		return codMpio;
	}

	public void setCodMpio(String codMpio) {
		this.codMpio = codMpio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipoMunicipio() {
		return tipoMunicipio;
	}

	public void setTipoMunicipio(String tipoMunicipio) {
		this.tipoMunicipio = tipoMunicipio;
	}

	public Double getLongitud() {
		return longitud;
	}

	public void setLongitud(Double longintud) {
		this.longitud = longintud;
	}

	public Double getLatitud() {
		return latitud;
	}

	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codMpio, latitud, longitud, nombre, tipoMunicipio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Municipio other = (Municipio) obj;
		return Objects.equals(codMpio, other.codMpio) && Objects.equals(latitud, other.latitud)
				&& Objects.equals(longitud, other.longitud) && Objects.equals(nombre, other.nombre)
				&& Objects.equals(tipoMunicipio, other.tipoMunicipio);
	}

	@Override
	public String toString() {
		return  nombre;
	}
	
	
	
	
}
