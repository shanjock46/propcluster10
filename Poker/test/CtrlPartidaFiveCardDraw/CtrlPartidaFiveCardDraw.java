/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package CtrlPartidaFiveCardDraw;

import java.util.*;

/**
 *
 * @author Dani
 */
public class CtrlPartidaFiveCardDraw extends CtrlPartidaSB{

    private PartidaFiveCardDraw partida;
    private CtrlRondaFiveCardDraw ctrlRonda;
    private CtrlJugador ctrlJugador;
    private int CG=0;

    public void crearPartida(List<String> llista, Integer cashInicial){
        ctrlJugador=new CtrlJugadorFiveCardDraw();
        List<Jugador> players=new LinkedList<Jugador>();
        Iterator<String> pateador=llista.iterator();
        while (pateador.hasNext()) {
            ctrlJugador.obteJugador(pateador.next());
            ctrlJugador.getJugador().setCash(cashInicial);
            players.add(ctrlJugador.getJugador());
        }
                if (cashInicial*(0.05)<1) CG=1;
                else CG=(int)(cashInicial*(0.05));
		partida = new PartidaFiveCardDraw(players, CG);
		ctrlRonda=partida.creaRonda();
		
	}

    public boolean fiPartida() {

		return (partida.getJugadorsActius().size() == 1);


}
}

