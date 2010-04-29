package Estrategia;

public abstract class ReglaFinal {

	protected String nom;
	protected Integer prioritat;
	protected String accio;
	
	/* GETTERS & SETTERS */
	public String getNom() {
		return nom;
	}
	
	public void setNom(String n) {
		nom = n;
	}
	
	public Integer getPrioritat() {
		return prioritat;
	}
	
	public void setPrioritat(Integer pes) {
		prioritat = pes;
	}
	
	public String getAccio() {
		return accio;
	}
	
	public void setAccio(String ac) {
		accio = ac;
	}

}
