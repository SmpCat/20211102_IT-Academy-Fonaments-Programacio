package cat.ajbarcelona.fdpl;

import java.util.Scanner;

public class M3_Exercici_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean isNumeric;
		String cadena;
		int[] operando = new int[2];
		int valor;
		
		for (byte x=1; x<=2; x++) {
			do {
				System.out.println("Escriu el número " + x + ": ");	
				cadena = sc.nextLine();
				isNumeric = cadena.matches("[+-]?\\d*(\\.\\d+)?");
				if(!isNumeric) {
					System.out.println("Número erroni. Introduir de nou.");
				}
			} while (!isNumeric);
			operando[x-1]= Integer.parseInt(cadena);
		}
		
		valor = operando[0] + operando[1];
		System.out.println("El resultat de la suma es: " + valor);
		
		valor = operando[0] - operando[1];
		System.out.println("El resultat de la resta es: " + valor);
		
		valor = operando[0] * operando[1];
		System.out.println("El resultat de la multiplicació es: " + valor);
		
		valor = operando[0] / operando[1];
		System.out.println("El resultat de la divisió es: " + valor);
		
		sc.close();
	}
	
}
