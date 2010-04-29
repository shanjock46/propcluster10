package com.prop.cluster10.common.test.app.model.ronda;

import java.util.List;
public abstract class Ronda 
{
	//protected Partida partida = null;
	protected Baralla baralla = new Baralla();
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
		if(this.jugadorsActius.contains(j)){
			inout io1=new inout();
			System.out.print('s');
			this.jugadorsActius.remove(j);
		}
		else{
			System.out.print('n');
		}
	}

	public Jugador getGuanyador() {
		// TODO Convertir la funci— en public LinkedList<Jugador> getGuanyadors()
		return null;
	}
	
	public abstract Jugador seguentJugador();

	public abstract void repartir();
	
	public abstract void tancaRonda();	//Fa les operacions necessˆries al acabar la ronda (actualitzar puntacions, desassociar les cartes a cada jugador...)

	public List<Jugador> getJugadorsActius() {
		return this.jugadorsActius;
	}
}
