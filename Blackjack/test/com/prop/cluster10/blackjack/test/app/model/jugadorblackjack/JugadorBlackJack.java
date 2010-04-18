package com.prop.cluster10.blackjack.test.app.model.jugadorblackjack;

import java.util.ArrayList;
import java.util.List;

import com.prop.cluster10.common.test.app.model.baralla.SBCarta;


// Hantaro's work

public class JugadorBlackJack extends SBJugador {
	private List<SBCarta> segonaMa;
	private int fitxesAssegurar;
	
	public JugadorBlackJack() {
		ma = new ArrayList<SBCarta>();
		segonaMa = new ArrayList<SBCarta>();
		SBCarta carta = new SBCarta();
		carta.setNumero(10);
		carta.setPal("piques");
		carta.setValor(0);
		ma.add(carta);
		ma.add(carta);
	}
	
	public int getFitxesAssegurar() {
		return fitxesAssegurar;
	}

	public void setFitxesAssegurar(int fitxesAssegurar) {
		this.fitxesAssegurar = fitxesAssegurar;
	}

	public void doblarAposta() {
		setAposta(getAposta() * 2);
		setCash( getCash()- aposta);
	}
	
	public void divideixMa() {
		//pre: a la ma del jugador només hi ha dues cartes que son iguals
		//Post: s'ha creat una segona ma que conté la segona carta que ha sortit
		int k = ma.size();
		segonaMa.add(ma.get(k-1));
		ma.remove(k-1);
	}

	public void setSegonaMa(List<SBCarta> segonaMa) {
		this.segonaMa = segonaMa;
	}

	public List<SBCarta> getSegonaMa() {
		return segonaMa;
	}
	
	
}
