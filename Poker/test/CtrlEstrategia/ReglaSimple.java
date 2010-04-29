package CtrlEstrategia;

public class ReglaSimple extends ReglaFinal {

	private String frase;

	public ReglaSimple() {
            frase = null;
            nom = null;
            
	}

	public ReglaSimple(String a, String b) {
            nom = a;
            frase = b;
            accio = null;
            prioritat = null;
	}

    
        public String getFrase() {
            return frase;
        }


        public void setFrase(String a) {
            frase = a;
        }
	
	
}
