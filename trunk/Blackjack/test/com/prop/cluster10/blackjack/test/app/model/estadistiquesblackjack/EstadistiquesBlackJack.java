package com.prop.cluster10.blackjack.test.app.model.estadistiquesblackjack;
//Hantaro's Work

public class EstadistiquesBlackJack extends SBEstadistiques{
	private int fitxes;

	public EstadistiquesBlackJack() {
		this.fitxes = -1;
	}
	
	public void setFitxes(int fitxes) {
		this.fitxes = fitxes;
	}

	public int getFitxes() {
		if(fitxes == -1) return 0; 
		else return fitxes;
	}
	
	public double getFitxesRonda() {
		return (fitxes/rondesJugades);
	}
	
}
