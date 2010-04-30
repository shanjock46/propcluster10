/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package CtrlEstadistiquesGeneralsFiveCardDraw;

/**
 *
 * @author Daniel Mulero
 */
public class TestCtrlEstadistiquesGeneralsFiveCardDraw {
    int op = 30;
                inout io = new inout();
                CtrlEstadistiquesGeneralsFiveCardDraw a=new CtrlEstadistiquesGeneralsFiveCardDraw();
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
                        }}}

