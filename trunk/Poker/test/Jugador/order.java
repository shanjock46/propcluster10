/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Jugador;

import java.util.Comparator;

/**
 *
 * @author Dani
 */
public class order implements Comparator<CartaSB>{

    public order() {
    }
    public int compare(CartaSB c1, CartaSB c2) {
        if (c1.getNumero()<c2.getNumero()) return -1;
        else if (c1.getNumero()==c2.getNumero()) return 0;
        else return 1;
    }

}