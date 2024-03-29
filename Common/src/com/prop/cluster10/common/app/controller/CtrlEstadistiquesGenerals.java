package com.prop.cluster10.common.app.controller;

import java.util.HashMap;

import com.prop.cluster10.common.app.model.EstadistiquesGenerals;
/**
 * @author Albert De Nova
 */
public abstract class CtrlEstadistiquesGenerals {

	private EstadistiquesGenerals estadistiquesGenerals;
		
	public HashMap<String, Object> carregaEstadistiquesGenerals() {		
		return estadistiquesGenerals.carregaEstadistiquesGenerals();
	}
	
	public abstract void guardaEstadistiquesGenerals();
	
	/* GETTERS & SETTERS */
	public EstadistiquesGenerals getEstadistiquesGenerals() {
		return estadistiquesGenerals;
	}

	public void setEstadistiquesGenerals(EstadistiquesGenerals estadistiquesGenerals) {
		this.estadistiquesGenerals = estadistiquesGenerals;
	}
	
}
