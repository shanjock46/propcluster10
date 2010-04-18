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
                Carta c=new Carta();
                Carta aux=new Carta();
                io.writeln("1- Crear un jugador buit");
                io.writeln("2- Crear un jugador amb nom i cash");
                io.writeln("3- Veure el nom del jugador");
                io.writeln("4- Veure la ma del jugador");
                io.writeln("5- Veure el cash del jugador");
                io.writeln("6- Veure l'aposta del jugador");
                io.writeln("7- Veure les estadistiques del jugador");
                io.writeln("8- Canviar valor de la carta");
                io.writeln("9- Comparar carta amb cartes predeterminades");
                io.writeln("0- Sortir");

                while (op != 0) {
                        op = io.readint();
                        switch (op) {

                        case 1:// Carta()
                            c = new Carta();
                                io.writeln("S'ha creat una carta buida");
                                break;


           }
}
           }
}
