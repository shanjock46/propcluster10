package CtrlEstrategia;

public class ReglaComposta extends ReglaFinal {

	private ReglaFinal regla1;
	private ReglaFinal regla2;
	private String comparacio;

	public ReglaComposta() {
		nom = null;
		regla1 = null;
		regla2 = null;
		comparacio = null;
		prioritat = null;
		accio = null;
	}

	public ReglaComposta(String n, ReglaFinal a, ReglaFinal b, String comp) {

                nom = n;
		regla1 = a;
		regla2 = b;
		comparacio = comp;
		
	}

    
    public ReglaFinal getRegla1() {
        return regla1;
    }

 
    public void setRegla1(ReglaFinal r1) {
        regla1 = r1;
    }

  
    public ReglaFinal getRegla2() {
        return regla2;
    }

    
    public void setRegla2(ReglaFinal r2) {
        regla2 = r2;
    }

   
    public String getComparacio() {
        return comparacio;
    }

   
    public void setComparacio(String comp) {
        comparacio = comp;
    }

		
}
