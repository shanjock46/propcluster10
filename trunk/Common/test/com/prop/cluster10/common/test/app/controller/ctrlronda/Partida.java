package com.prop.cluster10.common.test.app.controller.ctrlronda;

import java.util.List;


public abstract class Partida 
{
	protected long id;
	protected List<Jugador> jugadors = null;
	protected List<Jugador> jugadorsActius = null;
	protected Baralla baralla = null;
	protected Ronda rondaActual = null;
	protected int rondesJugades;

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

	public void setJugadors(List<Jugador> jugs) 
	{
		this.jugadors = jugs;
	}
	
	public List<Jugador> getJugadorsActius() 
	{
		return jugadorsActius;
	}

	public void setJugadorsActius(List<Jugador> jugs) 
	{
		this.jugadorsActius = jugs;
	}

	
	public Ronda getRondaActual() 
	{
		return rondaActual;
	}

	public void setRondaActual(Ronda rondaActual) 
	{
		this.rondaActual = rondaActual;
	}

	public long getId()
	{
		return id;
	}
	
	public void setId(long idP)
	{
		this.id = idP;
	}
	
	public int getRondesJugades() {
		return rondesJugades;
	}
	
	public void setRondesJugades(int r) {
		this.rondesJugades = r;
	}

	public void eliminaJugadors()	// Elimina els jugadors sense cash
	{

	}
	
	public void actualitzaEstadistiquesFiRonda() {

	}

	public void actualitzaEstadistiquesFiPartida() {
		
	}
	
	public abstract List<Jugador> guanyadorsPartida();
	
	public abstract Ronda creaRonda();

}
