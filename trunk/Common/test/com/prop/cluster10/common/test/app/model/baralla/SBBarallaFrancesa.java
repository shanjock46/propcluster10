package com.prop.cluster10.common.test.app.model.baralla;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import com.prop.cluster10.common.app.model.Baralla;


public class SBBarallaFrancesa extends Baralla{
	
	SBBarallaFrancesa() {
		List<SBCarta> llista = new ArrayList<SBCarta>();
		Stack<SBCarta> st = new Stack<SBCarta>();
		for(int i = 2; i < 11; ++i) {
			SBCarta c = new SBCarta();
			SBCarta c2 = new SBCarta();
			c.setNumero(i);
			c.setPal("Diamants");
			c.setValor(0);
			llista.add(c);
			c2.setNumero(i);
			c2.setPal("Diamants");
			c2.setValor(i);
			st.push(c2);
		}
		cartes = llista;
		cartesDescartades = st;
	}

	SBBarallaFrancesa(int a, Boolean comodin) {
	
	}
}
