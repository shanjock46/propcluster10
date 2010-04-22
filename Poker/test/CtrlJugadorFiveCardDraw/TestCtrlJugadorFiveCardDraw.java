/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package CtrlJugadorFiveCardDraw;

/**
 *
 * @author Martina Canyelles
 */
public class TestCtrlJugadorFiveCardDraw {

   public static void main(String[] args) throws Exception {
                int op = 30;
                inout io = new inout();
                CtrlJugadorFiveCardDraw c=new CtrlJugadorFiveCardDraw();
                io.writeln("1- Crear Controlador Jugador FiveCardDraw");
                io.writeln("2- Crear Jugador FiveCardDraw");
                io.writeln("0- Sortir");

                while (op != 0) {
                        op = io.readint();
                        switch (op) {

                        case 1:// Creadora CtrlJugadorFiveCardDraw()
                                c=new CtrlJugadorFiveCardDraw();
                                io.writeln("S'ha creat el controlador del Jugador FiveCardDraw");
                                break;
                        case 2:// crearJugador(string nom,boolean maquina)
                                io.writeln("Escrigui el nom del jugador:");
                                String nom=io.readword();
                                io.writeln("Es jugador màquina (si/no)");
                                
                                io.writeln("S'ha creat el jugador"+nom+" de tipus"+tipus+);
                                break;
                        }
                }
   }
}
