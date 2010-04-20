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
                io.writeln("2- Veure el total de partides jugades");
                io.writeln("3- Veure el total de rondes jugades");
                io.writeln("4- Veure el total de jugadors que han participat");
                io.writeln("5- Veure la mitjana de jugadors per ronda");
                io.writeln("6- Veure la mitjana de rondes per partida");
                io.writeln("7- Veure el total de victories per Calta Alta");
                io.writeln("8- Veure el total de victories per Parelles");
                io.writeln("9- Veure el total de victories per Dobles Parelles");
                io.writeln("10- Veure el total de victories per Trio");
                io.writeln("11- Veure el total de victories per Escala");
                io.writeln("12- Veure el total de victories per Color");
                io.writeln("13- Veure el total de victories per Full");
                io.writeln("14- Veure el total de victories per Poker");
                io.writeln("15- Veure el total de victories per Escala de Color");
                io.writeln("16- Canviar el total de partides jugades");
                io.writeln("17- Canviar el total de rondes jugades");
                io.writeln("18- Canviar el total de jugadors que han participat");
                io.writeln("19- Canviar el total de victories per Calta Alta");
                io.writeln("20- Canviar el total de victories per Parelles");
                io.writeln("21- Canviar el total de victories per Dobles Parelles");
                io.writeln("22- Canviar el total de victories per Trio");
                io.writeln("23- Canviar el total de victories per Escala");
                io.writeln("24- Canviar el total de victories per Color");
                io.writeln("25- Canviar el total de victories per Full");
                io.writeln("26- Canviar el total de victories per Poker");
                io.writeln("27- Canviar el total de victories per Escala de Color");
                io.writeln("28- Actualització d'estadistiques  generals");
                io.writeln("29- Actualització d'estadistiques  generals Five Card Draw");
                io.writeln("30- Carrega estadistiques generals Poker");
                io.writeln("0- Sortir");

                while (op != 0) {
                        op = io.readint();
                        switch (op) {

                        case 1:// EstadistiquesGeneralsFiveCardDraw()
                                e=new EstadistiquesGeneralsFiveCardDraw();
                                io.writeln("S'han creat les estadistiques generals buides");
                                break;
                        case 2:// getTotalPartidesJugades() NO ES FA
                                io.writeln("El total de les partides que s'han jugat es: "+e.getTotalPartidesJugades()+".");
                                break;

                        case 3:// getTotalRondesJugades() NO ES FA
                                io.writeln("El total de rondes que s'han jugat es: "+e.getTotalRondesJugades()+".");
                                break;
                        case 4:// getTotalJugadorsParticipants() NO ES FA
                                io.writeln("El total de jugadors participants ha estat: "+e.getTotalJugadorsParticipants()+".");
                                break;
                        case 5:// mitjanaJugadorsPartida() NO ES FA
                                io.writeln("La mitjana de jugadors per partida es de: "+e.mitjanaJugadorsPartida()+".");
                                break;
                        case 6:// mitjanaRondesPartida() NO ES FA
                                io.writeln("La mitjana de rondes jugades per partida es de: "+e.mitjanaRondesPartida()+".");
                                break;
                        case 7:// getTotalVictoriaCartaAlta()
                                io.writeln("El total de victories per Carta Alta es de: "+e.getTotalVictoriaCartaAlta()+".");
                                break;
                        case 8:// getTotalVictoriaParelles()
                                io.writeln("El total de victories per Parella es de:"+e.getTotalVictoriaParelles()+".");
                                break;
                        case 9:// getTotalVictoriaDoblesParelles()
                                io.writeln("El total de victories per Dobles Parelles es de: "+e.getTotalVictoriaDoblesParelles()+".");
                                break;
                        case 10:// getTotalVictoriaTrio()
                                io.writeln("El total de victories per Trio es de: "+e.getTotalVictoriaTrio()+".");
                                break;
                        case 11:// getTotalVictoriaEscala()
                                io.writeln("El total de victories per Escala es de: "+e.getTotalVictoriaEscala()+".");
                                break;
                        case 12:// getTotalVictoriaColor()
                                io.writeln("El total de victories per Color es de: "+e.getTotalVictoriaColor()+".");
                                break;
                        case 13:// getTotalVictoriaFull()
                                io.writeln("El total de victories per Full es de: "+e.getTotalVictoriaFull()+".");
                                break;
                        case 14:// getTotalVictoriaPoker()
                                io.writeln("El total de victories per Poker es de: "+e.getTotalVictoriaPoker()+".");
                                break;
                        case 15:// getTotalVictoriaEscalaColor()
                                io.writeln("El total de victories per Escala de Color es de: "+e.getTotalVictoriaEscalaColor()+".");
                                break;
                        case 16:// setTotalPartidesJugades() NO ES FA
                                io.writeln("Entra el nou numero per actualitzar el total de partides jugades");
                                int numpartides=io.readint();
                                e.setTotalPartidesJugades(numpartides);
                                io.writeln("S'ha actualitzat el total de partides jugades a "+numpartides+".");
                                break;
                        case 17:// setTotalRondesJugades() NO ES FA
                                io.writeln("Entra el nou numero per actualitzar el total de rondes jugades");
                                int numrondes=io.readint();
                                e.setTotalRondesJugades(numrondes);
                                io.writeln("S'ha actualitzat el total de rondes jugades a "+numrondes+".");
                                break;
                        case 18:// setTotalJugadorsParticipants() NO ES FA
                                io.writeln("Entra el nou numero per actualitzar el total de jugadors participants");
                                int numjugadors=io.readint();
                                e.setTotalJugadorsParticipants(numjugadors);
                                io.writeln("S'ha actualitzat el total de jugadors participants a "+numjugadors+".");
                                break;
                        case 19:// setTotalVictoriaCartaAlta()
                                io.writeln("Entra el nou numero per actualitzar el total de victories per Carta Alta");
                                int cartaalta=io.readint();
                                e.setTotalVictoriaCartaAlta(cartaalta);
                                io.writeln("S'ha actualitzat el total de victories per carta alta a "+cartaalta+".");
                                break;
                        case 20:// setTotalVictoriaParelles()
                                io.writeln("Entra el nou numero per actualitzar el total de victories per Parelles");
                                int parella=io.readint();
                                e.setTotalVictoriaParelles(parella);
                                io.writeln("S'ha actualitzat el total de victories per parella a "+parella+".");
                                break;
                        case 21:// setTotalVictoriaDoblesParelles()
                                io.writeln("Entra el nou numero per actualitzar el total de victories per Dobles Parelles");
                                int doblesparelles=io.readint();
                                e.setTotalVictoriaDoblesParelles(doblesparelles);
                                io.writeln("S'ha actualitzat el total de victories per dobles parelles a "+doblesparelles+".");
                                break;
                        case 22:// setTotalVictoriaTrio()
                                io.writeln("Entra el nou numero per actualitzar el total de victories per Trio");
                                int trio=io.readint();
                                e.setTotalVictoriaTrio(trio);
                                io.writeln("S'ha actualitzat el total de victories per trio a "+trio+".");
                                break;
                        case 23:// setTotalVictoriaEscala()
                                io.writeln("Entra el nou numero per actualitzar el total de victories per Escala");
                                int escala=io.readint();
                                e.setTotalVictoriaEscala(escala);
                                io.writeln("S'ha actualitzat el total de victories per escala a "+escala+".");
                                break;
                        case 24:// setTotalVictoriaColor()
                                io.writeln("Entra el nou numero per actualitzar el total de victories per Color");
                                int color=io.readint();
                                e.setTotalVictoriaColor(color);
                                io.writeln("S'ha actualitzat el total de victories per color a "+color+".");
                                break;
                        case 25:// setTotalVictoriaFull()
                                io.writeln("Entra el nou numero per actualitzar el total de victories per Full");
                                int full=io.readint();
                                e.setTotalVictoriaFull(full);
                                io.writeln("S'ha actualitzat el total de victories per full a "+full+".");
                                break;
                        case 26:// setTotalVictoriaPoker()
                                io.writeln("Entra el nou numero per actualitzar el total de victories per Poker");
                                int poker=io.readint();
                                e.setTotalVictoriaPoker(poker);
                                io.writeln("S'ha actualitzat el total de victories per poker a "+poker+".");
                                break;
                        case 27:// setTotalVictoriaEscalaColor()
                                io.writeln("Entra el nou numero per actualitzar el total de victories per Escala de Color");
                                int escalacolor=io.readint();
                                e.setTotalVictoriaEscalaColor(escalacolor);
                                io.writeln("S'ha actualitzat el total de victories per escala de color a "+escalacolor+".");
                                break;
                         case 28:// actualitzaEstadistiquesGenerals() NO ES FA
                                io.writeln("La partida ha finalitzat, quantes rondes heu jugat?");
                                int r=io.readint();
                                io.writeln("I quants jugadors?");
                                int j=io.readint();
                                e.actualitzaEstadistiquesGenerals(r, j);
                                io.writeln("Les estadistiques generals han estat actualitzades");
                                break;
                         case 29:// actualitzaEstadistiquesGeneralsFiveCardDraw()
                                io.writeln("La ronda ha finalitzat, heu guanyat? (si/no)");
                                String rguanyat=io.readword();
                                if (rguanyat.compareToIgnoreCase("si")==0){
                                    io.writeln("Amb quina combinació heu guanyat?");
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
                                    e.actualitzaEstadístiquesGeneralsFiveCardDraw(combinacio);
                                    io.writeln("Les estadistiques generals FiveCardDraw han estat actualitzades");
                                }
                                break;
                                
                              
                         case 30:// carregaEstadistiquesGeneralsPoker()
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
