package com.prop.cluster10.common.test.app.model.baralla;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TestBaralla {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int op = 30;
		inout io = new inout();
		SBBarallaFrancesa baralla = new SBBarallaFrancesa();
		io.writeln("1- Crear Baralla");
		io.writeln("2- Veure cartes de la Baralla");
		io.writeln("3- Veure cartes descartades de la Baralla");
		io.writeln("4- Modificar cartes de la Baralla");
		io.writeln("5- Modificar cartes descartades de la Baralla");
		io.writeln("6- Reiniciar cartes");
		io.writeln("7- Extreure carta de cartes");
		io.writeln("8- Extreure carta de cartes descartades");
		io.writeln("9- Veure primera carta de cartes descartades");
		io.writeln("10- Afegir carta descartada");
		io.writeln("0- Sortir");
		while (op != 0) {
			op = io.readint();
			switch (op) {
			case 1:
			    baralla = new SBBarallaFrancesa();
				io.writeln("S'ha creat una Baralla");
				break;
			case 2:// getCartes(): Set(Carta)
				List<SBCarta> cartes = baralla.getCartes();
				io.writeln("les cartes de prova(sense ser modificades) son una escala de diamants del 2 al 10 amb valors 0");
				if (cartes.isEmpty()) io.writeln("no hi ha cartes a la Baralla");
				else io.writeln("Les cartes de la Baralla son:");
				for (int i = 0; i < cartes.size(); ++i) {
					SBCarta carta = cartes.get(i);
					carta.testEscriuCarta();
					io.writeln();
				}
				break;
			case 3://getCartesDescartades(): Set(Carta)
				Stack<SBCarta> cd = baralla.getCartesDescartades();
				io.writeln("les cartes descartades de prova(sense ser modificades) son una escala de diamants del 2 al 10 amb valors iguals al numero");
				if (cd.isEmpty()) io.writeln("No hi ha cartes descartades a la Baralla");
				else io.writeln("Les cartes(en ordre de pila) descartades de la Baralla son:");
				for (int i = cd.size() - 1; i > -1; --i) {
					SBCarta carta = cd.get(i);
					carta.testEscriuCarta();
					io.writeln();
				}
				break;
			case 4://setCartes(llistaCartes: Set(Carta))
				List<SBCarta> cartes2 = new ArrayList<SBCarta>();
				io.write("Introdueix el nombre de cartes de cartes:");
				int num = io.readint();
				for (int i = 0; i < num; ++i) {
					io.write("carta ");
					io.writeln(i);
					SBCarta carta = new SBCarta();
					io.write("Pal?");
					String pal = io.readword();
					io.write("Numero?");
					int numero = io.readint();
					io.write("Valor?");
					int val = io.readint();
					carta.setNumero(numero);
					carta.setPal(pal);
					carta.setValor(val);
					cartes2.add(carta);
				}
				if(num > 0)baralla.setCartes(cartes2);
				break;
			case 5://setCartesDescartades(llistaCartes: Set(Carta))
				Stack<SBCarta> cd2 = new Stack<SBCarta>();
				io.write("Introdueix el nombre de cartes de cartes descartades:");
				int num2 = io.readint();
				for (int i = 0; i < num2; ++i) {
					io.write("carta ");
					io.writeln(i);
					SBCarta carta = new SBCarta();
					io.write("Pal?");
					String pal = io.readword();
					io.write("Numero?");
					int numero = io.readint();
					io.write("Valor?");
					int val = io.readint();
					carta.setNumero(numero);
					carta.setPal(pal);
					carta.setValor(val);
					cd2.push(carta);
				}
				if(num2 > 0)baralla.setCartesDescartades(cd2);
				break;
			case 6://reiniciaCartes()
				baralla.reiniciaCartes();
				io.writeln("S'han reiniciat les cartes. ara no hi ha cartes descartades.");
				break;
			case 7: //extreureCarta(): Carta
				if(baralla.getCartes().isEmpty()) io.writeln("No hi ha cartes per extreure");
				else {
					io.writeln("S'extreurˆ una carta de manera aleatoria de cartes.");
					SBCarta cartaRandom = baralla.extreuCarta();
					io.writeln("La carta extreta ha estat:");
					cartaRandom.testEscriuCarta();
				}
				break;
			case 8: //extreureCartaDescartada(): Carta
				if(baralla.getCartesDescartades().isEmpty()) io.writeln("No hi ha cartes descartades per extreure");
				else {
					io.writeln("S'extreurˆ la primera carta de cartes descartades");
					SBCarta cartaDes = baralla.extreuCartaDescartada();
					io.writeln("La carta extreta ha estat:");
					cartaDes.testEscriuCarta();
				}
				break;
			case 9: //veurePrimeraCarta(): Carta
				if(baralla.getCartesDescartades().isEmpty()) io.writeln("No hi ha cartes descartades per veure");
				else {
					io.writeln("es veurˆ la primera carta de cartes descartades pero no s'extreurˆ de la Baralla");
					SBCarta cartaDes = baralla.veurePrimeraCarta();
					io.writeln("La carta es");
					cartaDes.testEscriuCarta();
				}
				break;
			case 10: //afegirCartaDescartada(c: Carta)
				io.writeln("Introdueix la informaci— de la carta a afegir:");
				SBCarta nova = new SBCarta();
				io.write("Pal?");
				String pal = io.readword();
				io.write("Numero?");
				int numero = io.readint();
				io.write("Valor?");
				int val = io.readint();
				nova.setNumero(numero);
				nova.setPal(pal);
				nova.setValor(val);
				baralla.afegirCartaDescartada(nova);
				break;
			}
		}
	}
}
