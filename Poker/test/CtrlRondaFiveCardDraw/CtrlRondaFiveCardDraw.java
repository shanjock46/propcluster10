/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package CtrlRondaFiveCardDraw;

/**
 *
 * @author Dani
 */
public class CtrlRondaFiveCardDraw extends CtrlRondaSB{

    private CtrlJugadorFiveCardDraw actual;
    
    public CtrlRondaFiveCardDraw(){
	actual = new CtrlJugadorFiveCardDraw();
	}

    public CtrlRondaFiveCardDraw(RondaSB r){
        this.ronda = r;
    }

    public CtrlJugadorFiveCardDraw getJugadorActual() {
        return actual;
    }

    public void setJugadorActual(CtrlJugadorFiveCardDraw nou) {
        actual = nou;
    }
    @Override
    public void jugarRonda () {
        ronda.repartir();
	actual.setJugador(ronda.seguentJugador());
        actual.getJug().setAposta(CG/2);
        String primerEnParlar=actual.getJug().getNom();
        actual.setJugador(ronda.seguentJugador());
        actual.getJug().setAposta(CG);
        int apostaActual=CG;
        String ultimEnApostar=actual.getJug().getNom();
        actual.setJugador(ronda.seguentJugador());
        while (actual.getJug().getNom().compareTo(ultimEnApostar)!=0){//Primera ronda d'apostes
            //TO DO: Decisió jugador (igualar,pujar,plantar-se)
            //si puja, ultimEnApostar=actual.getJug().getNom() i apostaActual=aposta
        actual.setJugador(ronda.seguentJugador());
        }
        while (actual.getJug().getNom().compareTo(primerEnParlar)!=0){//Setegem el primer en descartar
            actual.setJugador(ronda.seguentJugador());
        }

        //TO DO: Descarte y 2a ronda apostes



    }
    }
}

