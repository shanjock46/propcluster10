package classes;
import java.util.List;
import java.util.Random;
import java.util.Stack;

// Hantaro's work


public abstract class Baralla {

	protected List<SBCarta> cartes;

    protected Stack<SBCarta> cartesDescartades;   

    public List<SBCarta> getCartes() {
		return cartes;
	}

	public void setCartes(List<SBCarta> cartes) {
		this.cartes = cartes;
	}

	public Stack<SBCarta> getCartesDescartades() {
		return cartesDescartades;
	}

	public void setCartesDescartades(Stack<SBCarta> cartesDescartades) {
		this.cartesDescartades = cartesDescartades;
	}
    
    public void reiniciaCartes() {
        while(!cartesDescartades.empty()){
            cartes.add(cartesDescartades.pop());
        }
    }
  
    public SBCarta extreuCarta() { 
    	//{Pre: cartes.size() > 0}
		Random random = new Random();
		int k = random.nextInt(cartes.size());
		SBCarta carta = cartes.get(k);
		cartes.remove(k);
		return carta;
    }
    
    public SBCarta extreuCartaDescartada() { 
		return cartesDescartades.pop();
    }
   
    public SBCarta veurePrimeraCarta(){
        return cartesDescartades.peek();
    }
   
    public void afegirCartaDescartada(SBCarta c){
    	cartesDescartades.push(c);
    }
 
} 