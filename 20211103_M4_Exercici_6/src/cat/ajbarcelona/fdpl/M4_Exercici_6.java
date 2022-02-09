package cat.ajbarcelona.fdpl;

import java.util.Scanner;

public class M4_Exercici_6 {

	public static boolean esNumeroCorrecte (String cadena, int rangInferior, int rangSuperior) {
		
		if (cadena.matches("[+-]?\\d*(\\.\\d+)?")) {
			if (Integer.parseInt(cadena) >= rangInferior && Integer.parseInt(cadena) <= rangSuperior) {
				return true;
			} else {
				System.out.println("El valor introduit ha de ser un número entre " + rangInferior + " i " + rangSuperior);	
				return false;
			}
		} else {
			System.out.println("El valor introduit ha de ser un número");	
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean validacioCorrecta;
		String cadena, signeZodiac = null, dia = null, mes = null;
		int mesDia;
		
		do {
			System.out.println("Dia de naixement: ");	
			cadena = sc.nextLine();
			
			if(esNumeroCorrecte(cadena, 1, 31)) {
				validacioCorrecta=true;
				dia = cadena;
			} else {
				validacioCorrecta=false;
			}
			
		} while (!validacioCorrecta);
		
		do {
			System.out.println("Mes de naixement: ");	
			cadena = sc.nextLine();
			
			if(esNumeroCorrecte(cadena, 1, 12)) {
				validacioCorrecta=true;
				mes = cadena;
			} else {
				validacioCorrecta=false;
			}
			
		} while (!validacioCorrecta);
		
		sc.close();
		
		/*
		Àries-Aries (21.03 — 19.04)
		Taure-Tauro (20.04 — 20.05)
		Bessons-Géminis (21.05 — 20.06)
		Cranc-Cáncer (21.06 — 22.07)
		LLeó-Leo (23.07 — 22.08)
		Verge-Virgo (23.08 — 22.09)
		Balança-Libra (23.09 — 22.10)
		Escorpi-Escorpio (23.10 — 21.11)
		Sagitario-Sagitario (22.11 — 21.12)
		Capricorn-Capricornio (22.12 — 19.01)
		Aquari-Acuario (20.01 — 18.02)
		Peixos-Piscis (19.02 — 20.03) */
		
		mesDia = Integer.parseInt(mes + dia);
		
		if (mesDia >= 321 && mesDia <= 419) {
			signeZodiac = "Àries";
		} else if(mesDia >= 420 && mesDia <= 520) {
			signeZodiac = "Taure";
		} else if(mesDia >= 521 && mesDia <= 620) {
			signeZodiac = "Bessons";
		} else if(mesDia >= 621 && mesDia <= 722) {
			signeZodiac = "Cranc";
		} else if(mesDia >= 723 && mesDia <= 822) {
			signeZodiac = "Lleó";
		} else if(mesDia >= 823 && mesDia <= 922) {
			signeZodiac = "Verge";
		} else if(mesDia >= 923 && mesDia <= 1022) {
			signeZodiac = "Balança";
		} else if(mesDia >= 1023 && mesDia <= 1121) {
			signeZodiac = "Escorpi";
		} else if(mesDia >= 1122 && mesDia <= 1221) {
			signeZodiac = "Sagitari";
		} else if(mesDia >= 1222 && mesDia <= 1231) {
			signeZodiac = "Capricorn";
		} else if(mesDia >= 11 && mesDia <= 119) {
			signeZodiac = "Capricorn";
		} else if(mesDia >= 120 && mesDia <= 218) {
			signeZodiac = "Aquari";
		} else if(mesDia >= 219 && mesDia <= 320) {
			signeZodiac = "Peixos";
		}
		
		System.out.println("Els nascuts el dia " + dia + " i mes " + mes + " són de signe " + signeZodiac);
	}	
}
