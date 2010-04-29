/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package EstadistiquesGeneralsFiveCardDraw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Martina Canyelles
 */
public class TestEstadistiquesGeneralsFiveCardDraw {
        public static void main(String[] args) throws Exception {
                int op = 30;
                inout io = new inout();
                EstadistiquesGeneralsFiveCardDraw e=new EstadistiquesGeneralsFiveCardDraw();
                io.writeln("1- Crear Estadistiques Generals");
                io.writeln("2- Veure el total de victories per Calta Alta");
                io.writeln("3- Veure el total de victories per Parelles");
                io.writeln("4- Veure el total de victories per Dobles Parelles");
                io.writeln("5- Veure el total de victories per Trio");
                io.writeln("6- Veure el total de victories per Escala");
                io.writeln("7- Veure el total de victories per Color");
                io.writeln("8- Veure el total de victories per Full");
                io.writeln("9- Veure el total de victories per Poker");
                io.writeln("10- Veure el total de victories per Escala de Color");
                io.writeln("11- Canviar el total de victories per Calta Alta");
                io.writeln("12- Canviar el total de victories per Parelles");
                io.writeln("13- Canviar el total de victories per Dobles Parelles");
                io.writeln("14- Canviar el total de victories per Trio");
                io.writeln("15- Canviar el total de victories per Escala");
                io.writeln("16- Canviar el total de victories per Color");
                io.writeln("17- Canviar el total de victories per Full");
                io.writeln("18- Canviar el total de victories per Poker");
                io.writeln("19- Canviar el total de victories per Escala de Color");
                io.writeln("20- Actualitzacio d'estadistiques  generals Five Card Draw");
                io.writeln("21- Carrega estadistiques generals Poker");
                io.writeln("0- Sortir");

                while (op != 0) {
                        op = io.readint();
                        switch (op) {

                        case 1:// EstadistiquesGeneralsFiveCardDraw()
                                e=new EstadistiquesGeneralsFiveCardDraw();
                                io.writeln("S'han creat les estadistiques generals buides");
                                break;
                        case 2:// getTotalVictoriaCartaAlta()
                                io.writeln("El total de victories per Carta Alta es de: "+e.getTotalVictoriaCartaAlta()+".");
                                break;
                        case 3:// getTotalVictoriaParelles()
                                io.writeln("El total de victories per Parella es de:"+e.getTotalVictoriaParelles()+".");
                                break;
                        case 4:// getTotalVictoriaDoblesParelles()
                                io.writeln("El total de victories per Dobles Parelles es de: "+e.getTotalVictoriaDoblesParelles()+".");
                                break;
                        case 5:// getTotalVictoriaTrio()
                                io.writeln("El total de victories per Trio es de: "+e.getTotalVictoriaTrio()+".");
                                break;
                        case 6:// getTotalVictoriaEscala()
                                io.writeln("El total de victories per Escala es de: "+e.getTotalVictoriaEscala()+".");
                                break;
                        case 7:// getTotalVictoriaColor()
                                io.writeln("El total de victories per Color es de: "+e.getTotalVictoriaColor()+".");
                                break;
                        case 8:// getTotalVictoriaFull()
                                io.writeln("El total de victories per Full es de: "+e.getTotalVictoriaFull()+".");
                                break;
                        case 9:// getTotalVictoriaPoker()
                                io.writeln("El total de victories per Poker es de: "+e.getTotalVictoriaPoker()+".");
                                break;
                        case 10:// getTotalVictoriaEscalaColor()
                                io.writeln("El total de victories per Escala de Color es de: "+e.getTotalVictoriaEscalaColor()+".");
                                break;
                        case 11:// setTotalVictoriaCartaAlta()
                                io.writeln("Entra el nou numero per actualitzar el total de victories per Carta Alta");
                                int cartaalta=io.readint();
                                e.setTotalVictoriaCartaAlta(cartaalta);
                                io.writeln("S'ha actualitzat el total de victories per carta alta a "+cartaalta+".");
                                break;
                        case 12:// setTotalVictoriaParelles()
                                io.writeln("Entra el nou numero per actualitzar el total de victories per Parelles");
                                int parella=io.readint();
                                e.setTotalVictoriaParelles(parella);
                                io.writeln("S'ha actualitzat el total de victories per parella a "+parella+".");
                                break;
                        case 13:// setTotalVictoriaDoblesParelles()
                                io.writeln("Entra el nou numero per actualitzar el total de victories per Dobles Parelles");
                                int doblesparelles=io.readint();
                                e.setTotalVictoriaDoblesParelles(doblesparelles);
                                io.writeln("S'ha actualitzat el total de victories per dobles parelles a "+doblesparelles+".");
                                break;
                        case 14:// setTotalVictoriaTrio()
                                io.writeln("Entra el nou numero per actualitzar el total de victories per Trio");
                                int trio=io.readint();
                                e.setTotalVictoriaTrio(trio);
                                io.writeln("S'ha actualitzat el total de victories per trio a "+trio+".");
                                break;
                        case 15:// setTotalVictoriaEscala()
                                io.writeln("Entra el nou numero per actualitzar el total de victories per Escala");
                                int escala=io.readint();
                                e.setTotalVictoriaEscala(escala);
                                io.writeln("S'ha actualitzat el total de victories per escala a "+escala+".");
                                break;
                        case 16:// setTotalVictoriaColor()
                                io.writeln("Entra el nou numero per actualitzar el total de victories per Color");
                                int color=io.readint();
                                e.setTotalVictoriaColor(color);
                                io.writeln("S'ha actualitzat el total de victories per color a "+color+".");
                                break;
                        case 17:// setTotalVictoriaFull()
                                io.writeln("Entra el nou numero per actualitzar el total de victories per Full");
                                int full=io.readint();
                                e.setTotalVictoriaFull(full);
                                io.writeln("S'ha actualitzat el total de victories per full a "+full+".");
                                break;
                        case 18:// setTotalVictoriaPoker()
                                io.writeln("Entra el nou numero per actualitzar el total de victories per Poker");
                                int poker=io.readint();
                                e.setTotalVictoriaPoker(poker);
                                io.writeln("S'ha actualitzat el total de victories per poker a "+poker+".");
                                break;
                        case 19:// setTotalVictoriaEscalaColor()
                                io.writeln("Entra el nou numero per actualitzar el total de victories per Escala de Color");
                                int escalacolor=io.readint();
                                e.setTotalVictoriaEscalaColor(escalacolor);
                                io.writeln("S'ha actualitzat el total de victories per escala de color a "+escalacolor+".");
                                break;
                         
                         case 20:// actualitzaEstadistiquesGeneralsFiveCardDraw()
                               
                                    io.writeln("Amb quina combinacio ha acabat la ronda?");
                                    io.writeln("Carta Alta");
                                    io.writeln("Parelles");
                                    io.writeln("Dobles Parelles");
                                    io.writeln("Trio");
                                    io.writeln("Escala");
                                    io.writeln("Color");
                                    io.writeln("Full");
                                    io.writeln("Poker");
                                    io.writeln("Escala Color");
                                    String combinacio=io.readword();
                                    e.actualitzaEstadistiquesGeneralsFiveCardDraw(combinacio);
                                    io.writeln("Les estadistiques generals FiveCardDraw han estat actualitzades");
                                
                                break;
                                
                              
                         case 21:// carregaEstadistiquesGeneralsPoker()
                                io.writeln("Les estadistiques generals Poker actuals son:");
                                                                                              
                                Map<String, Object> map = new HashMap<String, Object>();
                                map=e.carregaEstadistiquesGeneralsPoker();
                                Iterator iterator = map.keySet().iterator();

                                while (iterator.hasNext()) {
                                    String key = iterator.next().toString();
                                    String value = map.get(key).toString();
                                    io.writeln(key + ": " + value);
                                   }
                                break;

                            }
                        }
        }
}
