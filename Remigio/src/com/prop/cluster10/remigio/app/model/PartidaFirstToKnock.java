package com.prop.cluster10.remigio.app.model;
import java.util.Date;
import java.util.LinkedList;


public class PartidaFirstToKnock extends Partida{

	public PartidaFirstToKnock(LinkedList<Jugador> j) {
		this.jugadors = j;
		this.jugadorsActius.addAll(j);
		this.id = (new Date()).getTime();// Es faria aqu’?
		this.baralla = new BarallaFrancesa(2, true);//inicialitzem la baralla
		this.rondesJugades = 0;
	}

	@Override
	public Ronda creaRonda() {
		rondaActual = new RondaRemigio(this.jugadorsActius, baralla);
		return rondaActual;
	}

	@Override
	public LinkedList<Jugador> guanyadorsPartida() {
		// TODO Auto-generated method stub
		return null;
	}

}
