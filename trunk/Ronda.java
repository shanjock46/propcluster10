import java.util.List;

public abstract class Ronda 
{
	private List<Jugador> jugadors = null;
	
	public Ronda() 
	{
	
	}
	
	public Ronda(List<Jugador> j, Baralla b) 
	{
		this.jugadors = j;
	}

	public List<Jugador> getJugadorsActius() 
	{
		return jugadors;
	}

	public void setJugadorsActius(List<Jugador> jugadorsActius) 
	{
		this.jugadors = jugadorsActius;
	}
	
	public void retirarJugador(Jugador j)
	{
		this.jugadors.remove(j);
	}
}
