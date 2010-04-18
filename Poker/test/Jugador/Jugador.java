/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Jugador;



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
    protected nodoCarta ma;
    protected int cash;
    protected int aposta;
    protected Estadistiques est;

    
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

    public nodoCarta getMa(){
  
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

    public void setMa(Carta[] cartes){
        ma=null;
        for (int j=0; j<5 ; j++){
                if (cartes[j]!=null) {
                    if (ma==null) {
                        nodoCarta n=new nodoCarta();
                        n.siguiente=null;
                        n.c=cartes[j];

                        ma=n;
                    }
                    else {
                        nodoCarta anterior=null;
                        nodoCarta actual=ma;
                        while (actual!=null && actual.c.getNumero()<cartes[j].getNumero()) {
                            anterior=actual;
                            actual=actual.siguiente;
                        }
                        if (actual==null) {
                            nodoCarta n=new nodoCarta();
                            n.siguiente=null;
                            n.c=cartes[j];
                            anterior.siguiente=n;
                        }
                        else {
                            if (actual.c.getNumero()==cartes[j].getNumero()) {
                                nodoCarta n=new nodoCarta();
                                n.siguiente=actual;
                                n.c=cartes[j];
                                if (anterior==null) ma=n;
                                else anterior.siguiente=n;
                            }
                            else {
                                nodoCarta n=new nodoCarta();
                                n.siguiente=actual;
                                n.c=cartes[j];
                                if (anterior==null) ma=n;
                                else anterior.siguiente=n;
                            }



                        }

                    }
        }}
        
    }

    public void setCash(int cash){

        this.cash = cash;

    }

    public void setAposta(int aposta){

        this.aposta = aposta;

    }

    public Carta getCartaMa(int n){
        nodoCarta actual=ma;
        int i=1;
        while (i<=n && actual!=null) {
            actual=actual.siguiente;
            i++;
        }
        if (actual!= null) return actual.c;
        else return null;
    }

    public void afegeixCarta (Carta cart){
            if (cart!=null){
                if (ma==null) {
                        nodoCarta n=new nodoCarta();
                        n.siguiente=null;
                        n.c=cart;

                        ma=n;
                    }
                    else {
                        nodoCarta anterior=null;
                        nodoCarta actual=ma;
                        while (actual!=null && actual.c.getNumero()<cart.getNumero()) {
                            anterior=actual;
                            actual=actual.siguiente;
                        }
                        if (actual==null) {
                            nodoCarta n=new nodoCarta();
                            n.siguiente=null;
                            n.c=cart;
                            anterior.siguiente=n;
                        }
                        else {
                            if (actual.c.getNumero()==cart.getNumero()) {
                                nodoCarta n=new nodoCarta();
                                n.siguiente=actual;
                                n.c=cart;
                                if (anterior==null) ma=n;
                                else anterior.siguiente=n;
                            }
                            else {
                                nodoCarta n=new nodoCarta();
                                n.siguiente=actual;
                                n.c=cart;
                                if (anterior==null) ma=n;
                                else anterior.siguiente=n;
                            }

                        }

                        }

                    }
    }

    public void BuidaCartes(){

        ma=null;
    }

    public void Descartar(int numero, String pal){

        nodoCarta actual=ma;
        nodoCarta anterior=null;
        while (actual!=null && (actual.c.getNumero()!=numero && actual.c.getPal().compareToIgnoreCase(pal)==0 )) {
            anterior=actual;
            actual=actual.siguiente;
        }

        if (actual!=null){
            anterior.siguiente=actual.siguiente;
        }
     }

   //public abstract boolean[] evaluador(int pot,boolean descarte,int call, int ciega, int x);

}