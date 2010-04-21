/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package RondaFiveCardDraw;

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
    private String nom;
    private int cash;
    private int aposta;
    private EstadistiquesSB est;
    private ArrayList<CartaSB> ma;
    private EstrategiaSB estrategia;

/**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the cash
     */
    public int getCash() {
        return cash;
    }

    /**
     * @param cash the cash to set
     */
    public void setCash(int cash) {
        this.cash = cash;
    }

    /**
     * @return the aposta
     */
    public int getAposta() {
        return aposta;
    }

    /**
     * @param aposta the aposta to set
     */
    public void setAposta(int aposta) {
        this.aposta = aposta;
    }

    /**
     * @return the est
     */
    public EstadistiquesSB getEst() {
        return est;
    }

    /**
     * @param est the est to set
     */
    public void setEst(EstadistiquesSB est) {
        this.est = est;
    }

    /**
     * @return the ma
     */
    public ArrayList<CartaSB> getMa() {
        return ma;
    }

    /**
     * @param ma the ma to set
     */
    public void setMa(ArrayList<CartaSB> ma) {
        this.ma = ma;
    }

    /**
     * @return the estrategia
     */
    public EstrategiaSB getEstrategia() {
        return estrategia;
    }

    /**
     * @param estrategia the estrategia to set
     */
    public void setEstrategia(EstrategiaSB estrategia) {
        this.estrategia = estrategia;
    }

    public void afegeixCarta(CartaSB cart){
        if (cart!=null){
            getMa().add(cart);
            Comparator<CartaSB> ordrecreixent=new order();
            Collections.sort(getMa(),ordrecreixent);
        }

    }}