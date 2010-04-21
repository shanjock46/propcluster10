package com.prop.cluster10.remigio.app.model;

import java.util.List;

/**
 * @author Albert Moreno
 */
public abstract class Ronda 
{
	//protected Partida partida = null;
	protected Baralla baralla = null;
	protected List<Jugador> jugadorsActius = null;
	
	/*public Partida getPartida() 
	{
		return partida;
	}

	public void setPartida(Partida p) 
	{
		this.partida = p;
	}*/
	
	public Baralla getBaralla() {
		return baralla;
	}

	public void setBaralla(Baralla baralla) {
		this.baralla = baralla;
	}

	public void setJugadorsActius(List<Jugador> jugadorsActius) {
		this.jugadorsActius = jugadorsActius;
	}

	public void retirarJugador(Jugador j)
	{
		this.jugadorsActius.remove(j);
	}

	public Jugador getGuanyador() {
		// TODO Convertir la funci— en public LinkedList<Jugador> getGuanyadors()
		return null;
	}
	
	public abstract Jugador seguentJugador();

	public abstract void repartir();
	
	public abstract void tancaRonda();	//Fa les operacions necessˆries al acabar la ronda (actualitzar puntacions, desassociar les cartes a cada jugador...)

	public List<Jugador> getJugadorsActius() {
		// TODO Auto-generated method stub
		return null;
	}
}
