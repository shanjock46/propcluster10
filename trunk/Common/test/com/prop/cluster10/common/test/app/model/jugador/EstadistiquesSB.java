/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.prop.cluster10.common.test.app.model.jugador;

/**
 *
 * @author Dani
 */
public class EstadistiquesSB {
    private int partidesJugades=1;
    private int partidesGuanyades=2;
    private int partidesEliminat=3;
    private int rondesJugades=4;
    private int rondesGuanyades=5;
    private int rondesPerdudes=6;
    private int fitxesGuanyades=7;
    
    double[] carregaEstadistiques() {
        double[] res=new double[7];
        for (int i=0;i<res.length;i++){
            res[i]=i*2.2;
        }
        return res;
    }

    /**
     * @return the partidesJugades
     */
    public int getPartidesJugades() {
        return partidesJugades;
    }

    /**
     * @return the partidesGuanyades
     */
    public int getPartidesGuanyades() {
        return partidesGuanyades;
    }

    /**
     * @return the partidesEliminat
     */
    public int getPartidesEliminat() {
        return partidesEliminat;
    }

    /**
     * @return the rondesJugades
     */
    public int getRondesJugades() {
        return rondesJugades;
    }

    /**
     * @return the rondesGuanyades
     */
    public int getRondesGuanyades() {
        return rondesGuanyades;
    }

    /**
     * @return the rondesPerdudes
     */
    public int getRondesPerdudes() {
        return rondesPerdudes;
    }

    /**
     * @return the fitxesGuanyades
     */
    public int getFitxesGuanyades() {
        return fitxesGuanyades;
    }

    /**
     * @param partidesJugades the partidesJugades to set
     */
    public void setPartidesJugades(int partidesJugades) {
        this.partidesJugades = partidesJugades;
    }

    /**
     * @param partidesGuanyades the partidesGuanyades to set
     */
    public void setPartidesGuanyades(int partidesGuanyades) {
        this.partidesGuanyades = partidesGuanyades;
    }

    /**
     * @param partidesEliminat the partidesEliminat to set
     */
    public void setPartidesEliminat(int partidesEliminat) {
        this.partidesEliminat = partidesEliminat;
    }

    /**
     * @param rondesJugades the rondesJugades to set
     */
    public void setRondesJugades(int rondesJugades) {
        this.rondesJugades = rondesJugades;
    }

    /**
     * @param rondesGuanyades the rondesGuanyades to set
     */
    public void setRondesGuanyades(int rondesGuanyades) {
        this.rondesGuanyades = rondesGuanyades;
    }

    /**
     * @param rondesPerdudes the rondesPerdudes to set
     */
    public void setRondesPerdudes(int rondesPerdudes) {
        this.rondesPerdudes = rondesPerdudes;
    }

    /**
     * @param fitxesGuanyades the fitxesGuanyades to set
     */
    public void setFitxesGuanyades(int fitxesGuanyades) {
        this.fitxesGuanyades = fitxesGuanyades;
    }

}
