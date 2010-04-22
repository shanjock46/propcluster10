/**
 * @author Albert Moreno
 */
package CtrlRondaFiveCardDraw;


import java.util.List;

public abstract class CtrlRondaSB
{
	protected RondaSB ronda = null;

	public RondaSB getRonda()
	{
		return ronda;
	}

	public void setRonda(RondaSB ronda)
	{
		this.ronda = ronda;
	}

	public void eliminarJugador(List<Jugador> j)
	{
		for (Jugador jugador: j)
		{
			ronda.getJugadorsActius().remove(jugador);
		}
	}

	public abstract void jugarRonda();
}
