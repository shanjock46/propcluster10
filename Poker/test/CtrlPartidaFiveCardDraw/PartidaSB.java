/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package CtrlPartidaFiveCardDraw;

import java.util.List;

/**
 *
 * @author Daniel Mulero
 */
public abstract class PartidaSB {
    protected long id;
    protected List<Jugador> jugadors = null;
    protected List<Jugador> jugadorsActius = null;
    protected BarallaSB baralla = null;
    protected RondaSB rondaActual = null;
    protected int rondesJugades;
}
