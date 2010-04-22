/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package PartidaFiveCardDraw;

/**
 *
 * @author Daniel Mulero
 */
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

    public int compareTo (Carta c) {
 		if (c.getValor()==0 || this.valor==0) return -3;
 		else if ((c.getNumero()>this.numero)&&(c.getPal().compareToIgnoreCase(this.pal)!=0)) return -2;
 		else if ((c.getNumero()>this.numero)&&(c.getPal().compareToIgnoreCase(this.pal)==0)) return -1;
 		else if ((c.getNumero()==this.numero)&&(c.getPal().compareToIgnoreCase(this.pal)==0)) return 0;
 		else if ((c.getNumero()<this.numero)&&(c.getPal().compareToIgnoreCase(this.pal)==0)) return 1;
 		else if ((c.getNumero()<this.numero)&&(c.getPal().compareToIgnoreCase(this.pal)!=0)) return 2;
 		else return 3;
 	}
}