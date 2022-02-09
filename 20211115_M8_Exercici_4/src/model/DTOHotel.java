package model;

import java.text.DecimalFormat;

public class DTOHotel extends DTOEdifici {
	
	private int numHabitacions;
	private static final int SUPERFICIE_MAXIMA_VIGILADA_PER_VIGILANT = 1000;
	private static final double PLUS_PERILLOSITAT_VIGILANT = 500;
	private static final double COST_MENSUAL_VIGILANT = 1300 + PLUS_PERILLOSITAT_VIGILANT;
	private static final int HABITACIONS_ATESES_PER_PERSONA = 20;
	private static final double SOU_PERSONA_SERVEI_HABITACIONS = 1000;
	
	public DTOHotel() {
		super();
	}
	
	public DTOHotel(String nom, int numPlantes, int superficie, int numHabitacions) {
		super(nom, numPlantes, superficie);
		this.numHabitacions = numHabitacions;
	}
	
	public int getNumHabitacions() {
		return numHabitacions;
	}

	public void setNumHabitacions(int numHabitacions) {
		this.numHabitacions = numHabitacions;
	}
	
	@Override
	public String toString() {
		return "Hotel [numHabitacions=" + numHabitacions + ", toString()=" + super.toString() + "]";
	}

	public void calcularCostVigilancia() {
		int numVigilants = (this.getSuperficie() / SUPERFICIE_MAXIMA_VIGILADA_PER_VIGILANT) + (this.getSuperficie() % SUPERFICIE_MAXIMA_VIGILADA_PER_VIGILANT);
		double costVigilancia = numVigilants * COST_MENSUAL_VIGILANT;
		DecimalFormat formato = new DecimalFormat("###,###.##");
		System.out.println("El cost mensual de vigilancia és " + formato.format(costVigilancia) + " €");
	}
	
	public void calcularServei() {
		int totalPersonesServeiHabitacions = (this.getNumHabitacions() / HABITACIONS_ATESES_PER_PERSONA) + (this.getNumHabitacions() % HABITACIONS_ATESES_PER_PERSONA);
		DecimalFormat formato = new DecimalFormat("###,###.##");
		double costServeiHabitacions = totalPersonesServeiHabitacions * SOU_PERSONA_SERVEI_HABITACIONS;
		System.out.println("Les persones necessàries per atendre el servei d’habitacions de l’hotel són " + totalPersonesServeiHabitacions);
		System.out.println("El cost total del servei d'habitacions de l'hotel és de " + formato.format(costServeiHabitacions) + " €");
	}
}
