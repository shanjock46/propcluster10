package com.prop.cluster10.common.test.app.model.estrategia;

import java.util.ArrayList;

public class JugadorStub {
	
    protected String nom;
    protected int cash;
    protected int aposta;
    protected EstadistiquesStub est;
    protected ArrayList<CartaStub> ma;
    
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getCash() {
		return cash;
	}
	public void setCash(int cash) {
		this.cash = cash;
	}
	public int getAposta() {
		return aposta;
	}
	public void setAposta(int aposta) {
		this.aposta = aposta;
	}
	public EstadistiquesStub getEst() {
		return est;
	}
	public void setEst(EstadistiquesStub est) {
		this.est = est;
	}
	public ArrayList<CartaStub> getMa() {
		return ma;
	}
	public void setMa(ArrayList<CartaStub> ma) {
		this.ma = ma;
	}
}
