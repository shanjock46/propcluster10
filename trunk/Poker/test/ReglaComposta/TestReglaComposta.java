/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ReglaComposta;

import java.io.*;

/**
 *
 * @author Dani
 */
public class TestReglaComposta {
    public static void main(String[] args) throws Exception {
    int op = 30;
                inout io=new inout();
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br=new BufferedReader(isr);
                ReglaComposta a=new ReglaComposta();
                io.writeln("1- Crea una ReglaSimple buida");
                io.writeln("2- Crea una ReglaSimple amb nom i frase");
                io.writeln("3- Obte la frase de la ReglaSimple");
                io.writeln("4- Canvia la frase de la ReglaSimple");

                while (op != 0) {
                    op = io.readint();
                        switch (op) {

                        case 1:// ReglaComposta()
                            a=new ReglaComposta();
                            io.writeln("S'ha creat una ReglaComposta buida");
                            break;

                        case 2:// ReglaComposta(String, ReglaFinal, ReglaFinal, String)
                            io.writeln("Introdueix el nom de la ReglaFinal1");
                            String nom1=br.readLine();
                            ReglaComposta a1=new ReglaComposta();
                            a1.setNom(nom1);
                            io.writeln("Introdueix el nom de la ReglaFinal2");
                            String nom2=br.readLine();
                            ReglaComposta a2=new ReglaComposta();
                            a2.setNom(nom2);
                            io.writeln("Introdueix el nom de la nova regla");
                            String nom3=br.readLine();
                            io.writeln("Introdueix el comparador de la nova regla");
                            String comp=br.readLine();
                            a=new ReglaComposta(nom3,a1,a2,comp);
                            io.writeln("S'ha creat una ReglaComposta amb nom, regla 1, regla 2 i comparador");
                            io.writeln("Pots obtenir o canviar regla1, regla2 i comparador des d'aqui. El nom, des de el tester de ReglaFinal");
                            break;

                        case 3:// getRegla1()
                            io.writeln("El nom de la regla1 de la ReglaComposta es: "+a.getRegla1().getNom());
                            break;

                        case 4:// getRegla2()
                            io.writeln("El nom de la regla2 de la ReglaComposta es: "+a.getRegla2().getNom());
                            break;

                        case 5:// getComparacio()
                            io.writeln("La comparacio entre regles de la ReglaComposta es: "+a.getComparacio());
                            break;

                        case 6:// setRegla1(ReglaFinal)
                            io.writeln("Introdueix el nom de la ReglaFinal1");
                            String nom5=br.readLine();
                            ReglaComposta a3=new ReglaComposta();
                            a3.setNom(nom5);
                            a.setRegla1(a3);
                            io.writeln("El nom de la nova regla1 de ReglaComposta es: "+a.getRegla1().getNom());
                            break;

                        case 7:// setRegla2(ReglaFinal)
                            io.writeln("Introdueix el nom de la ReglaFinal1");
                            String nom6=br.readLine();
                            ReglaComposta a4=new ReglaComposta();
                            a4.setNom(nom6);
                            a.setRegla1(a4);
                            io.writeln("El nom de la nova regla1 de ReglaComposta es: "+a.getRegla1().getNom());
                            break;

                        case 8:// setComparacio(String)
                            io.writeln("Introdueix una nova comparacio");
                            String f=br.readLine();
                            a.setComparacio(f);
                            io.writeln("La nova comparacio de la ReglaComposta es: "+a.getComparacio());
                            break;

                        
}
                }}

}
