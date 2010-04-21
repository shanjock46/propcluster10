package com.prop.cluster10.remigio.app.model;

import java.util.List;

/**
 * @author Albert Moreno
 */
public abstract class CtrlRonda 
{
	protected Ronda ronda = null;
	
	public CtrlRonda() 
	{
		
	}
	
	public CtrlRonda(Ronda r) 
	{
		this.ronda = r;
	}

	public Ronda getRonda() 
	{
		return ronda;
	}

	public void setRonda(Ronda ronda) 
	{
		this.ronda = ronda;
	}

	public void eliminarJugador(List<Jugador> j)
	{
		for (Jugador jugador: j)
		{
			ronda.getJugadorsActius().remove(jugador);
		}
	}

	public abstract void jugarRonda();
}
