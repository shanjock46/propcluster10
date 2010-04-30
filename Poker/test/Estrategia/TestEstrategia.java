/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Estrategia;

import java.io.*;
import java.util.*;

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
                io.writeln("0 - Sortir");


                while (op != 0) {
                    op = io.readint();
                        switch (op) {

                        case 1:// Estrategia()
                            e=new Estrategia();
                            io.writeln("S'ha creat una Estrategia amb el set de regles simples present");
                            break;

                        case 2:// afegirRegla(ReglaFinal)
                            io.writeln("Introdueix el nom de la regla que vols afegir");
                            String nom=br.readLine();
                            ReglaSimple a=new ReglaSimple();
                            a.setNom(nom);
                            e.afegirRegla(a);
                            io.writeln("S'ha afegit la regla al set de regles. Comprova-ho fent un obteRegles(opcio 4)");
                            break;

                        case 3:// avaluaRegles(Map)
                            io.writeln("Per fer-ho mes grafic, canviarem el set de regles durant l'execucio d'aquesta opcio...");
                            io.writeln("El nom de les noves regles es: A, B, C, D, E");
                            io.writeln("Les seves frases son: fA, fB, fC, fD, fE");
                            io.writeln("Les seves accions associades son: accioA, accioB, accioC, accioD, accioE");
                            io.writeln("Les seves prioritats son: 1,2,3,4,5");
                            io.writeln("Al final de la opcio, tornarem a tenir el set de regles previ");
                            List<ReglaFinal> lll=new ArrayList<ReglaFinal>();
                            ReglaSimple xx1=new ReglaSimple();
                            xx1.setNom("A");
                            xx1.setFrase("fA");
                            xx1.setAccio("accioA");
                            xx1.setPrioritat(1);
                            lll.add(xx1);
                            xx1=new ReglaSimple();
                            xx1.setNom("B");
                            xx1.setFrase("fB");
                            xx1.setAccio("accioB");
                            xx1.setPrioritat(2);
                            lll.add(xx1);
                            xx1=new ReglaSimple();
                            xx1.setNom("C");
                            xx1.setFrase("fC");
                            xx1.setAccio("accioC");
                            xx1.setPrioritat(3);
                            lll.add(xx1);
                            xx1=new ReglaSimple();
                            xx1.setNom("D");
                            xx1.setFrase("fD");
                            xx1.setAccio("accioD");
                            xx1.setPrioritat(4);
                            lll.add(xx1);
                            xx1=new ReglaSimple();
                            xx1.setNom("E");
                            xx1.setFrase("fE");
                            xx1.setAccio("accioE");
                            xx1.setPrioritat(5);
                            lll.add(xx1);
                            List<ReglaFinal> llll=e.getConjuntRegles();
                            e.setConjuntRegles(lll);
                            io.writeln("Quantes regles vols introduir?");
                            int regla=io.readint();                            
                            io.writeln("Introdueix el nom de les regles que es compleixen.");
                            io.writeln("El sistema et retornara l'accio associada a la regla amb prioritat mes alta que es compleixi");
                            io.writeln("La comprovacio es fa amb la FRASE.Si no es compleix cap regla, el sistema t'ho fara saber");
                            Map<String,Object> m=new HashMap<String,Object>();
                            for (int i=1;i<=regla;i++){
                            io.writeln("Introdueix la frase de la regla "+i);
                            String frase=br.readLine();
                            m.put(frase, null);
                            }
                            io.writeln(e.avaluaRegles(m));
                            e.setConjuntRegles(llll);
                            break;

                        case 4:// getConjuntRegles()
                            io.writeln("La llista de regles presents a estrategia son...");
                            List<ReglaFinal> l=new ArrayList<ReglaFinal>();
                            l=e.getConjuntRegles();
                            Iterator<ReglaFinal> pateador=l.iterator();
                            while (pateador.hasNext()){
                                io.writeln(pateador.next().getNom());
                            }
                            io.writeln("Fi de la llista");
                            break;

                        case 5:// setConjuntRegles()
                            io.writeln("Substituirem el set de regles present a estrategia per 3 noves regles...");
                            io.writeln("Introdueix el nom de la regla 1");
                            String nom1=br.readLine();
                            ReglaSimple a1=new ReglaSimple();
                            a1.setNom(nom1);
                            io.writeln("Introdueix el nom de la regla 2");
                            String nom2=br.readLine();
                            ReglaSimple a2=new ReglaSimple();
                            a2.setNom(nom2);
                            io.writeln("Introdueix el nom de la regla 3");
                            String nom3=br.readLine();
                            ReglaSimple a3=new ReglaSimple();
                            a3.setNom(nom3);
                            List<ReglaFinal> ll=new ArrayList<ReglaFinal>();
                            ll.add(a1);
                            ll.add(a2);
                            ll.add(a3);
                            e.setConjuntRegles(ll);
                            io.writeln("S'ha substituit el set de regles. Comprova-ho fent un ObteRegles (opcio 4)");
                            break;
}
                }}}