package model;

public interface IFacadeHotel {
	
	public String[] buscar(String nom);
		   
	public String altaHotel(String nom, int numPlantes, int superficie, int numHabitacions);
			
	public String baixaHotel(String nom);
			
	public String mostrarDadesHotel(String nom);
			
	public String mostrarDadesHotel(); 	

}
