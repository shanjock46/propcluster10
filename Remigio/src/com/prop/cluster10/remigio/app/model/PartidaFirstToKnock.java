package com.prop.cluster10.remigio.app.model;

import java.util.Date;
import java.util.List;
import java.util.LinkedList;


public class PartidaFirstToKnock extends Partida{
	
	public PartidaFirstToKnock(){
		this.jugadorsActius = new LinkedList<Jugador>();
	}

	public PartidaFirstToKnock(List<Jugador> j) {
		this.jugadors = j;				//assignem el conjunt de jugadors
		this.jugadorsActius.addAll(j);	//assignem el subconjunt de jugadors Actius (en aquest cas tot perquè estem al inici de la partida)
		this.id = (new Date()).getTime();// assignem un identificador a la nova partida
		this.baralla = new BarallaFrancesa(2, true);//inicialitzem la baralla
		this.rondesJugades = 0;
	}

	@Override
	public Ronda creaRonda() {
		rondaActual = new RondaRemigio(this.jugadorsActius, baralla);
		return rondaActual;
	}

	@Override
	public List<Jugador> guanyadorsPartida() {
		// TODO Auto-generated method stub
		return null;
	}

}
