package Estrategia;

public class ReglaSimple extends ReglaFinal {

	private String frase;

	public ReglaSimple() {
            this.frase = null;
            this.nom = null;
            
	}

	public ReglaSimple(String a, String b) {
            this.nom = a;
            this.frase = b;
            this.accio = null;
            this.prioritat = null;
	}

    
        public String getFrase() {
            return this.frase;
        }


        public void setFrase(String a) {
            this.frase = a;
        }
	
	
}
