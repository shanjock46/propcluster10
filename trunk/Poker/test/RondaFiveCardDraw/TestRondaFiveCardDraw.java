/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package RondaFiveCardDraw;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Martina
 */
public class TestRondaFiveCardDraw {

    public static void main(String[] args) throws Exception {
                int op = 30;
                inout io = new inout();
                JugadorFiveCardDraw jug1=new JugadorFiveCardDraw();
                JugadorFiveCardDraw jug2=new JugadorFiveCardDraw();
                JugadorFiveCardDraw jug3=new JugadorFiveCardDraw();
                ArrayList<Jugador> jug = new ArrayList();
                jug.add(jug1);
                jug.add(jug2);
                jug.add(jug3);

                BarallaFrancesaSB baralla= new BarallaFrancesaSB(1,false);
                RondaFiveCardDraw ronda=new RondaFiveCardDraw(jug,baralla);

                io.writeln("1- Crear Ronda FiveCardDraw");
                io.writeln("2- Tancar la Ronda");
                io.writeln("3- Repartir cartes als jugadors");
                io.writeln("4- Passar al seguent jugador");
                io.writeln("5- Veure els jugadors guanyadors");
                io.writeln("6- Actualitzar els jugadors guanyadors");
                io.writeln("7- Veure el Pot");
                io.writeln("8- Actualitzar el Pot");
                io.writeln("0- Sortir");

                while (op != 0) {
                        op = io.readint();
                        switch (op) {

                        case 1:// RondaFiveCardDraw(List<Jugadors> jug, BarallaSB baralla)
                                ronda=new RondaFiveCardDraw(jug,baralla);
                                io.writeln("S'ha creat una nova ronda FiveCardDraw");
                              /*  Iterator<Jugador> it= jug.iterator();
                               * Jugador j;
                               * if(it.hasNext()){
                               *     j=it.next();
                               *     io.writeln(j.getNom());
                                }*/
                                break;
                        case 2:// tancaronda()
                                ronda.tancaRonda();
                                io.writeln("La ronda ha estat tancada");
                                break;
                        case 3:// repartir()
                                ronda.repartir();
                                io.writeln("S'han repartit les cartes als jugadors");
                                break;
                        case 4:// seguentJugador()
                                ronda.seguentJugador();
                                io.writeln("El torn ha passat al seguent jugador");
                                break;
                        case 5:// getGuanyadors()
                                io.writeln("Els guanyadors de les rondes han estat:");
                                Iterator<Jugador> it2= jug.iterator();
                                Jugador ju;
                                if(it2.hasNext()){
                                    ju=it2.next();
                                    io.writeln(ju.getNom());
                                }
                                break;
                        case 6:// setGuanyadors()
                                ArrayList<Jugador> guanyadors=new ArrayList();
                                guanyadors.addAll(guanyadors);
                                io.writeln("Els guanyadors de la ronda s'han actualitzat");
                                break;
                        case 7:// getPot()
                                int pot=ronda.getPot();
                                io.writeln("El Pot de la ronda es: "+pot+".");
                                break;
                        case 8:// setPot()
                                io.writeln("Escrigui el Pot final d'aquesta ronda:");
                                int p=io.readint();
                                ronda.setPot(p);
                                break;
                        }
                }
   }
}
