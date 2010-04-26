import java.util.Date;



public class PartidaBlackJack {
	
	private String mode;
	private Date dataFinalitzacio;
	private boolean ajudaActivada;
	
	public boolean isAjudaActivada() {
		return ajudaActivada;
	}

	public void setAjudaActivada(boolean ajudaActivada) {
		this.ajudaActivada = ajudaActivada;
	}

	PartidaBlackJack() {
		mode = "";
		dataFinalitzacio = new Date();
		ajudaActivada = false;
	}
	
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public Date getDataFinalitzacio() {
		return dataFinalitzacio;
	}	
		
	public void setDataFinalitzacio(Date dataFinalitzacio) {
		this.dataFinalitzacio = dataFinalitzacio;
	}
	
}
