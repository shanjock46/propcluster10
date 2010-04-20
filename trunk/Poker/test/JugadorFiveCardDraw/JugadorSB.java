/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package JugadorFiveCardDraw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Daniel Mulero
 */
public class JugadorSB {
    
    private class order implements Comparator<CartaSB>{

            public order() {
            }
            public int compare(CartaSB c1, CartaSB c2) {
                if (c1.getNumero()<c2.getNumero()) return -1;
                else if (c1.getNumero()==c2.getNumero()) return 0;
                else return 1;
            }

    }
    protected String nom;
    protected int cash;
    protected int aposta;
    protected EstadistiquesSB est;
    protected ArrayList<CartaSB> ma;
    protected EstrategiaSB estrategia;

public void setMa(ArrayList x){
        this.ma = x;
        Comparator<CartaSB> ordrecreixent=new order();
        Collections.sort(ma, ordrecreixent);
}

}

