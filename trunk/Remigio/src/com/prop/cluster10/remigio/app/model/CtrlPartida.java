package com.prop.cluster10.remigio.app.model;

import java.util.List;
import java.lang.String;

public abstract class CtrlPartida 
{
	protected Partida partida = null;
	protected CtrlRonda ctrlRonda = null;
	
	public abstract void crearPartida(List<String> jugadors, Integer cashInicial);
	
	protected void jugarPartida() {
		this.ctrlRonda.setRonda(this.partida.rondaActual);	// Carreguem la rondaActual de la partida al controlador de ronda
		boolean fi = false;
		while(!fi){
			ctrlRonda.jugarRonda();	// Juguem la Ronda
			this.finalitzarRonda();	// Fem les tasques de fi de ronda (actualitza estadístiques, elimina jugadors sense diners i incrementa les rondes jugades de la partida a Partida)
			if(this.fiPartida()){	// Si la partida acaba...
				fi = true;
			}else{					// Si la partida no acaba...
				// TODO capaPresentacio.preguntaSiGuardar()
				this.ctrlRonda.setRonda(this.partida.creaRonda());	// Creem la següent Ronda i la fiquem al Controlador de Ronda
			}
		}
		this.finalitzarPartida();	// Fem les tasques de fi de partida (actualitza estadístiques, elimina la partida del disc si estava guardada)
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
		//actualitzar estadístiques de fi de ronda
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
		CtrlEstadistiquesGenerals ctrlEstGen = new CtrlEstadistiquesGenerals();
		EstadistiquesGenerals stats = EstadistiquesGenerals().getInstance();
		stats.setTotalPartidesJugades(stats.getTotalPartidesJugades() + 1);
		stats.setTotalRondesJugades(stats.getTotalRondesJugades() + this.partida.getRondesJugades());
		stats.setTotalJugadorsParticipants(stats.getTotalJugadorsParticipants() + this.partida.getJugadors().size());
		
		//TODO Eliminar la partida si aquesta estava guardada
		//Falta el ctrl de la Capa de Dades
	}

}
