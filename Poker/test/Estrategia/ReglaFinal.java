package Estrategia;



public abstract class ReglaFinal {

	protected String nom;
	protected Integer pes;
	protected Double probabilitatVictoria;
	protected Double probabilitatMillora;
	protected Accio accio;	
	
	/* GETTERS & SETTERS */
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Integer getPes() {
		return pes;
	}
	public void setPes(Integer pes) {
		this.pes = pes;
	}
	public Double getProbabilitatVictoria() {
		return probabilitatVictoria;
	}
	public void setProbabilitatVictoria(Double probabilitatVictoria) {
		this.probabilitatVictoria = probabilitatVictoria;
	}
	public Double getProbabilitatMillora() {
		return probabilitatMillora;
	}
	public void setProbabilitatMillora(Double probabilitatMillora) {
		this.probabilitatMillora = probabilitatMillora;
	}
	public Accio getAccio() {
		return accio;
	}
	public void setAccio(Accio accio) {
		this.accio = accio;
	}
	
	
	
}
