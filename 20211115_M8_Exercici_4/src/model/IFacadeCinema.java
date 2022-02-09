package model;

public interface IFacadeCinema {
	
	public String[] buscar(String nom);
	   
	public String altaCinema(String nom, int numPlantes, int superficie, int numHabitacions);
		
	public String baixaCinema(String nom);
	
	public String mostrarDadesCinema(String nom);
		
	public String mostrarDadesCinema();
	
}
