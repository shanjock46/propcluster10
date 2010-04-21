/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.prop.cluster10.common.app.controller;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Alberto
 */
public abstract class CtrlJugador {
    
    protected Jugador jug;
    protected CtrlDadesJugador capaDeDades;
    protected CtrlEstrategia estrategia;



    
    //Getters i setters
    public Jugador getJug() {
        return jug;
    }

    public void setJug(Jugador jug) {
        this.jug = jug;
    }

    public CtrlDadesJugador getCapaDeDades() {
        return capaDeDades;
    }

    public void setCapaDeDades(CtrlDadesJugador capaDeDades) {
        this.capaDeDades = capaDeDades;
    }

    public CtrlEstrategia getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(CtrlEstrategia estrategia) {
        this.estrategia = estrategia;
    }
//Mes funcions
    public abstract void crearJugador (String nom, boolean maquina); // Cada uno se define su propio metodo en CtrlJugadorXXXXX

    public void obteJugador (String nom){
        this.jug=capaDeDades.obteJugador(nom);
    }
    public ArrayList obteLlistatJugadors () {
        ArrayList<String> noms=new ArrayList();
        ArrayList<Jugador> jugadors=new ArrayList();
        jugadors=capaDeDades.obteTots();
        Iterator<Jugador> it=jugadors.iterator();
        Jugador aux=new Jugador();
        while (it.hasNext()) {
            aux=it.next();
            noms.add(aux.getNom());
        }
    return noms;
    }

    public void guardaJugador () {
        getCapaDeDades().guardaJugador(jug);
    }

    public Map carregaEstadistiques () {
        return getJug().carregaEstadistiques();
    }

 







}
