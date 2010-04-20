package Estrategia;

import ReglaFinal.ReglaFinal;
import java.util.List;

public class Estrategia {

	private List<ReglaFinal> reglaFinalList;

	
	/**
	 * Evalua totes les regles de l'estrategia en funci� de la m� que te el jugador
	 * 
	 * @return accio a realitzar
	 */
	public String avaluaRegles(boolean[] frase) {
		//TODO: TOT
		
		//Iterem sobre cada regla
		//Per cada regla comprovem si es Simple o Composta
		//Si es simple mirem si es complix
		//Si es composta, anem recorrent fins que trobem una simple
		
		return null;
	}
	
	
	/* GETTERS & SETTERS */
	public List<ReglaFinal> getReglaFinalList() {
		return reglaFinalList;
	}

	public void setReglaFinalList(List<ReglaFinal> reglaFinalList) {
		this.reglaFinalList = reglaFinalList;
	}
	
}
