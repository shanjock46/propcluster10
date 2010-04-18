/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.prop.cluster10.poker.app.model;

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
        ma=null;
    }

    public JugadorFiveCardDraw (String nj, Integer ch){
        nom = nj;
        cash = ch;
        aposta = -1;
        est= new Estadistiques();
        ma=null;
    }

    public JugadorFiveCardDraw (String nj) {
        nom = nj;
        cash = -1;
        aposta = -1;
        est= new Estadistiques();
        ma=new nodoCarta();
    }

    public boolean[] evaluadorMa(boolean[] b) {
        /*Bits del array:
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

        b[0]=true;
        int cartaalta=0;
        int igualnumero=0;
        int igualcolor=0;
        int triode=0;
        int pokerde=0;
        int proyecto=0;
        int j=1;
        nodoCarta actual=ma;
        //--ESTO EVALUA LA MANO--
       
        while (actual!=null) {
            nodoCarta checker=actual.siguiente;
            cartaalta=0;
            igualnumero=0;
            igualcolor=0;
            proyecto=0;
            j=1;
            while (checker!=null){
                if (actual.c.getNumero()==checker.c.getNumero()) igualnumero++;
                if (actual.c.getPal().compareToIgnoreCase(checker.c.getPal())==0) igualcolor++;
                if (actual.c.getNumero()==checker.c.getNumero()-j) proyecto++;
                if (checker.siguiente==null) cartaalta=checker.c.getNumero();
                checker=checker.siguiente;
                j++;
            }
            if (igualnumero==1 && triode!=actual.c.getNumero() && pokerde!=actual.c.getNumero()) {  //Evalua si PAREJA o DOBLE PAREJA o FULL
                if (b[1]==true) {
                    b[1]=false;
                    b[2]=true;
                    b[23+actual.c.getNumero()]=true;
                }
                else if (b[3]==true) b[6]=true;
                else {
                    b[1]=true;
                    b[23+actual.c.getNumero()]=true;
                }
                b[0]=false;
            }
            if (igualnumero==2 && pokerde!=actual.c.getNumero()) { //Evalua si TRIO o FULL
                if (b[1]==true){
                    b[6]=true;
                    for (int xd=24;xd<37;xd++){
                        b[xd]=false;
                    }
                    b[23+actual.c.getNumero()]=true;
                }
                else {
                    b[3]=true;
                    b[23+actual.c.getNumero()]=true;
                    triode=actual.c.getNumero();
                    b[0]=false;
                }
            }
            if (igualnumero==3) {                                   //Evalua si POKER
                b[7]=true;
                b[23+actual.c.getNumero()]=true;
                pokerde=actual.c.getNumero();
                b[0]=false;
            }
            if (proyecto==4 && igualcolor!=4){
                b[4]=true;
                for(checker=actual;checker!=null;checker=checker.siguiente){
                    b[23+checker.c.getNumero()]=true;
                }
            }

            if (igualcolor==4) {                                    //Evalua si COLOR o ESCALERA DE COLOR
                if (proyecto==4) {
                    b[8]=true;
                }
                else b [5]=true;
                for(checker=actual;checker!=null;checker=checker.siguiente){
                    b[23+checker.c.getNumero()]=true;
                }

            }
            if ((b[5]==false && b[10]==false)&&(igualcolor==3 || igualcolor==2)) b[10]=true; //Evalua si PROYECTO DE COLOR
            
            if ((b[4]==false && b[9]==false)&&(proyecto==3 || proyecto==2)) b[9]=true; //Evalua si PROYECTO DE ESCALERA
        actual=actual.siguiente;
        }
        
        //--FIN EVALUACION MANO

    return b;
    }

    public boolean[] evaluador(int pot,boolean descarte,int call, int ciega, int apostes_acomulades) {
        /*Bits del array:
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
         * --BITS DEPENDIENTES DE LA POSICION DE LA CIEGA--
         * [11]=Cierto si jugador esta en posicion "CIEGA GRANDE"
         * [12]=Cierto si jugador esta en posicion "CIEGA PEQUEÑA"
         * [13]=Cierto si jugador esta en posicion "JUGADOR INTERMEDIO"
         * --BITS DEPENDIENTES DE LA RONDA--
         * [14]=Cierto si la ronda es "PRIMERA RONDA DE APUESTAS"
         * [15]=Cierto si la ronda es "FASE DE DESCARTE"
         * [16]=Cierto si la ronda es "SEGUNDA RONDA DE APUESTAS"
         * --BITS DEPENDIENTES DE ACCIONES DE OTROS JUGADORES--
         * [17]=Cierto si "NO HAY APUESTAS" (Todo check)
         * [18]=Cierto si "HAN IGUALADO CIEGA GRANDE" (Todo call)
         * [19]=Cierto si alguien "HA HECHO RAISE ENTRE 0% y 20% DE MI CASH"
         * [20]=Cierto si alguien "HA HECHO RAISE ENTRE 20% y 40% DE MI CASH"
         * [21]=Cierto si alguien "HA HECHO RAISE ENTRE 40% y 60% DE MI CASH"
         * [22]=Cierto si alguien "HA HECHO RAISE ENTRE 60% y 80% DE MI CASH"
         * [23]=Cierto si alguien "HA HECHO RAISE ENTRE 80% y 100% DE MI CASH"
         * --BITS DEPENDIENTES DEL VALOR DE LA JUGADA--
         [17]=Cierto si "NO HAY APUESTAS" (Todo check)
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
         * [36]=Cierto si "K"
         */
        System.out.println("ue1");
        boolean[] res=new boolean[24];
        res=evaluadorMa(res);
        if (apostes_acomulades==0){
            res[15]=true;
            if (aposta==0) {
                res[13]=true;
                if (call==ciega) res[18]=true;
                }
            else if (aposta==ciega) {
                res[11]=true;
                if (call==0) res[18]=true;
            }
            else if (aposta<ciega){
                res[12]=true;
                if (call==ciega/2) res[18]=true;
            }
            if ((call/cash)*100<=20) res[19]=true;
            else if (((call/cash)*100>20)&&((call/cash)*100<=40)) res[20]=true;
            else if (((call/cash)*100>40)&&((call/cash)*100<=60)) res[21]=true;
            else if (((call/cash)*100>60)&&((call/cash)*100<=80)) res[22]=true;
            else if (((call/cash)*100>80)&&((call/cash)*100<=100)) res[23]=true;

        }
        else if (descarte==true) {
            res[16]=true;
        }
        else{
            res[17]=true;
            if (call==0) res[17]=true;
            else if ((call/cash)*100<=20) res[19]=true;
            else if (((call/cash)*100>20)&&((call/cash)*100<=40)) res[20]=true;
            else if (((call/cash)*100>40)&&((call/cash)*100<=60)) res[21]=true;
            else if (((call/cash)*100>60)&&((call/cash)*100<=80)) res[22]=true;
            else if (((call/cash)*100>80)&&((call/cash)*100<=100)) res[23]=true;
        }
              


        return res;
    }
}
