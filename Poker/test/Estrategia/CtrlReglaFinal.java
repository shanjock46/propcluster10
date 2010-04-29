/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Estrategia;

/**
 *
 * @author Daniel Mulero
 */
public class CtrlReglaFinal {
    private ReglaComposta regla;

    public CtrlReglaFinal(){
        regla=null;
    }

    public ReglaFinal crearReglaComposta (String n, ReglaFinal a, ReglaFinal b, String comp) {
        regla=new ReglaComposta(n, a,  b,  comp);
        return regla;

    }


}
