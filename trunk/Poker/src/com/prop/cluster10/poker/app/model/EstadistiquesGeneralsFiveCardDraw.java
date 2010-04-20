/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.prop.cluster10.poker.app.model;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Martina Canyelles
 */
public class EstadistiquesGeneralsFiveCardDraw extends EstadistiquesGeneralsSB {

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

    this.totalVictoriaCartaAlta=-1;
    this.totalVictoriaParelles=-1;
    this.totalVictoriaDoblesParelles=-1;
    this.totalVictoriaTrio=-1;
    this.totalVictoriaEscala=-1;
    this.totalVictoriaColor=-1;
    this.totalVictoriaFull=-1;
    this.totalVictoriaPoker=-1;
    this.totalVictoriaEscalaColor=-1;
    this.totalPartidesJugades=-1;
    this.totalRondesJugades=-1;
    this.totalJugadorsParticipants=-1;
}

    /**
     * @return the totalVictoriaCartaAlta
     */
    public int getTotalVictoriaCartaAlta() {
        if (totalVictoriaCartaAlta != -1)
			return totalVictoriaCartaAlta;
		return 0;
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
        if (totalVictoriaParelles != -1)
			return totalVictoriaParelles;
		return 0;

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
        if (totalVictoriaDoblesParelles != -1)
			return totalVictoriaDoblesParelles;
		return 0;
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
        if (totalVictoriaTrio != -1)
			return totalVictoriaTrio;
		return 0;
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
        if (totalVictoriaEscala != -1)
			return totalVictoriaEscala;
		return 0;
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
        if (totalVictoriaColor != -1)
			return totalVictoriaColor;
		return 0;
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
        if (totalVictoriaFull != -1)
			return totalVictoriaFull;
		return 0;
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
        if (totalVictoriaPoker != -1)
			return totalVictoriaPoker;
		return 0;
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
        if (totalVictoriaEscalaColor != -1)
			return totalVictoriaEscalaColor;
		return 0;
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

    public Map carregaEstadistiquesGeneralsPoker() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("Total partides jugades", this.totalPartidesJugades);
        map.put("Total rondes jugades", this.totalRondesJugades);
        map.put("Total jugadors participants", this.totalJugadorsParticipants);
        map.put("Total victoria carta alta", this.totalVictoriaCartaAlta);
        map.put("Total victoria parella", this.totalVictoriaParelles);
        map.put("Total victoria doble parella", this.totalVictoriaDoblesParelles);
        map.put("Total victoria trio", this.totalVictoriaTrio);
        map.put("Total victoria escala", this.totalVictoriaEscala);
        map.put("Total victoria color", this.totalVictoriaColor);
        map.put("Total victoria full", this.totalVictoriaFull);
        map.put("Total victoria poker", this.totalVictoriaPoker);
        map.put("Total victoria escala de color", this.totalVictoriaEscalaColor);
        return map;
    }

}
