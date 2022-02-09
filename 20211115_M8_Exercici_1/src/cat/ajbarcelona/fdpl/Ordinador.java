package cat.ajbarcelona.fdpl;

public class Ordinador {
	
	private String marca;
	private String model;
	private String processador;
	private String quantitatRam;
	private String capacitatDiscDur;
	
	public Ordinador(String marca, String model) {
		this.marca = marca;
		this.model = model;
	}

	public Ordinador(String marca, String model, String processador, String quantitatRam, String capacitatDiscDur) {
		this.marca = marca;
		this.model = model;
		this.processador = processador;
		this.quantitatRam = quantitatRam;
		this.capacitatDiscDur = capacitatDiscDur;
	}

	public String getMarca() {
		return marca;
	}

	public String getModel() {
		return model;
	}

	public String getProcessador() {
		return processador;
	}
	
	public void setProcessador(String processador) {
		this.processador = processador;
	}

	public String getQuantitatRam() {
		return quantitatRam;
	}
	
	public void setQuantitatRam(String quantitatRam) {
		this.quantitatRam = quantitatRam;
	}

	public String getCapacitatDiscDur() {
		return capacitatDiscDur;
	}

	public void setCapacitatDiscDur(String capacitatDiscDur) {
		this.capacitatDiscDur = capacitatDiscDur;
	}
	
	public String mostrarMissatge (String text) {
		return "En aquests moments s'està executant: " + text;
	}

	@Override
	public String toString() {
		return "Ordinador [marca=" + marca + ", model=" + model + ", processador=" + processador + ", quantitatRam="
				+ quantitatRam + ", capacitatDiscDur=" + capacitatDiscDur + "]";
	}
	
}
