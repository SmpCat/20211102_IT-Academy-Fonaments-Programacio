package model;

import java.text.DecimalFormat;

public abstract class DTOEdifici {
	
	private String nom;
	private int numPlantes;
	private int superficie;
	private static final int SUPERFICIE_PER_MINUT = 5;
	private static final double PREU_NETEJA_PER_MINUT = 1;
	
	public DTOEdifici() {

	}
	
	public DTOEdifici(String nom, int numPlantes, int superficie) {
		this.nom = nom;
		this.numPlantes = numPlantes;
		this.superficie = superficie;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNumPlantes() {
		return numPlantes;
	}

	public void setNumPlantes(int numPlantes) {
		this.numPlantes = numPlantes;
	}

	public int getSuperficie() {
		return superficie;
	}

	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}
	
	@Override
	public String toString() {
		return "Edifici [nom=" + nom + ", numPlantes=" + numPlantes + ", superficie=" + superficie + "]";
	}

	public void netejar() {
		double tempsNeteja = (this.superficie / SUPERFICIE_PER_MINUT) + (this.numPlantes - 1) * 0.5;
		double costMensual = (tempsNeteja * PREU_NETEJA_PER_MINUT) * 30;
		DecimalFormat formato = new DecimalFormat("###,###.##");
		System.out.println("El temps necessari per netejar l'edifici és " + formato.format(tempsNeteja) + " minuts.");
		System.out.println("El cost mensual de neteja és " + formato.format(costMensual) + " €");
	}
	
	public abstract void calcularCostVigilancia();
		
}
