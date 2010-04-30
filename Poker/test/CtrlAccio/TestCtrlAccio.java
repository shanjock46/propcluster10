/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package CtrlAccio;

import java.io.*;

/**
 *
 * @author Dani
 */
public class TestCtrlAccio {
    public static void main(String[] args) throws Exception {

                int op = 30;
                inout io = new inout();
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br=new BufferedReader(isr);
                CtrlAccio a=new CtrlAccio();
                io.writeln("1- Crea el controlador d'accio");
                io.writeln("2- Obte una accio");
                io.writeln("0 - Sortir");

                while (op != 0) {
                        op = io.readint();
                        switch (op) {

                        case 1:// CtrlAccio()
                            a=new CtrlAccio();
                            io.writeln("S'ha creat un nou controlador d'accio");
                            break;

                        case 2:// obtenirAccio(String)
                            io.writeln("Introdueix string accio a obtenir:");
                            io.writeln("Possibilitats: check, call, fold, raise cg, raise 2cg, raise 3cg, raise 4cg, raise 5cg, raise 20, raise 40, raise 60, raise 80,");
                            io.writeln("raise 100, descartar tot, descartar res, descartar guardar carta alta, descartar guardar 2 carta alta, descartar guardar parella,");
                            io.writeln("descartar guardar parella carta alta, descartar guardar doble parella, descartar guardar trio, descartar guardar trio carta alta,");
                            io.writeln("descartar guardar poker, descartar guardar projecte escala, descartar guardar projecte color.");
                            io.writeln("----------------AVIS:CAP ALTRE OPCIO ES VALIDA---------------------------------------");
                            String ac=a.obtenirAccio(io.readword());
                            io.writeln("L'accio obtinguda es: "+ac);
                            break;


}
                }
    }
}