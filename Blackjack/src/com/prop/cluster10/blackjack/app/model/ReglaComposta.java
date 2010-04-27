package com.prop.cluster10.blackjack.app.model;

/**
 * 
 * @author Albert De Nova
 *
 */
public class ReglaComposta extends ReglaFinal {

	public static final String OPERACIO_AND = "and";
	public static final String OPERACIO_OR = "or";
	public static final String OPERACIO_XOR = "xor";

	private ReglaFinal primeraRegla;
	private ReglaFinal segonaRegla;
	private String tipusComparacio;

	public ReglaComposta() {
		this.nom = null;
		this.primeraRegla = null;
		this.segonaRegla = null;
		this.tipusComparacio = null;
		this.prioritat = null;
		this.accio = null;
	}

	public ReglaComposta(String nom, ReglaFinal primeraRegla, ReglaFinal segonaRegla, String tipusComparacio,
			Integer prioritat) {
		this.nom = nom;
		this.primeraRegla = primeraRegla;
		this.segonaRegla = segonaRegla;
		this.tipusComparacio = tipusComparacio;
		this.prioritat = prioritat;
	}

	/* GETTERS & SETTERS */
	public ReglaFinal getSegonaRegla() {
		return segonaRegla;
	}

	public void setSegonaRegla(ReglaFinal segonaRegla) {
		this.segonaRegla = segonaRegla;
	}

	public ReglaFinal getPrimeraRegla() {
		return primeraRegla;
	}

	public void setPrimeraRegla(ReglaFinal primeraRegla) {
		this.primeraRegla = primeraRegla;
	}

	public String getTipusComparacio() {
		return tipusComparacio;
	}

	public void setTipusComparacio(String tipusComparacio) {
		this.tipusComparacio = tipusComparacio;
	}

}
