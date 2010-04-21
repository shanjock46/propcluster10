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
                CtrlJugador c=new CtrlJugador();
                JugadorSB j=new JugadorSB();
                io.writeln("1- Retorna el jugador present a la capa");
                io.writeln("2- Canvia el jugador present a la capa");
                io.writeln("3- Retorna la capa de dades de jugador");
                io.writeln("4- Canvia la capa de dades de jugador");
                io.writeln("5- Retorna el controlador d'estrategia");
                io.writeln("6- Canvia el controlador d'estrategia");
                io.writeln("7- Crea una nova instancia de jugador al sistema");
                io.writeln("8- Fa persistent el jugador present a la capa");
                io.writeln("9- Obte un jugador del sistema amb nom igual a entrada");
                io.writeln("10- Carrega les estadistiques del jugador present a la capa");

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
                                j=new JugadorSB();
                                j.setNom(nom);
                                c.setJug(j);
                                io.writeln("S'ha canviat el jugador present a la capa");
                                break;

                        case 3:// getCtrlDadesJugador()

                                io.writeln("S'ha creat una carta buida");
                                break;

                        case 4:// setCtrlDadesJugador(CtrlDadesJugador)

                                io.writeln("S'ha creat una carta buida");
                                break;

                        case 5:// getCtrlEstrategia()

                                io.writeln("S'ha creat una carta buida");
                                break;

                        case 6:// setCtrlEstrategia()

                                io.writeln("S'ha creat una carta buida");
                                break;

                        case 7:// crearJugador(String,Boolean)

                                io.writeln("S'ha creat una carta buida");
                                break;

                        case 8:// obteLlistatJugadors()

                                io.writeln("S'ha creat una carta buida");
                                break;

                        case 11:// guardarJugador()

                                io.writeln("S'ha creat una carta buida");
                                break;

                        case 12:// carregaEstadistiques()

                                io.writeln("S'ha creat una carta buida");
                                break;
                        


}
                }
}
}
