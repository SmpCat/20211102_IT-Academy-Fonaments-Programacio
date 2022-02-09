package cat.ajbarcelona.fdpl;

import java.util.ArrayList;
import java.util.List;

public class GestionarHotels {
	
	private List<Hotel> hoteles = new ArrayList<Hotel>();
	
	public GestionarHotels() {
		
	}
	
	public void crearHotel(String nom, int numHabitacions, int numPlantes, int superficie) {
		Hotel hotel = new Hotel(nom, numHabitacions, numPlantes, superficie);
		hoteles.add(hotel);
	}
	
	public String[] buscarHotel(String nom) {
		
		String[] args = new String[] {"false","0"};
		
		boolean trobat = false;
		for (int i=0; ((i < hoteles.size()) && !trobat); i++) {
			
			Hotel hotel = hoteles.get(i);
			
			if (hotel.getNom().equalsIgnoreCase(nom)) {
				args[0]= "true";
				args[1]= String.valueOf(i);
			}
		}
		
		return args;
	}
	
	public void donarDeBaixaHotel(String nom) {
	
		String[] args = buscarHotel(nom);
		boolean trobat =  Boolean.parseBoolean(args[0]);
		int i = Integer.parseInt(args[1]);
		
		if (trobat) {
			hoteles.remove(i);
			System.out.println ("Sha donat de baixa a l'hotel " + nom);
		} else {
			System.out.println ("L'hotel " + nom + " no es troba dins del sistema");
		}
	}
	
	public Hotel actualitzarDades (Hotel hotel) {
		
		if(Teclado.leerSiNo("El numero d'habitacions és actualment de " + hotel.getNumHabitacions() +  " Vols modificar la dada? (S/N)")) {
			hotel.setNumHabitacions(Teclado.leerInt("Escriu el nou número d'habitacions de l'hotel?: "));
		}
		if(Teclado.leerSiNo("El numero de plantes és actualment de " + hotel.getNumPlantes() +  " Vols modificar la dada? (S/N)")) {
			hotel.setNumPlantes(Teclado.leerInt("Escriu el nou número de plantes de l'hotel?: "));
		}
		if(Teclado.leerSiNo("La superficie de l'hotel és actualment de " + hotel.getSuperficie() +  " Vols modificar la dada? (S/N)")) {
			hotel.setSuperficie(Teclado.leerInt("Escriu la nova superficie de l'hotel?: "));
		}
		return hotel;
	}
	
	public void modificarHotel(String nom) {
	
		String[] args = buscarHotel(nom);
		boolean trobat =  Boolean.parseBoolean(args[0]);
		int i = Integer.parseInt(args[1]);
	
		if (trobat) {
			Hotel hotel = actualitzarDades(hoteles.get(i));
			hoteles.set(i, hotel);
			System.out.println("La modificació s'ha realitzat correctament. Les noves dades de l'hotel " + nom + " són:");
			veureHotel(hoteles.get(i).getNom());
		} else {
			System.out.println ("L'hotel " + nom + " no es troba dins del sistema");
		}
	}

		
	public void veureHotel(String nom) {
		
		String[] args = buscarHotel(nom);
		boolean trobat =  Boolean.parseBoolean(args[0]);
		int i = Integer.parseInt(args[1]);
		
		if (trobat) {
			System.out.println(hoteles.get(i).toString());
			System.out.println(hoteles.get(i).calcularManteniment());
		} else {
			System.out.println ("L'hotel " + nom + " no es troba dins del sistema");
		}
	}
	
}
