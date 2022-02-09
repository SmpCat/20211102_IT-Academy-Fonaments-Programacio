package cat.ajbarcelona.fdpl;

import java.util.Scanner;

public class M4_Exercici_5 {

	public static boolean esNumeroCorrecte (String cadena) {
		
		if (cadena.matches("[+-]?\\d*(\\.\\d+)?")) {
			return true;
		} else {
			System.out.println("El valor introduit ha de ser un número");	
			return false;
		}
	}
	
	public static boolean esOperadorCorrecte (String cadena) {
		
		char[] operadores = {'+','-','*','/'};

		for(byte x=0; x < operadores.length; x++) {
			if (cadena.equals(String.valueOf(operadores[x]))) {
				return true;
			}
		}
		System.out.println("L'operador ha d'èsser '+','-','*','/'");
		return false;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean validacioCorrecta;
		String cadena;
		int numero1 = 0, numero2 = 0, resultado = 0;
		char operador = ' ';
		
		do {
			System.out.println("Introduir número 1: ");	
			cadena = sc.nextLine();
			
			if(esNumeroCorrecte(cadena)) {
				validacioCorrecta=true;
				numero1 = Integer.parseInt(cadena);
			} else {
				validacioCorrecta=false;
			}
			
		} while (!validacioCorrecta);
		
		do {
			System.out.println("Introduir número 2: ");	
			cadena = sc.nextLine();
			
			if(esNumeroCorrecte(cadena)) {
				validacioCorrecta=true;
				numero2 = Integer.parseInt(cadena);
			} else {
				validacioCorrecta=false;
			}
			
		} while (!validacioCorrecta);
		
		do {
			System.out.println("Introduir operador: ");	
			cadena = sc.nextLine();
			
			if(esOperadorCorrecte(cadena)) {
				operador = cadena.charAt(0);
				if (operador == '/' && numero2 == 0) {
					System.out.println("No és pot dividir per zero. S'ha de triar un operador diferent a '/'");
					validacioCorrecta=false;
				} else {
					validacioCorrecta=true;
				}
			} else {
				validacioCorrecta=false;
			}
			
		} while (!validacioCorrecta);
		
		sc.close();
		
		switch (operador) {
			case '+':
				resultado = numero1 + numero2;
				break;
			case '-':
				resultado = numero1 - numero2;
				break;
			case '*':
				resultado = numero1 * numero2;
				break;
			case '/':
				resultado = numero1 / numero2;
				break;
			default:		
		}
		
		System.out.println(numero1 + " " + operador + " " + numero2 + " = " + resultado);
	}	
}
