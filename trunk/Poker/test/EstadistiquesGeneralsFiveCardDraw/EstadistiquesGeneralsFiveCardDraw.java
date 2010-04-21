/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package EstadistiquesGeneralsFiveCardDraw;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Martina Canyelles
 */
public class EstadistiquesGeneralsFiveCardDraw extends EstadistiquesGeneralsSB {

    private int totalVictoriaCartaAlta;
    private int totalVictoriaParelles;
    private int totalVictoriaDoblesParelles;
    private int totalVictoriaTrio;
    private int totalVictoriaEscala;
    private int totalVictoriaColor;
    private int totalVictoriaFull;
    private int totalVictoriaPoker;
    private int totalVictoriaEscalaColor;

public EstadistiquesGeneralsFiveCardDraw(){

    this.totalVictoriaCartaAlta=-1;
    this.totalVictoriaParelles=-1;
    this.totalVictoriaDoblesParelles=-1;
    this.totalVictoriaTrio=-1;
    this.totalVictoriaEscala=-1;
    this.totalVictoriaColor=-1;
    this.totalVictoriaFull=-1;
    this.totalVictoriaPoker=-1;
    this.totalVictoriaEscalaColor=-1;
    this.totalPartidesJugades=-1;
    this.totalRondesJugades=-1;
    this.totalJugadorsParticipants=-1;
}

    /**
     * @return the totalVictoriaCartaAlta
     */
    public int getTotalVictoriaCartaAlta() {
        if (totalVictoriaCartaAlta != -1)
			return totalVictoriaCartaAlta;
		return 0;
    }

    /**
     * @param totalVictoriaCartaAlta the totalVictoriaCartaAlta to set
     */
    public void setTotalVictoriaCartaAlta(int totalVictoriaCartaAlta) {
        this.totalVictoriaCartaAlta = totalVictoriaCartaAlta;
    }

    /**
     * @return the totalVictoriaParelles
     */
    public int getTotalVictoriaParelles() {
        if (totalVictoriaParelles != -1)
			return totalVictoriaParelles;
		return 0;

    }

    /**
     * @param totalVictoriaParelles the totalVictoriaParelles to set
     */
    public void setTotalVictoriaParelles(int totalVictoriaParelles) {
        this.totalVictoriaParelles = totalVictoriaParelles;
    }

    /**
     * @return the totalVictoriaDoblesParelles
     */
    public int getTotalVictoriaDoblesParelles() {
        if (totalVictoriaDoblesParelles != -1)
			return totalVictoriaDoblesParelles;
		return 0;
    }

    /**
     * @param totalVictoriaDoblesParelles the totalVictoriaDoblesParelles to set
     */
    public void setTotalVictoriaDoblesParelles(int totalVictoriaDoblesParelles) {
        this.totalVictoriaDoblesParelles = totalVictoriaDoblesParelles;
    }

    /**
     * @return the totalVictoriaTrio
     */
    public int getTotalVictoriaTrio() {
        if (totalVictoriaTrio != -1)
			return totalVictoriaTrio;
		return 0;
    }

    /**
     * @param totalVictoriaTrio the totalVictoriaTrio to set
     */
    public void setTotalVictoriaTrio(int totalVictoriaTrio) {
        this.totalVictoriaTrio = totalVictoriaTrio;
    }

    /**
     * @return the totalVictoriaEscala
     */
    public int getTotalVictoriaEscala() {
        if (totalVictoriaEscala != -1)
			return totalVictoriaEscala;
		return 0;
    }
    /**
     * @param totalVictoriaEscala the totalVictoriaEscala to set
     */
    public void setTotalVictoriaEscala(int totalVictoriaEscala) {
        this.totalVictoriaEscala = totalVictoriaEscala;
    }

    /**
     * @return the totalVictoriaColor
     */
    public int getTotalVictoriaColor() {
        if (totalVictoriaColor != -1)
			return totalVictoriaColor;
		return 0;
    }

    /**
     * @param totalVictoriaColor the totalVictoriaColor to set
     */
    public void setTotalVictoriaColor(int totalVictoriaColor) {
        this.totalVictoriaColor = totalVictoriaColor;
    }

    /**
     * @return the totalVictoriaFull
     */
    public int getTotalVictoriaFull() {
        if (totalVictoriaFull != -1)
			return totalVictoriaFull;
		return 0;
    }

    /**
     * @param totalVictoriaFull the totalVictoriaFull to set
     */
    public void setTotalVictoriaFull(int totalVictoriaFull) {
        this.totalVictoriaFull = totalVictoriaFull;
    }

    /**
     * @return the totalVictoriaPoker
     */
    public int getTotalVictoriaPoker() {
        if (totalVictoriaPoker != -1)
			return totalVictoriaPoker;
		return 0;
    }

    /**
     * @param totalVictoriaPoker the totalVictoriaPoker to set
     */
    public void setTotalVictoriaPoker(int totalVictoriaPoker) {
        this.totalVictoriaPoker = totalVictoriaPoker;
    }

    /**
     * @return the totalVictoriaEscalaColor
     */
    public int getTotalVictoriaEscalaColor() {
        if (totalVictoriaEscalaColor != -1)
			return totalVictoriaEscalaColor;
		return 0;
    }

    /**
     * @param totalVictoriaEscalaColor the totalVictoriaEscalaColor to set
     */
    public void setTotalVictoriaEscalaColor(int totalVictoriaEscalaColor) {
        this.totalVictoriaEscalaColor = totalVictoriaEscalaColor;
    }

    public void actualitzaEstadístiquesGeneralsFiveCardDraw(String s){

        if (s.compareToIgnoreCase("carta alta")==0){
            if (this.totalVictoriaCartaAlta==-1) this.totalVictoriaCartaAlta=1;
            else this.totalVictoriaCartaAlta++;
        }
        else if (s.compareToIgnoreCase("parelles")==0){
            if (this.totalVictoriaParelles==-1) this.totalVictoriaParelles=1;
            else this.totalVictoriaParelles++;
        }
        else if (s.compareToIgnoreCase("dobles parelles")==0){
            if (this.totalVictoriaDoblesParelles==-1) this.totalVictoriaDoblesParelles=1;
            else this.totalVictoriaDoblesParelles++;
        }
        else if (s.compareToIgnoreCase("trio")==0){
            if (this.totalVictoriaTrio==-1) this.totalVictoriaTrio=1;
            else this.totalVictoriaTrio++;
        }
        else if (s.compareToIgnoreCase("escala")==0){
            if (this.totalVictoriaEscala==-1) this.totalVictoriaEscala=1;
            else this.totalVictoriaEscala++;
        }
        else if (s.compareToIgnoreCase("color")==0){
            if (this.totalVictoriaColor==-1) this.totalVictoriaColor=1;
            else this.totalVictoriaColor++;
        }
        else if (s.compareToIgnoreCase("full")==0){
            if (this.totalVictoriaFull==-1) this.totalVictoriaFull=1;
            else this.totalVictoriaFull++;
        }
        else if (s.compareToIgnoreCase("poker")==0){
            if (this.totalVictoriaPoker==-1) this.totalVictoriaPoker=1;
            else this.totalVictoriaPoker++;
        }
        else if (s.compareToIgnoreCase("escala color")==0){
            if (this.totalVictoriaEscalaColor==-1) this.totalVictoriaEscalaColor=1;
            else this.totalVictoriaEscalaColor++;
        }
    }

    public Map carregaEstadistiquesGeneralsPoker() {
        Map<String, Object> map = new HashMap<String, Object>();
            
            if (this.totalPartidesJugades==-1) map.put("Total partides jugades", 0);
            else map.put("Total partides jugades", this.totalRondesJugades);
       
            if (this.totalRondesJugades==-1) map.put("Total rondes jugades", 0);
            else map.put("Total rondes jugades", this.totalRondesJugades);
        
            if (this.totalJugadorsParticipants==-1) map.put("Total jugadors participants", 0);
            else map.put("Total jugadors participants", this.totalJugadorsParticipants);
        
            if (this.totalVictoriaCartaAlta==-1)  map.put("Total victoria carta alta", 0);
            else  map.put("Total victoria carta alta", this.totalVictoriaCartaAlta);
       
            if (this.totalVictoriaParelles==-1) map.put("Total victoria parella", 0);
            else map.put("Total victoria parella", this.totalVictoriaParelles);
        
            if (this.totalVictoriaDoblesParelles==-1) map.put("Total victoria doble parella", 0);
            else map.put("Total victoria doble parella", this.totalVictoriaDoblesParelles);
       
            if (this.totalVictoriaTrio==-1) map.put("Total victoria trio", 0);
            else map.put("Total victoria trio", this.totalVictoriaTrio);
        
            if (this.totalVictoriaEscala==-1) map.put("Total victoria escala", 0);
            else map.put("Total victoria escala", this.totalVictoriaEscala);
       
            if (this.totalVictoriaColor==-1) map.put("Total victoria color", 0);
            else map.put("Total victoria color", this.totalVictoriaColor);
        
            if (this.totalVictoriaFull==-1) map.put("Total victoria full", 0);
            else map.put("Total victoria full", this.totalVictoriaFull);
        
            if (this.totalVictoriaPoker==-1) map.put("Total victoria poker", 0);
            else map.put("Total victoria poker", this.totalVictoriaPoker);
        
            if (this.totalVictoriaEscalaColor==-1) map.put("Total victoria escala de color", 0);
            else map.put("Total victoria escala de color", this.totalVictoriaEscalaColor);
        
                return map;
    }




       
        
       
        
        
        
        
        
        
        
        
    
    }

