/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.prop.cluster10.common.test.app.controller.ctrljugador;


import java.util.*;

/**
 *
 * @author Alberto
 */
public abstract class CtrlJugador {
    
    protected Jugador jugador;
    protected CtrlDadesJugadorSB capaDeDades;
    protected CtrlEstrategiaSB estrategia;



    
    //Getters i setters
    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jug) {
        jugador = jug;
    }

    public CtrlDadesJugadorSB getCapaDeDades() {
        return capaDeDades;
    }

    public void setCapaDeDades(CtrlDadesJugadorSB capaDades) {
        capaDeDades = capaDades;
    }

    public CtrlEstrategiaSB getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(CtrlEstrategiaSB strategia) {
        estrategia = strategia;
    }
//Mes funcions
    public abstract void crearJugador (String nom, boolean maquina); // Cada uno se define su propio metodo en CtrlJugadorXXXXX

    public void obteJugador (String nom){
        jugador=capaDeDades.obteJugador(nom);
    }
    public ArrayList obteLlistatJugadors () {
        ArrayList<String> noms=new ArrayList();
        ArrayList<Jugador> jugadors=new ArrayList();
        jugadors=capaDeDades.obteTots();
        Iterator<Jugador> it=jugadors.iterator();
        Jugador aux;
        while (it.hasNext()) {
            aux=it.next();
            noms.add(aux.getNom());
        }
    return noms;
    }

    public void guardaJugador () {
        capaDeDades.guardaJugador(jugador);
    }

    public Map carregaEstadistiques () {
        return jugador.carregaEstadistiques();
    }

 







}
