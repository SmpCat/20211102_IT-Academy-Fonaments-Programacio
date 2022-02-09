package model;

public class DTOCotxe {
	
	private String model;
	private int potencia;
	private int velocitatMaxima;
	private String color;
	private double preu;
	
	public DTOCotxe() {
		
	}

	public DTOCotxe(String model, int potencia, int velocitatMaxima, String color, double preu) {
		this.model = model;
		this.potencia = potencia;
		this.velocitatMaxima = velocitatMaxima;
		this.color = color;
		this.preu = preu;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getVelocitatMaxima() {
		return velocitatMaxima;
	}

	public void setVelocitatMaxima(int velocitatMaxima) {
		this.velocitatMaxima = velocitatMaxima;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPreu() {
		return preu;
	}

	public void setPreu(double preu) {
		this.preu = preu;
	}

	@Override
	public String toString() {
		return "DTOCotxe [model=" + model + ", potencia=" + potencia + ", velocitatMaxima=" + velocitatMaxima
				+ ", color=" + color + ", preu=" + preu + "]";
	}
}
