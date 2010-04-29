/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Estrategia;

import java.util.*;

/**
 *
 * @author Daniel Mulero
 */
public class CtrlEstrategia {

    private Estrategia strategy;
    private CtrlReglaFinal crf;
    private int numeroReglas;

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
        if (r1!=null && r2!=null) strategy.afegirRegla(crf.crearReglaComposta(n,r1,r2,comp));
    }

    public void assignarAccio (String r, String a) {
        numeroReglas++;
        ReglaFinal r1=obteRegla(r);
        
        r1.setAccio(a);
        r1.setPrioritat(numeroReglas);
    }

    private ReglaFinal obteRegla (String a){

        List<ReglaFinal> x=strategy.getConjuntRegles();
        Iterator<ReglaFinal> pateador=x.iterator();

        while (pateador.hasNext()) {
            ReglaFinal r=pateador.next();
            if (r.getNom().compareTo(a)==0) return r;
        }
        return null;
    }
}
