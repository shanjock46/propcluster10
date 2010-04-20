/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package CtrlJugador;

/**
 *
 * @author Dani
 */
public class TestCtrlJugador {
        public static void main(String[] args) throws Exception {


                int op = 30;
                inout io = new inout();

                io.writeln("1- Crear CtrlJugador buit");
                io.writeln("2- Crear CtrlJugador amb el jugador que li indiquem");
                io.writeln("3- Retorna el jugador present a la capa");
                io.writeln("4- Canvia el jugador present a la capa");
                io.writeln("5- Retorna la capa de dades de jugador");
                io.writeln("6- Canvia la capa de dades de jugador");
                io.writeln("7- Retorna el controlador d'estrategia");
                io.writeln("8- Canvia el controlador d'estrategia");
                io.writeln("9- Crea una nova instancia de jugador al sistema");
                io.writeln("10- Fa persistent el jugador present a la capa");
                io.writeln("11- Obte un jugador del sistema amb nom igual a entrada");
                io.writeln("12- Carrega les estadistiques del jugador present a la capa");

                while (op != 0) {
                        op = io.readint();
                        switch (op) {

                        case 1:// CtrlJugador()
                           
                                io.writeln("S'ha creat una carta buida");
                                break;

                        case 2:// CrtlJugador(String)

                                io.writeln("S'ha creat una carta buida");
                                break;

                        case 3:// getJug()

                                io.writeln("S'ha creat una carta buida");
                                break;

                        case 4:// setJug(Jugador)

                                io.writeln("S'ha creat una carta buida");
                                break;

                        case 5:// getCtrlDadesJugador()

                                io.writeln("S'ha creat una carta buida");
                                break;

                        case 6:// setCtrlDadesJugador(CtrlDadesJugador)

                                io.writeln("S'ha creat una carta buida");
                                break;

                        case 7:// Carta()

                                io.writeln("S'ha creat una carta buida");
                                break;

                        case 8:// Carta()

                                io.writeln("S'ha creat una carta buida");
                                break;

                        case 9:// Carta()

                                io.writeln("S'ha creat una carta buida");
                                break;

                        case 10:// Carta()

                                io.writeln("S'ha creat una carta buida");
                                break;

                        case 11:// Carta()

                                io.writeln("S'ha creat una carta buida");
                                break;

                        case 12:// Carta()

                                io.writeln("S'ha creat una carta buida");
                                break;
                        


}
                }
}
}
