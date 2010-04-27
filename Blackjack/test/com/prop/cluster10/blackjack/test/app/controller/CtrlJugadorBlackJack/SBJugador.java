package com.prop.cluster10.blackjack.test.app.controller.CtrlJugadorBlackJack;



import java.util.List;




public class SBJugador {
	
	protected String nom;
	protected int cash = 500;
	protected int aposta = 100;
	protected List<SBCarta> ma;
	
	public List<SBCarta> getMa() {
		return ma;
	}

	public void setMa(List<SBCarta> ma) {
		this.ma = ma;
	}
	
	public void setAposta(int aposta) {
		this.aposta = aposta;
	}
	
	public int getAposta() {
		return aposta;
	}

	public int getCash() {
		return cash;
	}

	public void setCash(int cash) {
		this.cash = cash;
	}
	
	public void afageixCarta(SBCarta c) {
		ma.add(c);
	}
	
}
