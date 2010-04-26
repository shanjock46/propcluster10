package com.prop.cluster10.common.test.app.model.baralla;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Albert De Nova Santana
 */
public class BarallaFrancesa extends Baralla {

	public static final String PAL_CORS = "cors";
	public static final String PAL_PIQUES = "piques";
	public static final String PAL_TREVOLS = "trevols";
	public static final String PAL_DIAMANTS = "diamants";
	public static final String COMODIN = "comodin";
	
	public BarallaFrancesa() {		
	}

	/**
	 * {Pre: El paràmetre "copies" ha de ser > 0.}
	 * {Post: Crea una nova instància de BarallaFrancesa.}
	 * 
	 * {Post: Les cartes afegides van des de 1 fins al 13 per a cadascun
	 * dels 4 pals(cors, piques, trèvols i diamants). Es crearan tantes
	 * còpies de cada carta com el paràmetre “copies” de l’operació.}}
	 
	 * {Post: En el cas de que el paràmetre comodin sigui cert s’afegiran a
	 * la Baralla 2 comodins(numero = 0, pal = comodin, valor = 0), per a
	 * cada còpia de la Baralla.}
	 **/
	public BarallaFrancesa(Integer copies, boolean comodin) {
		List<SBCarta> cartesList = new ArrayList<SBCarta>();
		SBCarta cartaActual;
		
		while(copies > 0) {
			creaPal(PAL_CORS, cartesList);
			creaPal(PAL_PIQUES, cartesList);
			creaPal(PAL_TREVOLS, cartesList);
			creaPal(PAL_DIAMANTS, cartesList);
			
			if(comodin) {
				cartaActual = new SBCarta();
				cartaActual.setNumero(0);
				cartaActual.setPal(COMODIN);
				cartaActual.setValor(0);
				cartesList.add(cartaActual);
				cartesList.add(cartaActual);
			}
			--copies;
		}
		
		this.setCartes(cartesList);
	}
	
	/* PRIVATE */
	private void creaPal(String pal, List<SBCarta> cartesList) {
		SBCarta cartaActual;
		for (int current = 1; current <= 13; current++) {
			cartaActual = new SBCarta();
			cartaActual.setNumero(current);
			cartaActual.setPal(pal);
			if(current == 1) {
				cartaActual.setValor(11);
			} else if(current <= 10) {
				cartaActual.setValor(current);
			}
			else {
				cartaActual.setValor(10);
			}
			
			cartesList.add(cartaActual);
		}		
	}
}
