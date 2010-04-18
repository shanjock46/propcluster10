/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Jugador;

/**
 *
 * @author Dani
 */
public class JugadorFiveCardDraw extends Jugador{

    public JugadorFiveCardDraw() {
        nom = "";
        cash = -1;
        aposta = -1;
        est= new Estadistiques();
        ma=null;
    }

    public JugadorFiveCardDraw (String nj, Integer ch){
        nom = nj;
        cash = ch;
        aposta = -1;
        est= new Estadistiques();
        ma=null;
    }

    public JugadorFiveCardDraw (String nj) {
        nom = nj;
        cash = -1;
        aposta = -1;
        est= new Estadistiques();
        ma=new nodoCarta();
    }

    public boolean[] evaluador(int pot, boolean descarte, int call, int ciega, int x) {
        boolean[] res=new boolean[36];
        return res;

    }

}
