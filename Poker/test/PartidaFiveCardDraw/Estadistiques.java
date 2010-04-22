/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package PartidaFiveCardDraw;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Martina Canyelles
 */
public class Estadistiques {
    protected int partidesJugades;
    protected int partidesGuanyades;
    protected int partidesEliminat;
    protected int rondesJugades;
    protected int rondesGuanyades;
    protected int rondesPerdudes;
    protected int fitxesGuanyades;


    public int getPartidesJugades() {
        return partidesJugades;
    }

    public void setPartidesJugades(int partidesJugades) {
        this.partidesJugades = partidesJugades;
    }

    public int getPartidesGuanyades() {
        return partidesGuanyades;
    }

    public void setPartidesGuanyades(int partidesGuanyades) {
        this.partidesGuanyades = partidesGuanyades;
    }

    public int getPartidesEliminat() {
        return partidesEliminat;
    }

    public void setPartidesEliminat(int partidesEliminat) {
        this.partidesEliminat = partidesEliminat;
    }

    public int getRondesJugades() {
        return rondesJugades;
    }

    public void setRondesJugades(int rondesJugades) {
        this.rondesJugades = rondesJugades;
    }

    public int getRondesGuanyades() {
        return rondesGuanyades;
    }

    public void setRondesGuanyades(int rondesGuanyades) {
        this.rondesGuanyades = rondesGuanyades;
    }

    public int getRondesPerdudes() {
        return rondesPerdudes;
    }

    public void setRondesPerdudes(int rondesPerdudes) {
        this.rondesPerdudes = rondesPerdudes;
    }

    public int getFitxesGuanyades() {
        return fitxesGuanyades;
    }

    public void setFitxesGuanyades(int fitxesGuanyades) {
        this.fitxesGuanyades = fitxesGuanyades;
    }

    public double percentatgePartidesGuanyades() {
        if (this.getPartidesJugades()==0) return 0;
        else return (((double)this.getPartidesGuanyades())/((double)this.getPartidesJugades())*100);
    }

    public double percentatgePartidesPerdudes() {
        if (this.getPartidesJugades()==0) return 0;
        else return (((double)this.getPartidesEliminat())/((double)this.getPartidesJugades())*100);
    }

    public double coeficientEfectivitatPartides() {
        if (this.getPartidesEliminat()==0 ) return 0;
        else return ((double)this.getPartidesGuanyades()/(double)this.getPartidesEliminat());
    }

    public double percentatgeRondesGuanyades() {
        if (this.getRondesJugades()==0) return 0;
        else return (((double)this.getRondesGuanyades())/((double)this.getRondesJugades())*100);
    }

    public double percentatgeRondesPerdudes() {
        if (this.getRondesJugades()==0) return 0;
        else return (((double)this.getRondesPerdudes())/((double)this.getRondesJugades())*100);
    }

    public double coeficientEfectivitatRondes() {
        if (this.getRondesPerdudes()==0 ) return 0;
        else return ((double)this.getRondesGuanyades()/(double)this.getRondesPerdudes());
    }

    public double mitjanaRondesGuanyadesPartida() {
        if (this.getPartidesGuanyades()==0) return 0;
        else return ((double)this.getRondesGuanyades()/(double)this.getPartidesGuanyades());
    }

    public void actualitzaFiRonda(boolean r, int e) {
        this.setRondesJugades(this.getRondesJugades()+1);
        this.setFitxesGuanyades(this.getFitxesGuanyades()+e);
        if (r) this.setRondesGuanyades(this.getRondesGuanyades()+1);
        else this.setRondesPerdudes(this.getRondesPerdudes()+1);
    }

    public void actualitzaFiPartida(boolean p) {
        this.setPartidesJugades(this.getPartidesJugades()+1);
        if (p) this.setPartidesGuanyades(this.getPartidesGuanyades()+1);
        else this.setPartidesEliminat(this.getPartidesEliminat()+1);
    }

    public Map carregaEstadistiques() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("Partides jugades", this.partidesJugades);
        map.put("Partides guanyades", this.partidesGuanyades);
        map.put("Partides eliminat", this.partidesEliminat);
        map.put("Rondes jugades", this.rondesJugades);
        map.put("Rondes guanyades", this.rondesGuanyades);
        map.put("Rondes perdudes", this.rondesPerdudes);
        map.put("Percentatge partides guanyades", this.percentatgePartidesGuanyades());
        map.put("Percentatge partides perdudes", this.percentatgePartidesPerdudes());
        map.put("Percentatge rondes guanyades", this.percentatgeRondesGuanyades());
        map.put("Percentatge rondes perdudes", this.percentatgeRondesPerdudes());
        map.put("Coeficient efectivitat partides", this.coeficientEfectivitatPartides());
        map.put("Coeficient efectivitat rondes", this.coeficientEfectivitatRondes());
        map.put("Fitxes guanyades", this.fitxesGuanyades);

        return map;
    }


    
}
