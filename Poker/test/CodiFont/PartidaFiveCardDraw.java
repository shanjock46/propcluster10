/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package CodiFont;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Dani
 */
public class PartidaFiveCardDraw extends Partida{
    private int CG;

    public PartidaFiveCardDraw(List<Jugador> j, int cega) {
        jugadors = j;
        jugadorsActius = new ArrayList<Jugador>();
        jugadorsActius.addAll(j);
        id = (new Date()).getTime();// assignem un identificador a la nova partida
        rondesJugades = 0;
        CG=cega;
	}
    
    public RondaFiveCardDraw creaRonda() {
	if (rondesJugades!=0) if (jugadors.size()%rondesJugades==0) CG=CG*2;
        baralla=new BarallaFrancesaSB (1,false);
        rondaActual = new RondaFiveCardDraw(jugadorsActius, baralla);
	return (RondaFiveCardDraw) rondaActual;
	}

    public List<Jugador> guanyadorsPartida(){
        if (jugadorsActius.size()==1) return jugadorsActius;
        else return null;
    }
}
