package model;

import java.util.ArrayList;
import java.util.List;

public class FacadeEmpleat {
	
	private static List<DTOEmpleat> empleats;
	
	public FacadeEmpleat() {
		empleats = new ArrayList<DTOEmpleat>();
	}
	
	private String[] buscarEmpleat(String nom) {
		
		String[] args = new String[] {"false","0"};
		boolean trobat = false;
			
		for (int i=0; ((i < empleats.size()) && !trobat); i++) {
				
			DTOEmpleat empleat = empleats.get(i);
				
			if (empleat.getNom().equalsIgnoreCase(nom)) {
				args[0]= "true";
				args[1]= String.valueOf(i);
			}
		}	
		return args;
	}
	
	public String altaEmpleat(DTOEmpleat empleat) {
		empleats.add(empleat);
		return "L'empleat " + empleat.getNom() + " ha estat donat d'alta ";
	}
	
	public String baixaEmpleat(String nom) {
		String missatge = "";
		String[] args = buscarEmpleat(nom);
		boolean trobat =  Boolean.parseBoolean(args[0]);
		int i = Integer.parseInt(args[1]);
			
		if (trobat) {
			empleats.remove(i);
			missatge = "L'empleat " + nom + " ha estat donat de baixa ";
		} else {
			missatge = "L'empleat " + nom + " no es troba al sistema ";
		}
		return missatge; 
	}
	
	public String mostrarDadesEmpleat(String nom){
		
		String missatge = "";
		String[] args = buscarEmpleat(nom);
		boolean trobat =  Boolean.parseBoolean(args[0]);
		int i = Integer.parseInt(args[1]);
			
		if (trobat) {
			DTOEmpleat empleat = empleats.get(i);
			System.out.println(empleat.toString());
			System.out.println(empleat.sou());
		} else {
			missatge = "L'empleat " + nom + " no es troba al sistema ";
		}
		return missatge; 
	}
	
	public String mostrarDadesEmpleat() {
		
		String missatge = "";
		if (empleats.size() > 0) {
			for(DTOEmpleat empleat: empleats) {
				System.out.println(empleat.toString());
				System.out.println(empleat.sou());
			}	
		} else {
			missatge = "No existeix cap empleat donat d'alta al sistema";
		}
		return missatge;
	}
	
	public DTOEmpleat obtenirEmpleat(String nom) {
		
		DTOEmpleat empleat = null;
		
		String[] args = buscarEmpleat(nom);
		boolean trobat =  Boolean.parseBoolean(args[0]);
		int i = Integer.parseInt(args[1]);
			
		if (trobat) {
			empleat = empleats.get(i);
		}
		return empleat;
	}
}
