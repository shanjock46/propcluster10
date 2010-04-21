/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package RondaFiveCardDraw;

import java.util.List;

/**
 *
 * @author Martina Canyelles
 */
public class RondaFiveCardDraw extends RondaSB{
 
    public RondaFiveCardDraw(List<JugadorSB> jugadors){
        this.jugadors=jugadors;
    }

    public void JugarRondaFiveCardDraw() {
        //Es crea una baralla nova
        BarallaSB baralla=new BarallaFrancesaSB(1,false);
        //Es reparteixen les cartes, una a cada jugador, fins que en tenen 5 cadascun
        repartirCartes(jugadors,baralla);
        //Fase 1: Inicialitzar apostes a 0. Inicialitza la primera posició a 0, la 2a a CG/2, i la 3a a CG.
        //En cas de només 2 jugadors, la posició 0 s'inicialitza a CG.
        inicialitzarApostes(jugadors);












    }
        private void inicialitzarApostes(List<JugadorSB> jugadors){
            for (int i=0;i<jugadors.size();i++){
                if (i==0) {
                    if (jugadors.size()==2) jugadors.get(i).setAposta(CG);
                    else jugadors.get(i).setAposta(0);
                    }
                else if (i==1) jugadors.get(i).setAposta(CG/2);
                    
                else if (i==2){
                jugadors.get(i).setAposta(CG);
                    }
                else jugadors.get(i).setAposta(0);
            }

        }
        private void repartirCartes(List<JugadorSB> jugadors, BarallaSB baralla){
            for (int x=0;x<5;x++){
            for (int i=0;i<jugadors.size();i++){
                jugadors.get(i).afegeixCarta(baralla.extreuCarta());
        }
        }
        }
}
