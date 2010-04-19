
import java.util.LinkedList;
import java.util.List;

public abstract class CtrlPartida 
{
	protected Partida partida = null;
	private Ronda rondaActual = null;
	private CtrlRonda ctrlRonda = null;
	
	public CtrlPartida()
	{

	}
	
	public CtrlPartida(Partida p)
	{
		this.partida = p;
	}
	
	public abstract void iniPartida(List<Jugador> jugadors);

	public void crearPartida(List<Jugador> jugadors, Integer cashInicial){
		iniPartida(jugadors);	//iniciem la partida del tipus de cada joc
		this.rondaActual = this.partida.creaRonda(jugadors);
		jugarPartida();
	}
	
	private void jugarPartida() {
		ctrlRonda = new CtrlRonda(rondaActual);
		while(!fiPartida()){	//he separat fiRonda(retorna si sha acabat la partida, abstracte)
			ctrlRonda.jugarRonda();
			finalitzarRonda();	//només actualitza estadístiques
		}
		finalitzarPartida();
	}

	public abstract boolean fiPartida();
	
	public void carregarPartida(Long id)
	{
		//TODO: Falten els controladors de la capa de dades
	}
	
	public void guardarPartida()
	{
		//TODO: Falten els controladors de la capa de dades
	}
	
	public void finalitzarRonda()
	{	
		//actualitzar estadístique
		this.partida.actualitzaEstadistiquesFiRonda();
		
		//eliminar jugadors sense diners (treure dels actius)
		this.partida.eliminaJugadors();
	}
	
	public void finalitzarPartida()
	{/*
		EstadistiquesGenerals stats = new EstadistiquesGeneral();
		stats.carregaEstadistiquesGeneral();

		//TODO: implementar 
		stats.setTotalPartidesJugades(stats.getTotalPartidesJugades() + 1);
		stats.setTotalPartidesJugades(stats.getTotalPartidesJugades() + 1);
		stats.setTotalPartidesJugades(stats.getTotalPartidesJugades() + 1);
	  */
	}

}
