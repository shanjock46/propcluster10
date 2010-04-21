/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.prop.cluster10.poker.app.model;

import Estrategia.Estrategia;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Alberto
 */
public abstract class Jugador {

    protected String nom;
    protected int cash;
    protected int aposta;
    protected Estadistiques est;
    protected ArrayList<Carta> ma;
    protected Estrategia estrategia;
    
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

    public Estadistiques getEst() {
        return est;
    }

    public Estrategia getEstrategia() {
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

    public void setEst(Estadistiques est) {
        this.est = est;
    }

    public void setMa(ArrayList<Carta> ma) {
        this.ma = ma;
        Comparator<Carta> ordrecreixent=new order();
        Collections.sort(ma, ordrecreixent);
    }
    public void setEstrategia(Estrategia estrategia) {
        this.estrategia = estrategia;
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

    public Map carregaEstadistiques() {
        return getEst().carregaEstadistiques();
    }

    
    

    
}