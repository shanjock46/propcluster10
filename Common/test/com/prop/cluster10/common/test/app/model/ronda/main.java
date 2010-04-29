package com.prop.cluster10.common.test.app.model.ronda;

import java.util.List;
import java.util.LinkedList;
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		LinkedList<Jugador> l=new LinkedList<Jugador>();
		Baralla b=new Baralla();
		RondaRemigio r =new RondaRemigio(l,b);
		Baralla b1=new Baralla();
		Baralla b2=new Baralla();
		Jugador je= new Jugador("pere", 100);
		int op=0;
		inout io = new inout();
		io.writeln("1.Crear una baralla");
		io.writeln("2.Crear llista de jugadors");
		io.writeln("3. Crear una ronda");
		io.writeln("4.setejar una baralla");
		io.writeln("5.llegir una baralla");
		io.writeln("6.Afegir jugadors actius");
		io.writeln("7.Llistar jugadors actius");
		io.writeln("8.Retirar Jugador");
		io.writeln("9. Tancar Ronda");
		io.writeln("10. Repartir");
		op=io.readint();
		io.write(op);
		while(op!=0){

			if(op==1){
				b=new Baralla();
				io.writeln("Baralla Creada");
			}
			else if(op==2){
				l= new LinkedList();
				io.writeln("Llista jugadors Creada");
			}
			else if(op==3){
				r = new RondaRemigio(l,b);
			}
			else if(op==4){
				r.setBaralla(b);
			}
			else if(op==5){
				b1=r.getBaralla();
			}
			else if(op==6){
				int nj = io.readint();
				List <Jugador> ju = new LinkedList();
				for(int i=0; i<nj; ++i){
					String s=io.readword();
					int ca=io.readint();
					Jugador j =  new Jugador(s,ca);
					ju.add(j);
				}
				r.setJugadorsActius(ju);
				io.writeln("salgo");
			}
			else if(op==7){
				List <Jugador> j1 = r.getJugadorsActius();
				for(Jugador j2:j1){
					io.writeln(j2.nom);
				}
			}
			else if(op==8){
				String s2;
				s2=io.readword();
				List <Jugador> j2 = r.getJugadorsActius();
				for(Jugador j3:j2){
					io.writeln(s2);
					if(j3.nom.equals(s2)){
						je=j3;
					}
				}
				r.retirarJugador(je);
			}
			else if(op==9){
				r.tancaRonda();
			}
				
			else if(op==10){
				r.repartir();
			}
			op=io.readint();
		}	
	}

}
