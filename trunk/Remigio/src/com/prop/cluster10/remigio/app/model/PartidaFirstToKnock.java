import java.util.Date;
import java.util.List;


public class PartidaFirstToKnock extends Partida{

	public PartidaFirstToKnock(List<Jugador> j) {
		this.jugadors = j;		//PREGUNTA: quan fem aquesta assignaci�, estem copiant tots els valors de j a l'adre�a de jugadors, oi?
		this.id = (new Date()).getTime();// �s fa aqu�?
		this.baralla = new BarallaFrancesa(2, true);//inicialitzem la baralla
	}

	@Override
	public boolean finalitza() {
		//Estaria b� que RondaRemigio mir�s si la classe de la partida �s FirstToKnock i en aquest cas
		//acab�s la ronda quan algun dels jugadors es qued�s amb un deadwood < 10 en comptes de lligar-les totes.
		return true;	//�s una sola ronda
	}

	public void iniBaralla() {
		baralla = new BarallaFrancesa(2, true);
	}

	@Override
	public void iniRonda(List<Jugador> j) {
		rondaActual = new RondaRemigio(j, baralla);
	}

}
