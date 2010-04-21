/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package CtrlJugador;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Dani
 */
public class TestCtrlJugador {
        public static void main(String[] args) throws Exception {


                int op = 30;
                inout io = new inout();
                CtrlJugador c=new CtrlJugadorFiveCardDraw();
                Jugador j=new JugadorFiveCardDraw();
                io.writeln("1- Retorna el jugador present a la capa");
                io.writeln("2- Canvia el jugador present a la capa");
                io.writeln("3- Retorna la capa de dades de jugador");
                io.writeln("4- Canvia la capa de dades de jugador");
                io.writeln("5- Retorna el controlador d'estrategia");
                io.writeln("6- Canvia el controlador d'estrategia");
                io.writeln("7- Crea una nova instancia de jugador al sistema");
                io.writeln("8- Obte un jugador del sistema amb nom igual a entrada");
                io.writeln("9- Obte un llistat de noms de jugador del sistema");
                io.writeln("10- Fa persistent el jugador al sistema");
                io.writeln("11- Carrega les estadistiques del jugador present a la capa");

                while (op != 0) {
                        op = io.readint();
                        switch (op) {

                        case 1:// getJug()
                                if (c.getJug()==null) io.writeln("No hi ha cap jugador present a la capa.");
                                else io.writeln("El jugador present a la capa es diu "+c.getJug().getNom());
                                break;

                        case 2:// setJug(Jugador)
                                io.writeln("Introdueix un nom de jugador");
                                String nom=io.readword();
                                j=new JugadorFiveCardDraw();
                                j.setNom(nom);
                                c.setJug(j);
                                io.writeln("S'ha canviat el jugador present a la capa");
                                break;

                        case 3:// getCtrlDadesJugador()

                                if (c.getCapaDeDades()==null) io.writeln("No hi ha cap capa de dades de jugador associada a aquesta capa.");
                                else io.writeln("Hi ha una capa de dades de jugador associada a aquesta capa");
                                break;

                        case 4:// setCtrlDadesJugador(CtrlDadesJugador)
                                CtrlDadesJugadorSB cj=new CtrlDadesJugadorSB();
                                c.setCapaDeDades(cj);
                                io.writeln("S'ha associat una capa de dades de jugador a aquesta capa");
                                break;

                        case 5:// getCtrlEstrategia()

                                if (c.getEstrategia()==null) io.writeln("No hi ha cap controlador estrategia associat a aquesta capa.");
                                else io.writeln("Hi ha un controlador estrategia associat a aquesta capa");
                                break;

                        case 6:// setCtrlEstrategia()

                                CtrlEstrategiaSB e=new CtrlEstrategiaSB();
                                c.setEstrategia(e);
                                io.writeln("S'ha associat un controlador estrategia a aquesta capa");
                                break;

                        case 7:// crearJugador(String,Boolean)
                                io.writeln("Introdueix nom");
                                String nom2=io.readword();
                                io.writeln("Es maquina? (si/no)");
                                String maquina=io.readword();
                                if (maquina.compareTo("si")==0) {
                                    c.crearJugador(nom2, true);
                                    io.writeln("S'ha creat un nou jugador maquina i esta a la capa");
                                }
                                else if (maquina.compareTo("no")==0){
                                    c.crearJugador(nom2, false);
                                    io.writeln("S'ha creat un nou jugador huma i esta a la capa");
                                }
                                break;

                        case 8:// obteJugador(String)
                                io.writeln("Introdueix nom a buscar");
                                String nom3=io.readword();
                                c.obteJugador(nom3);
                                io.writeln("S'ha obtingut el jugador de la capa de dades i ara està a la capa");
                                break;
                        
                        case 9:// obteLlistatJugadors()
                                ArrayList<String> llista=new ArrayList<String>();
                                llista=c.obteLlistatJugadors();
                                Iterator<String> it=llista.iterator();
                                while (it.hasNext()) {
                                    io.writeln(it.next());
        }
                                io.writeln("Fi de la llista");
                                break;

                        case 10:// guardarJugador()
                                c.guardaJugador();
                                io.writeln("S'ha guardat el jugador a la capa de dades");
                                break;

                        case 11:// carregaEstadistiques()
                                Map <Integer,Integer> est=new HashMap<Integer,Integer>();
                                for (int ix=0;ix<est.size();ix++){
                                    io.writeln(est.get(ix));
                                }
                                io.writeln("Fi de les estadístiques");
                                break;
                        


}
                }
}
}
