/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.prop.cluster10.common.test.app.model.jugador;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/**
 *
 * @author Alberto
 */
public abstract class Jugador {

    protected String nom;
    protected int cash;
    protected int aposta;
    protected EstadistiquesSB est;
    protected ArrayList<CartaSB> ma;
    protected EstrategiaSB estrategia;
    

    

    public String getNom(){
        return this.nom;

    }
    
    public ArrayList<CartaSB> getMa(){
        
        return this.ma;
    }

    public int getCash(){

        return this.cash;

    }

    public int getAposta(){

        return this.aposta;

    }

    public EstadistiquesSB getEst() {
        return est;
    }

    public EstrategiaSB getEstrategia() {
        return estrategia;
    }

    public void setNom(String nom){

        this.nom = nom;

    }

    public void setCash(int cash){

        this.cash = cash;

    }

    public void setAposta(int aposta){

        this.aposta = aposta;

    }

    public void setEst(EstadistiquesSB est) {
        this.est = est;
    }

    /**
     * @param ma the ma to set
     */
    public void setMa(ArrayList<CartaSB> ma) {
        this.ma = ma;
        Comparator<CartaSB> ordrecreixent=new order();
        Collections.sort(ma, ordrecreixent);
    }
    public void setEstrategia(EstrategiaSB estrategia) {
        this.estrategia = estrategia;
    }

    public void afegeixCarta(CartaSB cart){
        if (cart!=null){
            ma.add(cart);
            Comparator<CartaSB> ordrecreixent=new order();
            Collections.sort(ma, ordrecreixent);
        }
        
    }

    public void buidaCartes(){
        ma.clear();
    }
    
    public void descartar(int numero, String pal){
        Iterator<CartaSB> actual=ma.iterator();
        CartaSB c=new CartaSB();
        while (actual.hasNext() && (c.getNumero()!=numero && c.getPal().compareTo(pal)!=0)){
            c=actual.next();    
        }
        if (c.getNumero()==numero && c.getPal().compareTo(pal)==0) {
            ma.remove(c);
        }
            
    }


    public double[] carregaEstadistiques() {
        return getEst().carregaEstadistiques();
    }

    
    

    
}