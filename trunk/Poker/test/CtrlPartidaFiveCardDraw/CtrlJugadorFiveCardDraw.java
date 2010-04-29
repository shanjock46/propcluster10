/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package CtrlPartidaFiveCardDraw;



/**
 *
 * @author Daniel Mulero
 */
public class CtrlJugadorFiveCardDraw extends CtrlJugador{

    

    @Override
  public void crearJugador (String nom, boolean maquina) {
        jugador=new JugadorFiveCardDraw(nom);
        if (maquina) {
            estrategia=new CtrlEstrategiaSB();
            estrategia.crearEstrategia();
            jugador.setEstrategia(estrategia.getEstrategia());
            }

    }

    
    }

