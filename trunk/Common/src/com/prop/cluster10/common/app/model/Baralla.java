package com.prop.cluster10.common.app.model;
import java.util.List;
import java.util.Random;
import java.util.Stack;

import com.prop.cluster10.common.test.model.baralla.SBCarta;


// Hantaro's work

//TODO: OK
public abstract class Baralla {

	protected List<Carta> cartes;

    protected Stack<Carta> cartesDescartades;   

    public List<Carta> getCartes() {
		return cartes;
	}

	public void setCartes(List<Carta> cartes) {
		this.cartes = cartes;
	}

	public Stack<Carta> getCartesDescartades() {
		return cartesDescartades;
	}

	public void setCartesDescartades(Stack<Carta> cartesDescartades) {
		this.cartesDescartades = cartesDescartades;
	}
    
    public void reiniciaCartes() {
        while(!cartesDescartades.empty()){
            cartes.add(cartesDescartades.pop());
        }
    }
  
    public Carta extreuCarta() { 
    	//{Pre: cartes.size() > 0}
		Random random = new Random();
		int k = random.nextInt(cartes.size());
		Carta carta = cartes.get(k);
		cartes.remove(k);
		return carta;
    }
    
    public Carta extreuCartaDescartada() { 
		return cartesDescartades.pop();
    }
   
    public Carta veurePrimeraCarta(){
        return cartesDescartades.peek();
    }
   
    public void afegirCartaDescartada(Carta c){
    	cartesDescartades.push(c);
    }
 
} 