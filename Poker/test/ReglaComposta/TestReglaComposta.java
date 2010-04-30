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
                io.writeln("1- Crea una ReglaComposta buida");
                io.writeln("2- Crea una ReglaComposta amb nom, regla1, regla2 i comparador");
                io.writeln("3- Obte regla1");
                io.writeln("4- Obte regla2");
                io.writeln("5- Obte comparador");
                io.writeln("6- Canvia regla1");
                io.writeln("7- Canvia regla2");
                io.writeln("8- Canvia comparador");
                io.writeln("0- Sortir");

                while (op != 0) {
                    op = io.readint();
                        switch (op) {

                        case 1:// ReglaComposta()
                            a=new ReglaComposta();
                            io.writeln("S'ha creat una ReglaComposta buida");
                            break;

                        case 2:// ReglaComposta(String, ReglaFinal, ReglaFinal, String)
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
                            a=new ReglaComposta(nom3,a1,a2,comp);
                            io.writeln("S'ha creat una ReglaComposta amb nom, regla 1, regla 2 i comparador");
                            io.writeln("Pots obtenir o canviar regla1, regla2 i comparador des d'aqui. El nom, des de el tester de ReglaFinal");
                            break;

                        case 3:// getRegla1()
                            if (a.getRegla1()==null) io.writeln("Executa la opcio 2 i crea una regla composta no buida");
                            else io.writeln("El nom de la regla1 de la ReglaComposta es: "+a.getRegla1().getNom());
                            break;

                        case 4:// getRegla2()
                            if (a.getRegla2()==null) io.writeln("Executa la opcio 2 i crea una regla composta no buida");
                            else io.writeln("El nom de la regla2 de la ReglaComposta es: "+a.getRegla2().getNom());
                            break;

                        case 5:// getComparacio()
                            io.writeln("La comparacio entre regles de la ReglaComposta es: "+a.getComparacio());
                            break;

                        case 6:// setRegla1(ReglaFinal)
                            io.writeln("Introdueix el nom de la ReglaFinal1");
                            String nom5=io.readword();
                            ReglaComposta a3=new ReglaComposta();
                            a3.setNom(nom5);
                            a.setRegla1(a3);
                            io.writeln("El nom de la nova regla1 de ReglaComposta es: "+a.getRegla1().getNom());
                            break;

                        case 7:// setRegla2(ReglaFinal)
                            io.writeln("Introdueix el nom de la ReglaFinal2");
                            String nom6=io.readword();
                            ReglaComposta a4=new ReglaComposta();
                            a4.setNom(nom6);
                            a.setRegla2(a4);
                            io.writeln("El nom de la nova regla1 de ReglaComposta es: "+a.getRegla2().getNom());
                            break;

                        case 8:// setComparacio(String)
                            io.writeln("Introdueix una nova comparacio");
                            String f=io.readword();
                            a.setComparacio(f);
                            io.writeln("La nova comparacio de la ReglaComposta es: "+a.getComparacio());
                            break;

                        
}
                }}

}
