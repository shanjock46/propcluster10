/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package RondaFiveCardDraw;

import java.util.ArrayList;


/**
 *
 * @author Daniel Mulero
 */
public class BarallaFrancesaSB extends BarallaSB{

    public BarallaFrancesaSB(int i, boolean b) {
        cartes=new ArrayList<Carta>();
        for (int f=0; f<15;f++){
                cartes.add(new Carta());
        }

    }

}
