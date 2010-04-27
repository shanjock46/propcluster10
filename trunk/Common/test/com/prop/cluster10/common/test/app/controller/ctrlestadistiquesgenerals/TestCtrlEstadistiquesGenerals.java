package com.prop.cluster10.common.test.app.controller.ctrlestadistiquesgenerals;

import java.util.HashMap;
import java.util.Iterator;

import com.prop.cluster10.common.test.app.model.baralla.inout;

public class TestCtrlEstadistiquesGenerals {
	public static void main(String[] args) {
		try {
			int operacio = -1;

			inout io = new inout();
			CtrlEstadistiquesGeneralsStub ctrlEstadistiquesGeneralsStub = new CtrlEstadistiquesGeneralsStub();

			io.writeln("1- Crear Controlador d'estadistiques");
			io.writeln("2- Carregar estadistiques generals");
			io.writeln("3- Guardar estadistiques generals");
			io.writeln("4- Crear noves estadistiques generals");
			io.writeln("5- Obtenir estadistiques generals");
			io.writeln("0- Sortir");
			
			while (operacio != 0) {
				operacio = io.readint();
				switch (operacio) {
				case 1:
					ctrlEstadistiquesGeneralsStub = new CtrlEstadistiquesGeneralsStub();
					io.writeln("Creat controlador d'estadistiques generals");
					break;
				case 2:
					io.writeln("Estadistiques generals:");
					HashMap<String, Object> estadistiques = ctrlEstadistiquesGeneralsStub.carregaEstadistiquesGenerals();
					Iterator<String> keys = estadistiques.keySet().iterator();
					String key;
					while(keys.hasNext()) {
						key = keys.next();
						System.out.println(key + " : " + estadistiques.get(key));
					}
					break;
				case 3:
					ctrlEstadistiquesGeneralsStub.guardaEstadistiquesGenerals();
					break;
				case 4: 
					io.writeln("Crear estadistiques generals");
					SBEstadistiquesGenerals sbEstadistiquesGenerals = new SBEstadistiquesGenerals();
					io.writeln("Introdueix total de partides jugades");
					sbEstadistiquesGenerals.setTotalPartidesJugades(io.readint());
					io.writeln("Introdueix total de jugadors participants");
					sbEstadistiquesGenerals.setTotalJugadorsParticipants(io.readint());
					io.writeln("Introdueix total de rondes jugades");
					sbEstadistiquesGenerals.setTotalRondesJugades(io.readint());
					ctrlEstadistiquesGeneralsStub.setEstadistiquesGenerals(sbEstadistiquesGenerals);
					break;
				case 5: 
					sbEstadistiquesGenerals = (SBEstadistiquesGenerals) ctrlEstadistiquesGeneralsStub.getEstadistiquesGenerals();
					io.writeln("Estadistiques generals:");
					io.writeln("Total partides jugades: " + sbEstadistiquesGenerals.getTotalPartidesJugades());
					io.writeln("Total rondes jugades: " + sbEstadistiquesGenerals.getTotalRondesJugades());
					io.writeln("Total jugadors participants: " + sbEstadistiquesGenerals.getTotalJugadorsParticipants());
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
