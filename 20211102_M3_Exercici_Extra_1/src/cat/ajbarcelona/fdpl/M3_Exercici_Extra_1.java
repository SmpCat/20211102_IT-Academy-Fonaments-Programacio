package cat.ajbarcelona.fdpl;

import java.util.Scanner;

public class M3_Exercici_Extra_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean isNumeric;
		String cadena;
	
		do {
			System.out.println("Escriure un nombre: ");	
			cadena = sc.nextLine();
			isNumeric = cadena.matches("[+-]?\\d*(\\.\\d+)?");
			if(!isNumeric) {
				System.out.println("El nombre és erroni. Introduir de nou");
			}
		} while (!isNumeric);
		
	
		System.out.println("El doble del nombre és: " + (Integer.parseInt(cadena))*2);
		System.out.println("El tripe del nombre és: " + (Integer.parseInt(cadena))*3);
	
		sc.close();
	}
	
}
