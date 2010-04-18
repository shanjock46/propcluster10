package com.prop.cluster10.blackjack.test.app.model.jugadorblackjack;


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
		io.writeln("0- Sortir");
		JugadorBlackJack jb = new JugadorBlackJack();
		while (op != 0) {
			io.write("Introdueix codi:");
			op = io.readint();
			switch (op) {
			case 1: //crear jugadorBlackJack
				jb = new JugadorBlackJack();
				io.writeln("S'ha creat un JugadorBlackJack");
				break;
			case 2: //setFitxesAssegurar
				io.writeln("Has d'haver creat un JugadorBlackJack abans de modificar el nombre de fitxes a assegurar");
				io.write("Introdueix el valor de fitxes:");
				int fitxes = io.readint();
				jb.setFitxesAssegurar(fitxes);				
				break;
			case 3: //getFitxesAssegurar
				io.write("El jugador té ");
				io.write(jb.getFitxesAssegurar());
				io.writeln(" fitxes assegurades.");
				break;
			case 4: //Doblar Aposta
				io.writeln("L'aposta de Jugador és constant a 100 i inicialment té 500 fitxes");
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
			case 5://Dividir ma
				
				break;
			case 6://Modificar Segona ma
				
				break;
			case 7://Veure Segona ma
				
				break;
			}
		}
	}

}
