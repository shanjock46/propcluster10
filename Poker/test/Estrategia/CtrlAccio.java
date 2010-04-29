/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Estrategia;

/**
 *
 * @author Daniel Mulero
 */
public class CtrlAccio {

    public Accio obtenirAccio(String a){
        if (a.compareToIgnoreCase("check")==0) return Accio.CHECK;
        else if (a.compareToIgnoreCase("call")==0) return Accio.CALL;
	else if (a.compareToIgnoreCase("fold")==0) return Accio.FOLD;
        else if (a.compareToIgnoreCase("raise cg")==0) return Accio.RAISE_CG;
        else if (a.compareToIgnoreCase("raise 2cg")==0) return Accio.RAISE_2CG;
        else if (a.compareToIgnoreCase("raise 3cg")==0) return Accio.RAISE_3CG;
        else if (a.compareToIgnoreCase("raise 4cg")==0) return Accio.RAISE_4CG;
        else if (a.compareToIgnoreCase("raise 5cg")==0) return Accio.RAISE_5CG;
        else if (a.compareToIgnoreCase("raise 20")==0) return Accio.RAISE_20;
        else if (a.compareToIgnoreCase("raise 40")==0) return Accio.RAISE_40;
        else if (a.compareToIgnoreCase("raise 60")==0) return Accio.RAISE_60;
        else if (a.compareToIgnoreCase("raise 80")==0) return Accio.RAISE_80;
        else if (a.compareToIgnoreCase("raise 100")==0) return Accio.RAISE_100;
        else if (a.compareToIgnoreCase("descartar tot")==0) return Accio.DESCARTAR_TOT;
        else if (a.compareToIgnoreCase("descartar res")==0) return Accio.DESCARTAR_RES;
        else if (a.compareToIgnoreCase("descartar guardar carta alta")==0) return Accio.DESCARTAR_GUARDAR_CARTA_ALTA;
        else if (a.compareToIgnoreCase("descartar guardar 2 carta alta")==0) return Accio.DESCARTAR_GUARDAR_2CARTA_ALTA;
        else if (a.compareToIgnoreCase("descartar guardar parella")==0) return Accio.DESCARTAR_GUARDAR_PARELLA;
        else if (a.compareToIgnoreCase("descartar guardar parella carta alta")==0) return Accio.DESCARTAR_GUARDAR_PARELLA_CARTA_ALTA;
        else if (a.compareToIgnoreCase("descartar guardar doble parella")==0) return Accio.DESCARTAR_GUARDAR_DOBLE_PARELLA;
        else if (a.compareToIgnoreCase("descartar guardar trio")==0) return Accio.DESCARTAR_GUARDAR_TRIO;
        else if (a.compareToIgnoreCase("descartar guardar trio carta alta")==0) return Accio.DESCARTAR_GUARDAR_TRIO_CARTA_ALTA;
        else if (a.compareToIgnoreCase("descartar guardar poker")==0) return Accio.DESCARTAR_GUARDAR_POKER;
        else if (a.compareToIgnoreCase("descartar guardar projecte escala")==0) return Accio.DESCARTAR_GUARDAR_PROJECTE_ESCALA;
        else if (a.compareToIgnoreCase("descartar guardar projecte color")==0) return Accio.DESCARTAR_GUARDAR_PROJECTE_COLOR;
        
        return null;
    }
}
