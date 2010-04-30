/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package CtrlEstrategia;

import java.io.*;
import java.util.*;

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
                            ce.crearEstrategia();
                            io.writeln("S'ha inicialitzat els atributs del controlador");
                            break;

                        case 3:// afegirReglaComposta(String, String, String, String)
                            io.writeln("Regles existents al sistema:");
                            List<ReglaFinal> l=ce.getStrategy().getConjuntRegles();
                            Iterator<ReglaFinal> pateador=l.iterator();
                            int i=1;
                            while (pateador.hasNext()){
                                if (i%5==0) io.writeln(" "+pateador.next().getNom()+",");
                                else io.write(" "+pateador.next().getNom()+",");
                            i++;
                            }
                            io.writeln();
                            io.writeln("----------------AVIS:CAP ALTRE OPCIO ES VALIDA---------------------------------------");
                            
                            io.writeln("Introdueix el nom de la nova ReglaComposta");
                            String nom1=br.readLine();
                            io.writeln("Introdueix el nom de la ReglaFinal1");
                            String nom2=br.readLine();
                            io.writeln("Introdueix el nom de la ReglaFinal2");
                            String nom3=br.readLine();
                            io.writeln("Introdueix el comparador de la nova regla");
                            String comp=br.readLine();
                            ce.afegirReglaComposta(nom1,nom2,nom3,comp);
                            io.writeln("S'ha creat una ReglaComposta amb nom, regla 1, regla 2 i comparador");
                            io.writeln("Pots obtenir o canviar regla1, regla2 i comparador des d'aqui. El nom, des de el tester de ReglaFinal");
                            break;

                        case 4:// assignarAccio(String, String)
                            io.writeln("Regles existents al sistema:");
                            List<ReglaFinal> ll=ce.getStrategy().getConjuntRegles();
                            Iterator<ReglaFinal> pateador2=ll.iterator();
                            int ii=1;
                            while (pateador2.hasNext()){
                                if (ii%5==0) io.writeln(" "+pateador2.next().getNom()+",");
                                else io.write(" "+pateador2.next().getNom()+",");
                            ii++;
                            }
                            io.writeln();
                            io.writeln("----------------AVIS:CAP ALTRE OPCIO ES VALIDA---------------------------------------");
                            io.writeln("Escolleix la regla (Entra el nom de una regla del sistema)");
                            String regla=br.readLine();
                            io.writeln("Escolleix la accio (Entra el nom de una regla del sistema)");
                            String accio=br.readLine();
                            ce.assignarAccio(regla, accio);
                            io.writeln("S'ha assignat a la regla "+regla+" l'accio "+accio);
                            break;

                        case 5:// canviPrioritat(String, String)
                            io.writeln("Regles existents al sistema:");
                            List<ReglaFinal> lll=ce.getStrategy().getConjuntRegles();
                            Iterator<ReglaFinal> pateador3=lll.iterator();
                            int iii=1;
                            while (pateador3.hasNext()){
                                if (iii%5==0) io.writeln(" "+pateador3.next().getNom()+",");
                                else io.write(" "+pateador3.next().getNom()+",");
                            iii++;
                            }
                            io.writeln();
                            io.writeln("----------------AVIS:CAP ALTRE OPCIO ES VALIDA---------------------------------------");
                            io.writeln("Escolleix la regla1 (Entra el nom de una regla del sistema)");
                            String regla1=br.readLine();
                            io.writeln("Escolleix la regla2 (Entra el nom de una regla del sistema)");
                            String regla2=br.readLine();
                            ce.canviPrioritat(regla1, regla2);
                            io.writeln("S'ha intercanviat la prioritat de les regles introduides si eren valides");
                            break;

                        case 6:// getStrategy()
                            if (ce.getStrategy()==null) io.writeln("S'ha fet un getStrategy, i l'objecte es null (no inicialitzat)");
                            else io.writeln("S'ha fet un getStrategy, i l'objecte no es null (inicialitzat)");
                            break;

                        case 7:// getCrf()
                            if (ce.getCrf()==null) io.writeln("S'ha fet un getCrf, i l'objecte es null (no inicialitzat)");
                            else io.writeln("S'ha fet un getCrf, i l'objecte no es null (inicialitzat)");
                            break;

                        case 8:// getNumeroReglas()
                            io.writeln("El numero de regles amb accio associada al controlador es "+ce.getNumeroReglas());
                            break;

                        case 9:// setStrategy(Estrategia)
                            Estrategia est=new Estrategia();
                            ce.setStrategy(est);
                            io.writeln("S'ha setejat un objecte Estrategia inicialitzada standard al controlador");
                            break;

                        case 10:// setCrf(CtrlReglaFinal)
                            CtrlReglaFinal ctrl=new CtrlReglaFinal();
                            ce.setCrf(ctrl);
                            io.writeln("S'ha setejat un objecte CtrlRondaFinal al controlador");
                            break;

                        case 11:// setNumeroReglas(Integer)
                            int uuu=io.readint();
                            ce.setNumeroReglas(uuu);
                            io.writeln("S'ha actualitzat el numero de regles. Ara es "+ce.getNumeroReglas());
                            break;

                        }}}
}
