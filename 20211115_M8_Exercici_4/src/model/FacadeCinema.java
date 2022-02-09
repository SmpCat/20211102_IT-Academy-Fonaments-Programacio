package model;

import java.util.ArrayList;
import java.util.List;

import view.View;

public class FacadeCinema implements IFacadeCinema {
	
	private static List<DTOCinema> cinemes;
	
	public FacadeCinema() {
		cinemes = new ArrayList<DTOCinema>();
	}
	
	public String[] buscar(String nom) {
			
		String[] args = new String[] {"false","0"};
		boolean trobat = false;
			
		for (int i=0; ((i < cinemes.size()) && !trobat); i++) {
				
			DTOCinema Cinema = cinemes.get(i);
				
			if (Cinema.getNom().equalsIgnoreCase(nom)) {
				args[0]= "true";
				args[1]= String.valueOf(i);
			}
		}	
		return args;
	}
	   
	public String altaCinema(String nom, int numPlantes, int superficie, int numHabitacions){
			
		String missatge = new String();
	    String[] args = buscar(nom);
		boolean trobat =  Boolean.parseBoolean(args[0]);
			
		if (trobat) {
			missatge = "El cinema " + nom + " no s'ha donat d'alta perquè ja es troba donat d'alta al sistema";
		} else {
			DTOCinema Cinema = new DTOCinema(nom, numPlantes, superficie, numHabitacions);
			cinemes.add(Cinema);
			missatge = "El cinema " + nom + " ha estat donat d'alta";
		}	
		return missatge; 
	}
		
	public String baixaCinema(String nom){
	    	
	    String missatge = new String();
	    String[] args = buscar(nom);
		boolean trobat =  Boolean.parseBoolean(args[0]);
		int i = Integer.parseInt(args[1]);
			
		if (trobat) {
	    	cinemes.remove(i);
	    	missatge = "Sha donat de baixa a El cinema " + nom;	
		} else {
			missatge = "El cinema " + nom + " no es troba al sistema ";		
		}
		return missatge; 
	}
		
	public String mostrarDadesCinema(String nom){
			
		String missatge = new String();
	    String[] args = buscar(nom);
		boolean trobat =  Boolean.parseBoolean(args[0]);
		int i = Integer.parseInt(args[1]);
			
		if (trobat) {
			DTOCinema cinema = cinemes.get(i);
			System.out.println(cinema.toString());
			cinema.netejar();
			cinema.calcularCostVigilancia();
			View view = new View();
			int numAssistents = view.preguntarNumAssistents();
			float preuEntrada = view.preguntarPreuEntrada();
			cinema.projectarSessio(numAssistents, preuEntrada);
		} else {
			missatge = "El cinema " + nom + " no es troba al sistema ";
		}
		return missatge; 
	}
		
	public String mostrarDadesCinema() {
			
		String missatge = "";
		if (cinemes.size() > 0) {
			for(DTOCinema cinema: cinemes) {
				System.out.println(cinema.toString());
				cinema.netejar();
				cinema.calcularCostVigilancia();
				View view = new View();
				int numAssistents = view.preguntarNumAssistents();
				float preuEntrada = view.preguntarPreuEntrada();
				cinema.projectarSessio(numAssistents, preuEntrada);
			}	
		} else {
			missatge = "No existeix cap cinema donat d'alta al sistema";
		}
		return missatge;
	}
}
