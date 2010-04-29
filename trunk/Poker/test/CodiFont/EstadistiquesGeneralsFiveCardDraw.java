/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package CodiFont;


import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Martina Canyelles
 */
public class EstadistiquesGeneralsFiveCardDraw extends EstadistiquesGenerals {

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

    totalVictoriaCartaAlta=-1;
    totalVictoriaParelles=-1;
    totalVictoriaDoblesParelles=-1;
    totalVictoriaTrio=-1;
    totalVictoriaEscala=-1;
    totalVictoriaColor=-1;
    totalVictoriaFull=-1;
    totalVictoriaPoker=-1;
    totalVictoriaEscalaColor=-1;
    totalPartidesJugades=-1;
    totalRondesJugades=-1;
    totalJugadorsParticipants=-1;
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
    public void setTotalVictoriaCartaAlta(int totalVictoriaCartaAlt) {
        totalVictoriaCartaAlta = totalVictoriaCartaAlt;
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
    public void setTotalVictoriaParelles(int totalVictoriaParell) {
        totalVictoriaParelles = totalVictoriaParell;
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
    public void setTotalVictoriaDoblesParelles(int totalVictoriaDoblesParell) {
        totalVictoriaDoblesParelles = totalVictoriaDoblesParell;
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
    public void setTotalVictoriaTrio(int totalVictoriaTri) {
        totalVictoriaTrio = totalVictoriaTri;
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
    public void setTotalVictoriaEscala(int totalVictoriaEscal) {
        totalVictoriaEscala = totalVictoriaEscal;
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
    public void setTotalVictoriaColor(int totalVictoriaCol) {
        totalVictoriaColor = totalVictoriaCol;
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
    public void setTotalVictoriaFull(int totalVictoriaFul) {
        totalVictoriaFull = totalVictoriaFul;
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
    public void setTotalVictoriaPoker(int totalVictoriaPokr) {
        totalVictoriaPoker = totalVictoriaPokr;
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
    public void setTotalVictoriaEscalaColor(int totalVictoriaEscalaCol) {
        totalVictoriaEscalaColor = totalVictoriaEscalaCol;
    }

    public void actualitzaEstadistiquesGeneralsFiveCardDraw(String s){

        if (s.compareToIgnoreCase("carta alta")==0){
            if (totalVictoriaCartaAlta==-1) totalVictoriaCartaAlta=1;
            else totalVictoriaCartaAlta++;
        }
        else if (s.compareToIgnoreCase("parelles")==0){
            if (totalVictoriaParelles==-1) totalVictoriaParelles=1;
            else totalVictoriaParelles++;
        }
        else if (s.compareToIgnoreCase("dobles parelles")==0){
            if (totalVictoriaDoblesParelles==-1) totalVictoriaDoblesParelles=1;
            else totalVictoriaDoblesParelles++;
        }
        else if (s.compareToIgnoreCase("trio")==0){
            if (totalVictoriaTrio==-1) totalVictoriaTrio=1;
            else totalVictoriaTrio++;
        }
        else if (s.compareToIgnoreCase("escala")==0){
            if (totalVictoriaEscala==-1) totalVictoriaEscala=1;
            else totalVictoriaEscala++;
        }
        else if (s.compareToIgnoreCase("color")==0){
            if (totalVictoriaColor==-1) totalVictoriaColor=1;
            else totalVictoriaColor++;
        }
        else if (s.compareToIgnoreCase("full")==0){
            if (totalVictoriaFull==-1) totalVictoriaFull=1;
            else totalVictoriaFull++;
        }
        else if (s.compareToIgnoreCase("poker")==0){
            if (totalVictoriaPoker==-1) totalVictoriaPoker=1;
            else totalVictoriaPoker++;
        }
        else if (s.compareToIgnoreCase("escala color")==0){
            if (totalVictoriaEscalaColor==-1) totalVictoriaEscalaColor=1;
            else totalVictoriaEscalaColor++;
        }
    }

    public Map carregaEstadistiquesGeneralsPoker() {
        Map<String, Object> map = new HashMap<String, Object>();
            
            if (totalPartidesJugades==-1) map.put("Total partides jugades", 0);
            else map.put("Total partides jugades", totalRondesJugades);
       
            if (totalRondesJugades==-1) map.put("Total rondes jugades", 0);
            else map.put("Total rondes jugades", totalRondesJugades);
        
            if (totalJugadorsParticipants==-1) map.put("Total jugadors participants", 0);
            else map.put("Total jugadors participants", totalJugadorsParticipants);
        
            if (totalVictoriaCartaAlta==-1)  map.put("Total victoria carta alta", 0);
            else  map.put("Total victoria carta alta", totalVictoriaCartaAlta);
       
            if (totalVictoriaParelles==-1) map.put("Total victoria parella", 0);
            else map.put("Total victoria parella", totalVictoriaParelles);
        
            if (totalVictoriaDoblesParelles==-1) map.put("Total victoria doble parella", 0);
            else map.put("Total victoria doble parella", totalVictoriaDoblesParelles);
       
            if (totalVictoriaTrio==-1) map.put("Total victoria trio", 0);
            else map.put("Total victoria trio", totalVictoriaTrio);
        
            if (totalVictoriaEscala==-1) map.put("Total victoria escala", 0);
            else map.put("Total victoria escala", totalVictoriaEscala);
       
            if (totalVictoriaColor==-1) map.put("Total victoria color", 0);
            else map.put("Total victoria color", totalVictoriaColor);
        
            if (totalVictoriaFull==-1) map.put("Total victoria full", 0);
            else map.put("Total victoria full", totalVictoriaFull);
        
            if (totalVictoriaPoker==-1) map.put("Total victoria poker", 0);
            else map.put("Total victoria poker", totalVictoriaPoker);
        
            if (totalVictoriaEscalaColor==-1) map.put("Total victoria escala de color", 0);
            else map.put("Total victoria escala de color", totalVictoriaEscalaColor);
        
                return map;
    }




       
        
       
        
        
        
        
        
        
        
        
    
    }

