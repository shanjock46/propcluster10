/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package CtrlPartidaFiveCardDraw;

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

    public void setPartidesJugades(int partidesJug) {
        partidesJugades = partidesJug;
    }

    public int getPartidesGuanyades() {
        return partidesGuanyades;
    }

    public void setPartidesGuanyades(int partidesGuany) {
        partidesGuanyades = partidesGuan;
    }

    public int getPartidesEliminat() {
        return partidesEliminat;
    }

    public void setPartidesEliminat(int partidesElim) {
        partidesEliminat = partidesElim;
    }

    public int getRondesJugades() {
        return rondesJugades;
    }

    public void setRondesJugades(int rondesJug) {
        rondesJugades = rondesJug;
    }

    public int getRondesGuanyades() {
        return rondesGuanyades;
    }

    public void setRondesGuanyades(int rondesGuany) {
        rondesGuanyades = rondesGuany;
    }

    public int getRondesPerdudes() {
        return rondesPerdudes;
    }

    public void setRondesPerdudes(int rondesPerd) {
        rondesPerdudes = rondesPerd;
    }

    public int getFitxesGuanyades() {
        return fitxesGuanyades;
    }

    public void setFitxesGuanyades(int fitxesGuany) {
        fitxesGuanyades = fitxesGuany;
    }

    public double percentatgePartidesGuanyades() {
        if (getPartidesJugades()==0) return 0;
        else return (((double)getPartidesGuanyades())/((double)getPartidesJugades())*100);
    }

    public double percentatgePartidesPerdudes() {
        if (getPartidesJugades()==0) return 0;
        else return (((double)getPartidesEliminat())/((double)getPartidesJugades())*100);
    }

    public double coeficientEfectivitatPartides() {
        if (getPartidesEliminat()==0 ) return 0;
        else return ((double)getPartidesGuanyades()/(double)getPartidesEliminat());
    }

    public double percentatgeRondesGuanyades() {
        if (getRondesJugades()==0) return 0;
        else return (((double)getRondesGuanyades())/((double)getRondesJugades())*100);
    }

    public double percentatgeRondesPerdudes() {
        if (getRondesJugades()==0) return 0;
        else return (((double)getRondesPerdudes())/((double)getRondesJugades())*100);
    }

    public double coeficientEfectivitatRondes() {
        if (getRondesPerdudes()==0 ) return 0;
        else return ((double)getRondesGuanyades()/(double)getRondesPerdudes());
    }

    public double mitjanaRondesGuanyadesPartida() {
        if (getPartidesGuanyades()==0) return 0;
        else return ((double)getRondesGuanyades()/(double)getPartidesGuanyades());
    }

    public void actualitzaFiRonda(boolean r, int e) {
        setRondesJugades(getRondesJugades()+1);
        setFitxesGuanyades(getFitxesGuanyades()+e);
        if (r) setRondesGuanyades(getRondesGuanyades()+1);
        else setRondesPerdudes(getRondesPerdudes()+1);
    }

    public void actualitzaFiPartida(boolean p) {
        setPartidesJugades(getPartidesJugades()+1);
        if (p) setPartidesGuanyades(getPartidesGuanyades()+1);
        else setPartidesEliminat(getPartidesEliminat()+1);
    }

    public Map carregaEstadistiques() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("Partides jugades", partidesJugades);
        map.put("Partides guanyades", partidesGuanyades);
        map.put("Partides eliminat", partidesEliminat);
        map.put("Rondes jugades", rondesJugades);
        map.put("Rondes guanyades", rondesGuanyades);
        map.put("Rondes perdudes", rondesPerdudes);
        map.put("Percentatge partides guanyades", percentatgePartidesGuanyades());
        map.put("Percentatge partides perdudes", percentatgePartidesPerdudes());
        map.put("Percentatge rondes guanyades", percentatgeRondesGuanyades());
        map.put("Percentatge rondes perdudes", percentatgeRondesPerdudes());
        map.put("Coeficient efectivitat partides", coeficientEfectivitatPartides());
        map.put("Coeficient efectivitat rondes", coeficientEfectivitatRondes());
        map.put("Fitxes guanyades", fitxesGuanyades);

        return map;
    }


    
}
