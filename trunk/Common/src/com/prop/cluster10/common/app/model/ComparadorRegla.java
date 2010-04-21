package com.prop.cluster10.common.app.model;

import java.util.Comparator;

public class ComparadorRegla implements Comparator<ReglaFinal> {

	public int compare(ReglaFinal regla1, ReglaFinal regla2) {		
		return regla2.getPrioritat() - regla1.getPrioritat();
	}

}
