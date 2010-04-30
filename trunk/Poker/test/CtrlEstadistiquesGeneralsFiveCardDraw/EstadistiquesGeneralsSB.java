package CtrlEstadistiquesGeneralsFiveCardDraw;

import java.util.ArrayList;

public abstract class EstadistiquesGeneralsSB {

	protected Integer totalPartidesJugades;
	protected Integer totalRondesJugades;
	protected Integer totalJugadorsParticipants;

	public Integer getTotalPartidesJugades() {
		if (totalPartidesJugades != -1)
			return totalPartidesJugades;
		else
			return 0;
	}

	public void setTotalPartidesJugades(Integer totalPartidesJugades) {
		this.totalPartidesJugades = totalPartidesJugades;
	}

	public Integer getTotalRondesJugades() {
		if (totalRondesJugades != -1)
			return totalPartidesJugades;
		return 0;
	}

	public void setTotalRondesJugades(Integer totalRondesJugades) {
		this.totalRondesJugades = totalRondesJugades;
	}

	public Integer getTotalJugadorsParticipants() {
		if (totalJugadorsParticipants != -1)
			return totalPartidesJugades;
		else
			return 0;
	}

	public void setTotalJugadorsParticipants(Integer totalJugadorsParticipants) {
		this.totalJugadorsParticipants = totalJugadorsParticipants;
	}

	public double mitjanaJugadorsPartida() {
		double mitjana = 0;
		if (totalPartidesJugades > 0) {
			mitjana = (double) getTotalJugadorsParticipants() / (double) getTotalPartidesJugades();
		}
		return mitjana;
	}

	public double mitjanaRondesPartida() {
		double mitjana = 0;
		if (totalPartidesJugades > 0) {
			mitjana = (double) getTotalRondesJugades() / (double) getTotalPartidesJugades();
		}
		return mitjana;
	}

	public void actualitzaEstadistiquesGenerals(Integer r, Integer j) {
		if (totalPartidesJugades == -1)
			totalPartidesJugades = 0;
		if (totalRondesJugades == -1)
			totalRondesJugades = 0;
		if (totalJugadorsParticipants == -1)
			totalJugadorsParticipants = 0;
		totalPartidesJugades++;
		totalRondesJugades += r;
		totalJugadorsParticipants += j;
	}

	public ArrayList<Object> carregaEstadistiquesGenerals() {
		ArrayList<Object> est = new ArrayList<Object>();
		if (totalPartidesJugades != -1)
			est.add(totalPartidesJugades);
		else
			est.add(0);
		if (totalJugadorsParticipants != -1)
			est.add(totalJugadorsParticipants);
		else
			est.add(0);
		if (totalRondesJugades != -1)
			est.add(totalRondesJugades);
		else
			est.add(0);
		est.add(mitjanaJugadorsPartida());
		est.add(mitjanaRondesPartida());
		return est;
	}

}
