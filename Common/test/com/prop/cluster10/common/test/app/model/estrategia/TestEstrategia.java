package com.prop.cluster10.common.test.app.model.estrategia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.prop.cluster10.common.app.model.Accio;
import com.prop.cluster10.common.app.model.ReglaComposta;
import com.prop.cluster10.common.app.model.ReglaFinal;
import com.prop.cluster10.common.app.model.ReglaSimple;
import com.prop.cluster10.common.test.app.model.baralla.inout;

/**
 * 
 * @author Albert De Nova
 * 
 */
public class TestEstrategia {

	private static inout io;

	public static void main(String[] args) {
		try {
			int operacio = -1;

			io = new inout();
			Estrategia estrategia = new Estrategia();

			io.writeln("1- Crear Estrategia sense arguments");
			io.writeln("2- Crear Estrategia amb llistat de regles i accio per defecte");
			io.writeln("3- Afegir regla");
			io.writeln("4- Introduir jugador");
			io.writeln("5- Obtenir jugador");
			io.writeln("6- Introduir frases");
			io.writeln("7- Obtenir frases");
			io.writeln("8- Introduir accio per defecte");
			io.writeln("9- Obtenir accio per defecte");
			io.writeln("10- Avaluar regles");
			io.writeln("11- Llistar regles");
			io.writeln("0- Sortir");

			while (operacio != 0) {
				operacio = io.readint();
				switch (operacio) {
				case 1:
					estrategia = new Estrategia();
					io.writeln("Creada nova estrategia sense arguments");
					break;
				case 2:
					List<ReglaFinal> llistatRegles = crearLlistatRegles();
					io.writeln("Escull l'accio per defecte a realitzar si no hi ha cap regla que es compleixi");
					io.writeln("1-PLANTARSE");
					io.writeln("2-DOBLARSE");
					io.writeln("3-RETIRARSE");
					io.writeln("4-ASEGURAR");

					int tipus = io.readint();
					Accio accioDefecte = null;
					switch (tipus) {
					case 1:
						accioDefecte = Accio.PLANTARSE;
						break;
					case 2:
						accioDefecte = Accio.DOBLARSE;
						break;
					case 3:
						accioDefecte = Accio.RETIRARSE;
						break;
					case 4:
						accioDefecte = Accio.ASEGURAR;
						break;
					}

					estrategia = new Estrategia(llistatRegles, accioDefecte);
					io.writeln("Creada nova estrategia amb llistat de regles");
					break;
				case 3:
					ReglaFinal reglaFinal = crearRegla(estrategia.getLlistatReglesFinals());
					estrategia.afegirRegla(reglaFinal);
					io.writeln("Afegida nova regla");
					break;
				case 4:
					estrategia.setJugador(crearJugador());
					io.writeln("Jugador agregat");
					break;
				case 5:
					io.writeln("Jugador");
					io.writeln("Nom: " + estrategia.getJugador().getNom());
					io.writeln("Cash: " + estrategia.getJugador().getCash());
					io.writeln("Aposta: " + estrategia.getJugador().getAposta());
					io.writeln("Ma: ");
					ArrayList<CartaStub> ma = estrategia.getJugador().getMa();
					for (CartaStub cartaStub : ma) {
						cartaStub.testEscriuCarta();
					}
					io.writeln("Estadistiques: ");
					io.writeln("PartidesJugades: " + estrategia.getJugador().getEst().getPartidesJugades());
					io.writeln("PartidesGuanyades: " + estrategia.getJugador().getEst().getPartidesGuanyades());
					io.writeln("PartidesEliminat: " + estrategia.getJugador().getEst().getPartidesEliminat());
					io.writeln("RondesJugades: " + estrategia.getJugador().getEst().getRondesJugades());
					io.writeln("RondesGuanyades: " + estrategia.getJugador().getEst().getRondesGuanyades());
					io.writeln("RondesPerdudes: " + estrategia.getJugador().getEst().getRondesPerdudes());
					io.writeln("FitxesGuanyades: " + estrategia.getJugador().getEst().getFitxesGuanyades());
					break;
				case 6:
					estrategia.setFrases(crearFrases());
					io.writeln("Frases agregades");
					break;
				case 7:
					io.writeln("Frases");
					Map<String, Object> frases = estrategia.getFrases();
					Iterator<String> frasesIterator = frases.keySet().iterator();
					String frase;
					while (frasesIterator.hasNext()) {
						frase = frasesIterator.next();
						io.writeln("Frase: " + frase + " | Valor: " + frases.get(frase));
					}
					break;
				case 8:
					io.writeln("Escull l'accio per defecte a realitzar si no hi ha cap regla que es compleixi");
					io.writeln("1-PLANTARSE");
					io.writeln("2-DOBLARSE");
					io.writeln("3-RETIRARSE");
					io.writeln("4-ASEGURAR");

					tipus = io.readint();
					accioDefecte = null;
					switch (tipus) {
					case 1:
						accioDefecte = Accio.PLANTARSE;
						break;
					case 2:
						accioDefecte = Accio.DOBLARSE;
						break;
					case 3:
						accioDefecte = Accio.RETIRARSE;
						break;
					case 4:
						accioDefecte = Accio.ASEGURAR;
						break;
					}
					estrategia.setAccioDefecte(accioDefecte);
					break;
				case 9:
					io.writeln("Accio per defecte: " + estrategia.getAccioDefecte());
					break;
				case 10:
					io.writeln("L'accio a realitzar es:" + estrategia.avaluaRegles());
					break;
				case 11:
					io.writeln("Regles");
					List<ReglaFinal> reglaFinalList = estrategia.getLlistatReglesFinals();
					for (ReglaFinal reglaFinal2 : reglaFinalList) {
						System.out.println("- " + reglaFinal2.getNom() + ", Prioritat: " + reglaFinal2.getPrioritat());
					}
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static List<ReglaFinal> crearLlistatRegles() throws Exception {
		List<ReglaFinal> reglaFinalList = new ArrayList<ReglaFinal>();
		io.writeln("Crear llistat regles");
		io.writeln("1- Afegir nova regla");
		io.writeln("0- Sortir");

		int operacio = io.readint();
		while (operacio != 0) {
			reglaFinalList.add(crearRegla(reglaFinalList));
			io.writeln("Regla afegida");
			operacio = io.readint();
		}

		return reglaFinalList;
	}

	private static ReglaFinal crearRegla(List<ReglaFinal> reglaFinalList) throws Exception {
		io.writeln("Crear regla");
		io.writeln("Indica el tipus de regla: 1 - Simple, 2 - Composta");

		int tipus = io.readint();
		if (tipus == 1) {
			ReglaSimple reglaSimple = new ReglaSimple();
			io.writeln("Indica si vols crear la regla amb 1 - frase o  2 - propietat");
			tipus = io.readint();
			String nom;
			Integer valor;
			Integer prioritat;
			if (tipus == 1) {
				io.writeln("Introdueix nom");
				nom = io.readword();
				io.writeln("Introdueix frase");
				String frase = io.readword();
				io.writeln("Indica: 1 - Introduir valor, 2 - No introduir valor");
				tipus = io.readint();
				if(tipus == 1) {
					io.writeln("Introdueix valor");
					valor = io.readint();
				} else {
					valor = null;
				}
				io.writeln("Introdueix prioritat");
				prioritat = io.readint();
				reglaSimple = new ReglaSimple(nom, frase, valor, prioritat);
			} else {
				io.writeln("Introdueix nom");
				nom = io.readword();
				io.writeln("Introdueix propietat");
				String propietat = io.readword();
				io
						.writeln("Introdueix tipus de comparacio: 1- major, 2-menor, 3-igual, 4-major o igual, 5-menor o igual");
				tipus = io.readint();
				String tipusComparacio = null;
				switch (tipus) {
				case 1:
					tipusComparacio = ReglaSimple.COMPARACIO_MAJOR;
					break;
				case 2:
					tipusComparacio = ReglaSimple.COMPARACIO_MENOR;
					break;
				case 3:
					tipusComparacio = ReglaSimple.COMPARACIO_IGUAL;
					break;
				case 4:
					tipusComparacio = ReglaSimple.COMPARACIO_MAJOR_IGUAL;
					break;
				case 5:
					tipusComparacio = ReglaSimple.COMPARACIO_MENOR_IGUAL;
					break;
				}
				io.writeln("Introdueix valor");
				valor = io.readint();
				io.writeln("Introdueix prioritat");
				prioritat = io.readint();
				reglaSimple = new ReglaSimple(nom, propietat, tipusComparacio, valor, prioritat);
			}

			io.writeln("Escull l'accio a realitzar");
			io.writeln("1-PLANTARSE");
			io.writeln("2-DOBLARSE");
			io.writeln("3-RETIRARSE");
			io.writeln("4-ASEGURAR");
			io.writeln("5-CAP");

			tipus = io.readint();
			switch (tipus) {
			case 1:
				reglaSimple.setAccio(Accio.PLANTARSE);
				break;
			case 2:
				reglaSimple.setAccio(Accio.DOBLARSE);
				break;
			case 3:
				reglaSimple.setAccio(Accio.RETIRARSE);
				break;
			case 4:
				reglaSimple.setAccio(Accio.ASEGURAR);
				break;
			}

			return reglaSimple;
		} else {
			ReglaComposta reglaComposta = new ReglaComposta();
			io.writeln("Introdueix nom");
			String nom = io.readword();
			reglaComposta.setNom(nom);

			io.writeln("Primera regla");
			io.writeln("Desitjes: 1- Crear nova regla, 2 - Fer servir regla del llistat");
			tipus = io.readint();
			ReglaFinal primeraRegla;
			if (tipus == 1) {
				primeraRegla = crearRegla(reglaFinalList);
			} else {
				primeraRegla = escollirReglaLlistat(reglaFinalList);
			}
			reglaComposta.setPrimeraRegla(primeraRegla);

			io.writeln("Segona regla");
			io.writeln("Desitjes: 1- Crear nova regla, 2 - Fer servir regla del llistat");
			tipus = io.readint();
			ReglaFinal segonaRegla;
			if (tipus == 1) {
				segonaRegla = crearRegla(reglaFinalList);
			} else {
				segonaRegla = escollirReglaLlistat(reglaFinalList);
			}
			reglaComposta.setSegonaRegla(segonaRegla);

			io.writeln("Introdueix tipus de comparacio entre regles: 1 - AND, 2- OR, 3 - XOR");
			tipus = io.readint();
			switch (tipus) {
			case 1:
				reglaComposta.setTipusComparacio(ReglaComposta.OPERACIO_AND);
				break;
			case 2:
				reglaComposta.setTipusComparacio(ReglaComposta.OPERACIO_OR);
				break;
			case 3:
				reglaComposta.setTipusComparacio(ReglaComposta.OPERACIO_XOR);
				break;
			}
			io.writeln("Introdueix prioritat");
			Integer prioritat = io.readint();
			reglaComposta.setPrioritat(prioritat);
			
			io.writeln("Escull l'accio a realitzar");
			io.writeln("1-PLANTARSE");
			io.writeln("2-DOBLARSE");
			io.writeln("3-RETIRARSE");
			io.writeln("4-ASEGURAR");
			io.writeln("5-CAP");

			tipus = io.readint();
			switch (tipus) {
			case 1:
				reglaComposta.setAccio(Accio.PLANTARSE);
				break;
			case 2:
				reglaComposta.setAccio(Accio.DOBLARSE);
				break;
			case 3:
				reglaComposta.setAccio(Accio.RETIRARSE);
				break;
			case 4:
				reglaComposta.setAccio(Accio.ASEGURAR);
				break;
			}
			
			return reglaComposta;
		}
	}

	private static JugadorStub crearJugador() throws Exception {
		JugadorStub jugadorStub = new JugadorStub();
		io.writeln("Crear jugador");
		io.writeln("Introdueix nom:");
		jugadorStub.setNom(io.readword());
		io.writeln("Introdueix cash:");
		jugadorStub.setCash(io.readint());
		io.writeln("Introdueix aposta:");
		jugadorStub.setAposta(io.readint());
		jugadorStub.setEst(new EstadistiquesStub());
		io.writeln("Crea la ma del jugador:");
		ArrayList<CartaStub> ma = new ArrayList<CartaStub>();
		io.writeln("1- Afegir carta");
		io.writeln("0- Sortir");
		int tipus = io.readint();
		while (tipus != 0) {
			ma.add(crearCarta());
			io.writeln("1- Afegir carta");
			io.writeln("0- Sortir");
			tipus = io.readint();
		}
		jugadorStub.setMa(ma);
		return jugadorStub;
	}

	private static CartaStub crearCarta() throws Exception {
		io.writeln("Crear carta");
		CartaStub cartaStub = new CartaStub();
		io.writeln("Indica el pal");
		cartaStub.setPal(io.readword());
		io.writeln("Indica el numero");
		cartaStub.setNumero(io.readint());
		io.writeln("Indica el valor");
		cartaStub.setValor(io.readint());
		return cartaStub;
	}

	private static Map<String, Object> crearFrases() throws Exception {
		Map<String, Object> frases = new HashMap<String, Object>();
		io.writeln("Crear frases");
		io.writeln("1 - Introduir frase");
		io.writeln("0 - Sortir");
		int tipus = io.readint();
		String frase = null;
		Integer valor = null;
		while (tipus != 0) {
			frase = null;
			valor = null;
			io.writeln("Introdueix frase");
			frase = io.readword();
			io.writeln("Vols introduir valor (integer)? 1- Si, 2 - No");
			tipus = io.readint();
			if (tipus == 1) {
				io.writeln("Introdueix valor");
				valor = io.readint();
			}
			frases.put(frase, valor);
			io.writeln("Frase agregada");
			tipus = io.readint();
		}
		return frases;
	}

	private static ReglaFinal escollirReglaLlistat(List<ReglaFinal> reglaFinalList) throws Exception {
		io.writeln("Regles disponibles:");
		int i = 0;
		for (ReglaFinal reglaFinal : reglaFinalList) {
			io.writeln(i + "- " + reglaFinal.getNom());
			++i;
		}
		int tipus = io.readint();
		return reglaFinalList.get(tipus);
	}
}
