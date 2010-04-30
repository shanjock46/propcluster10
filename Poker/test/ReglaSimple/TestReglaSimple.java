/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ReglaSimple;

import java.io.*;

/**
 *
 * @author Dani
 */
public class TestReglaSimple {
    public static void main(String[] args) throws Exception {
    int op = 30;
                inout io=new inout();
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br=new BufferedReader(isr);
                ReglaSimple a=new ReglaSimple();
                io.writeln("1- Crea una ReglaSimple buida");
                io.writeln("2- Crea una ReglaSimple amb nom i frase");
                io.writeln("3- Obte la frase de la ReglaSimple");
                io.writeln("4- Canvia la frase de la ReglaSimple");
                io.writeln("0- Sortir");

                while (op != 0) {
                    op = io.readint();
                        switch (op) {

                        case 1:// ReglaSimple()
                            a=new ReglaSimple();
                            io.writeln("S'ha creat una ReglaSimple buida");
                            break;

                        case 2:// ReglaSimple(String, String)
                            io.writeln("Introdueix el nom de la ReglaSimple");
                            String nom=br.readLine();
                            io.writeln("Introdueix la frase de la ReglaSimple");
                            String frase=br.readLine();
                            a=new ReglaSimple(nom,frase);
                            io.writeln("S'ha creat una ReglaSimple amb nom i frase: "+a.getFrase());
                            io.writeln("Pots obtenir o canviar la frase des d'aqui. El nom, des de el tester de ReglaFinal");
                            break;

                        case 3:// getFrase()
                            io.writeln("La frase de la ReglaSimple es: "+a.getFrase());
                            break;

                        case 4:// setFrase(String)
                            io.writeln("Introdueix una nova frase per la ReglaSimple");
                            String f=br.readLine();
                            a.setFrase(f);
                            io.writeln("La nova frase de la ReglaSimple es: "+a.getFrase());
                            break;
}
                }}}