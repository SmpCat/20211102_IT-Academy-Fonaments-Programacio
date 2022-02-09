package cat.ajbarcelona.fdpl;

import java.util.Scanner;

public class M3_Exercici_Extra_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean isNumeric;
		String cadena;
		int amplada, altura, numeroDeMans, litresPintura;
		final int COBERTURALITRO=12;
			
		do {
			System.out.println("Escriu l'amplada de la paret a pintar: ");	
			cadena = sc.nextLine();
			isNumeric = cadena.matches("[+-]?\\d*(\\.\\d+)?");
			if(!isNumeric) {
				System.out.println("L'amplada és errònia. Introduir de nou");
				}
		} while (!isNumeric);
		
		amplada=Integer.parseInt(cadena); 
			
		do {
			System.out.println("Escriu l'alçada de la paret a pintar: ");	
			cadena = sc.nextLine();
			isNumeric = cadena.matches("[+-]?\\d*(\\.\\d+)?");
			if(!isNumeric) {
				System.out.println("L'alçada és errònia. Introduir de nou");
				}
		} while (!isNumeric);
		
		altura=Integer.parseInt(cadena);
		
		do {
			System.out.println("Escriu el nombre de mans a aplicar: ");	
			cadena = sc.nextLine();
			isNumeric = cadena.matches("[+-]?\\d*(\\.\\d+)?");
			if(!isNumeric) {
				System.out.println("El nombre de mans a aplicar és erroni. Introduir de nou");
				}
		} while (!isNumeric);
		
		numeroDeMans=Integer.parseInt(cadena);
		
		litresPintura=((amplada * altura)/COBERTURALITRO)*numeroDeMans;
		
		System.out.println("Els litres de pintura necessaris són: " + litresPintura);
		
		sc.close();
	}
	
}
