/**
 * 
 * @author Albert De Nova
 *
 */
public class ReglaSimple extends ReglaFinal {

	public static final String COMPARACIO_MAJOR = "major";
	public static final String COMPARACIO_MENOR = "menor";
	public static final String COMPARACIO_IGUAL = "igual";
	public static final String COMPARACIO_MAJOR_IGUAL = "major_igual";
	public static final String COMPARACIO_MENOR_IGUAL = "menor_igual";
	
	private Integer valor;
	private String frase;
	private String propietat;
	private String tipusComparacio;

	public ReglaSimple() {
		this.valor = null;
		this.frase = null;
		this.propietat = null;
		this.tipusComparacio = null;
	}

	public ReglaSimple(String nom, String frase, Integer valor, Integer prioritat) {
		this.nom = nom;
		this.frase = frase;
		this.valor = valor;
		this.prioritat = prioritat;	
	}
	
	public ReglaSimple(String nom, String propietat, String tipusComparacio, Integer valor, Integer prioritat) {
		this.nom = nom;
		this.propietat = propietat;
		this.tipusComparacio = tipusComparacio;
		this.valor = valor;
		this.prioritat = prioritat;
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

	public String getPropietat() {
		return propietat;
	}

	public void setPropietat(String propietat) {
		this.propietat = propietat;
	}

	public String getTipusComparacio() {
		return tipusComparacio;
	}

	public void setTipusComparacio(String comparacio) {
		this.tipusComparacio = comparacio;
	}

}
