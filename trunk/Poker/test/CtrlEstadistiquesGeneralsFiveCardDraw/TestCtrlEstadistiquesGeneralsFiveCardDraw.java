/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package CtrlEstadistiquesGeneralsFiveCardDraw;

import java.util.*;

/**
 *
 * @author Daniel Mulero
 */
public class TestCtrlEstadistiquesGeneralsFiveCardDraw {
    public static void main(String[] args) throws Exception {
                int op = 30;
                inout io = new inout();
                CtrlEstadistiquesGeneralsFiveCardDraw a=new CtrlEstadistiquesGeneralsFiveCardDraw();
                io.writeln("1- Crea el controlador d'estadistiques");
                io.writeln("2- Carrega les estadistiques presents al controlador");
                io.writeln("3- ");
                io.writeln("4- ");
                io.writeln("5- ");
                io.writeln("0- Sortir");

                while (op != 0) {
                        op = io.readint();
                        switch (op) {

                        case 1:// CtrlEstadistiquesGeneralsFiveCardDraw()
                            a=new CtrlEstadistiquesGeneralsFiveCardDraw();
                            io.writeln("S'ha creat un nou controlador d'accio");
                            break;

                        case 2:// carregaEstadistiquesPoker()
                            io.writeln("Les estadistiques generals Poker actuals son:");

                                Map<String, Object> map = new HashMap<String, Object>();
                                map=a.carregaEstadistiquesPoker();
                                Iterator iterator = map.keySet().iterator();

                                while (iterator.hasNext()) {
                                    String key = iterator.next().toString();
                                    String value = map.get(key).toString();
                                    io.writeln(key + ": " + value);
                                   }
                            break;

                        case 3:// actualitzaEstadistiquesPoker(String s)
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
                                    io.writeln();
                                    a.actualitzaEstadistiquesPoker(combinacio);
                                    io.writeln("Les estadistiques generals FiveCardDraw han estat actualitzades");
                            break;

                        case 4:// getEst()
                            if (a.getEst()==null) io.writeln("No hi ha cap est present a la capa");
                            else io.writeln("S'ha carregat correctament el est present a la capa");
                            break;

                        case 5:// setEst(EstadistiquesGeneralsFiveCardDraw)
                            EstadistiquesGeneralsFiveCardDraw r=new EstadistiquesGeneralsFiveCardDraw();
                            a.setEst(r);
                            io.writeln("S'ha setejat un nou objecte est al controlador");
                            break;
                        }}}
}
