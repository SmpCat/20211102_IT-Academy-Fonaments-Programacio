package cat.ajbarcelona.fdpl;

import java.text.Normalizer;

public class M7_3_Exercici_5 {

	static String tractarText(String str) {
		String strTractat = str;
		
		strTractat = strTractat.replace(" ", "");
		strTractat = strTractat.replace(",", "");
		strTractat = strTractat.replace(".", "");
		strTractat = strTractat.replace("-", "");
		
		return strTractat;
	}
	
	static void comprovarMajusculesMinuscules(String text) {
		
		boolean majuscula = false, minuscula = false;
		
		String textTractat = tractarText(text);
		
		for (int x = 0 ; (x < textTractat.length() && (!majuscula || !minuscula)) ; x++) { 
			
			char chr = textTractat.charAt (x); 
			if (Character.isUpperCase(chr)) {
				majuscula = true;
			} else {
				minuscula = true;
			}	
		}
			
		if (majuscula && minuscula) {
			System.out.println ("El text està format per majúscules i minúscules");
		} 
		else if (majuscula) {
			System.out.println ("El text està format només per majúscules");
		}
		else if (minuscula) {
			System.out.println ("El text està format només per minúscules");
		}
		else {
			System.out.println ("Error de format!");
		}
	}

	public static void main(String[] args) {
	
		String text = Teclado.leerString("Escriu un text: ");
		comprovarMajusculesMinuscules(text);
	}
}

