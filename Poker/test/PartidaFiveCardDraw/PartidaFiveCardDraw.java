/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package PartidaFiveCardDraw;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Dani
 */
public class PartidaFiveCardDraw extends PartidaSB{

    public PartidaFiveCardDraw(List<Jugador> j) {
        this.jugadors = j;
        this.jugadorsActius.addAll(j);
        this.id = (new Date()).getTime();// assignem un identificador a la nova partida
        this.rondesJugades = 0;
	}
    
    public RondaSB creaRonda() {
	if (rondesJugades!=0) if (jugadors.size()%rondesJugades==0) CG=CG*2;
        baralla=new BarallaFrancesaSB (1,false);
        rondaActual = new RondaFiveCardDraw(jugadorsActius, baralla);
	return rondaActual;
	}

    public List<Jugador> guanyadorsPartida(){
        if (jugadorsActius.size()==1) return jugadorsActius;
        else return null;
    }
}
