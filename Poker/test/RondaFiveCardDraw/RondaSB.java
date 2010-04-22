package RondaFiveCardDraw;

import java.util.List;

/**
 * @author Albert Moreno
 */
public abstract class RondaSB
{
	//protected Partida partida = null;
	protected BarallaSB baralla = null;
	protected List<JugadorSB> jugadorsActius = null;
	
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

	public void setJugadorsActius(List<JugadorSB> jugadorsActius) {
		this.jugadorsActius = jugadorsActius;
	}

	public void retirarJugador(JugadorSB j)
	{
		this.jugadorsActius.remove(j);
	}

	public JugadorSB getGuanyador() {
		// TODO Convertir la funci� en public LinkedList<Jugador> getGuanyadors()
		return null;
	}
	
	public abstract JugadorSB seguentJugador();

	public abstract void repartir();
	
	public abstract void tancaRonda();	//Fa les operacions necess�ries al acabar la ronda (actualitzar puntacions, desassociar les cartes a cada jugador...)

	public List<JugadorSB> getJugadorsActius() {
		// TODO Auto-generated method stub
		return null;
	}
}
