/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package CtrlPartidaFiveCardDraw;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Dani
 */
public class CtrlPartidaFiveCardDraw extends CtrlPartidaSB{

    private CtrlJugador ctrlJugador;
    private int CG=0;

    public void crearPartida(List<String> llista, Integer cashInicial){
        ctrlJugador=new CtrlJugadorFiveCardDraw();
        List<Jugador> players=new LinkedList<Jugador>();
        Iterator<String> pateador=llista.iterator();
        while (pateador.hasNext()) {
            ctrlJugador.obteJugador(pateador.next());
            ctrlJugador.getJug().setCash(cashInicial);
            players.add(ctrlJugador.getJug());
        }
                if (cashInicial*(0.05)<1) CG=1;
                else CG=(int)(cashInicial*(0.05));
		partida = new PartidaFiveCardDraw(players, CG);
		ctrlRonda = new CtrlRondaFiveCardDraw(partida.creaRonda());
		jugarPartida();
	}

    public boolean fiPartida() {

		return (partida.getJugadorsActius().size() == 1);


}

