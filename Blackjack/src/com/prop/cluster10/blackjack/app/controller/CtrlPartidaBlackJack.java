package com.prop.cluster10.blackjack.app.controller;

public class CtrlPartidaBlackJack {
	
	private static CtrlPartidaBlackJack myInstance;
	
	public CtrlPartidaBlackJack() {
		// TODO Auto-generated constructor stub
	}


	public static CtrlPartidaBlackJack getInstance() {
		if (myInstance == null)
			myInstance = new CtrlPartidaBlackJack();
		return myInstance;
	}
}
