package classes;

import java.util.List;

public class SBJugador {
	protected String nom;
	protected int cash = 500;
	protected int aposta = 100;
	protected List<SBCarta> ma;
	
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
	
}
