package model;

import java.text.DecimalFormat;

public class DTOCinema extends DTOEdifici {
	
	private int aforament;
	private static final int SUPERFICIE_MAXIMA_VIGILADA_PER_VIGILANT = 3000;
	private static final double COST_MENSUAL_VIGILANT = 1300;
	
	public DTOCinema() {
		super();
	}
	
	public DTOCinema(String nom, int numPlantes, int superficie, int aforament) {
		super(nom, numPlantes, superficie);
		this.aforament = aforament;
	}

	public int getAforament() {
		return aforament;
	}

	public void setAforament(int aforament) {
		this.aforament = aforament;
	}

	@Override
	public String toString() {
		return "Cinema [aforament=" + aforament + ", toString()=" + super.toString() + "]";
	}

	public void calcularCostVigilancia() {
		int numVigilants = (this.getSuperficie() / SUPERFICIE_MAXIMA_VIGILADA_PER_VIGILANT) + (this.getSuperficie() % SUPERFICIE_MAXIMA_VIGILADA_PER_VIGILANT);
		double costVigilancia = numVigilants * COST_MENSUAL_VIGILANT;
		DecimalFormat formato = new DecimalFormat("###,###.##");
		System.out.println("El cost mensual de vigilancia és " + formato.format(costVigilancia) + " €");
	}
	
	public void projectarSessio(int numAssistents, float preuEntrada ) {
		if (numAssistents > this.aforament) {
			System.out.println("El número d’assistents a la sessió no pot ser més gran que l’aforament total de la sala");
		} else {
			double recaptacio = numAssistents * preuEntrada;
			DecimalFormat formato = new DecimalFormat("###,###.##");
			System.out.println("S’han recaptat " +  formato.format(recaptacio) + " euros");
		}
		
	}
}
