package com.prop.cluster10.blackjack.app.model;

import com.prop.cluster10.blackjack.test.app.model.estadistiquesblackjack.SBEstadistiques;
//Hantaro's Work

public class EstadistiquesBlackJack extends SBEstadistiques{
	private int fitxes;

	public EstadistiquesBlackJack() {
		this.fitxes = 0;
	}
	
	public void setFitxes(int fitxes) {
		this.fitxes = fitxes;
	}

	public int getFitxes() {
		return fitxes;
	}
	
	public double getFitxesRonda() {
		return (fitxes/rondesJugades);
	}
	
}
