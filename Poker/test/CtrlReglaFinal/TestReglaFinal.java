/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package CtrlReglaFinal;

import java.io.*;

/**
 *
 * @author Dani
 */
public class TestReglaFinal {
     public static void main(String[] args) throws Exception {

                int op = 30;
                inout io = new inout();
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br=new BufferedReader(isr);
                CtrlReglaFinal a=new CtrlReglaFinal();
                io.writeln("1- Crea el controlador de ReglaFinal buit");
                io.writeln("2- Crea una nova regla composta");
                io.writeln("0- Sortir");

                while (op != 0) {
                        op = io.readint();
                        switch (op) {

                        case 1:// CtrlReglaFinal()
                            a=new CtrlReglaFinal();
                            io.writeln("S'ha creat un nou controlador de ReglaFinal");
                            break;

                        case 2:// crearReglaComposta()
                            io.writeln("Introdueix el nom de la ReglaFinal1");
                            String nom1=io.readword();
                            ReglaComposta a1=new ReglaComposta();
                            a1.setNom(nom1);
                            io.writeln("Introdueix el nom de la ReglaFinal2");
                            String nom2=io.readword();
                            ReglaComposta a2=new ReglaComposta();
                            a2.setNom(nom2);
                            io.writeln("Introdueix el nom de la nova regla");
                            String nom3=io.readword();
                            io.writeln("Introdueix el comparador de la nova regla");
                            String comp=io.readword();
                            ReglaComposta x=(ReglaComposta)a.crearReglaComposta(nom3, a1, a2, comp);
                            io.writeln("S'ha creat una nova regla composta al controlador");
                            io.writeln("La nova ReglaComposta te nom: "+x.getNom()+", el nom de la seva regla1 es: "+x.getRegla1().getNom()+", el nom de la seva regla2 es: "+x.getRegla2().getNom()+" i el seu comparador es: "+x.getComparacio());
                            break;
                        }}}

}
