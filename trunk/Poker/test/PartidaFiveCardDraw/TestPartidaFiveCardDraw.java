/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package PartidaFiveCardDraw;

import java.util.ArrayList;
import java.util.Iterator;


/**
 *
 * @author Martina Canyelles
 */
public class TestPartidaFiveCardDraw {
    public static int CG=0;
    public static void main (String args[]) throws Exception{
              
                int op = 30;
                inout io = new inout();
                JugadorFiveCardDraw jug1=new JugadorFiveCardDraw();
                JugadorFiveCardDraw jug2=new JugadorFiveCardDraw();
                JugadorFiveCardDraw jug3=new JugadorFiveCardDraw();
                ArrayList<Jugador> jug = new ArrayList();
                jug.add(jug1);
                jug.add(jug2);
                jug.add(jug3);
                
                PartidaFiveCardDraw p=new PartidaFiveCardDraw(jug,0);
                          
                io.writeln("1- Crear una partida de Poker_FiveCardDraw");
                io.writeln("2- Crea nova ronda");
                io.writeln("3- Veure els guanyadors de la partida");
                io.writeln("0- Sortir");

                while (op != 0) {
                        op = io.readint();
                        switch (op) {

                        case 1:// PartidaFiveCardDraw(List<Jugador> j, int cega)
                                p=new PartidaFiveCardDraw(jug,0);
                                io.writeln("S'ha creat una nova partida de Poker_FiveCardDraw");
                                break;

                        case 2:// creaRonda()
                                RondaFiveCardDraw ronda=new RondaFiveCardDraw(jug,null);
                                ronda=p.creaRonda();
                                io.writeln("S'ha creat una nova ronda");
                                break;
                        case 3:// guanyadorsPartida()
                               ArrayList<Jugador> guanyadors= new ArrayList();
                               guanyadors=(ArrayList<Jugador>) p.guanyadorsPartida();
                               if (guanyadors!=null){
                               Iterator<Jugador> it= guanyadors.iterator();
                                Jugador j;
                                if(it.hasNext()){
                                    j=it.next();
                                    io.writeln(j.getNom());
                                }
                                 io.writeln("Els guanyadors de la partida son:");
                               } else io.writeln("No hi ha guanyadors");
                                break;


                       }
               }
      }
}
