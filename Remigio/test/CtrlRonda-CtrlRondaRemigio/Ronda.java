import java.util.List;
import java.util.LinkedList;


public class Ronda {
	
	private List<Jugador> jugadorsActius = null;
	
	public Ronda(){
		jugadorsActius = new LinkedList<Jugador>();
	}
	
	public Ronda(List<Jugador> jugs){
		jugadorsActius = jugs;
	}

	public List<Jugador> getJugadorsActius() {
		// TODO Auto-generated method stub
		return jugadorsActius;
	}

	public void repartir() {
		// TODO Auto-generated method stub
		
	}

	public Jugador seguentJugador() {
		// TODO Auto-generated method stub
		return null;
	}

	public void tancaRonda() {
		// TODO Auto-generated method stub
		
	}

}
