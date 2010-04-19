import java.util.List;


public class CtrlPartidaRemigio extends CtrlPartida {

	@Override
	public void iniPartida(List<Jugador> jugadors) {
		// TODO Auto-generated method stub
		partida = new PartidaFirstToKnock(jugadors);
	}

	@Override
	public boolean fiPartida() {
		//TODO
		//retorna si s'ha acabat de jugar la partida (si hi ha una altra ronda i s'ha de seguir jugant)
		return false;
	}

}
