/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package JugadorFiveCardDraw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Daniel Mulero
 */
public class TestJugadorFiveCardDraw {
    //TO DO: Tot. Al loro con el evaluador/evaluadorma. Tiran con HashMap<String, Object>.
    //En el caso de "Doble Parella", el Object es un ArrayList<Integer> (Para poder guardar los valores de las dos parejas).
    //En el resto de casos, Integer.
           public static void main(String[] args) throws Exception {

                int op = 30;
                inout io = new inout();
                Carta aux=new Carta();
                JugadorFiveCardDraw jug=new JugadorFiveCardDraw();
                io.writeln("1- Crear un jugador buit");
                io.writeln("2- Crear un jugador amb nom i cash");
                io.writeln("3- Crear un jugador amb nom");
                io.writeln("4- Evaluador de ma");
                io.writeln("5- Evaluador situació");

                io.writeln("0- Sortir");

                while (op != 0) {
                        op = io.readint();
                        switch (op) {

                        case 1:// JugadorFiveCardDraw();
                                jug=new JugadorFiveCardDraw();
                                io.writeln("S'ha creat un nou jugador");
                                break;

                        case 2:// JugadorFiveCardDraw(String, Integer);
                                io.writeln("Introdueix el nom:");
                                String nom=io.readword();
                                io.writeln("Introdueix el cash");
                                int cash=io.readint();
                                jug=new JugadorFiveCardDraw(nom,cash);
                                io.writeln("S'ha creat un nou jugador amb nom i cash");
                                break;

                        case 3:// JugadorFiveCardDraw(String);
                                io.writeln("Introdueix el nom:");
                                String nom2=io.readword();
                                jug=new JugadorFiveCardDraw(nom2);
                                io.writeln("S'ha creat un nou jugador amb nom");
                                break;

                        case 4:// evaluadorMa();
                              ArrayList<Carta> C1=new ArrayList();
                              System.out.println("Entra la ma a evaluar");
                              for (int i=0; i<5; i++) {
                                    Carta x=new Carta();
                                    System.out.println("Pal de la carta "+(i+1)+":");
                                    String a=io.readword();
                                    x.setPal(a);
                                    System.out.println("Numero de la carta "+(i+1)+":");
                                    int b=io.readint();
                                    x.setNumero(b);
                                    C1.add(x);
                                                    }
                              jug.setMa(C1);
                              Map<String,Object> eval=new HashMap<String,Object>();
                              eval=jug.evaluadorMa(eval);
                              Iterator iterator = eval.keySet().iterator();
                                System.out.print("Tens ");
                                while (iterator.hasNext()) {
                                    String key = iterator.next().toString();
                                    Object value = eval.get(key);
                                    if (key.compareTo("Dobles Parelles")==0){
                                        ArrayList<Integer> bb=new ArrayList<Integer>();
                                        int xx=bb.get(0);
                                        int yy=bb.get(1);
                                        io.writeln(key+" de "+Math.max(xx, yy)+" y "+Math.min(xx, yy));
                                    }
                                    else io.writeln(key+" de "+value);
                                   }



                                break;

                        case 5:// evaluador(pot,descarte,call,ciega,apostes_acomulades)
                              System.out.println("Es la fase de descart?");
                                Map<String,Object> evalx=new HashMap<String,Object>();
                                boolean b=io.readboolean();
                                if (b) evalx=jug.evaluador(0,true,0,0,0);
                                else {
                                    System.out.println("Si apostes=0 -> Primera ronda d'apostes");
                                    System.out.println("Si call=cega -> Jugador intermig");
                                    System.out.println("Si call=cega/2 -> Cega petita");
                                    System.out.println("Si call=0 -> Cega gran");
                                    System.out.println("Pot:");
                                    int pot=io.readint();
                                    System.out.println("Call:");
                                    int call=io.readint();
                                    System.out.println("Cega:");
                                    int cega=io.readint();
                                    System.out.println("Apostes acomulades:");
                                    int apostes=io.readint();
                                    evalx=jug.evaluador(pot,false,call,cega,apostes);
                                }

                              Iterator iteratorx = evalx.keySet().iterator();
                                System.out.print("Tens ");
                                while (iteratorx.hasNext()) {
                                    String key = iteratorx.next().toString();
                                    Object value = evalx.get(key);
                                    io.writeln(key);
                                   }

                                break;



                        }}}}
