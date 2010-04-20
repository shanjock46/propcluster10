package ReglaComposta;

import ReglaFinal.ReglaFinal;

public class ReglaComposta extends ReglaFinal {

	private ReglaFinal primeraRegla;
	private ReglaFinal segonaRegla;
	private String operacio;
	
	public ReglaComposta() {}
	
	public ReglaComposta(String nom, ReglaFinal primeraRegla, ReglaFinal segonaRegla, String operacio, Integer pes, Double probabilitatVictoria, Double probabilitatMillora) {		
		this.nom = nom;
		this.primeraRegla = primeraRegla;
		this.segonaRegla = segonaRegla;
		this.operacio = operacio;
		this.pes = pes;
		this.probabilitatVictoria = probabilitatVictoria;
		this.probabilitatMillora = probabilitatMillora;		
	}

	/* GETTERS & SETTERS */
	public ReglaFinal getSegonaRegla() {
		return segonaRegla;
	}

	public void setSegonaRegla(ReglaFinal segonaRegla) {
		this.segonaRegla = segonaRegla;
	}

	public ReglaFinal getPrimeraRegla() {
		return primeraRegla;
	}

	public void setPrimeraRegla(ReglaFinal primeraRegla) {
		this.primeraRegla = primeraRegla;
	}

	public String getOperacio() {
		return operacio;
	}

	public void setOperacio(String operacio) {
		this.operacio = operacio;
	}
	
}
