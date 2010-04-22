/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package CtrlJugadorFiveCardDraw;

/**
 *
 * @author Daniel Mulero
 */
public class CtrlJugadorFiveCardDraw extends CtrlJugador{

    private static inout io=new inout();

    public void crearJugador (String nom, boolean maquina) {
        jug=new JugadorFiveCardDrawSB(nom);
        if (maquina) {
            estrategia=new CtrlEstrategiaSB();
            estrategia.crearEstrategia();
            jug.setEstrategia(estrategia.getEstrategia());
            }

    }

    
    }

