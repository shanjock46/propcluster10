package com.prop.cluster10.blackjack.app.model;

import java.util.HashMap;

import com.prop.cluster10.common.app.model.EstadistiquesGenerals;


public class EstadistiquesGeneralsBlackJack extends EstadistiquesGenerals {
		
	EstadistiquesGeneralsBlackJack() {
		blackJacks = -1;
		asseguratsGuanyats = -1;
		totalPartidesJugades = -1;
		totalRondesJugades = -1;
		totalJugadorsParticipants = -1;
	}
	
	private int blackJacks;
	private int asseguratsGuanyats;
	
	public int getBlackJacks() {
		if (blackJacks == -1) return 0;
		return blackJacks;
	}
	public void setBlackJacks(int blackjacks) {
		this.blackJacks = blackjacks;
	}
	public int getAsseguratsGuanyats() {
		if (asseguratsGuanyats == -1) return 0;
		else return asseguratsGuanyats;
	}
	public void setAsseguratsGuanyats(int asseguratsGuanyats) {
		this.asseguratsGuanyats = asseguratsGuanyats;
	}
	
	public double getMitjanaBlackJacksPartida() {
		double mitjana = 0;
		if (totalPartidesJugades > 0 && blackJacks != -1) {
			mitjana = (double) blackJacks / (double) totalPartidesJugades;
		}
		return mitjana;
	}
	
	public HashMap<String, Object> carregaEstadistiquesGenerals() {
		HashMap <String, Object> est = new HashMap <String, Object>();
		if (totalPartidesJugades != -1) est.put("totalPartidesJugades", totalPartidesJugades);
		else est.put("totalPartidesJugades", 0);
		if (totalJugadorsParticipants != -1) est.put("totalJugadorsParticipants", totalJugadorsParticipants);
		else est.put("totalJugadorsParticipants", 0);
		if (totalRondesJugades != -1) est.put("totalRondesJugades", totalRondesJugades);
		else est.put("totalRondesJugades", 0);
		if (blackJacks != -1) est.put("blackJacks", blackJacks);
		else est.put("blackJacks", 0);
		if (asseguratsGuanyats != -1) est.put("asseguratsGuanyats", asseguratsGuanyats);
		else est.put("asseguratsGuanyats", 0);
		est.put("mitjanaJugadorsPartida", mitjanaJugadorsPartida());
		est.put("mitjanaRondesPartida", mitjanaRondesPartida());
		est.put("mitjanaBlackJacksPartida", getMitjanaBlackJacksPartida());
		return est;	
		
	}
	
	
}
