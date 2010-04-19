/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Jugador;

import java.util.ArrayList;

/**
 *
 * @author Dani
 */
public class JugadorFiveCardDrawSB extends Jugador{

    public JugadorFiveCardDrawSB(){
        nom = "";
        cash = -1;
        aposta = -1;
        est= new EstadistiquesSB();
        ma=new ArrayList();
    }

    public JugadorFiveCardDrawSB (String nj, Integer ch){
        nom = nj;
        cash = ch;
        aposta = -1;
        est= new EstadistiquesSB();
        ma=new ArrayList();
    }

    public JugadorFiveCardDrawSB (String nj) {
        nom = nj;
        cash = -1;
        aposta = -1;
        est= new EstadistiquesSB();
        ma=new ArrayList();
    }

    public boolean[] evaluador(int pot, boolean descarte, int call, int ciega, int x) {
        boolean[] res=new boolean[36];
        for (int i=0;i<res.length;i++) {
            if (i % 2==0) res[i]=true;
        }
        return res;

    }

}
