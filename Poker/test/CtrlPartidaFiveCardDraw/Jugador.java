/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package CtrlPartidaFiveCardDraw;




import java.util.*;

/**
 *
 * @author Alberto
 */
public abstract class Jugador {

    private class order implements Comparator<Carta>{

            public order() {
            }
        @Override
            public int compare(Carta c1, Carta c2) {
                if (c1.getNumero()<c2.getNumero()) return -1;
                else if (c1.getNumero()==c2.getNumero()) return 0;
                else return 1;
            }

}

    protected String nom;
    protected int cash;
    protected int aposta;
    protected Estadistiques est;
    protected ArrayList<Carta> ma;
    protected Estrategia estrategia;
    

    

    public String getNom(){
        return nom;

    }
    
    public ArrayList<Carta> getMa(){
        
        return ma;
    }

    public int getCash(){

        return cash;

    }

    public int getAposta(){

        return aposta;

    }

    public Estadistiques getEst() {
        return est;
    }

    public Estrategia getEstrategia() {
        return estrategia;
    }

    public void setNom(String n){

        nom = n;

    }

    public void setCash(int c){

        cash = c;

    }

    public void setAposta(int apost){

        aposta = apost;

    }

    public void setEst(Estadistiques e) {
        est = e;
    }

    /**
     * @param ma the ma to set
     */
    public void setMa(ArrayList<Carta> m) {
        ma = m;
        Comparator<Carta> ordrecreixent=new order();
        Collections.sort(ma, ordrecreixent);
    }
    public void setEstrategia(Estrategia strategia) {
        estrategia = strategia;
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

