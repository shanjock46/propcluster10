package com.prop.cluster10.remigio.app.model;

import java.util.LinkedList;
import java.util.List;


public class CtrlPartidaRemigio extends CtrlPartida {

	private List<CtrlJugadorRemigio> ctrlJugadors = null;

	@Override
	public boolean fiPartida() {
		// Retorna si s'ha acabat de jugar la partida (ja no queden jugadors)
		return (this.partida.jugadorsActius.size() <= 1);
	}

	@Override
	public void crearPartida(List<String> jugadors, Integer cashInicial) {
		for(String j: jugadors){	// Carreguem tots els ctrlJugador a ctrlJugadors, un per cada nom (String) que ens passen
			ctrlJugadors.add(new CtrlJugadorRemigio(j));
		}
		for(int i = 0;i < ctrlJugadors.size(); i++){	// Inicialitzem el cash inicial a tots els jugadors
			ctrlJugadors.get(i).setCash(cashInicial);
		}
		List<Jugador> jugs = new LinkedList<Jugador>();
		for(CtrlJugadorRemigio cj: ctrlJugadors){
			jugs.add(cj.getJug());
		}
		partida = new PartidaFirstToKnock(jugs);	// Creem la partida amb tots els jugadors
		ctrlRonda = new CtrlRondaRemigio(this.partida.creaRonda());	// Inicialitzem el ctrlRonda amb la primera ronda cridant a Partida per a que la generi
		this.jugarPartida();	// Juguem la partida (iniciem el joc)
	}

	
}
