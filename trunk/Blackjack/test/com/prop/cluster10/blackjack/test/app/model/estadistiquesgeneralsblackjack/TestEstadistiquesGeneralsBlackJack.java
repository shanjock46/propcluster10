package com.prop.cluster10.blackjack.test.app.model.estadistiquesgeneralsblackjack;

import java.util.HashMap;

import com.prop.cluster10.blackjack.test.app.controller.CtrlJugadorBlackJack.inout;

public class TestEstadistiquesGeneralsBlackJack {
	
	public static void main(String args[]) throws Exception {
		inout io = new inout();
		EstadistiquesGeneralsBlackJack est = new EstadistiquesGeneralsBlackJack();
		System.out.print("Quina accio vols fer? ");
		int op = io.readint();
			while(op != 0) {
			if(op == 1) System.out.println("El nombre de BlackJack's totals es: " + est.getBlackJacks());
			else if (op == 2) { 
					System.out.print("Tria el nombre de BlackJack's totals: ");
					int bJ = io.readint();
					est.setBlackJacks(bJ);
					System.out.println("Nombre de BlackJack's totals actualitzat: " + est.getBlackJacks());
			}
			else if (op == 3) System.out.println("El total d'assegurats guanyats es: " + est.getAsseguratsGuanyats());
			else if (op == 4) {
					System.out.print("Tria el total d'assegurats guanyats: ");
					int aG = io.readint();
					est.setAsseguratsGuanyats(aG);
					System.out.println("Total d'assegurats guanyats actualitzat: " + est.getAsseguratsGuanyats());
			}
			else if (op == 5) System.out.println("La mitjana de BlackJack's per partida es: " + est.getMitjanaBlackJacksPartida());
			else if (op == 6) { HashMap <String, Object> v = est.carregaEstadistiquesGenerals();
				System.out.println("Estadistiques Generals:");
				System.out.println("El nombre de partides es: " + v.get("totalPartidesJugades"));
				System.out.println("El nombre de jugadors es: " + v.get("totalJugadorsParticipants"));
				System.out.println("El nombre de rondes es: " + v.get("totalRondesJugades"));
				System.out.println("El nombre de BlackJack's es: " + v.get("blackJacks"));
				System.out.println("El nombre d'assegurats guanyats es: " + v.get("asseguratsGuanyats"));
				System.out.println("La mitjana de jugadors per partida es: " + v.get("mitjanaJugadorsPartida"));
				System.out.println("La mitjana de rondes per partida es: " + v.get("mitjanaRondesPartida"));
				System.out.println("La mitjana de BlackJack's per partida es: " + v.get("mitjanaBlackJacksPartida"));
			}
			System.out.print("Quina accio vols fer ara? ");
			op = io.readint();
		}
			
	}
}
