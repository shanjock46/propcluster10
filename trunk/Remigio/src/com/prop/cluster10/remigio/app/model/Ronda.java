package com.prop.cluster10.remigio.app.model;
import java.util.List;

public abstract class Ronda 
{
	private List<Jugador> jugadors = null;
	
	public List<Jugador> getJugadorsActius() 
	{
		return jugadors;
	}

	public void setJugadorsActius(List<Jugador> jugadorsActius) 
	{
		this.jugadors = jugadorsActius;
	}
	
	public void retirarJugador(Jugador j)
	{
		this.jugadors.remove(j);
	}
}
