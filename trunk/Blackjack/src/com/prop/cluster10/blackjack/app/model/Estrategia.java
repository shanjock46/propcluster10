import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author Albert De Nova
 *
 */
public class Estrategia {

	private List<ReglaFinal> llistatReglesFinals;
	private JugadorStub jugador;
	private Map<String, Object> frases;
	private Accio accioDefecte;

	public Estrategia() {
		llistatReglesFinals = new ArrayList<ReglaFinal>();
	}

	public Estrategia(List<ReglaFinal> llistatReglesFinals, Accio accioDefecte) {
		this.llistatReglesFinals = llistatReglesFinals;
		this.accioDefecte = accioDefecte;
	}

	/**
	 * Afegeix una nova regla al llistat de les ja existents
	 * 
	 * @param reglaFinal
	 */
	public void afegirRegla(ReglaFinal reglaFinal) {
		llistatReglesFinals.add(reglaFinal);
	}

	/**
	 * Avalua totes les regles de l'estrategia en funci— de la mˆ que te el
	 * jugador
	 * 
	 * @return accio a realitzar
	 */
	public Accio avaluaRegles() {
		// Ordenamos reglas
		Collections.sort(llistatReglesFinals, new ComparadorRegla());

		Iterator<ReglaFinal> reglaFinalIterator = llistatReglesFinals.iterator();
		boolean reglaSeCumple = false;
		ReglaFinal reglaFinal = null;

		// Iteramos sobre cada regla
		while (!reglaSeCumple && reglaFinalIterator.hasNext()) {
			reglaFinal = reglaFinalIterator.next();
			reglaSeCumple = avaluaReglaFinal(reglaFinal);
		}

		if (reglaSeCumple && reglaFinal.getAccio() != null) {
			return reglaFinal.getAccio();
		}

		return accioDefecte;
	}

	/* PRIVATE */
	private boolean avaluaReglaFinal(ReglaFinal reglaFinal) {
		boolean reglaSeCumple = false;

		// Comprovamos de que tipo se trata
		if (reglaFinal instanceof ReglaSimple) {
			// Si es simple la evaluamos directamente como tal
			reglaSeCumple = avaluaReglaSimple((ReglaSimple) reglaFinal);
		} else {
			// Si es compuesta ser‡ necesario evaluarla de otra forma
			reglaSeCumple = avaluaReglaComposta((ReglaComposta) reglaFinal);
		}

		return reglaSeCumple;
	}

	@SuppressWarnings("unchecked")
	private boolean avaluaReglaSimple(ReglaSimple reglaSimple) {
		if (reglaSimple.getFrase() != null) {
			// Si no est‡ en el Map obviamente no se cumple
			if (!frases.containsKey(reglaSimple.getFrase())) {
				return false;
			}
			
			Object frase = frases.get(reglaSimple.getFrase());
			// Si la regla tiene valor nulo, se cumple directamente
			if (reglaSimple.getValor() == null) {
				return true;
			}

			// Sino, comprobamos valores
			return reglaSimple.getValor() == (Integer) frase;
		} else {
			try {
				// Navegaci— per OGNL de l'objecte jugador
				Object claseActual = jugador;
				Class propietatClaseActual = jugador.getClass();
				String propietat = null;

				if (reglaSimple.getPropietat().contains(".")) {
					String[] jugadorOGNL = reglaSimple.getPropietat().split("\\.");

					int propietatActual = 0;
					for (propietatActual = 0; propietatActual < jugadorOGNL.length - 1; ++propietatActual) {
						propietat = jugadorOGNL[propietatActual];
						propietatClaseActual = propietatClaseActual.getMethod("get" + capitalize(propietat),
								new Class[] {}).invoke(claseActual, new Object[] {}).getClass();
						claseActual = propietatClaseActual.getConstructor(new Class[] {}).newInstance((Object[]) null);
					}

					propietat = jugadorOGNL[propietatActual];
				} else {
					propietat = reglaSimple.getPropietat();
				}
				Integer valorPropietat = (Integer) propietatClaseActual.getMethod("get" + capitalize(propietat),
						new Class[] {}).invoke(claseActual, new Object[] {});

				if (reglaSimple.getTipusComparacio().equals(ReglaSimple.COMPARACIO_IGUAL)) {
					return valorPropietat == reglaSimple.getValor();
				} else if (reglaSimple.getTipusComparacio().equals(ReglaSimple.COMPARACIO_MAJOR)) {
					return valorPropietat > reglaSimple.getValor();
				} else if (reglaSimple.getTipusComparacio().equals(ReglaSimple.COMPARACIO_MENOR)) {
					return valorPropietat < reglaSimple.getValor();
				} else if (reglaSimple.getTipusComparacio().equals(ReglaSimple.COMPARACIO_MAJOR_IGUAL)) {
					return valorPropietat >= reglaSimple.getValor();
				} else if (reglaSimple.getTipusComparacio().equals(ReglaSimple.COMPARACIO_MENOR_IGUAL)) {
					return valorPropietat <= reglaSimple.getValor();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	private boolean avaluaReglaComposta(ReglaComposta reglaComposta) {
		boolean primeraReglaEsCompleix = avaluaReglaFinal(reglaComposta.getPrimeraRegla());
		
		// Si la primera es compleix i la operacio es "or" ja podem tornar que si
		if (primeraReglaEsCompleix
				&& reglaComposta.getTipusComparacio().equals(ReglaComposta.OPERACIO_OR)) {
			return true;
		}
		
		// Si la primera no es compleix i la operacio es "and" ja podem tornar que no
		if (!primeraReglaEsCompleix
				&& reglaComposta.getTipusComparacio().equals(ReglaComposta.OPERACIO_AND)) {
			return false;
		}
		
		
		// En cas contrari evaluem la segona regla
		boolean segonaReglaEsCompleix = avaluaReglaFinal(reglaComposta.getSegonaRegla());
		
		if (reglaComposta.getTipusComparacio().equals(ReglaComposta.OPERACIO_AND)) {
			return primeraReglaEsCompleix & segonaReglaEsCompleix;
		} else if (reglaComposta.getTipusComparacio().equals(ReglaComposta.OPERACIO_OR)) {
			return primeraReglaEsCompleix | segonaReglaEsCompleix;
		} else if (reglaComposta.getTipusComparacio().equals(ReglaComposta.OPERACIO_XOR)) {
			return primeraReglaEsCompleix ^ segonaReglaEsCompleix;
		}

		return false;
	}

	private static String capitalize(String s) {
		if (s.length() == 0)
			return s;
		return s.substring(0, 1).toUpperCase() + s.substring(1);
	}

	/* GETTERS & SETTERS */
	public List<ReglaFinal> getLlistatReglesFinals() {
		return llistatReglesFinals;
	}

	public void setLlistatReglesFinals(List<ReglaFinal> reglaFinalList) {
		this.llistatReglesFinals = reglaFinalList;
	}

	public JugadorStub getJugador() {
		return jugador;
	}

	public void setJugador(JugadorStub jugador) {
		this.jugador = jugador;
	}

	public Map<String, Object> getFrases() {
		return frases;
	}

	public void setFrases(Map<String, Object> frases) {
		this.frases = frases;
	}

	public Accio getAccioDefecte() {
		return accioDefecte;
	}

	public void setAccioDefecte(Accio accioDefecte) {
		this.accioDefecte = accioDefecte;
	}

}
