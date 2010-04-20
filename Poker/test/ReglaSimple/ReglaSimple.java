package ReglaSimple;

import ReglaFinal.ReglaFinal;

public class ReglaSimple extends ReglaFinal {

	private boolean[] frase;
	private Integer valor;

	public ReglaSimple() {
	}

	public ReglaSimple(String nom, boolean[] frase, Integer pes, Double probabilitatVictoria, Double probabilitatMillora) {
		this.frase = frase;
		this.nom = nom;
		this.pes = pes;
		this.probabilitatVictoria = probabilitatVictoria;
		this.probabilitatMillora = probabilitatMillora;		
	}

	/* GETTERS & SETTERS */
	public boolean[] getFrase() {
		return frase;
	}

	public void setFrase(boolean[] frase) {
		this.frase = frase;
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

}
