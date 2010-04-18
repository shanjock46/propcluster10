package com.prop.cluster10.blackjack.test.app.model.estadistiquesblackjack;

public class TestEstadistiquesBlackJack {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int op = 30;
		inout io = new inout();
		io.writeln("1- Crear EstadistquesBlackJack");
		io.writeln("2- Modificar fitxes");
		io.writeln("3- Veure Fitxes");
		io.writeln("4- Veure Ftixes per Ronda");
		io.writeln("0- Sortir");
		EstadistiquesBlackJack est = new EstadistiquesBlackJack();
		while (op != 0) {
			io.write("Introdueix codi:");
			op = io.readint();
			switch (op) {
			case 1:
				est = new EstadistiquesBlackJack();
				io.writeln("S'ha creat un EstadistiquesBlackJack");
				break;
			case 2:
				io.writeln("Has d'haver creat abans de modificar el nombre de fitxes");
				io.write("Introdueix el valor de fitxes:");
				int fitxes = io.readint();
				est.setFitxes(fitxes);
				break;
			case 3:
				io.write("El jugador te ");
				io.write(est.getFitxes());
				io.writeln(" fitxes.");
				break;
			case 4:// setCartes(llistaCartes: Set(Carta))
				io.writeln("El nombre de Rondes es constant a 10");
				io.write("fitxes per Ronda = ");
				io.writeln(est.getFitxesRonda());
				break;
			}
		}
	}
}
