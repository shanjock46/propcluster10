/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.prop.cluster10.common.test.app.controller.CtrlJugador;

/**
 *
 * @author Daniel Mulero
 */
public class CtrlJugadorFiveCardDrawSB extends CtrlJugador{

    public void crearJugador (String nom, boolean maquina) {
        jug=new JugadorFiveCardDrawSB(nom);
        

    }
}
