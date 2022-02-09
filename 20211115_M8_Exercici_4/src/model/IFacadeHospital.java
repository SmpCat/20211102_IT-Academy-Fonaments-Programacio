package model;

public interface IFacadeHospital {
	
	public String[] buscar(String nom);
	   
	public String altaHospital(String nom, int numPlantes, int superficie);
		
	public String baixaHospital(String nom);
	
	public String actualitzarDadesHospital(String nom, int numRacions, int numMalalts);
		
	public String mostrarDadesHospital(String nom);
		
	public String mostrarDadesHospital();

}
