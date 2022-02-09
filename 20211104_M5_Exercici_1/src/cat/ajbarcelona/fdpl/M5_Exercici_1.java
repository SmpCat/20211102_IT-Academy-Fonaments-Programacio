package cat.ajbarcelona.fdpl;

import java.util.ArrayList;
import java.util.List;

public class M5_Exercici_1 {
	
	public static void main(String[] args) {
		
		int numParaules;
		List<String> paraules = new ArrayList<String>();
	
		
		numParaules = Teclado.leerInt("Escriu el número de paraules que vols introduir: ");
		
		for (int x = 1; x <= numParaules; x++) {
			paraules.add(Teclado.leerString("Introdueix la paraula " + x + " "));
		}
		
		System.out.println("Les paraules escrites han estat:");
		
		for (String paraula : paraules) {
			System.out.println(paraula);
		}
	}	
}
