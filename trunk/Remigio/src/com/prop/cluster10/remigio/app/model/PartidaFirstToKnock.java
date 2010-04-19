import java.util.Date;
import java.util.List;


public class PartidaFirstToKnock extends Partida{

	public PartidaFirstToKnock(List<Jugador> j) {
		this.jugadors = j;		//PREGUNTA: quan fem aquesta assignació, estem copiant tots els valors de j a l'adreça de jugadors, oi?
		this.id = (new Date()).getTime();// És fa aquí?
		this.baralla = new BarallaFrancesa(2, true);//inicialitzem la baralla
	}

	@Override
	public boolean finalitza() {
		//Estaria bé que RondaRemigio mirés si la classe de la partida és FirstToKnock i en aquest cas
		//acabés la ronda quan algun dels jugadors es quedés amb un deadwood < 10 en comptes de lligar-les totes.
		return true;	//És una sola ronda
	}

	public void iniBaralla() {
		baralla = new BarallaFrancesa(2, true);
	}

	@Override
	public void iniRonda(List<Jugador> j) {
		rondaActual = new RondaRemigio(j, baralla);
	}

}
