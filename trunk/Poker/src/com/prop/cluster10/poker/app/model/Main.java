/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.prop.cluster10.poker.app.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;


/**
 *
 * @author Daniel Mulero
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        inout io= new inout();
        System.out.println("Nom jugador");
        String s=io.readword();
	JugadorFiveCardDraw j=new JugadorFiveCardDraw(s);
        Carta[] c=new Carta[5];
        System.out.println("5 cartas");
        ArrayList<Carta> C1=new ArrayList();
        for (int i=0; i<5; i++) {
            Carta x=new Carta();
            System.out.println("Pal de la carta "+(i+1)+":");
            String a=io.readword();
            x.setPal(a);
            System.out.println("Numero de la carta "+(i+1)+":");
            int b=io.readint();
            x.setNumero(b);
            C1.add(x);
           }
        j.setMa(C1);
        j.setAposta(0);
        /*ArrayList<Carta> C1=j.getxD();
        Iterator<Carta> actual=C1.iterator();
        Carta xD=new Carta();
        while (actual.hasNext()){
            xD=actual.next();
            io.writeln("Numero= "+xD.getNumero()+"Pal= "+xD.getPal());
        }*/
        Map<String,Object> m=j.evaluador(5000, false, 0, 0, 0);
        Iterator iterator = m.keySet().iterator();

                                while (iterator.hasNext()) {
                                    String key = iterator.next().toString();
                                    Object value = m.get(key);
                                    if (key.compareTo("Dobles Parelles")==true){
                                        ArrayList<Integer> bb=new ArrayList<Integer>();
                                        
                                        io.writeln(key);
                                    }
                                    else io.writeln(key+" de "+value);
                                   }
    }}


    
