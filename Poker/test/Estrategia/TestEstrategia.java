/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Estrategia;

import java.io.*;

/**
 *
 * @author Dani
 */
public class TestEstrategia {
    public static void main(String[] args) throws Exception {
    int op = 30;
                inout io=new inout();
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br=new BufferedReader(isr);
                Estrategia e=new Estrategia();
                io.writeln("1- Crea una estrategia amb el set de regles simples");
                io.writeln("2- Afegeix una regla al set de regles de l'estrategia");
                io.writeln("3- Avalua les regles de l'estrategia");
                io.writeln("4- Obte conjunt de regles");
                io.writeln("5- Canvia el conjunt de regles");


                while (op != 0) {
                    op = io.readint();
                        switch (op) {

                        case 1:// Estrategia()
                            
                            break;

                        case 2:// afegirRegla(ReglaFinal)

                            break;

                        case 3:// avaluaRegles(Map)

                            break;

                        case 4:// getConjuntRegles()

                            break;

                        case 5:// setConjuntRegles()

                            break;
}
                }}}