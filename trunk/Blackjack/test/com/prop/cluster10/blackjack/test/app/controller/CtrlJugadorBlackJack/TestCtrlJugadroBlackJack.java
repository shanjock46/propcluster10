import java.util.ArrayList;
import java.util.List;

public class TestCtrlJugadroBlackJack {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int op = 30;
		inout io = new inout();
		CtrlJugadorBlackJack ctrlJB = new CtrlJugadorBlackJack();
		io.writeln("1- Crear CtrlJugadorBlackJack");
		io.writeln("2- Veure Jugador de BlackJack");
		io.writeln("3- Modificar Jugador de BlackJack");
		io.writeln("4- Demanar carta");
		io.writeln("5- Apostar");
		io.writeln("6- Assegurar");
		io.writeln("7- Doblar Aposta");
		io.writeln("8- Dividir");
		io.writeln("0- Sortir");
		while (op != 0) {
			op = io.readint();
			switch (op) {
			case 1:
			    ctrlJB = new CtrlJugadorBlackJack();
				io.writeln("S'ha creat un Controlador de BlackJack");
				break;
			case 2://getJugadorBlackJack
				io.writeln("Jugador actual:");
				io.write("nom: ");
				io.writeln(ctrlJB.getJugadorBlackJack().getNom());
				io.write("Aposta: ");
				io.writeln(ctrlJB.getJugadorBlackJack().getAposta());
				io.write("fitxes a assegurar: ");
				io.writeln(ctrlJB.getJugadorBlackJack().getFitxesAssegurar());
				io.write("fitxes: ");
				io.writeln(ctrlJB.getJugadorBlackJack().getCash());
				io.write("Ma: ");
				if (ctrlJB.getJugadorBlackJack().getMa().isEmpty()) io.writeln("no hi ha cartes a la ma");
				else io.writeln("Les cartes de la ma son:");
					for (int i = 0; i < ctrlJB.getJugadorBlackJack().getMa().size(); ++i) {
						SBCarta carta = ctrlJB.getJugadorBlackJack().getMa().get(i);
						carta.testEscriuCarta();
						io.writeln();
					}
				io.write("Segona ma: ");
				if (ctrlJB.getJugadorBlackJack().getSegonaMa().isEmpty()) io.writeln("no hi ha cartes a la segona ma");
				else io.writeln("Les cartes de la segona ma son:");
				for (int i = 0; i < ctrlJB.getJugadorBlackJack().getSegonaMa().size(); ++i) {
					SBCarta carta = ctrlJB.getJugadorBlackJack().getSegonaMa().get(i);
					carta.testEscriuCarta();
					io.writeln();
				}
				break;
			case 3: // setJugadorBlackJack
				JugadorBlackJack jb = new JugadorBlackJack();
				io.writeln("introdueix les segŸents dades:");
				io.write("nom:");
				jb.setNom(io.readname());
				io.write("fitxes a assegurar: ");
				jb.setFitxesAssegurar(io.readint());
				io.write("fitxes: ");
				jb.setCash(io.readint());
				io.write("fitxes per apostar: ");
				jb.setAposta(io.readint());
				io.writeln("Ma: ");
				io.writeln("introdueix el nombre de cartes per a ma: ");	
				List<SBCarta> cartes = new ArrayList<SBCarta>();
				int k = io.readint();
				for (int j = 0; j < k; ++j) {
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
					cartes.add(carta);
				}
				jb.setMa(cartes);
				List<SBCarta> cartes2 = new ArrayList<SBCarta>();
				io.writeln("Segona ma: ");
				io.writeln("introdueix el nombre de cartes per a la segona ma: ");
				k = io.readint();
				for (int j = 0; j < k; ++j) {
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
				jb.setSegonaMa(cartes2);
				ctrlJB.setJugadorBlackJack(jb);
				break;
			case 4: //demanar carta
				io.write("la carta que t'ha tocat es:");
				SBCarta c = ctrlJB.demanar();
				c.testEscriuCarta();
				break;
			case 5://apostar
					io.write("quantes fitxes vols apostar? ");
					ctrlJB.apostar(io.readint());
					io.writeln("Si s'ha pogut,s'han actualitzat les fitxes i l'aposta del jugador del controlador");
				break;
			case 6:// Assegurar
					io.write("quantes fitxes vols assegurar? ");
					ctrlJB.assegurar(io.readint());
					io.writeln("Si s'ha pogut,s'han actualitzat les fitxes i les fitxes a assegurar del jugador del controlador");
				break;
			case 7: //Doblar
					ctrlJB.doblar();
					io.writeln("Si s'ha pogut, s'ha doblat l'aposta i s'han actualitzat les fitxes del jugador del controlador");
				break;
			case 8: //dividir
					ctrlJB.dividir();
					io.writeln("Si s'ha pogut, s'ha dividit la ma i s'han actualitzat les fitxes del jugador del controlador");
				break;

			}
		}
	}

}
