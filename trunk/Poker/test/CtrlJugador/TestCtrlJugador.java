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
                io.writeln("3- Veure pal de la carta");
                io.writeln("4- Veure numero de la carta");
                io.writeln("5- Veure valor de la carta");
                io.writeln("6- Canviar pal de la carta");
                io.writeln("7- Canviar numero de la carta");
                io.writeln("8- Canviar valor de la carta");
                io.writeln("9- Comparar carta amb cartes predeterminades");
                io.writeln("0- Sortir");

                while (op != 0) {
                        op = io.readint();
                        switch (op) {

                        case 1:// Carta()
                           
                                io.writeln("S'ha creat una carta buida");
                                break;
                        


}
                }
}
}
