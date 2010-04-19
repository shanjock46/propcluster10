/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.prop.cluster10.poker.app.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/**
 *
 * @author Alberto
 */
public abstract class Jugador {

    protected class nodoCarta {
        protected Carta c;
        protected nodoCarta siguiente;
    }

    protected String nom;
    protected int cash;
    protected int aposta;
    protected Estadistiques est;
    protected ArrayList<Carta> ma;
    
/*
    public Jugador (String nj, Integer ch){
        nom = nj;
        cash = ch;
        aposta = -1;
        est= new Estadistiques();
    }

    public  Jugador (String nj) {
        nom = nj;
        cash = -1;
        aposta = -1;
        est= new Estadistiques();
    }
*/

    public String getNom(){
        return this.nom;

    }
    
    public ArrayList<Carta> getMa(){
        
        return this.ma;
    }

    public int getCash(){

        return this.cash;

    }

    public int getAposta(){

        return this.aposta;

    }

    public void setNom(String nom){

        this.nom = nom;

    }

    public void setMa(Carta[] cartes) {
        ma.clear();
        for (int j=0; j<cartes.length ; j++){
                if (cartes[j]!=null) {
                    ma.add(cartes[j]);
                    
                }
                }
        Comparator<Carta> ordrecreixent=new order();
        Collections.sort(ma, ordrecreixent);
        
    }

    public void setCash(int cash){

        this.cash = cash;

    }

    public void setAposta(int aposta){

        this.aposta = aposta;

    }

    public void afegeixCarta(Carta cart){
        if (cart!=null){
            ma.add(cart);
            Comparator<Carta> ordrecreixent=new order();
            Collections.sort(ma, ordrecreixent);
        }
        
    }

    public void buidaCartes(){
        ma.clear();
    }
    
    public void descartar(int numero, String pal){
        Iterator<Carta> actual=ma.iterator();
        Carta c=new Carta();
        while (actual.hasNext() && (c.getNumero()!=numero && c.getPal().compareTo(pal)!=0)){
            c=actual.next();    
        }
        if (c.getNumero()==numero && c.getPal().compareTo(pal)==0) {
            ma.remove(c);
        }
            
    }

    public abstract boolean[] evaluador(int pot,boolean descarte,int call, int ciega, int x);

}