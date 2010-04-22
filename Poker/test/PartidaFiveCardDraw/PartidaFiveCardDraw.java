/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package PartidaFiveCardDraw;

import java.util.List;

/**
 *
 * @author Dani
 */
public class PartidaFiveCardDraw extends Partida{

    public PartidaFirstToKnock(List<Jugador> j) {
        this.jugadors = j;
        this.jugadorsActius.addAll(j);
        this.id = (new Date()).getTime();// assignem un identificador a la nova partida
        this.rondesJugades = 0;
	}
    
    public Ronda creaRonda() {
	baralla=new BarallaFrancesa (1,false);	
        rondaActual = new RondaFiveCardDraw(jugadorsActius, baralla);
	return rondaActual;
	}

    public List<Jugador> guanyadorsPartida(){
        if (jugadorsActius.size()==1) return jugadorsActius;
        else return null;
    }
}
