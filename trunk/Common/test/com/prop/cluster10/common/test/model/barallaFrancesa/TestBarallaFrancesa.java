package com.prop.cluster10.common.test.model.barallaFrancesa;

import java.util.List;

import com.prop.cluster10.common.app.model.BarallaFrancesa;
import com.prop.cluster10.common.test.model.baralla.SBCarta;
import com.prop.cluster10.common.test.model.baralla.inout;

public class TestBarallaFrancesa {

	public static void main(String[] args) {
		try {
			int operacio = -1;

			inout io = new inout();
			BarallaFrancesa barallaFrancesa = new BarallaFrancesa();

			io.writeln("1- Crear Baralla");
			io.writeln("2- Veure cartes de la Baralla");
			io.writeln("0- Sortir");

			while (operacio != 0) {
				operacio = io.readint();
				switch (operacio) {
				case 1:
					io.writeln("Nombre de copies que té la baralla?");
					int copies = io.readint();
					io.writeln("Utilitzar comodins?");
					String respostaComodin = io.readword();					
					barallaFrancesa = new BarallaFrancesa(copies, respostaComodin.equals("Y"));
					break;
				case 2:
					List<SBCarta> cartes = barallaFrancesa.getCartes();
					if(cartes.isEmpty()) io.writeln("Baralla buida");
					else {
						for (SBCarta sbCarta : cartes) {
							sbCarta.testEscriuCarta();
						}
					}
					break;
				}
				io.writeln("Operació completada, escull un altre operació a realitzar");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
