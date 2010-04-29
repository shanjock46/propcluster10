/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Jugador;



import java.util.*;

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
    
    public Map evaluadorMa(Map m){
        
        int igualnumero=0; int igualcolor=0; int triode=0; int pokerde=0;
        int proyecto=0; int j=1; int i=0;
        Iterator<Carta> actual=ma.iterator();
        Carta c1=new Carta(); Carta c2=new Carta();
        Map<String, Object> sit=new HashMap<String, Object>();

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
                    Object ff=sit.get("Parella");
                    sit.remove("Parella");
                    ArrayList<Integer> tt=new ArrayList();
                    tt.add((Integer)ff);
                    tt.add(c1.getNumero());
                    sit.put("Doble Parella", ff); //Cal fer algo per guardar 2 valors!
                    }
                else if (sit.containsKey("Trio")==true) {
                    Object f=sit.get("Trio");
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
        
        Map<String,Object> map=new HashMap<String, Object>();
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
            map.put("Fase descart", 0);
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
