/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ReglaFinal;

import java.io.*;

/**
 *
 * @author Dani
 */
public class TestReglaFinal {
    public static void main(String[] args) throws Exception {
    int op = 30;
                inout io=new inout();
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br=new BufferedReader(isr);
                ReglaSimple a=new ReglaSimple();
                io.writeln("1- Crea una ReglaFinal buida");
                io.writeln("2- Obte el nom de la ReglaFinal");
                io.writeln("3- Obte la prioritat de la ReglaFinal");
                io.writeln("4- Obte l'accio de la ReglaFinal");
                io.writeln("5- Canvia el nom de la ReglaFinal");
                io.writeln("6- Canvia la prioritat de la ReglaFinal");
                io.writeln("7- Canvia l'accio de la ReglaFinal");
                io.writeln("0- Sortir");
                
                while (op != 0) {
                    op = io.readint();
                        switch (op) {

                        case 1:// ReglaSimple(). ReglaFinal es abstracta
                            a=new ReglaSimple();
                            io.writeln("S'ha creat una ReglaFinal buida");
                            break;

                        case 2:// getNom()
                            io.writeln("El nom de la ReglaFinal es: "+a.getNom());
                            break;

                        case 3:// getPrioritat()
                            io.writeln("La prioritat de la ReglaFinal es: "+a.getPrioritat());
                            break;

                        case 4:// getAccio()
                            io.writeln("L'accio associada a la ReglaFinal es: "+a.getAccio());
                            break;

                        case 5:// setNom(String)
                            io.writeln("Introdueix un nou nom");
                            String f=br.readLine();
                            a.setNom(f);
                            io.writeln("El nou nom de la ReglaFinal es: "+a.getNom());
                            break;

                        case 6:// setPrioritat(Integer)
                            io.writeln("Introdueix una nova prioritat");
                            int x=io.readint();
                            a.setPrioritat(x);
                            io.writeln("La nova prioritat de la ReglaFinal es: "+a.getPrioritat());
                            break;

                        case 7:// setAccio(String)
                            io.writeln("Introdueix una nova accio");
                            String f2=br.readLine();
                            a.setAccio(f2);
                            io.writeln("La nova accio associada a la ReglaFinal es: "+a.getAccio());
                            break;
}
                }}}