package com.prop.cluster10.remigio.app.model;

import java.util.LinkedList;
import java.util.Date;


public abstract class Partida 
{
	protected long id;
	protected LinkedList<Jugador> jugadors = null;
	protected LinkedList<Jugador> jugadorsActius = null;
	protected Baralla baralla = null;
	protected Ronda rondaActual = null;
	protected int rondesJugades;

	
	public Partida() 
	{
		this.jugadors = new LinkedList<Jugador>();
		this.jugadorsActius = new LinkedList<Jugador>();
	}
	
	public Partida(LinkedList<Jugador> j) 
	{	//cal¿
		this.jugadors = j;		//PREGUNTA: quan fem aquesta assignació, estem copiant tots els valors de j a l'adreça de jugadors, oi?
		this.jugadorsActius.addAll(j);
		this.rondesJugades = 0;
		this.id = (new Date()).getTime();// És fa aquí?
	}

	public Baralla getBaralla() 
	{
		return baralla;
	}

	public void setBaralla(Baralla baralla) 
	{
		this.baralla = baralla;
	}

	public LinkedList<Jugador> getJugadors() 
	{
		return jugadors;
	}

	public void setJugadors(LinkedList<Jugador> jugs) 
	{
		this.jugadors = jugs;
	}
	
	public LinkedList<Jugador> getJugadorsActius() 
	{
		return jugadorsActius;
	}

	public void setJugadorsActius(LinkedList<Jugador> jugs) 
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
		// TODO Auto-generated method stub
		return rondesJugades;
	}
	
	public void setRondesJugades(int r) {
		// TODO Auto-generated method stub
		this.rondesJugades = r;
	}

	public void actualitzaEstadistiquesFiRonda() {
		//actualitzem les estadístiques de fi de ronda de cada jugador
		//TODO com sabem qui és el guanyador d'una ronda? A poker pot haver-hi més d'un guanyador, oi? En aquest cas auqesta opció no valdria...
		Jugador g = this.rondaActual.getGuanyador();
		g.actualitzaFiRonda(true);
		for(Jugador j: this.jugadorsActius)
		{
			if(j != g){
				j.actualitzaFiRonda(false);
			}
		}
	}

	public void actualitzaEstadistiquesFiPartida() {
		//actualitzem les estadístiques de fi de partida de cada jugador
		//TODO com sabem qui és guanyador de la partida? No és necessàriament l'últim que queda...fem un obté guanyador abstracte a partida
		LinkedList<Jugador> guanyadors = guanyadorsPartida();
		for(Jugador j: guanyadors){
			j.actualitzaFiPartida(true);
		}
		for(Jugador j: this.jugadors)
		{
			if(!guanyadors.contains(j)){
				j.actualitzaFiPartida(false);
			}
		}
		
	}
	
	public abstract LinkedList<Jugador> guanyadorsPartida();
	
	public abstract Ronda creaRonda();
	
	public void eliminaJugadors()
	{
		for(Jugador j: this.jugadorsActius)
		{
			if (j.getCash() <= 0) jugadorsActius.remove(j);
		}
	}
}
