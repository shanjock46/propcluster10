/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package CtrlAccio;

/**
 *
 * @author Daniel Mulero
 */
public enum Accio {
        //Accions en fase d'aposta
        CHECK,
	CALL,
	FOLD,
        RAISE_CG,
        RAISE_2CG,
        RAISE_3CG,
        RAISE_4CG,
        RAISE_5CG,
        RAISE_20,
        RAISE_40,
        RAISE_60,
        RAISE_80,
        RAISE_100,
        //Accions en fase de descart
        DESCARTAR_TOT,
        DESCARTAR_RES,
        DESCARTAR_GUARDAR_CARTA_ALTA,
        DESCARTAR_GUARDAR_2CARTA_ALTA,
        DESCARTAR_GUARDAR_PARELLA,
        DESCARTAR_GUARDAR_PARELLA_CARTA_ALTA,
        DESCARTAR_GUARDAR_DOBLE_PARELLA,
        DESCARTAR_GUARDAR_TRIO,
        DESCARTAR_GUARDAR_TRIO_CARTA_ALTA,
        DESCARTAR_GUARDAR_POKER,
        DESCARTAR_GUARDAR_PROJECTE_ESCALA,
        DESCARTAR_GUARDAR_PROJECTE_COLOR;

}
