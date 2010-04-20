package com.prop.cluster10.remigio.app.model;
import java.util.LinkedList;


public class CtrlPartidaRemigio extends CtrlPartida {

	@Override
	public void iniPartida(LinkedList<Jugador> jugadors) {
		// TODO Parlar amb la capa de presentaci— per decidir el tipus de partida
		partida = new PartidaFirstToKnock(jugadors);
	}

	@Override
	public boolean fiPartida() {
		//TODO
		//retorna si s'ha acabat de jugar la partida (si hi ha una altra ronda i s'ha de seguir jugant)
		return false;
	}

}
