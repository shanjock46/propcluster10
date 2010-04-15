package com.prop.cluster10.blackjack.app.model;

import java.util.LinkedList;
import java.util.List;

public abstract class CtrlPartida 
{
	private Partida partida = null;
	
	public CtrlPartida()
	{

	}
	
	public CtrlPartida(Partida p)
	{
		this.partida = p;
	}

	public abstract Partida crearPartida(List<Jugador> jugadors, Integer cashInicial);
	
	public void eliminarJugadors(List<Jugador> jugadors)
	{
		this.partida.eliminaJugadors(jugadors);
	}
	
	public void carregarPartida(Long id)
	{
		
	}
	
	public void guardarPartida()
	{
		
	}
	
	public boolean finalitzarRonda()
	{	
			
		for(Jugador jugador: this.partida.getJugadors())
		{
			//TODO:
			//Estadistiques stats = jugador.getEstadistiques();
			//stats.setRondesJugades(stats.getRondesJugades() + 1);
			// y asi sucesivamemte...
			//stats.
		}
		
		List<Jugador> jugadorsToDelete = new LinkedList<Jugador>();
		for(Jugador j: this.partida.getJugadors())
		{
			//TODO: descomentar cuando se haya implementado Jugador
			//if (j.getCash().intValue() <= 0) jugadorsToDelete.add(j);
		}
		
		this.partida.eliminaJugadors(jugadorsToDelete);
		
		return (this.partida.getJugadors().size() > 1);
	}
	
	public void finalitzarPartida()
	{/*
		EstadistiquesGenerals stats = new EstadistiquesGeneral();
		stats.carregaEstadistiquesGeneral();

		//TODO: implementar 
		stats.setTotalPartidesJugades(stats.getTotalPartidesJugades() + 1);
		stats.setTotalPartidesJugades(stats.getTotalPartidesJugades() + 1);
		stats.setTotalPartidesJugades(stats.getTotalPartidesJugades() + 1);
	  */
	}
}
