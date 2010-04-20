/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.prop.cluster10.poker.app.model;

import java.util.Map;

/**
 *
 * @author Alberto
 */
public abstract class CtrlJugador {
    
    protected Jugador jug;
    private CtrlDadesJugadorSB capaDeDades;
    protected CtrlEstrategiaSB estrategia;

    public CtrlJugador (){
        this.jug = null;

    }

    public CtrlJugador (String nom){
        this.jug = obteJugador(nom);

    }

    public abstract void crearJugador (String nom, boolean maquina); // Cada uno se define su propio metodo en CtrlJugadorXXXXX

    public Jugador obteJugador (String nom){
        return capaDeDades.obteJugador(nom);
    }

    public void guardaJugador () {
        capaDeDades.guardaJugador(jug);
    }

    public Map carregaEstadistiques () {
        return getJug().carregaEstadistiques();
    }

    /**
     * @return the jug
     */
    public Jugador getJug() {
        return jug;
    }

    /**
     * @param jug the jug to set
     */
    public void setJug(Jugador jug) {
        this.jug = jug;
    }


 







}
