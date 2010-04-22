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
public class CtrlPartidaFiveCardDraw extends CtrlPartida{

    private CtrlJugador ctrlJugador;


    public void crearPartida(List<String> llista, Integer cashInicial){
        ctrlJugador=new CtrlJugadorFiveCardDraw();
        List<Jugador> players=new LinkedList<Jugador>();
        Iterator<String> pateador=llista.iterator();
        while (pateador.hasNext()) {
            ctrlJugador.obteJugador(pateador.next());
            ctrlJugador.getJug().setCash(cashInicial);
            players.add(ctrlJugador.getJug());
        }
		partida = new PartidaFiveCardDraw(players);
		ctrlRonda = new CtrlRondaFiveCardDraw(partida.creaRonda());
		this.jugarPartida();
	}

    public boolean fiPartida() {

		return (this.partida.getJugadorsActius().size() == 1);


}

