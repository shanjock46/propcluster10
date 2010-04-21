package com.prop.cluster10.common.test.app.model.reglasimple;

import com.prop.cluster10.common.app.model.Accio;
import com.prop.cluster10.common.app.model.ReglaSimple;
import com.prop.cluster10.common.test.app.model.baralla.inout;

/**
 * 
 * @author Albert De Nova
 *
 */
public class TestReglaSimple {


	public static void main(String[] args) {
		try {
			int operacio = -1;

			inout io = new inout();
			ReglaSimple reglaSimple = new ReglaSimple();

			io.writeln("1- Crear ReglaSimple sense arguments");
			io.writeln("2- Crear ReglaSimple amb nom, frase, valor i prioritat");
			io.writeln("3- Crear ReglaSimple amb nom, propietat, tipusComparacio, valor i prioritat");
			io.writeln("4- Veure ReglaSimple");
			io.writeln("5- Introduir nom regla");
			io.writeln("6- Obtenir nom regla");
			io.writeln("7- Introduir frase");
			io.writeln("8- Obtenir frase");
			io.writeln("9- Introduir valor");
			io.writeln("10- Obtenir valor");
			io.writeln("11- Introduir prioritat");
			io.writeln("12- Obtenir prioritat");
			io.writeln("13- Introduir propietat");
			io.writeln("14- Obtenir propietat");
			io.writeln("15- Introduir tipusComparacio");
			io.writeln("16- Obtenir tipusComparacio");
			io.writeln("17- Introduir accio");
			io.writeln("18- Obtenir accio");
			io.writeln("0- Sortir");

			while (operacio != 0) {
				operacio = io.readint();
				switch (operacio) {
				case 1:
					reglaSimple = new ReglaSimple();
					io.writeln("S'ha creat una regla simple sense arguments");					
					break;
				case 2:
					io.writeln("Introdueix nom");
					String nom = io.readword();
					io.writeln("Introdueix frase");
					String frase = io.readword();
					io.writeln("Introdueix valor");
					Integer valor = io.readint();
					io.writeln("Introdueix prioritat");
					Integer prioritat = io.readint();
					reglaSimple = new ReglaSimple(nom, frase, valor, prioritat);					
					io.writeln("S'ha creat una regla simple amb nom, frase, valor i prioritat");
					break;
				case 3:
					io.writeln("Introdueix nom");
					nom = io.readword();
					io.writeln("Introdueix propietat");
					String propietat = io.readword();
					io.writeln("Introdueix tipus de comparacio");
					String tipusComparacio = io.readword();
					valor = io.readint();
					prioritat = io.readint();
					reglaSimple = new ReglaSimple(nom, propietat, tipusComparacio, valor, prioritat);					
					io.writeln("S'ha creat una baralla amb nom, propietat, tipusComparacio, valor i prioritat");
					break;
				case 4:
					io.writeln("Regla Simple");
					io.writeln("Nom: " + reglaSimple.getNom());
					io.writeln("Frase: " + reglaSimple.getFrase());
					io.writeln("Propietat: " + reglaSimple.getPropietat());
					io.writeln("Tipus Comparacio: " + reglaSimple.getTipusComparacio());
					io.writeln("Valor: " + reglaSimple.getValor());
					io.writeln("Prioritat: " + reglaSimple.getPrioritat());
					io.writeln("Accio: " + reglaSimple.getAccio());
					break;
				case 5:
					io.writeln("Introdueix nom");
					nom = io.readword();
					reglaSimple.setNom(nom);
					break;
				case 6:
					io.writeln("Nom: " + reglaSimple.getNom());
					break;
				case 7:
					io.writeln("Introdueix frase");
					frase = io.readword();
					reglaSimple.setFrase(frase);
					break;
				case 8:
					io.writeln("Frase: " + reglaSimple.getFrase());
					break;
				case 9:
					io.writeln("Introdueix valor");
					valor = io.readint();
					reglaSimple.setValor(valor);
					break;
				case 10:
					io.writeln("Valor: " + reglaSimple.getValor());
					break;
				case 11:
					io.writeln("Introdueix prioritat");
					prioritat = io.readint();
					reglaSimple.setPrioritat(prioritat);
					break;
				case 12:
					io.writeln("Prioritat: " + reglaSimple.getPrioritat());
					break;
				case 13:
					io.writeln("Introdueix propietat");
					propietat = io.readword();
					break;
				case 14:
					io.writeln("Propietat: " + reglaSimple.getPropietat());
					break;
				case 15:
					io.writeln("Introdueix tipus de comparacio");
					tipusComparacio = io.readword();
					break;
				case 16:
					io.writeln("Tipus de comparacio: " + reglaSimple.getTipusComparacio());
					break;
				case 17:
					io.writeln("Selecciona accio");
					io.writeln("1 - Plantarse " +  Accio.PLANTARSE);
					io.writeln("2 - Assegurar " +  Accio.ASEGURAR);
					int accio = io.readint();					
					switch (accio) {
					case 1:
						reglaSimple.setAccio(Accio.PLANTARSE);
						break;

					case 2:
						reglaSimple.setAccio(Accio.ASEGURAR);
						break;
					}					
					break;
				case 18:
					io.writeln("Accio: " + reglaSimple.getAccio());
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
