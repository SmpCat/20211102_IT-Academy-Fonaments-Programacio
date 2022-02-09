package model;

import java.util.ArrayList;
import java.util.List;

public class FacadeEscuderia {
	
	private static List<DTOEscuderia> escuderies;
	
	public FacadeEscuderia() {
		escuderies = new ArrayList<DTOEscuderia>();
	}
	
	public String[] buscarEscuderia(String nom) {
		
		String[] args = new String[] {"false","0"};
		boolean trobat = false;
			
		for (int i=0; ((i < escuderies.size()) && !trobat); i++) {
				
			DTOEscuderia escuderia = escuderies.get(i);
				
			if (escuderia.getNom().equalsIgnoreCase(nom)) {
				args[0]= "true";
				args[1]= String.valueOf(i);
			}
		}	
		return args;
	}
	
	public String[] buscarEmpleatEscuderia(String nom, int indexEscuderia) {
		
		String[] args = new String[] {"false","0"};
		boolean trobat = false;
		List<DTOEmpleat> empleats = escuderies.get(indexEscuderia).getEmpleats();	
		for (int i=0; ((i < empleats.size()) && !trobat); i++) {
				
			DTOEmpleat empleat = empleats.get(i);
				
			if (empleat.getNom().equalsIgnoreCase(nom)) {
				args[0]= "true";
				args[1]= String.valueOf(i);
			}
		}	
		return args;
	}
	
	public String altaEscuderia(DTOEscuderia escuderia) {
		escuderies.add(escuderia);
		return "La escuderia " + escuderia.getNom() + " ha estat donada d'alta ";
	}
	
	public String baixaEscuderia(String nom) {
		String missatge = "";
		String[] args = buscarEscuderia(nom);
		boolean trobat =  Boolean.parseBoolean(args[0]);
		int i = Integer.parseInt(args[1]);
			
		if (trobat) {
			escuderies.remove(i);
			missatge = "La escuderia " + nom + " ha estat donada de baixa ";
		} else {
			missatge = "La escuderia " + nom + " no es troba al sistema ";
		}
		return missatge; 
	}
	
	public String mostrarDadesEscuderia(String nom){
		
		String missatge = "";
		String[] args = buscarEscuderia(nom);
		boolean trobat =  Boolean.parseBoolean(args[0]);
		int i = Integer.parseInt(args[1]);
			
		if (trobat) {
			DTOEscuderia escuderia = escuderies.get(i);
			System.out.println(escuderia.toString());
		} else {
			missatge = "La escuderia " + nom + " no es troba al sistema ";
		}
		return missatge; 
	}
	
	public String mostrarDadesEscuderia() {
		
		String missatge = "";
		if (escuderies.size() > 0) {
			for(DTOEscuderia escuderia: escuderies) {
				System.out.println(escuderia.toString());
			}	
		} else {
			missatge = "No existeix cap escuderia donada d'alta al sistema";
		}
		return missatge;
	}
	
	public int obtenirPosicioEscuderia(String nom) {
		
		int indexEscuderia = -1;
		
		String[] args = buscarEscuderia(nom);
		boolean trobat =  Boolean.parseBoolean(args[0]);
		int i = Integer.parseInt(args[1]);
			
		if (trobat) {
			indexEscuderia = i;
		}
		return indexEscuderia;
	}
	
	public String afegirEmpleatEscuderia(DTOEmpleat empleat, int indexEscuderia) {
		
		String missatge = "";
		String[] args =  buscarEmpleatEscuderia(empleat.getNom(),indexEscuderia);
		boolean trobat =  Boolean.parseBoolean(args[0]);
			
		if (trobat) {
			missatge = "L'empleat " + empleat.getNom() + " ja es troba donat d'alta a la escuderia " + escuderies.get(indexEscuderia).getNom();
		} else {
			escuderies.get(indexEscuderia).getEmpleats().add(empleat);
			missatge = "L'empleat " + empleat.getNom() + " ha estat afegit amb èxit a l'escuderia " + escuderies.get(indexEscuderia).getNom();
		}
		return missatge;
	}
	
	public String afegirCotxeEscuderia(DTOCotxe cotxe, int indexEscuderia) {
		
		String missatge = "";
		String[] args =  buscarEmpleatEscuderia(cotxe.getModel(),indexEscuderia);
		boolean trobat =  Boolean.parseBoolean(args[0]);
			
		if (trobat) {
			missatge = "El cotxe " + cotxe.getModel() + " ja es troba donat d'alta a la escuderia " + escuderies.get(indexEscuderia).getNom();
		} else {
			escuderies.get(indexEscuderia).getCotxes().add(cotxe);
			missatge = "El cotxe " + cotxe.getModel() + " ha estat afegit amb èxit a l'escuderia " + escuderies.get(indexEscuderia).getNom();
		}
		return missatge;
	}
}
