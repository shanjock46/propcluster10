package com.prop.cluster10.blackjack.app.model;

import com.prop.cluster10.blackjack.test.app.model.estadistiquesblackjack.SBEstadistiques;
//Hantaro's Work

public class EstadistiquesBlackJack extends SBEstadistiques{
	private int fitxes;

	public EstadistiquesBlackJack() {
		this.fitxes = -1;
		//Inicialitzar atributs Estadistiques;
		/*
		this.partidesJugades = -1;
		this.partidesGuanyades = -1;
		this.partidesEliminat = -1
		this.rondesJugades = -1;
		this.rondesGuanyades = -1;
		this.rondesPerdudes = -1;
		this.fitxesGuanyades = -1;
		*/
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
