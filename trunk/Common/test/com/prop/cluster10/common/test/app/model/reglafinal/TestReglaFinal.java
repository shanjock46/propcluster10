package com.prop.cluster10.common.test.app.model.reglafinal;

import com.prop.cluster10.common.app.model.Accio;
import com.prop.cluster10.common.test.app.model.baralla.inout;

/**
 * 
 * @author Albert De Nova
 *
 */
public class TestReglaFinal {


	public static void main(String[] args) {
		try {
			int operacio = -1;

			inout io = new inout();
			ReglaFinalStub reglaFinalStub = new ReglaFinalStub();

			io.writeln("1- Crear ReglaFinal sense arguments");
			io.writeln("2- Crear ReglaFinal amb nom i prioritat");
			io.writeln("3- Veure ReglaFinal");
			io.writeln("4- Introduir nom regla");
			io.writeln("5- Obtenir nom regla");
			io.writeln("6- Introduir prioritat");
			io.writeln("7- Obtenir prioritat");
			io.writeln("8- Introduir accio");
			io.writeln("9- Obtenir accio");
			io.writeln("0- Sortir");

			while (operacio != 0) {
				operacio = io.readint();
				switch (operacio) {
				case 1:
					reglaFinalStub = new ReglaFinalStub();
					io.writeln("S'ha creat una regla final sense arguments");					
					break;
				case 2:
					io.writeln("Introdueix nom");
					String nom = io.readword();					
					io.writeln("Introdueix prioritat");
					Integer prioritat = io.readint();
					reglaFinalStub = new ReglaFinalStub(nom, prioritat);					
					io.writeln("S'ha creat una regla final amb nom i prioritat");
					break;
				case 3:
					io.writeln("Regla Final");
					io.writeln("Nom: " + reglaFinalStub.getNom());
					io.writeln("Prioritat: " + reglaFinalStub.getPrioritat());
					io.writeln("Accio: " + reglaFinalStub.getAccio());
					break;
				case 4:
					io.writeln("Introdueix nom");
					nom = io.readword();
					reglaFinalStub.setNom(nom);
					break;
				case 5:
					io.writeln("Nom: " + reglaFinalStub.getNom());
					break;
				case 6:
					io.writeln("Introdueix prioritat");
					prioritat = io.readint();
					reglaFinalStub.setPrioritat(prioritat);
					break;
				case 7:
					io.writeln("Prioritat: " + reglaFinalStub.getPrioritat());
					break;				
				case 8:
					io.writeln("Selecciona accio");
					io.writeln("1 - Plantarse " +  Accio.PLANTARSE);
					io.writeln("2 - Assegurar " +  Accio.ASEGURAR);
					int accio = io.readint();					
					switch (accio) {
					case 1:
						reglaFinalStub.setAccio(Accio.PLANTARSE);
						break;

					case 2:
						reglaFinalStub.setAccio(Accio.ASEGURAR);
						break;
					}					
					break;
				case 9:
					io.writeln("Accio: " + reglaFinalStub.getAccio());
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
