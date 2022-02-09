package cat.ajbarcelona.fdpl;

import java.util.Scanner;

public class M3_Exercici_Extra_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean isNumeric;
		String cadena;
		int varInt;
	
		do {
			System.out.println("Escriure un nombre: ");	
			cadena = sc.nextLine();
			isNumeric = cadena.matches("[+-]?\\d*(\\.\\d+)?");
			if(!isNumeric) {
				System.out.println("El nombre és erroni. Introduir de nou");
			}
		} while (!isNumeric);
		
	
		varInt = (Integer.parseInt(cadena))<10 ? (Integer.parseInt(cadena)) : 1;
		
		System.out.println("La taula de multiplicar de " + varInt + " és:");
		
		for(byte x=0; x<=10 ; x++) {
			System.out.println(x + " * " + varInt + " = " + x*varInt);
		}
		
		sc.close();
	}
	
}
