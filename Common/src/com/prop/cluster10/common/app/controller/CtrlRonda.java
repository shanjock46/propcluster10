/**
 * @author Albert Moreno
 */
package com.prop.cluster10.common.app.controller;

import java.util.List;

public abstract class CtrlRonda 
{
	protected Ronda ronda = null;

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
