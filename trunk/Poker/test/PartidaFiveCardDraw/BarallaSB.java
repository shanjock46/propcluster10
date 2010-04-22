/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package PartidaFiveCardDraw;


import java.util.List;
import java.util.Random;

/**
 *
 * @author Daniel Mulero
 */
public class BarallaSB {
    protected List<Carta> cartes;
    public Carta extreuCarta() {
    	//{Pre: cartes.size() > 0}
		Random random = new Random();
		int k = random.nextInt(cartes.size());
		Carta carta = cartes.get(k);
		cartes.remove(k);
		return carta;
    }
}
