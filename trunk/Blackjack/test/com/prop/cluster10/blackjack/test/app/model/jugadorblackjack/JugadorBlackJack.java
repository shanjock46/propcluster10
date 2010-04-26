package com.prop.cluster10.blackjack.test.app.model.jugadorblackjack;

//Antar Moratona Franco

import java.util.ArrayList;
import java.util.List;

import com.prop.cluster10.blackjack.test.app.controller.CtrlJugadorBlackJack.SBCarta;



public class JugadorBlackJack extends SBJugador {
	private List<SBCarta> segonaMa;
	private int apostaSegonaMa;
	private int fitxesAssegurar;
	
	public JugadorBlackJack() {
		ma = new ArrayList<SBCarta>();
		segonaMa = new ArrayList<SBCarta>();
		setFitxesSegonaMa(0);
		fitxesAssegurar = 0;
	}
	
	public int getFitxesAssegurar() {
		return fitxesAssegurar;
	}

	public void setFitxesAssegurar(int f) {
		if(f <= cash) this.fitxesAssegurar = f;
	}

	public void doblarAposta() {
		if(aposta <= cash) { //estem doblant, l'aposta inicial ja esta restada
			setAposta(getAposta() * 2);
			setCash( getCash()- aposta);
		}
	}
	
	
	public void divideixMa() {
		if(aposta <= cash) {
			int k = ma.size();
			if(k == 2 && ma.get(0).getNumero() == ma.get(1).getNumero()) {
				segonaMa.add(ma.get(k-1));
				ma.remove(k-1);
			}
		}
	}

	public void setSegonaMa(List<SBCarta> segonaMa) {
		this.segonaMa = segonaMa;
	}

	public List<SBCarta> getSegonaMa() {
		return segonaMa;
	}
	
	public int evaluaMa() {
		int valor = 0;
		int asos = 0;
		for(int i = 0; i < ma.size(); ++i) {
			int k = ma.get(i).getValor();
			valor += k;
			if (k == 11) ++asos;
		}
		while(valor > 21 && asos > 0) {
			--asos;
			valor -= 10;
		}
		return valor;
	}
	
	public int evaluaSegonaMa() {
		int valor = 0;
		int asos = 0;
		for(int i = 0; i < segonaMa.size(); ++i) {
			int k = segonaMa.get(i).getValor();
			valor += k;
			if (k == 11) ++asos;
		}
		while(valor > 21 && asos > 0) {
			--asos;
			valor -= 10;
		}
		return valor;
	}

	public void setFitxesSegonaMa(int fitxesSegonaMa) {
		this.apostaSegonaMa = fitxesSegonaMa;
	}

	public int getFitxesSegonaMa() {
		return apostaSegonaMa;
	}
}
