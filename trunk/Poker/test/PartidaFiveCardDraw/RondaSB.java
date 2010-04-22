package PartidaFiveCardDraw;

import RondaFiveCardDraw.*;
import java.util.List;

/**
 * @author Albert Moreno
 */
public abstract class RondaSB
{
	//protected Partida partida = null;
	protected BarallaSB baralla = null;
	protected List<Jugador> jugadorsActius = null;
	
	/*public Partida getPartida() 
	{
		return partida;
	}

	public void setPartida(Partida p) 
	{
		this.partida = p;
	}*/
	
	public BarallaSB getBaralla() {
		return baralla;
	}

	public void setBaralla(BarallaSB baralla) {
		this.baralla = baralla;
	}

	public void setJugadorsActius(List<Jugador> jugadorsActius) {
		this.jugadorsActius = jugadorsActius;
	}

	public void retirarJugador(Jugador j)
	{
		this.jugadorsActius.remove(j);
	}

	public Jugador getGuanyador() {
		// TODO Convertir la funci� en public LinkedList<Jugador> getGuanyadors()
		return null;
	}
	
	public abstract Jugador seguentJugador();

	public abstract void repartir();
	
	public abstract void tancaRonda();	//Fa les operacions necess�ries al acabar la ronda (actualitzar puntacions, desassociar les cartes a cada jugador...)

	public List<Jugador> getJugadorsActius() {
		// TODO Auto-generated method stub
		return null;
	}
}
