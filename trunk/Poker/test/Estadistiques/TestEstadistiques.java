package Estadistiques;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Martina Canyelles
 */
public class TestEstadistiques {

    public static void main(String[] args) throws Exception {


                int op = 30;
                inout io = new inout();
                Estadistiques e=new Estadistiques();
                io.writeln("1- Crear estadistiques");
                io.writeln("2- Veure numero de partides jugades ");
                io.writeln("3- Veure numero de partides guanyades");
                io.writeln("4- Veure numero de partides perdudes");
                io.writeln("5- Veure numero de rondes jugades");
                io.writeln("6- Veure numero de rondes guanyades");
                io.writeln("7- Veure numero de rondes perdudes");
                io.writeln("8- Veure numero de fitxes guanyades");
                io.writeln("9- Canviar numero de partides jugades ");
                io.writeln("10- Canviar numero de partides guanyades");
                io.writeln("11- Canviar numero de partides perdudes");
                io.writeln("12- Canviar numero de rondes jugades");
                io.writeln("13- Canviar numero de rondes guanyades");
                io.writeln("14- Canviar numero de rondes perdudes");
                io.writeln("15- Canviar numero de fitxes guanyades");
                io.writeln("16- Veure el percentatge de partides guanyades");
                io.writeln("17- Veure el percentatge de partides perdudes");
                io.writeln("18- Veure el percentatge de rondes guanyades");
                io.writeln("19- Veure el percentatge de rondes rondes");
                io.writeln("20- Veure el coeficient d'efectivitat de les partides");
                io.writeln("21- Veure el coeficient d'efectivitat de les rondes");
                io.writeln("22- Veure la mitjana de rondes per partida");
                io.writeln("23- Actualització d'estadistiques al finalitzar una ronda");
                io.writeln("24- Actualització d'estadistiques al finalitzar una partida");
                io.writeln("25- Carrega estadistiques");
                io.writeln("0- Sortir");

                while (op != 0) {
                        op = io.readint();
                        switch (op) {

                        case 1:// Estadistiques()
                                e=new Estadistiques();
                                io.writeln("S'han creat les estadistiques buides");
                                break;
                        case 2:// getPartidesJugades()
                                io.writeln("Les partides que s'han jugat son: "+e.getPartidesJugades()+".");
                                break;
                        case 3:// getPartidesGuanyades()
                                io.writeln("Les partides que s'han guanyat son: "+e.getPartidesGuanyades()+".");
                                break;
                        case 4:// getPartidesEliminat()
                                io.writeln("Les partides que s'han perdut son: "+e.getPartidesEliminat()+".");
                                break;
                        case 5:// getRondesJugades()
                                io.writeln("Les rondes que s'han jugat son: "+e.getRondesJugades()+".");
                                break;
                        case 6:// getRondesGuanyades()
                                io.writeln("Les rondes que s'han guanyat son: "+e.getRondesGuanyades()+".");
                                break;     
                        case 7:// getRondesPerdudes()
                                io.writeln("Les rondes que s'han perdut son: "+e.getRondesPerdudes()+".");
                                break;
                        case 8:// getFitxesGuanyades()
                                io.writeln("Les fitxes guanyades son: "+e.getFitxesGuanyades()+".");
                                break;
                        case 9:// serPartidesJugades()
                                io.writeln("Entra el nou numero per actualitzar les partides jugades");
                                int numpartides=io.readint();
                                e.setPartidesJugades(numpartides);
                                io.writeln("S'han actualitzat les partides jugades a "+numpartides+".");
                                break;
                        case 10:// setPartidesGuanyades()
                                io.writeln("Entra el nou numero per actualitzar les partides guanyades");
                                int pguanyades=io.readint();
                                e.setPartidesGuanyades(pguanyades);
                                io.writeln("S'han actualitzat les partides guanyades a "+pguanyades+".");
                                break;
                        case 11:// setPartidesEliminat()
                                io.writeln("Entra el nou numero per actualitzar les partides perdudes");
                                int pperdudes=io.readint();
                                e.setPartidesEliminat(pperdudes);
                                io.writeln("S'han actualitzat les partides perdudes a "+pperdudes+".");
                                break;
                        case 12:// setRondesJugades()
                                io.writeln("Entra el nou numero per actualitzar les rondes jugades");
                                int rondesj=io.readint();
                                e.setRondesJugades(rondesj);
                                io.writeln("S'han actualitzat les rondes jugades a "+rondesj+".");
                                break;
                        case 13:// setRondesGuanyades()
                                io.writeln("Entra el nou numero per actualitzar les rondes guanyades");
                                int rondesg=io.readint();
                                e.setRondesGuanyades(rondesg);
                                io.writeln("S'han actualitzat les rondes guanyades a "+rondesg+".");
                                break;
                        case 14:// setRondesPerdudes()
                                io.writeln("Entra el nou numero per actualitzar les rondes perdudes");
                                int rondesp=io.readint();
                                e.setRondesPerdudes(rondesp);
                                io.writeln("S'han actualitzat les rondes perdudes a "+rondesp+".");
                                break;
                        case 15:// setFitxesGuanyades()
                                io.writeln("Entra el nou numero per actualitzar les fitxes guanyades");
                                int fitxesguany=io.readint();
                                e.setFitxesGuanyades(fitxesguany);
                                io.writeln("S'han actualitzat les fitxes guanyades a "+fitxesguany+".");
                                break;
                         case 16:// percentatgePartidesGuanyades()
                                io.writeln("El percentatge de partides guanyades es:"+e.percentatgePartidesGuanyades()+".");
                                break;
                         case 17:// percentatgePartidesPerdues()
                                io.writeln("El percentatge de partides perdudes es:"+e.percentatgePartidesPerdudes()+".");
                                break;
                         case 18:// percentatgeRondesGuanyades()
                                io.writeln("El percentatge de rondes guanyades es:"+e.percentatgeRondesGuanyades()+".");
                                break;
                         case 19:// percentatgeRondesPerdudes()
                                io.writeln("El percentatge de rondes perdudes es:"+e.percentatgeRondesPerdudes()+".");
                                break;
                         case 20:// coeficientEfectivitatPartides()
                                io.writeln("El coeficient d'efectivitat de les partides es:"+e.coeficientEfectivitatPartides()+".");
                                break;
                         case 21:// coeficientEfectivitatRondes()
                                io.writeln("El coeficient d'efectivitat de les rondes es:"+e.coeficientEfectivitatRondes()+".");
                                break;
                         case 22:// mitjanaRondesPartida()
                                io.writeln("La mitjana de rondes per partida es:"+e.mitjanaRondesGuanyadesPartida()+".");
                                break;
                         case 23:// actualitzaFiRonda()
                                io.writeln("La ronda ha finalitzat, heu guanyat? (si/no)");
                                String rguanyat=io.readword();
                                if (rguanyat.compareToIgnoreCase("si")==0){
                                    io.writeln("Quantes fitxes heu guanyat?");
                                    int fitxes=io.readint();
                                    e.actualitzaFiRonda(true, fitxes);
                                }
                                else if (rguanyat.compareToIgnoreCase("no")==0) e.actualitzaFiRonda(false, 0);
                                break;
                         case 24:// actualitzaFiPartida()
                                io.writeln("La partida ha finalitzat, heu guanyat (si/no)?");
                                String pguanyat=io.readword();
                                if (pguanyat.compareToIgnoreCase("si")==0) e.actualitzaFiPartida(true);
                                else if (pguanyat.compareToIgnoreCase("no")==0) e.actualitzaFiPartida(false);
                                break;
                         case 25:// carregaEstadistiques()
                                io.writeln("Les estadistiques actuals son:");
                                Map<String, Object> map = new HashMap<String, Object>();
                                map=e.carregaEstadistiques();
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
