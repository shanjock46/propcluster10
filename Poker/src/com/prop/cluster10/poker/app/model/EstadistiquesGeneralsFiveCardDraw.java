/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.prop.cluster10.poker.app.model;

/**
 *
 * @author Martina Canyelles
 */
public class EstadistiquesGeneralsFiveCardDraw extends Estadistiques {

    private int totalVictoriaCartaAlta;
    private int totalVictoriaParelles;
    private int totalVictoriaDoblesParelles;
    private int totalVictoriaTrio;
    private int totalVictoriaEscala;
    private int totalVictoriaColor;
    private int totalVictoriaFull;
    private int totalVictoriaPoker;
    private int totalVictoriaEscalaColor;

public EstadistiquesGeneralsFiveCardDraw(){

    this.totalVictoriaCartaAlta=0;
    this.totalVictoriaParelles=0;
    this.totalVictoriaDoblesParelles=0;
    this.totalVictoriaTrio=0;
    this.totalVictoriaEscala=0;
    this.totalVictoriaColor=0;
    this.totalVictoriaFull=0;
    this.totalVictoriaPoker=0;
    this.totalVictoriaEscalaColor=0;
}

    /**
     * @return the totalVictoriaCartaAlta
     */
    public int getTotalVictoriaCartaAlta() {
        return totalVictoriaCartaAlta;
    }

    /**
     * @param totalVictoriaCartaAlta the totalVictoriaCartaAlta to set
     */
    public void setTotalVictoriaCartaAlta(int totalVictoriaCartaAlta) {
        this.totalVictoriaCartaAlta = totalVictoriaCartaAlta;
    }

    /**
     * @return the totalVictoriaParelles
     */
    public int getTotalVictoriaParelles() {
        return totalVictoriaParelles;
    }

    /**
     * @param totalVictoriaParelles the totalVictoriaParelles to set
     */
    public void setTotalVictoriaParelles(int totalVictoriaParelles) {
        this.totalVictoriaParelles = totalVictoriaParelles;
    }

    /**
     * @return the totalVictoriaDoblesParelles
     */
    public int getTotalVictoriaDoblesParelles() {
        return totalVictoriaDoblesParelles;
    }

    /**
     * @param totalVictoriaDoblesParelles the totalVictoriaDoblesParelles to set
     */
    public void setTotalVictoriaDoblesParelles(int totalVictoriaDoblesParelles) {
        this.totalVictoriaDoblesParelles = totalVictoriaDoblesParelles;
    }

    /**
     * @return the totalVictoriaTrio
     */
    public int getTotalVictoriaTrio() {
        return totalVictoriaTrio;
    }

    /**
     * @param totalVictoriaTrio the totalVictoriaTrio to set
     */
    public void setTotalVictoriaTrio(int totalVictoriaTrio) {
        this.totalVictoriaTrio = totalVictoriaTrio;
    }

    /**
     * @return the totalVictoriaEscala
     */
    public int getTotalVictoriaEscala() {
        return totalVictoriaEscala;
    }

    /**
     * @param totalVictoriaEscala the totalVictoriaEscala to set
     */
    public void setTotalVictoriaEscala(int totalVictoriaEscala) {
        this.totalVictoriaEscala = totalVictoriaEscala;
    }

    /**
     * @return the totalVictoriaColor
     */
    public int getTotalVictoriaColor() {
        return totalVictoriaColor;
    }

    /**
     * @param totalVictoriaColor the totalVictoriaColor to set
     */
    public void setTotalVictoriaColor(int totalVictoriaColor) {
        this.totalVictoriaColor = totalVictoriaColor;
    }

    /**
     * @return the totalVictoriaFull
     */
    public int getTotalVictoriaFull() {
        return totalVictoriaFull;
    }

    /**
     * @param totalVictoriaFull the totalVictoriaFull to set
     */
    public void setTotalVictoriaFull(int totalVictoriaFull) {
        this.totalVictoriaFull = totalVictoriaFull;
    }

    /**
     * @return the totalVictoriaPoker
     */
    public int getTotalVictoriaPoker() {
        return totalVictoriaPoker;
    }

    /**
     * @param totalVictoriaPoker the totalVictoriaPoker to set
     */
    public void setTotalVictoriaPoker(int totalVictoriaPoker) {
        this.totalVictoriaPoker = totalVictoriaPoker;
    }

    /**
     * @return the totalVictoriaEscalaColor
     */
    public int getTotalVictoriaEscalaColor() {
        return totalVictoriaEscalaColor;
    }

    /**
     * @param totalVictoriaEscalaColor the totalVictoriaEscalaColor to set
     */
    public void setTotalVictoriaEscalaColor(int totalVictoriaEscalaColor) {
        this.totalVictoriaEscalaColor = totalVictoriaEscalaColor;
    }

    public void actualitzaEstadístiquesGeneralsFiveCardDraw(String s){

        if (s.compareToIgnoreCase("cartaalta")==0) this.totalVictoriaCartaAlta++;
        else if (s.compareToIgnoreCase("parelles")==0) this.totalVictoriaParelles++;
        else if (s.compareToIgnoreCase("doblesparelles")==0) this.totalVictoriaDoblesParelles++;
        else if (s.compareToIgnoreCase("trio")==0) this.totalVictoriaTrio++;
        else if (s.compareToIgnoreCase("escala")==0) this.totalVictoriaEscala++;
        else if (s.compareToIgnoreCase("color")==0) this.totalVictoriaColor++;
        else if (s.compareToIgnoreCase("full")==0) this.totalVictoriaFull++;
        else if (s.compareToIgnoreCase("poker")==0) this.totalVictoriaPoker++;
        else if (s.compareToIgnoreCase("escalacolor")==0) this.totalVictoriaEscalaColor++;
    }
}
