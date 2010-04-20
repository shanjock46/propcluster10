/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.prop.cluster10.common.app.model;

import java.util.HashMap;
import java.util.Map;

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

    public double percentatgePartidesGuanyades() {
        if (this.getPartidesJugades()==0) return 0;
        else return ((this.getPartidesGuanyades())/(this.getPartidesJugades())*100);
    }

    public double percentatgePartidesPerdudes() {
        if (this.getPartidesJugades()==0) return 0;
        else return ((this.getPartidesEliminat())/(this.getPartidesJugades())*100);
    }

    public double coeficientEfectivitatPartides() {
        if (this.getPartidesEliminat()==0 ) return 0;
        else return (this.getPartidesGuanyades()/this.getPartidesEliminat());
    }

    public double percentatgeRondesGuanyades() {
        if (this.getRondesJugades()==0) return 0;
        else return ((this.getRondesGuanyades())/(this.getRondesJugades())*100);
    }

    public double percentatgeRondesPerdudes() {
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

    public Map carregaEstadistiques() {
        Map<String, Double> map = new HashMap<String, Double>();
        map.put("Partides jugades", (double)this.partidesJugades);
        map.put("Partides guanyades", (double)this.partidesGuanyades);
        map.put("Partides eliminat", (double)this.partidesEliminat);
        map.put("Rondes jugades", (double)this.rondesJugades);
        map.put("Rondes guanyades", (double)this.rondesGuanyades);
        map.put("Rondes perdudes", (double)this.rondesPerdudes);
        map.put("Percentatge partides guanyades", this.percentatgePartidesGuanyades());
        map.put("Percentatge partides perdudes", this.percentatgePartidesPerdudes());
        map.put("Percentatge rondes guanyades", this.percentatgeRondesGuanyades());
        map.put("Percentatge rondes perdudes", this.percentatgeRondesPerdudes());
        map.put("Coeficient efectivitat partides", this.coeficientEfectivitatPartides());
        map.put("Coeficient efectivitat rondes", this.coeficientEfectivitatRondes());
        map.put("Fitxes guanyades", (double)this.fitxesGuanyades);

        return map;
    }


    
}
