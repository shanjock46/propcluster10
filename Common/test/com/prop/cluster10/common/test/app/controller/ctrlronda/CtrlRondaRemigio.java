package com.prop.cluster10.common.test.app.controller.ctrlronda;

/**
 * @author Victor Mier
 */

public class CtrlRondaRemigio extends CtrlRonda {
	
	private CtrlJugadorRemigio jugadorActual = null;
	
	public CtrlRondaRemigio(){
		jugadorActual = new CtrlJugadorRemigio();
	}

	public CtrlRondaRemigio(Ronda r){
		this.ronda = r;
		jugadorActual = new CtrlJugadorRemigio();
	}
	
	public CtrlJugadorRemigio getJugadorActual() {
		return jugadorActual;
	}

	public void setJugadorActual(CtrlJugadorRemigio jugadorActual) {
		this.jugadorActual = jugadorActual;
	}

	@Override
	public void jugarRonda() {
		boolean fiRonda = false;
		this.ronda.repartir();	// Repartim les cartes entre tots els jugadors
		this.jugadorActual.setJugador(ronda.seguentJugador());	// Carreguem el seg�ent jugador al controlador de jugador
		while(!fiRonda){
			this.jugadorActual.robarCarta();		// Roba una carta
			this.jugadorActual.descartarCarta();	// Descarta la carta que no vol
			if(this.jugadorActual.tancaMa()){
				fiRonda = true;						// Si el jugador tanca la m� s'acaba la ronda (l'ha guanyat)
			}else{
				this.jugadorActual.set(ronda.seguentJugador());	// Sino, carreguem el seg�ent jugador que li toqui
			}
		}
		this.ronda.tancaRonda();	// Fem les tasques de fi de ronda (actualitza les puntuacions i retorna les cartes dels jugadors a la baralla)
	}

}
