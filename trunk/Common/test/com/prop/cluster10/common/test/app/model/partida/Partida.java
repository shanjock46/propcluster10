package com.prop.cluster10.common.test.app.model.partida;

import java.util.LinkedList;
import java.util.List;
import java.util.Date;


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
		for(Jugador j: this.jugadorsActius)
		{
			if (j.getCash() <= 0) jugadorsActius.remove(j);
		}
	}
	
	/*public void actualitzaEstadistiquesFiRonda() {
		//actualitzem les estadístiques de fi de ronda de cada jugador
		//TODO com sabem qui és el guanyador d'una ronda? A poker pot haver-hi més d'un guanyador, oi? En aquest cas auqesta opció no valdria...
		List<Jugador> g = this.rondaActual.guanyadorsRonda();
		for(Jugador j: this.jugadorsActius)
		{
			if(!g.contains(j)){
				j.getEstadistiques().actualitzaFiRonda(false);
			}else{
				g.getEstadistiques().actualitzaFiRonda(true);
			}
		}
	}

	public void actualitzaEstadistiquesFiPartida() {
		//actualitzem les estadístiques de fi de partida de cada jugador
		//TODO com sabem qui és guanyador de la partida? No és necessàriament l'últim que queda...fem un obté guanyador abstracte a partida
		List<Jugador> guanyadors = guanyadorsPartida();
		for(Jugador j: this.jugadors)
		{
			if(!guanyadors.contains(j)){
				j.getEstadistiques().actualitzaFiPartida(false);
			}else{
				j.getEstadistiques().actualitzaFiPartida(true);
			}
		}
		
	}*/
	
	public abstract List<Jugador> guanyadorsPartida();
	
	public abstract Ronda creaRonda();

}
