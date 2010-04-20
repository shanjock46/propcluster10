/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package JugadorFiveCardDraw;
    
/**
 *
 * @author Dani
 */
public class CartaSB {
    private String pal;
    private int numero;
    private int valor;

    /**
     * @return the pal
     */
    public CartaSB(){
        this.pal="";
    	this.numero=-1;
    	this.valor=-1;
    
    }

    public CartaSB(String pal, int numero, int valor) {
        this.pal=pal;
    	this.numero=numero;
    	this.valor=valor;
        
    }



    public String getPal() {
        return pal;
    }

    /**
     * @param pal the pal to set
     */
    public void setPal(String pal) {
        this.pal = pal;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the valor
     */
    public int getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }
}
