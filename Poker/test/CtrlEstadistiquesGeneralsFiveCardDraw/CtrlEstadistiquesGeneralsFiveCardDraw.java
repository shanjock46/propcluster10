/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package CtrlEstadistiquesGeneralsFiveCardDraw;

import java.util.*;

/**
 *
 * @author Daniel Mulero
 */
public class CtrlEstadistiquesGeneralsFiveCardDraw extends CtrlEstadistiquesGeneralsSB {
    private EstadistiquesGeneralsFiveCardDraw est=null;

    public CtrlEstadistiquesGeneralsFiveCardDraw(){
        est=new EstadistiquesGeneralsFiveCardDraw();
    }
    public Map carregaEstadistiquesPoker(){
        Map<String, Object> map = new HashMap<String, Object>();
        map=getEst().carregaEstadistiquesGeneralsPoker();
        return map;
    }

    public void actualitzaEstadistiquesPoker(int i, int c, String s) {
        getEst().actualitzaEstadistiquesGenerals(i, c);
        getEst().actualitzaEstadistiquesGeneralsFiveCardDraw(s);
    }

 
    public EstadistiquesGeneralsFiveCardDraw getEst() {
        return est;
    }

   
    public void setEst(EstadistiquesGeneralsFiveCardDraw estd) {
        est = estd;
    }

    
}
