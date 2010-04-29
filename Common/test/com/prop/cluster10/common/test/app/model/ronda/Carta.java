package com.prop.cluster10.common.test.app.model.ronda;

public class Carta {
    private String pal;
    private int numero;
    private int valor;


    public Carta() {
    	this.pal="";
    	this.numero=-1;
    	this.valor=-1;
    }

    public Carta(String p, int n, int v) {
    	this.pal=p;
    	this.numero=n;
    	this.valor=v;
    }

    public String getPal() {
 		return this.pal;
 	}

    public int getNumero() {
 		return this.numero;
 	}

    public int getValor() {
 		return this.valor;
 	}

    public void setPal(String p) {
 		this.pal=p;
 	}

    public void setNumero(int n) {
 		this.numero=n;
 	}

    public void setValor(int v) {
 		this.valor=v;
 	}
}
