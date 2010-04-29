/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ReglaSimple2;

import java.io.*;

/**
 *
 * @author Dani
 */
public class TestReglaSimple {
    public static void main(String[] args) throws Exception {
    int op = 30;

                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br=new BufferedReader(isr);
                ReglaSimple a=new ReglaSimple();
                System.out.println("1- Crea una ReglaSimple buida");
                System.out.println("2- Crea una ReglaSimple amb nom i frase");
                System.out.println("3- Obte la frase de la ReglaSimple");
                System.out.println("4- Canvia la frase de la ReglaSimple");

                while (op != 0) {
                        op = br.read();
                        switch (op) {

                        case 1:// ReglaSimple()
                            a=new ReglaSimple();
                            break;

                        case 2:// ReglaSimple(String, String)
                            System.out.println("Introdueix el nom de la ReglaSimple");
                            String nom=br.readLine();
                            System.out.println("Introdueix la frase de la ReglaSimple");
                            String frase=br.readLine();
                            a=new ReglaSimple(nom,frase);
                            System.out.println("S'ha creat una ReglaSimple amb nom i frase: "+a.getFrase());
                            System.out.println("Pots obtenir o canviar la frase des d'aqui. El nom, des de el tester de ReglaFinal");
                            break;

                        case 3:// getFrase()
                            System.out.println("La frase de la ReglaSimple es: "+a.getFrase());
                            break;

                        case 4:// setFrase(String)
                            System.out.println("Introdueix una nova frase per la ReglaSimple");
                            String f=br.readLine();
                            a.setFrase(f);
                            System.out.println("La nova frase de la ReglaSimple es: "+a.getFrase());
                            break;
}
                }}}