import java.io.*;
import java.util.*;

public class TestEstadistiquesGenerals {

	public static int readint() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input = in.readLine();
		int pJ = 0;
		if (input != null) {
			pJ = Integer.parseInt(input);
		}
		return pJ;
	}
	public static void main(String args[]) throws IOException {
		EstadistiquesGeneralsBlackJackStub est = new EstadistiquesGeneralsBlackJackStub();
		System.out.print("Quina acció vols fer? ");
		int op = readint();
		while(op != 0) {
			if(op == 1) System.out.println("El nombre de partides es: " + est.getTotalPartidesJugades());
			else if (op == 2) { 
					System.out.println("Tria el total de partides jugades");
					int pJ = readint();
					est.setTotalPartidesJugades(pJ);
					System.out.println("Nombre de partides actualitzat: " + est.getTotalPartidesJugades());
			}
			else if (op == 3) System.out.println("El nombre de jugadors es: " + est.getTotalJugadorsParticipants());
			else if (op == 4) { System.out.println("Tria el total de jugadors participants");
					int jP = readint();
					est.setTotalJugadorsParticipants(jP);
					System.out.println("Nombre de jugadors actualitzat: " + est.getTotalJugadorsParticipants());
			} else if (op == 5) System.out.println("El nombre de rondes jugades es: " + est.getTotalRondesJugades());
			else if (op == 6) { System.out.println("Tria el total de rondes jugades");
					int rJ = readint();
					est.setTotalRondesJugades(rJ);
					System.out.println("Nombre de rondes actualitzat: " + est.getTotalRondesJugades());
			} else if (op == 7) System.out.println("La mitjana de jugadors per partida es: " + est.mitjanaJugadorsPartida());
			else if (op == 8) System.out.println("La mitjana de rondes per partida es: " + est.mitjanaRondesPartida());
			else if (op == 9) { System.out.println("Tria l'actualització de rondes");
					int r = readint();
					System.out.println("Tria l'actualització de jugadors");
					int j = readint();
					est.actualitzaEstadistiquesGenerals(r, j);
					System.out.println("Actualització completada");
			} else if (op == 10) { ArrayList <Object> v = est.carregaEstadístiquesGenerals();
				System.out.println("Estadistiques Generals:");
				System.out.println("El nombre de partides es: " + v.get(0));
				System.out.println("El nombre de jugadors es: " + v.get(1));
				System.out.println("El nombre de rondes es: " + v.get(2));
				System.out.println("La mitjana de jugadors per partida es: " + v.get(3));
				System.out.println("La mitjana de rondes per partida es: " + v.get(4));
			}
			System.out.print("Quina acció vols fer ara? ");
			op = readint();
		}
			
	}
}
		
