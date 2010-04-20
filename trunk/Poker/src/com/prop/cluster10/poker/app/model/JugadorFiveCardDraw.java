/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.prop.cluster10.poker.app.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Dani
 */
public class JugadorFiveCardDraw extends Jugador{


    public JugadorFiveCardDraw() {
        nom = "";
        cash = -1;
        aposta = -1;
        est= new Estadistiques();
        ma=new ArrayList();
    }

    public JugadorFiveCardDraw (String nj, Integer ch){
        nom = nj;
        cash = ch;
        aposta = -1;
        est= new Estadistiques();
        ma=new ArrayList();
    }

    public JugadorFiveCardDraw (String nj) {
        nom = nj;
        cash = -1;
        aposta = -1;
        est= new Estadistiques();
        ma=new ArrayList();
    }
    /* Post: Bits del array:
         * --BITS DEPENDIENTES DE LA MANO--
         * [0]=Cierto si jugador tiene "CARTA ALTA" en mano (Por defecto, siempre cierto)
         * [1]=Cierto si jugador tiene "PAREJA" en mano
         * [2]=Cierto si jugador tiene "DOBLE PAREJA" en mano
         * [3]=Cierto si jugador tiene "TRIO" en mano
         * [4]=Cierto si jugador tiene "ESCALERA" en mano
         * [5]=Cierto si jugador tiene "COLOR" en mano
         * [6]=Cierto si jugador tiene "FULL" en mano
         * [7]=Cierto si jugador tiene "POKER" en mano
         * [8]=Cierto si jugador tiene "ESCALERA DE COLOR"
         * [9]=Cierto si jugador tiene "PROYECTO DE ESCALERA" (3 o 4 cartas dentro de un rango de 5)
         * [10]=Cierto si jugador tiene "PROYECTO DE COLOR" (3 o 4 cartas del mismo palo)
         * [24]=Cierto si "A"
         * [25]=Cierto si "2"
         * [26]=Cierto si "3"
         * [27]=Cierto si "4"
         * [28]=Cierto si "5"
         * [29]=Cierto si "6"
         * [30]=Cierto si "7"
         * [31]=Cierto si "8"
         * [32]=Cierto si "9"
         * [33]=Cierto si "10"
         * [34]=Cierto si "J"
         * [35]=Cierto si "Q"
         * [36]=Cierto si "K" */
    public Map evaluadorMa(Map m){
        
        int igualnumero=0; int igualcolor=0; int triode=0; int pokerde=0;
        int proyecto=0; int j=1; int i=0;
        Iterator<Carta> actual=ma.iterator();
        Carta c1=new Carta(); Carta c2=new Carta();
        Map<String, Integer> sit=new HashMap<String, Integer>();

        //--ESTO EVALUA LA MANO--
        while (actual.hasNext()) {
            c1 = actual.next();
            igualnumero=0;
            igualcolor=0;
            proyecto=0;
            j=i+1;
            while (ma.size()-j>0){
                c2= ma.get(j);
                if (c1.getNumero()==c2.getNumero()) igualnumero++;
                if (c1.getPal().compareToIgnoreCase(c2.getPal())==0) igualcolor++;
                if (c1.getNumero()==c2.getNumero()-j) proyecto++;
                
                j++;
            }
            if (igualnumero==1 && triode!=c1.getNumero() && pokerde!=c1.getNumero()) {  //Evalua si PAREJA o DOBLE PAREJA o FULL
                if (sit.containsKey("Parella")==true) {
                    //double f=sit.get("Parella");
                    sit.remove("Parella");
                    sit.put("Doble Parella", c1.getNumero()); //Cal fer algo per guardar 2 valors!
                    }
                else if (sit.containsKey("Trio")==true) {
                    int f=sit.get("Trio");
                    sit.remove("Trio");
                    sit.put("Full", f);
                    }
                else {
                    sit.put("Parella", c1.getNumero());
                }
             }
            if (igualnumero==2 && pokerde!=c1.getNumero()) { //Evalua si TRIO o FULL
                if (sit.containsKey("Parella")==true){
                    sit.remove("Parella");
                    sit.put("Full", c1.getNumero());
                    
                }
                else {
                    sit.put("Trio", c1.getNumero());
                    triode=c1.getNumero();
                    
                }
            }
            if (igualnumero==3) {                                   //Evalua si POKER
                sit.put("Poker", c1.getNumero());
                pokerde=c1.getNumero();
                }
            if (proyecto==4 && igualcolor!=4){
                sit.put("Escala", c1.getNumero()+4);
                }

            if (igualcolor==4) {                                    //Evalua si COLOR o ESCALERA DE COLOR
                if (proyecto==4) {
                    sit.put("Escala de color", c1.getNumero()+4);
                }
                else sit.put("Color", c1.getNumero()+4);
                }
            
            if ((sit.containsKey("Color")==false && sit.containsKey("Projecte de color")==false)&&(igualcolor==3 || igualcolor==2)) sit.put("Projecte de color", c1.getNumero()); //Evalua si PROYECTO DE COLOR

            if ((sit.containsKey("Escala")==false && sit.containsKey("Projecte d'escala")==false)&&(proyecto==3 || proyecto==2)) sit.put("Projecte d'escala", c1.getNumero()); //Evalua si PROYECTO DE ESCALERA

            i++;
        }
        sit.put("Carta Alta", c1.getNumero());
      
        return sit;
    }
        
    public Map evaluador(int pot,boolean descarte,int call, int ciega, int apostes_acomulades) {
        
        Map<String,Integer> map=new HashMap<String, Integer>();
        map=evaluadorMa(map);
        if (apostes_acomulades==0 && descarte==false){
            map.put("Primera ronda d'apostes", 0);
            if (aposta==0) {
                map.put("Jugador Intermig", 0);
                if (call==ciega) map.put("Tothom ha igualat la cega", 0);
                }
            else if (aposta==ciega) {
                map.put("Cega gran", 0);
                if (call==0) map.put("Tothom ha igualat la cega", 0);
            }
            else if (aposta<ciega){
                map.put("Cega petita", 0);
                if (call==ciega/2) map.put("Tothom ha igualat la cega", 0);
            }
            if (call==0) map.put("No mes apostes", 0);
            else if (call!=0 && (call/cash)*100<=20) map.put("Raise entre 0% i 20%", call);
            else if (((call/cash)*100>20)&&((call/cash)*100<=40)) map.put("Raise entre 20% i 40%", call);
            else if (((call/cash)*100>40)&&((call/cash)*100<=60)) map.put("Raise entre 40% i 60%", call);
            else if (((call/cash)*100>60)&&((call/cash)*100<=80)) map.put("Raise entre 60% i 80%", call);
            else if ((call/cash)*100>80) map.put("Raise superior al 80%", call);

        }
        else if (descarte==true) {
            map.put("Fase descart", call);
        }
        else{
            map.put("Segona ronda d'apostes", 0);
            if (call==0) map.put("No mes apostes", 0);
            else if (call!=0 && (call/cash)*100<=20) map.put("Raise entre 0% i 20%", call);
            else if (((call/cash)*100>20)&&((call/cash)*100<=40)) map.put("Raise entre 20% i 40%", call);
            else if (((call/cash)*100>40)&&((call/cash)*100<=60)) map.put("Raise entre 40% i 60%", call);
            else if (((call/cash)*100>60)&&((call/cash)*100<=80)) map.put("Raise entre 60% i 80%", call);
            else if ((call/cash)*100>80) map.put("Raise superior al 80%", call);
        }
              


        return map;
    }
}
