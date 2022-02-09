package view;

import model.DTOCotxe;

public class ViewCotxe {

	public ViewCotxe() {
		
	}
	
	public DTOCotxe altaCotxe() {
		String model = Teclado.leerString("Escriu el model del cotxe: ");
		int potencia = Teclado.leerInt("Escriu la potència del cotxe (CV): ");
		int velocitatMaxima = Teclado.leerInt("Escriu la velocitat màxima del cotxe (km/h): ");
		String color = Teclado.leerString("Escriu el color del cotxe: ");
		double preu = Teclado.leerDouble("Escriu el preu del cotxe (€): ");
		return new DTOCotxe(model, potencia, velocitatMaxima, color, preu);
	}
	
	public String obtenirModelCotxe() {
		
		String model = "";
		model = Teclado.leerString("Escriu el model del cotxe: ");
		return model;
	}
}
