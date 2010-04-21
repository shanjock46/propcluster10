package com.prop.cluster10.remigio.app.model;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.List;
import java.lang.String;

public class RondaRemigio extends Ronda 
{
	private int iteradorJugadors;
	
	public RondaRemigio(List<Jugador> j, Baralla b){
		jugadorsActius = new LinkedList<Jugador>();		// Creem una nova llista de jugadorsActius
		jugadorsActius.addAll(j);
		iteradorJugadors = 0;
		this.baralla = b;
	}
	
	@Override
	public Jugador seguentJugador() {
		int aux = iteradorJugadors;
		iteradorJugadors = 0;
		if(iteradorJugadors == jugadorsActius.size()){
			iteradorJugadors = 0;
		}
		return jugadorsActius.get(aux);
	}

	@Override
	public void tancaRonda() {
		for(Jugador j: jugadorsActius){
			j.setCash(j.getCash() - j.cartesNoTancades());	// Actualitza les puntuacions (el cash)
			j.buidaCartes();	// Retorna les cartes dels jugadors a la baralla
		}
	}

	@Override
	public void repartir() {
		for(Jugador j: this.jugadorsActius){
			for(int i = 0; i<10; i++){
				j.afegeixCarta(baralla.extreureCarta());
			}
		}
		
	}
	

}
