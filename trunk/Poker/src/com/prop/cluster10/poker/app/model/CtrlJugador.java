/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.prop.cluster10.poker.app.model;

/**
 *
 * @author Alberto
 */
public class CtrlJugador {
    
    private Jugador jug = new Jugador();
    private CtrlPartida ctrlpart = new CtrlPartida();
    private CtrlRonda crtlronda = new CtrlRonda();

    public CtrlJugador (){
        this.jug = null;
       
    }

    public CtrlJugador (Jugador jugador){
        this.jug = jugador;

    }

    public Jugador getJugador(){
        return this.jug;
    }

    public void setJugador (Jugador jugador){
        this.jug = jugador;
    }
    //por supuesto no es un int
    public int CarregaJugador (Jugador jugador){
        return 0;
    }






}
