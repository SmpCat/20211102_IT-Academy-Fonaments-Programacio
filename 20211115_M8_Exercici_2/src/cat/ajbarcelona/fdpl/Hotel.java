package cat.ajbarcelona.fdpl;

import java.text.DecimalFormat;

public class Hotel {
	
	private String nom;
	private int numHabitacions;
	private int numPlantes;
	private int superficie;
	
	public Hotel() {
		
	}

	public Hotel(String nom, int numHabitacions, int numPlantes, int superficie) {
		this.nom = nom;
		this.numHabitacions = numHabitacions;
		this.numPlantes = numPlantes;
		this.superficie = superficie;
	}

	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public int getNumHabitacions() {
		return numHabitacions;
	}
	
	public void setNumHabitacions(int numHabitacions) {
		this.numHabitacions = numHabitacions;
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
		return "Hotel [nom=" + nom + ", numHabitacions=" + numHabitacions + ", numPlantes=" + numPlantes
				+ ", superficie=" + superficie + "]";
	}

	public String calcularManteniment() {
		
		String missatge;
		int personesNecessaries;
		final byte NUM_HABITACIONS_PER_PERSONA = 20;
		final float SALARI_TREBALLADOR = 1500;
		DecimalFormat formato1 = new DecimalFormat("###,###.##");
		
		personesNecessaries = this.numHabitacions / NUM_HABITACIONS_PER_PERSONA;
		if (this.numHabitacions % NUM_HABITACIONS_PER_PERSONA != 0) {
			personesNecessaries ++;
		}
		
		missatge = "Persones necessàries per atendre el servei d'habitacions: " + personesNecessaries + "\n" ;
		missatge = missatge + "El cost total del servei és de: " + formato1.format(personesNecessaries * SALARI_TREBALLADOR) + " €";
		
		return missatge;
	}
}
