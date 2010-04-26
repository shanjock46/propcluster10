package com.prop.cluster10.blackjack.test.app.model.jugadorblackjack;

//Antar Moratona Franco

import java.util.ArrayList;
import java.util.List;

import com.prop.cluster10.blackjack.test.app.controller.CtrlJugadorBlackJack.SBCarta;
import com.prop.cluster10.blackjack.test.app.controller.CtrlJugadorBlackJack.inout;




public class TestJugadroBlackJack {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int op = 30;
		inout io = new inout();
		io.writeln("1- Crear JugadorBlackJack");
		io.writeln("2- Modificar fitxes a assegurar");
		io.writeln("3- Veure fitxes a assegurar");
		io.writeln("4- Doblar aposta");
		io.writeln("5- Dividir ma");
		io.writeln("6- Modificat Segona ma");
		io.writeln("7- Veure Segona ma");
		io.writeln("8- Evalua la ma");
		io.writeln("9- Evalua la segona ma");
		io.writeln("(10- opcional: modifica la ma)");
		io.writeln("(11- opcional: veure la ma)");
		io.writeln("0- Sortir");
		JugadorBlackJack jb = new JugadorBlackJack();
		while (op != 0) {
			io.write("Introdueix codi:");
			op = io.readint();
			switch (op) {
			case 1: // crear jugadorBlackJack
				jb = new JugadorBlackJack();
				io.writeln("S'ha creat un JugadorBlackJack");
				break;
			case 2: // setFitxesAssegurar
				io.writeln("Has d'haver creat un JugadorBlackJack abans de modificar el nombre de fitxes a assegurar");
				io.write("Introdueix el valor de fitxes:");
				int fitxes = io.readint();
				jb.setFitxesAssegurar(fitxes);
				break;
			case 3: // getFitxesAssegurar
				io.write("El jugador te ");
				io.write(jb.getFitxesAssegurar());
				io.writeln(" fitxes assegurades.");
				break;
			case 4: // Doblar Aposta
				io.writeln("L'aposta de Jugador es constant a 100 i inicialment te 500 fitxes");
				io.write("fitxes incials: ");
				io.writeln(jb.getCash());
				io.write("aposta inicial: ");
				io.writeln(jb.getAposta());
				io.write("Fitxes actualitzades = ");
				jb.doblarAposta();
				io.writeln(jb.getCash());
				io.write("aposta actualitzada = ");
				io.writeln(jb.getAposta());
				break;
			case 5:// Dividir ma
				if(jb.getMa().size() != 2) io.writeln("No es pot dividir la ma ja que hi ha una ma mes o menys de dues cartes.");
				else if(jb.getMa().get(0).getNumero() != jb.getMa().get(1).getNumero()) {
					io.writeln("No es pot dividir la ma ja que no hi ha dues cartes iguals.");
				}
				else {
				io.writeln("Es dividira la ma actual. Aquesta per defecte conte a ma dos 10 de piques.");
				io.writeln("la ma actual es: ");
				for (int i = 0; i < 2; ++i) {
					io.write("carta ");
					io.write(i);
					io.writeln(":");
					jb.getMa().get(i).testEscriuCarta();
				}
				if(jb.getSegonaMa().isEmpty()) io.writeln("No hi ha segona ma.");
				jb.divideixMa();
				io.writeln("la ma un cop dividida es: ");
				for (int i = 0; i < jb.getMa().size(); ++i) {
					io.write("carta ");
					io.write(i);
					io.writeln(":");
					jb.getMa().get(i).testEscriuCarta();
				}
				if(jb.getSegonaMa().isEmpty()) io.writeln("No hi ha segona ma.");
				else {
					io.writeln("la segona ma te:");
					jb.getSegonaMa().get(0).testEscriuCarta();
				}
				}
				break;
			case 6:// Modificar Segona ma
				List<SBCarta> llista = new ArrayList<SBCarta>();
				io.write("Introdueix el nombre de cartes de la segona ma: ");
				int k = io.readint();
				for(int i = 0; i < k; ++i) {
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
					llista.add(i, carta);
				}
				jb.setSegonaMa(llista);
				break;
			case 7:// Veure Segona ma
				if(jb.getSegonaMa().isEmpty()) io.writeln("No hi ha cartes a la segona ma");
				else {
					List<SBCarta> llista2 = jb.getSegonaMa();
					int k2 = llista2.size();
					for(int i = 0; i < k2; ++i) {
						io.write("carta ");
						io.writeln(i);
						llista2.get(i).testEscriuCarta();
					}
				}
				break;
			
			case 8:// Evaluar ma
				io.write("El valor de la ma es ");
				io.writeln(jb.evaluaMa());
				break;
				
			case 9:// Evaluar segonaMa
				io.write("El valor de la segona ma es ");
				io.writeln(jb.evaluaSegonaMa());
				break;
				
			case 10:// Opcional modifica ma
				List<SBCarta> llista3 = new ArrayList<SBCarta>();
				io.write("Introdueix el nombre de cartes de la ma: ");
				int k3 = io.readint();
				for(int m = 0; m < k3; ++m) {
					io.write("carta ");
					io.writeln(m);
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
					llista3.add(m, carta);
				}
				jb.setMa(llista3);
				break;
			case 11:
				if(jb.getMa().isEmpty()) io.writeln("No hi ha cartes a la ma");
				for (int i = 0; i < jb.getMa().size(); ++i) {
					jb.getMa().get(i).testEscriuCarta();
				}
				break;
			}
			
		
		}
	}


}
