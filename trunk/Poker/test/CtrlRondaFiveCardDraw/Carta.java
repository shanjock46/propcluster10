/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package CtrlRondaFiveCardDraw;

/**
 *
 * @author Daniel Mulero
 */
public class Carta {
    private String pal;
    private int numero;
    private int valor;


    public Carta() {
    	pal="";
    	numero=-1;
    	valor=-1;
    }

    public Carta(String p, int n, int v) {
    	pal=p;
    	numero=n;
    	valor=v;
    }

    public String getPal() {
 		return pal;
 	}

    public int getNumero() {
 		return numero;
 	}

    public int getValor() {
 		return valor;
 	}

    public void setPal(String p) {
 		pal=p;
 	}

    public void setNumero(int n) {
 		numero=n;
 	}

    public void setValor(int v) {
 		valor=v;
 	}

    public int compareTo (Carta c) {
 		if (c.getValor()==0 || valor==0) return -3;
 		else if ((c.getNumero()>numero)&&(c.getPal().compareToIgnoreCase(pal)!=0)) return -2;
 		else if ((c.getNumero()>numero)&&(c.getPal().compareToIgnoreCase(pal)==0)) return -1;
 		else if ((c.getNumero()==numero)&&(c.getPal().compareToIgnoreCase(pal)==0)) return 0;
 		else if ((c.getNumero()<numero)&&(c.getPal().compareToIgnoreCase(pal)==0)) return 1;
 		else if ((c.getNumero()<numero)&&(c.getPal().compareToIgnoreCase(pal)!=0)) return 2;
 		else return 3;
 	}
}