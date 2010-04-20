package com.prop.cluster10.remigio.app.model;

import java.util.LinkedList;

public abstract class CtrlPartida 
{
	protected Partida partida = null;
	private CtrlRonda ctrlRonda = null;
	
	public CtrlPartida()
	{

	}
	
	public CtrlPartida(Partida p)
	{
		this.partida = p;
	}
	
	public abstract void iniPartida(LinkedList<Jugador> jugadors);

	public void crearPartida(LinkedList<Jugador> jugadors, Integer cashInicial){
		//TODO en comptes de passar jugadors, hauriem de passar strings i crear els jugadors?
		for(Jugador j: jugadors)	//actualitzem el cash dels jugadors
		{
			j.setCash(cashInicial);
		}
		iniPartida(jugadors);	//iniciem la partida del tipus de cada joc (remigio/poker/blackjack)
		ctrlRonda = new CtrlRonda(this.partida.creaRonda());
		jugarPartida();
	}
	
	private void jugarPartida() {
		this.ctrlRonda.setRonda(this.partida.rondaActual);
		boolean fi = false;
		while(!fi){	//he separat finalitzarRonda en finalitzaRonda(actualitza estadístiques i elimina jugadorsActius que s'han quedat sense cash de la partida) i fiRonda(retorna si sha acabat la partida, abstracte)
			ctrlRonda.jugarRonda();
			finalitzarRonda();	//només actualitza estadístiques
			if(fiPartida()){
				fi = true;
			}else{
				//Aquí caldria preguntar a capa presentació si guardar?
				this.ctrlRonda.setRonda(this.partida.creaRonda());
			}
		}
		finalitzarPartida();
	}

	public abstract boolean fiPartida();
	
	public void carregarPartida(Long id)
	{
		//TODO: Falten els controladors de la capa de dades
		/*
		this.partida = ctrlDades.getPartida(idPartida);
		jugarPartida();
		*/
	}
	
	public void guardarPartida()
	{
		//TODO: Falten els controladors de la capa de dades
	}
	
	public void finalitzarRonda()
	{	
		//actualitzar estadístique
		this.partida.actualitzaEstadistiquesFiRonda();
		
		//eliminar jugadors sense diners (treure dels actius)
		this.partida.eliminaJugadors();
		
		//actualitzar el número de rondes jugades
		this.partida.setRondesJugades(partida.getRondesJugades() + 1);
	}
	
	public void finalitzarPartida()
	{
		//actualitzem les estadístiques de cada jugador
		this.partida.actualitzaEstadistiquesFiPartida();
		
		//actualitzem les estadístiques generals
		/* DESCOMENTAR QUAN IMPLEMENTAT
		EstadistiquesGenerals stats = new EstadistiquesGeneral();
		stats.setTotalPartidesJugades(stats.getTotalPartidesJugades() + 1);
		stats.setTotalRondesJugades(stats.getTotalRondesJugades() + this.partida.getRondesJugades());
		stats.setTotalJugadorsParticipants(stats.getTotalJugadorsParticipants() + this.partida.getJugadors().size());
		*/
		
		//TODO Eliminar la partida si aquesta estava guardada
	}

}
