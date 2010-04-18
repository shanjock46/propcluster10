package com.prop.cluster10.common.app.controller;




import java.util.Set;


public class CtrlRonda 
{
	private Ronda ronda = null;
	
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

	public void eliminarJugador(Set<Jugador> j)
	{
		for (Jugador jugador: j)
		{
			ronda.getJugadorsActius().remove(jugador);
		}
	}
}
