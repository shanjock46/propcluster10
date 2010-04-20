package Estrategia;



public class ReglaSimple extends ReglaFinal {

	private String frase;
	private Integer valor;

	public ReglaSimple() {
	}

	public ReglaSimple(String nom, String frase, Integer pes, Double probabilitatVictoria, Double probabilitatMillora) {
		this.frase = frase;
		this.nom = nom;
		this.pes = pes;
		this.probabilitatVictoria = probabilitatVictoria;
		this.probabilitatMillora = probabilitatMillora;		
	}

	/* GETTERS & SETTERS */
	public String getFrase() {
		return frase;
	}

	public void setFrase(String frase) {
		this.frase = frase;
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

}
