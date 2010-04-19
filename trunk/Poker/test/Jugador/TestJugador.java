/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Jugador;

/**
 *
 * @author Dani
 */
public class TestJugador {

           public static void main(String[] args) throws Exception {

                int op = 30;
                inout io = new inout();
                Jugador jug=new JugadorFiveCardDrawSB();
                io.writeln("1- Crear un jugador buit");
                io.writeln("2- Crear un jugador amb nom i cash");
                io.writeln("3- Crear un jugador amb nom");
                io.writeln("4- Veure el nom del jugador");
                io.writeln("5- Veure la ma del jugador");
                io.writeln("6- Veure el cash del jugador");
                io.writeln("7- Veure l'aposta del jugador");
                io.writeln("8- Veure les estadistiques del jugador");
                io.writeln("9- Veure l'estrategia");
                io.writeln("10- Canviar el nom del jugador");
                io.writeln("11- Canviar la ma del jugador");
                io.writeln("12- Canviar el cash del jugador");
                io.writeln("13- Canviar l'aposta del jugador");
                io.writeln("14- Canviar les estadistiques del jugador");
                io.writeln("15- Canviar l'estrategia");
                io.writeln("16- Afegir una carta a la ma");
                io.writeln("17- Buidar la ma");
                io.writeln("18- Descartar una carta");
                io.writeln("19- Fer una evaluació");
                io.writeln("20- Carrega les estadístiques");
                io.writeln("21- Afegir una carta a la ma");
                io.writeln("0- Sortir");
                io.writeln("0- Sortir");

                while (op != 0) {
                        op = io.readint();
                        switch (op) {

                        case 1:// Carta()
                                jug=new JugadorFiveCardDrawSB();
                                io.writeln("S'ha creat un nou jugador");
                                break;
                        
                        case 2:// Carta()
                                io.writeln("S'ha creat una carta buida");
                                break;
                                
                        case 3:// Carta()
                                io.writeln("S'ha creat una carta buida");
                                break;

                        case 4:// Carta()
                                io.writeln("S'ha creat una carta buida");
                                break;

                         case 5:// Carta()
                                io.writeln("S'ha creat una carta buida");
                                break;

                        case 6:// Carta()
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

                         case 13:// Carta()
                                io.writeln("S'ha creat una carta buida");
                                break;

                        case 14:// Carta()
                                io.writeln("S'ha creat una carta buida");
                                break;

                        case 15:// Carta()
                                io.writeln("S'ha creat una carta buida");
                                break;

                        case 16:// Carta()
                                io.writeln("S'ha creat una carta buida");
                                break;

                        case 17:// Carta()
                                io.writeln("S'ha creat una carta buida");
                                break;

                        case 18:// Carta()
                                io.writeln("S'ha creat una carta buida");
                                break;

                        case 19:// Carta()
                                io.writeln("S'ha creat una carta buida");
                                break;

                        case 20:// Carta()
                                io.writeln("S'ha creat una carta buida");
                                break;

                        case 21:// Carta()
                                io.writeln("S'ha creat una carta buida");
                                break;

           }
}
           }
}
