package com.empresa.controller;

import java.io.Serializable;

import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

@Named("mybean")
@ViewScoped
public class Prueba implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String mensaje() {
		return "Hola Mundo Beans";
	}
}
