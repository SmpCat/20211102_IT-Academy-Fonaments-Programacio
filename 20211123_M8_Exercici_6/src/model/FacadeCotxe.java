package model;

import java.util.ArrayList;
import java.util.List;

public class FacadeCotxe {
	
	private static List<DTOCotxe> cotxes;
	
	public FacadeCotxe() {
		cotxes = new ArrayList<DTOCotxe>();
	}
	
	public String[] buscarCotxe(String model) {
		
		String[] args = new String[] {"false","0"};
		boolean trobat = false;
			
		for (int i=0; ((i < cotxes.size()) && !trobat); i++) {
				
			DTOCotxe cotxe = cotxes.get(i);
				
			if (cotxe.getModel().equalsIgnoreCase(model)) {
				args[0]= "true";
				args[1]= String.valueOf(i);
			}
		}	
		return args;
	}
	
	public String altaCotxe(DTOCotxe cotxe) {
		cotxes.add(cotxe);
		return "El cotxe " + cotxe.getModel() + " ha estat donat d'alta ";
	}
	
	public String baixaCotxe(String nom) {
		String missatge = "";
		String[] args = buscarCotxe(nom);
		boolean trobat =  Boolean.parseBoolean(args[0]);
		int i = Integer.parseInt(args[1]);
		
		if (trobat) {
			cotxes.remove(i);
			missatge = "El cotxe " + nom + " ha estat donat de baixa ";
		} else {
			missatge = "El cotxe " + nom + " no es troba al sistema ";
		}
		return missatge; 
	}
	
	public String mostrarDadesCotxe(String model){
		
		String missatge = "";
		String[] args = buscarCotxe(model);
		boolean trobat =  Boolean.parseBoolean(args[0]);
		int i = Integer.parseInt(args[1]);
			
		if (trobat) {
			DTOCotxe cotxe = cotxes.get(i);
			System.out.println(cotxe.toString());
		} else {
			missatge = "El cotxe " + model + " no es troba al sistema ";
		}
		return missatge; 
	}
	
	public String mostrarDadesCotxe() {
		
		String missatge = "";
		if (cotxes.size() > 0) {
			for(DTOCotxe cotxe: cotxes) {
				System.out.println(cotxe.toString());
			}	
		} else {
			missatge = "No existeix cap cotxe donat d'alta al sistema";
		}
		return missatge;
	}
	
	public DTOCotxe obtenirCotxe(String nom) {
		
		DTOCotxe cotxe = null;
		
		String[] args = buscarCotxe(nom);
		boolean trobat =  Boolean.parseBoolean(args[0]);
		int i = Integer.parseInt(args[1]);
			
		if (trobat) {
			cotxe = cotxes.get(i);
		}
		return cotxe;
	}
}
