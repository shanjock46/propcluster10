/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package PartidaFiveCardDraw;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Martina Canyelles
 */
public class RondaFiveCardDraw extends RondaSB{

    private ArrayList<Jugador> guanyadors;
    private int pot;
    private Iterator<Jugador> iter;
    
    public RondaFiveCardDraw(List<Jugador> jugadors, BarallaSB baralla){
        jugadorsActius=new LinkedList<Jugador>();
        jugadorsActius.addAll(jugadors);
        this.baralla=baralla;
        guanyadors=new ArrayList<Jugador>();
        pot=0;
        iter=jugadorsActius.iterator();
    }

    public void tancaRonda() {
		for(JugadorSB j: getGuanyadors()){
			j.setCash(j.getCash() + getPot()/getGuanyadors().size());	// Actualitza les puntuacions (el cash)
			j.buidaCartes();	// Retorna les cartes dels jugadors a la baralla
		}
	}
    
    public void repartir(){
            for (int x=0;x<5;x++){
                for (int i=0;i<jugadorsActius.size();i++){
                    jugadorsActius.get(i).afegeixCarta(baralla.extreuCarta());
                     }
                }
            }
    public JugadorSB seguentJugador() {
		if (iter.hasNext()==false) iter=jugadorsActius.iterator();
                return iter.next();
	}

//GETTERS I SETTERS
    public ArrayList<JugadorSB> getGuanyadors() {
        return guanyadors;
    }
    
    public void setGuanyadors(ArrayList<JugadorSB> guanyadors) {
        this.guanyadors = guanyadors;
    }
   
    public int getPot() {
        return pot;
    }
    
    public void setPot(int pot) {
        this.pot = pot;
    }

       
}