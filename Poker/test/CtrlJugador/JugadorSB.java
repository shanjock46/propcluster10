/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package CtrlJugador;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Dani
 */
public class JugadorSB {

    private String nom;
    private int cash;
    private int aposta;
    private EstrategiaSB estrategia;

    public Map carregaEstadistiques() {
        Map<Integer, Integer> m=new HashMap<Integer, Integer>();
        return m;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @return the cash
     */
    public int getCash() {
        return cash;
    }

    /**
     * @return the aposta
     */
    public int getAposta() {
        return aposta;
    }

    /**
     * @return the estrategia
     */
    public EstrategiaSB getEstrategia() {
        return estrategia;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

}
