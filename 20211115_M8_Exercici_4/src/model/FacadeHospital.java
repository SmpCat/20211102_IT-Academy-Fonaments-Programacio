package model;

import java.util.ArrayList;
import java.util.List;

public class FacadeHospital implements IFacadeHospital {
	
	private static List<DTOHospital> hospitales;
	
	public FacadeHospital() {
		hospitales = new ArrayList<DTOHospital>();
	}
	
	public String[] buscar(String nom) {
			
		String[] args = new String[] {"false","0"};
		boolean trobat = false;
			
		for (int i=0; ((i < hospitales.size()) && !trobat); i++) {
				
			DTOHospital Hospital = hospitales.get(i);
				
			if (Hospital.getNom().equalsIgnoreCase(nom)) {
				args[0]= "true";
				args[1]= String.valueOf(i);
			}
		}	
		return args;
	}
	   
	public String altaHospital(String nom, int numPlantes, int superficie){
			
		String missatge = new String();
	    String[] args = buscar(nom);
		boolean trobat =  Boolean.parseBoolean(args[0]);
			
		if (trobat) {
			missatge = "L'hospital " + nom + " no s'ha donat d'alta perquè ja es troba donat d'alta al sistema";
		} else {
			DTOHospital Hospital = new DTOHospital(nom, numPlantes, superficie);
			hospitales.add(Hospital);
			missatge = "L'hospital " + nom + " ha estat donat d'alta";
		}	
		return missatge; 
	}
		
	public String baixaHospital(String nom){
	    	
	    String missatge = new String();
	    String[] args = buscar(nom);
		boolean trobat =  Boolean.parseBoolean(args[0]);
		int i = Integer.parseInt(args[1]);
			
		if (trobat) {
	    	hospitales.remove(i);
	    	missatge = "Sha donat de baixa a L'hospital " + nom;	
		} else {
			missatge = "L'hospital " + nom + " no es troba al sistema ";		
		}
		return missatge; 
	}
	
	public String actualitzarDadesHospital(String nom, int numRacions, int numMalalts){
    	
	    String missatge = new String();
	    String[] args = buscar(nom);
		boolean trobat =  Boolean.parseBoolean(args[0]);
		int i = Integer.parseInt(args[1]);
			
		if (trobat) {
			DTOHospital hospital = hospitales.get(i);
			hospital.setNumRacions(numRacions);
			hospital.setNumMalalts(numMalalts);
	    	hospitales.set(i, hospital);
	    	missatge = "Les dades de l'hospital " + nom + " s'han actualitzat";	
		} else {
			missatge = "L'hospital " + nom + " no es troba al sistema ";		
		}
		return missatge; 
	}
		
	public String mostrarDadesHospital(String nom){
			
		String missatge = new String();
	    String[] args = buscar(nom);
		boolean trobat =  Boolean.parseBoolean(args[0]);
		int i = Integer.parseInt(args[1]);
			
		if (trobat) {
			DTOHospital hospital = hospitales.get(i);
			System.out.println(hospital.toString());
			hospital.netejar();
			hospital.calcularCostVigilancia();
			hospital.repartirDinar();
		} else {
			missatge = "L'hospital " + nom + " no es troba al sistema ";
		}
		return missatge; 
	}
		
	public String mostrarDadesHospital() {
			
		String missatge = "";
		if (hospitales.size() > 0) {
			for(DTOHospital hospital: hospitales) {
				System.out.println(hospital.toString());
				hospital.netejar();
				hospital.calcularCostVigilancia();
				hospital.repartirDinar();
			}	
		} else {
			missatge = "No existeix cap hospital donat d'alta al sistema";
		}
		return missatge;
	}
}
