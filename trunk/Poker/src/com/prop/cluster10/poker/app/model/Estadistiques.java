/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.prop.cluster10.poker.app.model;

/**
 *
 * @author Martina Canyelles
 */
public class Estadistiques {
    private int partidesJugades;
    private int partidesGuanyades;
    private int partidesEliminat;
    private int rondesJugades;
    private int rondesGuanyades;
    private int rondesPerdudes;
    private int fitxesGuanyades;


    public int getPartidesJugades() {
        return partidesJugades;
    }

    public void setPartidesJugades(int partidesJugades) {
        this.partidesJugades = partidesJugades;
    }

    public int getPartidesGuanyades() {
        return partidesGuanyades;
    }

    public void setPartidesGuanyades(int partidesGuanyades) {
        this.partidesGuanyades = partidesGuanyades;
    }

    public int getPartidesEliminat() {
        return partidesEliminat;
    }

    public void setPartidesEliminat(int partidesEliminat) {
        this.partidesEliminat = partidesEliminat;
    }

    public int getRondesJugades() {
        return rondesJugades;
    }

    public void setRondesJugades(int rondesJugades) {
        this.rondesJugades = rondesJugades;
    }

    public int getRondesGuanyades() {
        return rondesGuanyades;
    }

    public void setRondesGuanyades(int rondesGuanyades) {
        this.rondesGuanyades = rondesGuanyades;
    }

    public int getRondesPerdudes() {
        return rondesPerdudes;
    }

    public void setRondesPerdudes(int rondesPerdudes) {
        this.rondesPerdudes = rondesPerdudes;
    }

    public int getFitxesGuanyades() {
        return fitxesGuanyades;
    }

    public void setFitxesGuanyades(int fitxesGuanyades) {
        this.fitxesGuanyades = fitxesGuanyades;
    }

    public int percentatgePartidesGuanyades() {
        if (this.getPartidesJugades()==0) return 0;
        else return ((this.getPartidesGuanyades())/(this.getPartidesJugades())*100);
    }

    public int percentatgePartidesPerdudes() {
        if (this.getPartidesJugades()==0) return 0;
        else return ((this.getPartidesEliminat())/(this.getPartidesJugades())*100);
    }

    public double coeficientEfectivitatPartides() {
        if (this.getPartidesEliminat()==0 ) return 0;
        else return (this.getPartidesGuanyades()/this.getPartidesEliminat());
    }

    public int percentatgeRondesGuanyades() {
        if (this.getRondesJugades()==0) return 0;
        else return ((this.getRondesGuanyades())/(this.getRondesJugades())*100);
    }

    public int percentatgeRondesPerdudes() {
        if (this.getRondesJugades()==0) return 0;
        else return ((this.getRondesPerdudes())/(this.getRondesJugades())*100);
    }

    public double coeficientEfectivitatRondes() {
        if (this.getRondesPerdudes()==0 ) return 0;
        else return (this.getRondesGuanyades()/this.getRondesPerdudes());
    }

    public double mitjanaRondesGuanyadesPartida() {
        if (this.getPartidesGuanyades()==0) return 0;
        else return (this.getRondesGuanyades()/this.getPartidesGuanyades());
    }

    public void actualitzaFiRonda(boolean r, int e) {
        this.setRondesJugades(this.getRondesJugades()+1);
        this.setFitxesGuanyades(this.getFitxesGuanyades()+e);
        if (r) this.setRondesGuanyades(this.getRondesGuanyades()+1);
        else this.setRondesPerdudes(this.getRondesPerdudes()+1);
    }

    public void actualitzaFiPartida(boolean p) {
        this.setPartidesJugades(this.getPartidesJugades()+1);
        if (p) this.setPartidesGuanyades(this.getPartidesGuanyades()+1);
        else this.setPartidesEliminat(this.getPartidesEliminat()+1);
    }

    public double[] carregaEstadistiques() {
        double[] res=new double[14];
        res[0]=this.partidesJugades;
        res[1]=this.partidesGuanyades;
        res[2]=this.partidesEliminat;
        res[3]=this.rondesJugades;
        res[4]=this.rondesGuanyades;
        res[5]=this.rondesPerdudes;
        res[6]=this.fitxesGuanyades;
        res[7]=this.percentatgePartidesGuanyades();
        res[8]=this.percentatgePartidesPerdudes();
        res[9]=this.percentatgeRondesGuanyades();
        res[10]=this.percentatgeRondesPerdudes();
        res[11]=this.coeficientEfectivitatPartides();
        res[12]=this.coeficientEfectivitatRondes();
        res[13]=this.mitjanaRondesGuanyadesPartida();

        return res;
    }


    
}
