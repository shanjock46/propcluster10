
import java.util.LinkedList;
import java.util.List;
import java.util.Date;


public abstract class Partida 
{
	protected Long id;
	protected List<Jugador> jugadors = null;
	protected List<Jugador> jugadorsActius = null;
	protected Baralla baralla = null;
	protected Ronda rondaActual = null;
	public CtrlPartida ctrlPartida = null;	//l'he afegit a les creadores
	
	public Partida() 
	{
		this.jugadors = new LinkedList<Jugador>();
		this.jugadorsActius = new LinkedList<Jugador>();
	}
	
	public Partida(List<Jugador> j) 
	{
		this.jugadors = j;		//PREGUNTA: quan fem aquesta assignació, estem copiant tots els valors de j a l'adreça de jugadors, oi?
		this.id = (new Date()).getTime();// És fa aquí?
	}
	
	public Ronda creaRonda(List<Jugador> j){
		iniRonda(j);
		return rondaActual;
	}
	
	public void eliminaJugadors()
	{
		for(Jugador j: this.jugadorsActius)
		{
			if (j.getCash() <= 0) jugadorsActius.remove(j);
		}
	}

	public Baralla getBaralla() 
	{
		return baralla;
	}

	public void setBaralla(Baralla baralla) 
	{
		this.baralla = baralla;
	}

	public List<Jugador> getJugadors() 
	{
		return jugadors;
	}

	public void setJugadors(List<Jugador> jugs) 
	{
		this.jugadors = jugs;
	}
	
	public List<Jugador> getJugadorsActius() 
	{
		return jugadorsActius;
	}

	public void setJugadorsActius(List<Jugador> jugs) 
	{
		this.jugadorsActius = jugs;
	}

	
	public Ronda getRondaActual() 
	{
		return rondaActual;
	}

	public void setRondaActual(Ronda rondaActual) 
	{
		this.rondaActual = rondaActual;
	}

	public Long getId()
	{
		return id;
	}
	
	public abstract void iniRonda(List<Jugador> j);
	
	public abstract void iniBaralla();
	
	public abstract boolean finalitza();
	
	public void jugarPartida(int cashInicial, int rj, boolean carrega){
		
		int rondesJugades = rj;
		boolean guardar = false;
		List<Jugador> jugadorsToDelete = null;
		
		for(Jugador j: this.jugadorsActius)
		{
			j.setCash(cashInicial);
		}
		
		if(!carrega){
			iniBaralla(); // Inicialitzem la baralla
			this.jugadorsActius.addAll(jugadors);	//Correcte?
		}
		
		// Llançem el joc i anem controlant per cada Ronda si ja ha acabat la partida o no. Anem actualitzant est
		while(this.jugadorsActius.size() > 1 && !guardar && !finalitza()){ //Es podria fer una operació que retornés l'int size directament i no tota la llista?
			iniRonda(this.jugadorsActius);
			rondaActual.jugarRonda(); //Juguem la ronda
			rondesJugades++;
			
			//Fer el control de puntuacions
			//ho fa Ronda?//

			
		}
		if(guardar){
			ctrlPartida.guardarPartida();
		}else{ //acaba la partida
			//assignar guanyador i actualitzar estadístiques de jugadors
			Jugador guanyador = null; //TODO: assignar segons puntuacions o segons si es l'unic jugadorActiu
			Estadistiques e;
			e = guanyador.getEstadistiques();
			e.finalitzaPartida(true);
			for(Jugador j: jugadors){
				if(j != guanyador){
					e = j.getEstadistiques();
					e.finalitzarPartida(false);
				}
			}
			ctrlPartida.finalitzarPartida();	//S'hauria de comunicar amb la capa de presentació per avisar que s'acaba la partida
			// Actualitza fitxes guanyades (es pot fer a dalt)
			//...//
			// Actualitzem estadístiques generals
			//EstadistiquesGenerals estGenerals = EstadistiquesGenerals(); //com es crida la classe singleton?
			//estGenerals.actualitzaEstadistiquesGenerals(rondesJugades, jugadors.size());
			//estGenerals.guardar();
		}
	}

	public void actualitzaEstadistiquesFiRonda() {
		// TODO Auto-generated method stub
		
	}
}
