/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package CtrlJugadorFiveCardDraw;

import com.prop.cluster10.poker.app.model.CtrlJugador;
import com.prop.cluster10.poker.app.model.JugadorFiveCardDraw;

/**
 *
 * @author Daniel Mulero
 */
public class CtrlJugadorFiveCardDraw extends CtrlJugador{

    public void crearJugador (String nom, boolean maquina) {
        jug=new JugadorFiveCardDraw(nom);
        if (maquina) {
            estrategia=new CtrlEstrategiaSB();
            estrategia.crearEstrategia();
            jug.setEstrategia(estrategia.getEstrategia());
            }

    }
}
