package com.prop.cluster10.common.test.app.model.partida;

import java.util.List;
import java.util.LinkedList;
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		inout io = new inout();
		int op=0;
		PartidaRemigio pr=new PartidaRemigio();
		Baralla b=new Baralla();
		Ronda r=new Ronda();
		List<Jugador> jug =new LinkedList();
		Jugador j4 = new Jugador();
		jug.add(j4);
		Jugador j5= new Jugador();
		jug.add(j5);
		io.writeln("1.Crear una baralla");
		io.writeln("2.setejar una baralla");
		io.writeln("3.llegir una baralla");
		io.writeln("4.Crear 2 jugadors y afegir-los a la llista");
		io.writeln("5.setejar un jugador");
		io.writeln("6.setejar un jugador actiu");
		io.writeln("7.llegir un jugador actiu");
		io.writeln("8Crear una ronda");
		io.writeln("9.setejar una ronda");
		io.writeln("10.llegir una ronda");
		io.writeln("11.set id");
		io.writeln("12.get id");
		io.writeln("13.set rondesjugades");
		io.writeln("14.get rondesjugades");
		io.writeln("15.elimina jugadors");
		io.writeln("16.crear partida");
		io.writeln("17.crear partida atributs");
		io.writeln("18.crear ronda remigio");
		io.writeln("19.consultar guanyadors");
		io.writeln("0. Salir");
		op=io.readint();
		while(op!=0){
			if(op==1){
				b=new Baralla();
			}
			else if(op==2){
				pr.setBaralla(b);
			}
			else if(op==3){
				Baralla b1= pr.getBaralla();
			}
			else if(op==4){
				jug = new LinkedList();
				Jugador j1 = new Jugador();
				jug.add(j1);
				Jugador j2 = new Jugador();
				jug.add(j2);
			}
			else if(op==5){
				pr.setJugadors(jug);
			}
			else if(op==6){
				pr.setJugadorsActius(jug);
			}
			else if(op==7){
				List<Jugador> j3 = pr.getJugadorsActius();
			}
			else if(op==8){
				r = new Ronda();
			}
			else if(op==9){
				pr.setRondaActual(r);
			}
			else if(op==10){
				Ronda r1 = pr.getRondaActual();
			}
			else if(op==11){
				int id=0;
				id=io.readint();
				pr.setId(id);
			}
			else if(op==12){
				long id=pr.getId();
				io.write(id);
			}
			else if(op==13){
				int rj=0;
				rj=io.readint();
				pr.setRondesJugades(rj);
			}
			else if(op==14){
				int r1= pr.getRondesJugades();
				io.write(r1);
			}
			else if(op==15){
				pr.eliminaJugadors();
			}
			else if(op==16){
				PartidaRemigio pr1= new PartidaRemigio();
			}
			else if(op==17){
				PartidaRemigio pr1= new PartidaRemigio(jug);
			}
			else if(op==18){
				pr.creaRonda();
			}
			else if(op==19){
				
				List<Jugador> l2= pr.guanyadorsPartida();
			}
			op=io.readint();
		}

	}

}
