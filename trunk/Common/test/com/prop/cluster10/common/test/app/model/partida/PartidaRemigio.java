package com.prop.cluster10.common.test.app.model.partida;

import java.util.Date;
import java.util.List;
import java.util.LinkedList;


public class PartidaRemigio extends Partida{
	
	public PartidaRemigio(){
		this.jugadorsActius = new LinkedList<Jugador>();
	}

	public PartidaRemigio(List<Jugador> j) {
		if(j!=null){
			this.jugadors = j;				
			this.jugadorsActius=j;

			this.id = (new Date()).getTime();
			this.baralla = new BarallaFrancesa(2, true);
			this.rondesJugades = 0;
		}
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
