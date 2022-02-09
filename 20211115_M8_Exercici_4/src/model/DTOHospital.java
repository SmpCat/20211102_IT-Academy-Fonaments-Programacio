package model;

import java.text.DecimalFormat;

public class DTOHospital extends DTOEdifici {

	private int numRacions;
	private int numMalalts;
	private static final int SUPERFICIE_MAXIMA_VIGILADA_PER_VIGILANT = 1000;
	private static final double COST_MENSUAL_VIGILANT = 1300;
	private static final int NUM_RACIONS_DIA = 3;
	
	public DTOHospital() {
		super();
	}
	
	public DTOHospital(String nom, int numPlantes, int superficie) {
		super(nom, numPlantes, superficie);
		this.numRacions = NUM_RACIONS_DIA;
		this.numMalalts = 0;
	}

	public int getNumRacions() {
		return numRacions;
	}

	public void setNumRacions(int numRacions) {
		this.numRacions = numRacions;
	}

	public int getNumMalalts() {
		return numMalalts;
	}

	public void setNumMalalts(int numMalalts) {
		this.numMalalts = numMalalts;
	}

	@Override
	public String toString() {
		return "Hospital [numRacions=" + numRacions + ", numMalalts=" + numMalalts + ", toString()=" + super.toString()
				+ "]";
	}

	public void calcularCostVigilancia() {
		int numVigilants = (this.getSuperficie() / SUPERFICIE_MAXIMA_VIGILADA_PER_VIGILANT) + (this.getSuperficie() % SUPERFICIE_MAXIMA_VIGILADA_PER_VIGILANT);
		double costVigilancia = numVigilants * COST_MENSUAL_VIGILANT;
		DecimalFormat formato = new DecimalFormat("###,###.##");
		System.out.println("El cost mensual de vigilancia és " + formato.format(costVigilancia) + " €");
	}

	public void repartirDinar() {
		System.out.println("S’estan repartint " + this.numRacions + " racions");
	}
}
