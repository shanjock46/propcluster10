





public class CtrlJugadorBlackJack extends SBCtrlJugador {
	JugadorBlackJack jb = new JugadorBlackJack();
	private static CtrlJugadorBlackJack myInstance;
	
	protected CtrlJugadorBlackJack() {
		
	}
	
	public CtrlJugadorBlackJack getInstance() {
		if (myInstance == null) myInstance = new CtrlJugadorBlackJack();
	    return myInstance;
	}
	
	public void apostar(int f) {
		if(f <= jb.getCash()) {
			jb.setAposta(f);
			jb.setCash(jb.getCash() - f);
		}
	}

	public SBCarta demanar() {
		CtrlPartidaBlackJack cPBlackjack = CtrlPartidaBlackJack.getInstance();
		SBCarta carta = new SBCarta();
		carta = cPBlackjack.getPartidaBlackJack().getBaralla().extreuCarta();
		jb.afageixCarta(carta);
		return carta;
	}

	public JugadorBlackJack getJugadorBlackJack() {
		return jb;
	}

	public void setJugadorBlackJack(JugadorBlackJack jb) {
		this.jb = jb;
	}

	public void assegurar(int f) {
		 jb.setFitxesAssegurar(f);
	}

	public void doblar() {
		jb.doblarAposta();
	}

	public void dividir() {
		jb.divideixMa();
	}

}
