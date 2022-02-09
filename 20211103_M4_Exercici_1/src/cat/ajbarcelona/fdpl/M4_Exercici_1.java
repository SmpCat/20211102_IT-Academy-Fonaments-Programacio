package cat.ajbarcelona.fdpl;

import java.util.Scanner;

public class M4_Exercici_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean isNumeric;
		String nombre, apellidos, edad;
		String missatge;
		
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
		
		missatge = (Integer.parseInt(edad))<18 ? "ets MENOR d’edat" : "ets MAJOR d’edat";
		
		System.out.println(nombre + " " + apellidos +", " + missatge);
	
		sc.close();
	}
	
}
