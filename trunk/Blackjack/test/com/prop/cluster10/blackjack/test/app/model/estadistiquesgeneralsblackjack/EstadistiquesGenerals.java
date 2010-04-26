package com.prop.cluster10.blackjack.test.app.model.estadistiquesgeneralsblackjack;

import java.util.HashMap;


public abstract class EstadistiquesGenerals {
	
	public Integer getTotalPartidesJugades() {
		if (totalPartidesJugades != -1) return totalPartidesJugades;
		else return 0;
	}
	public void setTotalPartidesJugades(Integer totalPartidesJugades) {
		this.totalPartidesJugades = totalPartidesJugades;
	}
	public Integer getTotalRondesJugades() {
		if (totalRondesJugades != -1) return totalRondesJugades;
		else return 0;
	}
	public void setTotalRondesJugades(Integer totalRondesJugades) {
		this.totalRondesJugades = totalRondesJugades;
	}
	public Integer getTotalJugadorsParticipants() {
		if (totalJugadorsParticipants != -1) return totalJugadorsParticipants;
		else return 0;
	}
	public void setTotalJugadorsParticipants(Integer totalJugadorsParticipants) {
		this.totalJugadorsParticipants = totalJugadorsParticipants;
	}

	public double mitjanaJugadorsPartida() {
		double mitjana = 0;
		if (totalPartidesJugades > 0 && totalJugadorsParticipants != -1) {
			mitjana = (double)getTotalJugadorsParticipants() / (double)getTotalPartidesJugades();
		}
		return mitjana;
	}
	
	public double mitjanaRondesPartida() {
		double mitjana = 0;
		if (totalPartidesJugades > 0 && totalRondesJugades != -1) {
			mitjana = (double)getTotalRondesJugades() / (double)getTotalPartidesJugades();
		}
		return mitjana;
	}
	
	public void actualitzaEstadistiquesGenerals(Integer r, Integer j) {
		if (totalPartidesJugades == -1) totalPartidesJugades = 0;
		if (totalRondesJugades == -1) totalRondesJugades = 0;
		if (totalJugadorsParticipants == -1) totalJugadorsParticipants = 0;
		totalPartidesJugades++;
		totalRondesJugades += r;
		totalJugadorsParticipants += j;
	}
	
	public HashMap<String, Object> carregaEstadistiquesGenerals() {
		HashMap <String, Object> est = new HashMap <String, Object>();
		if (totalPartidesJugades != -1) est.put("totalPartidesJugades", totalPartidesJugades);
		else est.put("totalPartidesJugades", 0);
		if (totalJugadorsParticipants != -1) est.put("totalJugadorsParticipants", totalJugadorsParticipants);
		else est.put("totalJugadorsParticipants", 0);
		if (totalRondesJugades != -1) est.put("totalRondesJugades", totalRondesJugades);
		else est.put("totalRondesJugades", 0);
		est.put("mitjanaJugadorsPartida", mitjanaJugadorsPartida());
		est.put("mitjanaRondesPartida", mitjanaRondesPartida());
		return est;		
	}
	
	protected Integer totalPartidesJugades;
	protected Integer totalRondesJugades;
	protected Integer totalJugadorsParticipants;
	
}


