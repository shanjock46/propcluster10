package Estrategia;

public class ReglaComposta extends ReglaFinal {

	private ReglaFinal regla1;
	private ReglaFinal regla2;
	private String comparacio;

	public ReglaComposta() {
		this.nom = null;
		this.regla1 = null;
		this.regla2 = null;
		this.comparacio = null;
		this.prioritat = null;
		this.accio = null;
	}

	public ReglaComposta(String nom, ReglaFinal a, ReglaFinal b, String comp) {

                this.nom = nom;
		this.regla1 = a;
		this.regla2 = b;
		this.comparacio = comp;
		
	}

    
    public ReglaFinal getRegla1() {
        return regla1;
    }

 
    public void setRegla1(ReglaFinal regla1) {
        this.regla1 = regla1;
    }

  
    public ReglaFinal getRegla2() {
        return regla2;
    }

    
    public void setRegla2(ReglaFinal regla2) {
        this.regla2 = regla2;
    }

   
    public String getComparacio() {
        return comparacio;
    }

   
    public void setComparacio(String comparacio) {
        this.comparacio = comparacio;
    }

		
}
