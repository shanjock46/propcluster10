/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package CtrlJugador;

import java.util.Map;

/**
 *
 * @author Alberto
 */
public abstract class CtrlJugador {
    
    protected JugadorSB jug;
    private CtrlDadesJugadorSB capaDeDades;
    protected CtrlEstrategiaSB estrategia;



    public CtrlJugador (){
        this.jug = null;
    }

    public CtrlJugador (String nom){
        this.jug = obteJugador(nom);
    }

    public abstract void crearJugador (String nom, boolean maquina); // Cada uno se define su propio metodo en CtrlJugadorXXXXX

    public JugadorSB obteJugador (String nom){
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
    public JugadorSB getJug() {
        return jug;
    }

    public void setJug(JugadorSB jug) {
        this.jug = jug;
    }


 







}
