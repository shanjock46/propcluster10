package com.prop.cluster10.blackjack.app.model;
import java.util.LinkedList;
import java.util.List;


public abstract class Partida 
{
	private Long id;
	private List<Jugador> jugadors = null;
	private Baralla baralla = null;
	private Ronda rondaActual = null;
	
	public Partida() 
	{
		this.jugadors = new LinkedList<Jugador>();
		this.baralla = new BarallaFrancesa(); 
	}
	
	public Partida(List<Jugador> j) 
	{
		this.jugadors = j;
		this.baralla = new BarallaFrancesa();
	}

	public abstract void jugarPartida(Integer cashInicial);
	
	public void eliminaJugadors(List<Jugador> jugadors)
	{
		for (Jugador j: jugadors)
		{
			this.jugadors.remove(j);
		}
	}

	public Baralla getBaralla() 
	{
		return baralla;
	}

	public void setBaralla(Baralla baralla) 
	{
		this.baralla = baralla;
	}

	public List<Jugador> getJugadors() 
	{
		return jugadors;
	}

	public void setJugadors(List<Jugador> jugadors) 
	{
		this.jugadors = jugadors;
	}

	
	public Ronda getRondaActual() 
	{
		return rondaActual;
	}

	public void setRondaActual(Ronda rondaActual) 
	{
		this.rondaActual = rondaActual;
	}

	public Long getId()
	{
		return id;
	}
}
