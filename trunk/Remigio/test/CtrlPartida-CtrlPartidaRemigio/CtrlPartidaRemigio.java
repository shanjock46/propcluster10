/**
 * @author Victor Mier
 */
import java.util.LinkedList;
import java.util.List;
import java.lang.String;


public class CtrlPartidaRemigio extends CtrlPartida {

	private List<CtrlJugadorRemigio> ctrlJugadors = null;
	
	public CtrlPartidaRemigio(){
		ctrlJugadors = new LinkedList<CtrlJugadorRemigio>();
	}

	public List<CtrlJugadorRemigio> getCtrlJugadors() {
		return ctrlJugadors;
	}



	public void setCtrlJugadors(List<CtrlJugadorRemigio> ctrlJugadors) {
		this.ctrlJugadors = ctrlJugadors;
	}



	@Override
	public boolean fiPartida() {
		// Retorna si s'ha acabat de jugar la partida (ja no queden jugadors)
		return (this.partida.getJugadorsActius().size() <= 1);
	}
	
	@Override
	public void crearPartida(List<String> jugadors, Integer cashInicial) {
		for(int i = 0; i < jugadors.size(); i++){ // Carreguem tots els ctrlJugador a ctrlJugadors, un per cada nom (String) que ens passen
			ctrlJugadors.add(new CtrlJugadorRemigio(jugadors.get(i)));
		}
		List<Jugador> jugs = new LinkedList<Jugador>();
		for(int i = 0;i < ctrlJugadors.size(); i++){	// Inicialitzem el cash inicial a tots els jugadors
			ctrlJugadors.get(i).setCash(cashInicial);
			jugs.add(ctrlJugadors.get(i).getJug());		// Obtenim els Jugador(s) i els afegim a la llista jugs
		}
		partida = new PartidaFirstToKnock(jugs);	// Creem la partida amb tots els jugadors (a jugs)
		ctrlRonda = new CtrlRondaRemigio(this.partida.creaRonda());	// Inicialitzem el ctrlRonda amb la primera ronda cridant a Partida per a que la generi
		this.jugarPartida();	// Juguem la partida (iniciem el joc)
	}

	
}
