package view;

import java.util.ArrayList;
import java.util.List;

import model.DTOCotxe;
import model.DTOEmpleat;
import model.DTOEscuderia;

public class ViewEscuderia {

	public ViewEscuderia() {
		
	}
	
	public DTOEscuderia altaEscuderia() {
		String nom = Teclado.leerString("Escriu el nom de l'escuderia: ");
		double pressupost = Teclado.leerDouble("Escriu el pressupost de l'escuderia (€): ");
		String pais = Teclado.leerString("Escriu el pais de l'escuderia: ");
		List<DTOEmpleat> empleats = new ArrayList<DTOEmpleat>();
		List<DTOCotxe> cotxes = new ArrayList<DTOCotxe>();
		
		return new DTOEscuderia(nom, pressupost, pais, empleats, cotxes);
	}
	
	public String obtenirNomEscuderia() {
		
		String nom = "";
		nom = Teclado.leerString("Escriu el nom de l'escuderia: ");
		return nom;
	}
}
