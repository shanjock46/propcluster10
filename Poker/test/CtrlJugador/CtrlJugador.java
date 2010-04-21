/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package CtrlJugador;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Alberto
 */
public abstract class CtrlJugador {
    
    protected Jugador jug;
    protected CtrlDadesJugadorSB capaDeDades;
    protected CtrlEstrategiaSB estrategia;



    
    //Getters i setters
    public Jugador getJug() {
        return jug;
    }

    public void setJug(Jugador jug) {
        this.jug = jug;
    }

    public CtrlDadesJugadorSB getCapaDeDades() {
        return capaDeDades;
    }

    public void setCapaDeDades(CtrlDadesJugadorSB capaDeDades) {
        this.capaDeDades = capaDeDades;
    }

    public CtrlEstrategiaSB getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(CtrlEstrategiaSB estrategia) {
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
        Jugador aux;
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
