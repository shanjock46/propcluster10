/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package CtrlEstrategia;

import java.io.*;

/**
 *
 * @author Dani
 */
public class TestCtrlEstrategia {
    public static void main(String[] args) throws Exception {

                int op = 30;
                inout io = new inout();
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br=new BufferedReader(isr);
                CtrlEstrategia ce=new CtrlEstrategia();
                io.writeln("1- Crea el controlador d'estrategia buit");
                io.writeln("2- Inicialitza els atributs de la classe");
                io.writeln("3- Afegeix una nova regla composta al set de regles de l'estrategia del controlador");
                io.writeln("4- Assigna una accio i una prioritat a una regla del set de regles de l'estrategia del controlador");
                io.writeln("5- Intercanvia la prioritat entre dos regles del set de regles de l'estrategis del controlador");
                io.writeln("6- Obte l'estrategia present al controlador");
                io.writeln("7- Obte el CtrlReglaFinal present al controlador");
                io.writeln("8- Obte el numero de regles amb accio assignada present al sistema (sense contar defaults)");
                io.writeln("9- Canvia l'estrategia present al controlador");
                io.writeln("10- Canvia el CtrlReglaFinal present al controlador");
                io.writeln("11- Canvia el numero de regles amb accio assignada presents al sistema");
                io.writeln("0- Sortir");

                while (op != 0) {
                        op = io.readint();
                        switch (op) {

                        case 1:// CtrlEstrategia()
                            ce=new CtrlEstrategia();
                            io.writeln("S'ha creat un nou controlador d'estrategia");
                            break;

                        case 2:// crearEstrategia()
                            ce=new CtrlEstrategia();
                            io.writeln("S'ha creat un nou controlador d'estrategia");
                            break;

                        case 3:// afegirReglaComposta(String, String, String, String)
                            ce=new CtrlEstrategia();
                            io.writeln("S'ha creat un nou controlador d'estrategia");
                            break;

                        case 4:// assignarAccio(String, String)
                            ce=new CtrlEstrategia();
                            io.writeln("S'ha creat un nou controlador d'estrategia");
                            break;

                        case 5:// canviPrioritat(String, String)
                            ce=new CtrlEstrategia();
                            io.writeln("S'ha creat un nou controlador d'estrategia");
                            break;

                        case 6:// getStrategy()
                            ce=new CtrlEstrategia();
                            io.writeln("S'ha creat un nou controlador d'estrategia");
                            break;

                        case 7:// getCrf()
                            ce=new CtrlEstrategia();
                            io.writeln("S'ha creat un nou controlador d'estrategia");
                            break;

                        case 8:// getNumeroReglas()
                            ce=new CtrlEstrategia();
                            io.writeln("S'ha creat un nou controlador d'estrategia");
                            break;

                        case 9:// setStrategy(Estrategia)
                            ce=new CtrlEstrategia();
                            io.writeln("S'ha creat un nou controlador d'estrategia");
                            break;

                        case 10:// setCrf(CtrlReglaFinal)
                            ce=new CtrlEstrategia();
                            io.writeln("S'ha creat un nou controlador d'estrategia");
                            break;

                        case 11:// setNumeroReglas(Integer)
                            ce=new CtrlEstrategia();
                            io.writeln("S'ha creat un nou controlador d'estrategia");
                            break;

                        }}}
}
