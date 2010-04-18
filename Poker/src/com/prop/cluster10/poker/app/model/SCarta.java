/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.prop.cluster10.poker.app.model;

/**
 *
 * @author Dani
 */
public class SCarta {
    private String pal;
    private int numero;
    private int valor;

    public void testEscriuCarta() throws Exception {
                inout io = new inout();
                io.write("Pal: ");
                io.write(pal);
                io.write("   Numero: ");
                io.write(numero);
                io.write("   Valor: ");
                io.writeln(valor);
        }

    public SCarta(String p, int n, int v) {
    	this.pal=p;
    	this.numero=n;
    	this.valor=v;
    }

    public String getPal() {
 		return "hola";
 	}

    public int getNumero() {
 		return 1;
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

    public int compareTo (Carta c) {
 		return 0;
 	}
}