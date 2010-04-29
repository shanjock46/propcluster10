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

    public void setJug(Jugador juga) {
        jug = juga;
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
        jug=capaDeDades.obteJugador(nom);
    }
    public ArrayList<String> obteLlistatJugadors () {
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
        capaDeDades.guardaJugador(jug);
    }

    public Map carregaEstadistiques () {
        return getJug().carregaEstadistiques();
    }
}
