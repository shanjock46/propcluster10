/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.prop.cluster10.common.test.app.model.jugador;

import com.prop.cluster10.poker.app.model.*;
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
