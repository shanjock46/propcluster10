/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package CtrlEstrategia;

import java.util.*;

/**
 *
 * @author Daniel Mulero
 */
public class CtrlEstrategia {

    private Estrategia strategy;
    private CtrlReglaFinal crf;
    private int numeroReglas;  //numero de regles finals amb accio sense contar els defaults

    public CtrlEstrategia() {
        strategy=null;
        crf=null;
        numeroReglas=0;
    }

    public void crearEstrategia(){
        strategy=new Estrategia();
        crf=new CtrlReglaFinal();
    }
    
    public void afegirReglaComposta (String n, String a, String b, String comp){
        ReglaFinal r1=obteRegla(a);
        ReglaFinal r2=obteRegla(b);
        if (r1!=null && r2!=null) strategy.afegirRegla(getCrf().crearReglaComposta(n,r1,r2,comp));
    }

    public void assignarAccio (String r, String a) {
        numeroReglas=numeroReglas + 1;
        ReglaFinal r1=obteRegla(r);
        CtrlAccio ca=new CtrlAccio();
        assigna(r1,numeroReglas,ca.obtenirAccio(a));
        
    }

    public void canviPrioritat(String a, String b){
        ReglaFinal r1=obteRegla(a);
        ReglaFinal r2=obteRegla(b);
        canvi(r1,r2);

        
    }

    //Getters & Setters
    public Estrategia getStrategy() {
        return strategy;
    }

    public void setStrategy(Estrategia strategys) {
        strategy = strategys;
    }

    public CtrlReglaFinal getCrf() {
        return crf;
    }

    public void setCrf(CtrlReglaFinal crfs) {
        crf = crfs;
    }

    public int getNumeroReglas() {
        return numeroReglas;
    }
    
    public void setNumeroReglas(int numeroReglass) {
        numeroReglas = numeroReglass;
    }

    //Private
    private ReglaFinal obteRegla (String a){

        List<ReglaFinal> x=strategy.getConjuntRegles();
        Iterator<ReglaFinal> pateador=x.iterator();

        while (pateador.hasNext()) {
            ReglaFinal r=pateador.next();
            if (r.getNom().compareToIgnoreCase(a)==0) return r;
        }
        return null;
    }

    private void assigna (ReglaFinal r, int n, String a){

        List<ReglaFinal> x=strategy.getConjuntRegles();
        x.remove(r);
        r.setAccio(a);
        r.setPrioritat(n);
        x.add(r);
        strategy.setConjuntRegles(x);

    }

    private void canvi (ReglaFinal r, ReglaFinal s){

        List<ReglaFinal> x=strategy.getConjuntRegles();
        x.remove(r);
        x.remove(s);
        int aux=r.getPrioritat();
        r.setPrioritat(s.getPrioritat());
        s.setPrioritat(aux);
        x.add(r);
        x.add(s);
        strategy.setConjuntRegles(x);

    }
}
