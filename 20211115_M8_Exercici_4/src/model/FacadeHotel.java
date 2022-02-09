package model;

import java.util.ArrayList;
import java.util.List;

public class FacadeHotel implements IFacadeHotel {
	
	private static List<DTOHotel> hoteles;
	
	public FacadeHotel() {
		hoteles = new ArrayList<DTOHotel>();
	}
	
	public String[] buscar(String nom) {
			
		String[] args = new String[] {"false","0"};
		boolean trobat = false;
			
		for (int i=0; ((i < hoteles.size()) && !trobat); i++) {
				
			DTOHotel hotel = hoteles.get(i);
				
			if (hotel.getNom().equalsIgnoreCase(nom)) {
				args[0]= "true";
				args[1]= String.valueOf(i);
			}
		}	
		return args;
	}
	   
	public String altaHotel(String nom, int numPlantes, int superficie, int numHabitacions){
			
		String missatge = new String();
	    String[] args = buscar(nom);
		boolean trobat =  Boolean.parseBoolean(args[0]);
			
		if (trobat) {
			missatge = "L'hotel " + nom + " no s'ha donat d'alta perquè ja es troba donat d'alta al sistema";
		} else {
			DTOHotel hotel = new DTOHotel(nom, numPlantes, superficie, numHabitacions);
			hoteles.add(hotel);
			missatge = "L'hotel " + nom + " ha estat donat d'alta";
		}	
		return missatge; 
	}
		
	public String baixaHotel(String nom){
	    	
	    String missatge = new String();
	    String[] args = buscar(nom);
		boolean trobat =  Boolean.parseBoolean(args[0]);
		int i = Integer.parseInt(args[1]);
			
		if (trobat) {
	    	hoteles.remove(i);
	    	missatge = "Sha donat de baixa a l'hotel " + nom;	
		} else {
			missatge = "L'hotel " + nom + " no es troba al sistema ";		
		}
		return missatge; 
	}
		
	public String mostrarDadesHotel(String nom){
		
		String missatge = new String();
	    String[] args = buscar(nom);
		boolean trobat =  Boolean.parseBoolean(args[0]);
		int i = Integer.parseInt(args[1]);
			
		if (trobat) {
			DTOHotel hotel = hoteles.get(i);
			System.out.println(hotel.toString());
			hotel.netejar();
			hotel.calcularCostVigilancia();
			hotel.calcularServei();
		} else {
			missatge = "L'hotel " + nom + " no es troba al sistema ";
		}
		return missatge; 
	}
		
	public String mostrarDadesHotel() {
			
		String missatge = "";
		if (hoteles.size() > 0) {
			for(DTOHotel hotel: hoteles) {
				System.out.println(hotel.toString());
				hotel.netejar();
				hotel.calcularCostVigilancia();
				hotel.calcularServei();
			}	
		} else {
			missatge = "No existeix cap hotel donat d'alta al sistema";
		}
		return missatge;
	}
}
