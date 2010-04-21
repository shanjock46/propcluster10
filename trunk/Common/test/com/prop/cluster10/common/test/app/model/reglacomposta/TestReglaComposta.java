package com.prop.cluster10.common.test.app.model.reglacomposta;

import com.prop.cluster10.common.app.model.ReglaComposta;
import com.prop.cluster10.common.app.model.ReglaSimple;
import com.prop.cluster10.common.test.app.model.baralla.inout;

/**
 * 
 * @author Albert De Nova
 *
 */
public class TestReglaComposta {

	private static inout io;

	public static void main(String[] args) {
		try {
			int operacio = -1;

			io = new inout();
			ReglaComposta reglaComposta = new ReglaComposta();

			io.writeln("1- Crear ReglaComposta sense arguments");
			io.writeln("2- Crear ReglaComposta amb nom, primera regla, segona regla,  operacio i prioritat");
			io.writeln("3- Veure ReglaComposta");
			io.writeln("4- Introduir nom regla");
			io.writeln("5- Obtenir nom regla");
			io.writeln("6- Introduir primera regla");
			io.writeln("7- Obtenir primera regla");
			io.writeln("8- Introduir segona regla");
			io.writeln("9- Obtenir segona regla");
			io.writeln("10- Introduir tipus comparacio");
			io.writeln("11- Obtenir tipus comparacio");
			io.writeln("12- Introduir prioritat");
			io.writeln("13- Obtenir prioritat");
			io.writeln("0- Sortir");

			while (operacio != 0) {
				operacio = io.readint();
				switch (operacio) {
				case 1:
					reglaComposta = new ReglaComposta();
					io.writeln("S'ha creat una regla composta sense arguments");					
					break;
				case 2:
					io.writeln("Introdueix nom");
					String nom = io.readword();
					io.writeln("Primera regla");
					ReglaSimple primeraRegla = crearRegla();
					io.writeln("Segona regla");
					ReglaSimple segonaRegla = crearRegla();
					io.writeln("Introdueix operacio");
					String tipusComparacio = io.readword();
					io.writeln("Introdueix prioritat");
					Integer prioritat = io.readint();
					reglaComposta = new ReglaComposta(nom, primeraRegla, segonaRegla, tipusComparacio, prioritat);					
					io.writeln("S'ha creat una regla composta amb nom, frase, valor i prioritat");
					break;
				case 3:
					io.writeln("Regla Composta:");
					io.writeln("Nom: " + reglaComposta.getNom());
					io.writeln("Tipus comparacio: " + reglaComposta.getTipusComparacio());
					io.writeln("Prioritat: " + reglaComposta.getPrioritat());
					
					io.writeln("Primera Regla");
					io.writeln("Nom: " + reglaComposta.getPrimeraRegla().getNom());
					io.writeln("Prioritat: " + reglaComposta.getPrimeraRegla().getPrioritat());
					
					io.writeln("Segona Regla");
					io.writeln("Nom: " + reglaComposta.getSegonaRegla().getNom());
					io.writeln("Prioritat: " + reglaComposta.getSegonaRegla().getPrioritat());				
					break;
				case 4:
					io.writeln("Introdueix nom");
					nom = io.readword();
					reglaComposta.setNom(nom);
					break;
				case 5:
					io.writeln("Nom: " + reglaComposta.getNom());
					break;
				case 6:
					io.writeln("Primera regla");
					primeraRegla = crearRegla();
					reglaComposta.setPrimeraRegla(primeraRegla);
					break;
				case 7:
					io.writeln("Primera regla");
					io.writeln("Nom: " + reglaComposta.getPrimeraRegla().getNom());
					io.writeln("Prioritat: " + reglaComposta.getPrimeraRegla().getPrioritat());
					break;
				case 8:
					io.writeln("Segona regla");
					segonaRegla = crearRegla();
					reglaComposta.setSegonaRegla(segonaRegla);
					break;
				case 9:
					io.writeln("Segona regla");
					io.writeln("Nom: " + reglaComposta.getSegonaRegla().getNom());
					io.writeln("Prioritat: " + reglaComposta.getSegonaRegla().getPrioritat());
					break;
				case 10:
					io.writeln("Introdueix tipus de comparacio");
					tipusComparacio = io.readword();
					break;
				case 11:
					io.writeln("Tipus de comparacio: " + reglaComposta.getTipusComparacio());
					break;
				case 12:
					io.writeln("Introdueix prioritat");
					prioritat = io.readint();
					reglaComposta.setPrioritat(prioritat);
					break;
				case 13:
					io.writeln("Prioritat: " + reglaComposta.getPrioritat());
					break;				
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static ReglaSimple crearRegla() throws Exception {
		io.writeln("Crea regla");
		io.writeln("Introdueix nom");
		String nom = io.readword();
		io.writeln("Introdueix prioritat");
		Integer prioritat = io.readint();
		ReglaSimple reglaSimple = new ReglaSimple(nom, null, null, prioritat);	
		return reglaSimple;
	}

}
