package com.prop.cluster10.common.app.model;

public abstract class ReglaFinal {

	protected String nom;
	protected Integer prioritat;
	protected Accio accio;	
	
	/* GETTERS & SETTERS */
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public Integer getPrioritat() {
		return prioritat;
	}
	
	public void setPrioritat(Integer pes) {
		this.prioritat = pes;
	}
	
	public Accio getAccio() {
		return accio;
	}
	
	public void setAccio(Accio accio) {
		this.accio = accio;
	}
	
	
	
}
