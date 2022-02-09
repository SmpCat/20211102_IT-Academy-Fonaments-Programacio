package cat.ajbarcelona.fdpl;

import java.util.Scanner;

public class M3_Exercici_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean isNumeric;
		String nombre, apellidos, edad;
		
		System.out.println("Nombre: ");	
		nombre = sc.nextLine();
		
		System.out.println("Apellidos: ");	
		apellidos = sc.nextLine();
		
		do {
			System.out.println("Edad: ");	
			edad = sc.nextLine();
			isNumeric = edad.matches("[+-]?\\d*(\\.\\d+)?");
			if(!isNumeric) {
				System.out.println("Edad errónea. Introducir de nuevo.");
			}
		} while (!isNumeric);
		
		System.out.println("Nombre:" + nombre);
		System.out.println("Apellidos: " + apellidos);
		System.out.println("Edad: " + edad);
	
		sc.close();
	}
	
}
