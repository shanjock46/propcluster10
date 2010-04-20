package com.prop.cluster10.remigio.app.model;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import Carta.Carta;

/**
* @author Albert Moreno Gelabert
*/
public class JugadorRemigio extends Jugador 
{
	protected enum Pals { COMODI, CORS, PIQUES, TREBOLS, DIAMANTS }
	
	public JugadorRemigio() 
	{
		this.nom = "";
		//TODO: establir un default cash
		this.cash = 5000;
		this.est = new Estadistiques();
	}
	
	public JugadorRemigio(String name, Integer cashInicial)
	{
		this.nom = name;
		this.cash = cashInicial;
		this.est = new Estadistiques();
	}
	
	//TODO: veure com s'aplica la variant de fer servir la carta visible o agafar una carta RANDOM
	public Map<String, Boolean> evaluadorMa(Carta cartaVisible)
	{
		Map<String, Boolean> resultats = new HashMap<String, Boolean>();

		//Recompte de cartes per numero
		int[] numCartesPerNumero = new int[13];
		
		//Recompte de cartes per pal
		Map<String, Integer> numCartesPerPal = new HashMap<String, Integer>();
		
		//Inicialitzacions
		for (int i = 0; i < 13; ++i) 
			numCartesPerNumero[i] = 0;
		
		for(Pals pal: JugadorRemigio.Pals.values())
			numCartesPerPal.put(pal.toString(), 0);
		
		//Recollim les dades de la ma
		for (Carta actual: this.ma)
		{
			numCartesPerPal.put(actual.getPal(), numCartesPerPal.get(actual.getPal()) + 1);
			
			if (!actual.getPal().equals(JugadorRemigio.Pals.COMODI))
				numCartesPerNumero[actual.getNumero()]++;
		}
		
		//Avaluem els resultats numerics (agrupaments)
		for (int i = 0; i < 13; ++i)
		{
			if (numCartesPerNumero[i] > 3) resultats.put("MULTI_" + i, true);
			if (numCartesPerNumero[i] == 3) resultats.put("TRIO_" + i, true);
			if (numCartesPerNumero[i] == 2) resultats.put("PARELLA_" + i, true);
			if (numCartesPerNumero[i] == 1) resultats.put("SOLA_" + i, true);
		}
		
		//TODO: mirar com calcular el tema de els escales
		if (numCartesPerPal.get(JugadorRemigio.Pals.COMODI) > 0)
		{
			int numComodins = numCartesPerPal.get(JugadorRemigio.Pals.COMODI);
			resultats.put("COMODINS_" + numComodins, true);
		}
		
		//Si tenim més d'una carta d'un mateix pal: 
		// - Mirem si és una escala completa (3 o més)
		// - Mirem si és una escala factible (és possible completar-la en poques jugades)
		if (numCartesPerPal.get(JugadorRemigio.Pals.CORS) > 1) 
			testEscala(resultats, numCartesPerPal, JugadorRemigio.Pals.CORS.toString());
		
		if (numCartesPerPal.get(JugadorRemigio.Pals.DIAMANTS) > 1) 
			testEscala(resultats, numCartesPerPal, JugadorRemigio.Pals.DIAMANTS.toString());
		
		if (numCartesPerPal.get(JugadorRemigio.Pals.PIQUES) > 1) 
			testEscala(resultats, numCartesPerPal, JugadorRemigio.Pals.PIQUES.toString());
		
		if (numCartesPerPal.get(JugadorRemigio.Pals.TREBOLS) > 1)  
			testEscala(resultats, numCartesPerPal, JugadorRemigio.Pals.TREBOLS.toString());

		return resultats;
	}
	
	private void testEscala(Map<String, Boolean> resultats, Map<String, Integer> numCartesPerPal, String pal) 
	{
		int numCartesEscala = numCartesPerPal.get(JugadorRemigio.Pals.CORS);
		boolean consecutives = true;
		boolean candidatEscala = true;

		List<Integer> nums = new LinkedList<Integer>();
		for (Carta c: this.ma)
		{
			if (c.getPal().equals(pal)) nums.add(c.getNumero()); 
		}
		Collections.sort(nums);
				
		for (int i = 1; i < nums.size(); ++i)
		{
			if (nums.get(i - 1).equals(nums.get(i) + 1) && consecutives)
			{
				consecutives = true;
				candidatEscala = true;
			}
			else if (nums.get(i - 1).equals(nums.get(i) + 2) && candidatEscala) candidatEscala = true;
			else
			{
				consecutives = false;
				candidatEscala = false;
			}
		}
			
		if (numCartesEscala >= 3 && consecutives) resultats.put("ESCALA_" + pal, true);
		if (numCartesEscala >= 2 && candidatEscala) resultats.put("PSEUDOESCALA_" + pal, true);
	}

	private void executeActionByName(String action)
	{
		try 
		{
			Method metode = this.getClass().getMethod(action, (Class[]) null);
			metode.invoke((JugadorRemigio) this, (Object[]) null);
		} 
		catch (Exception e) 
		{
			System.out.println("No existeix cap accio amb aquest nom: " + action);
			e.printStackTrace();
		}
	}
	
	/****************************************************************************
	 * Accions predefinides, que seran aplicades per l'estrategia a seguir 
	 * (Particulars per a cada joc)
	 ****************************************************************************/
	public void deixarCartaSolaMesAlta()
	{
		
	}
}
