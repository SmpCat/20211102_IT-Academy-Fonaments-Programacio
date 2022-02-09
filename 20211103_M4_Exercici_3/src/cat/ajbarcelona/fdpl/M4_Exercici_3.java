package cat.ajbarcelona.fdpl;

import java.util.Scanner;

public class M4_Exercici_3 {

	public static boolean esNumero (String cadena) {
		if (cadena.matches("[+-]?\\d*(\\.\\d+)?")) {
			return true;
		} else {
			System.out.println("El valor introduit no és un número.");	
			return false;
		}
	}
	
	public static boolean esSiNo (String cadena) {
		if(cadena.equals("s") || cadena.equals("S") || cadena.equals("n") || cadena.equals("N")) {
			return true;
		} else {
			System.out.println("Resposta incorrecta. Valors vàlids 'S' 's' 'N' 'n' ");	
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean validacioCorrecta;
		String cadena, titolUniversitari = null, atur = null;
		int edat = 0;
		
		do {
			System.out.println("Edat: ");	
			cadena = sc.nextLine();
			
			if(esNumero(cadena)) {
				validacioCorrecta=true;
				edat = Integer.parseInt(cadena);
			} else {
				validacioCorrecta=false;
			}
			
		} while (!validacioCorrecta);
		
		
		do {
			System.out.println("Tens títol universitari? (S/N): ");	
			cadena = sc.nextLine();
			
			if (esSiNo(cadena)) {
				validacioCorrecta=true;
				titolUniversitari=cadena;
			} else {
				validacioCorrecta=false;
			}
			
		} while (!validacioCorrecta);
		
		
		do {
			System.out.println("Estàs a l'atur? (S/N): ");	
			cadena = sc.nextLine();
			
			if (esSiNo(cadena)) {
				validacioCorrecta=true;
				atur=cadena;
			} else {
				validacioCorrecta=false;	
			}
			
		} while (!validacioCorrecta);
		
		
		if (((edat >= 18) && ((titolUniversitari.equals("s")) || (titolUniversitari.equals("S")))) || 
		   (atur.equals("s")) || (atur.equals("S"))) {
			System.out.println("Beca:SI");
		} else {
			System.out.println("Beca:NO");
		}
	
		sc.close();
	}	
}
