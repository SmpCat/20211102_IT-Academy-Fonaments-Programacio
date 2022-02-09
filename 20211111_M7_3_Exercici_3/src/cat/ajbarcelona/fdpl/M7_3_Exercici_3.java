package cat.ajbarcelona.fdpl;

import java.text.Normalizer;

public class M7_3_Exercici_3 {

	static String tractarText(String str) {
		String result = str;
		
		result = result.replace(" ", "");
		result = result.replace(",", "");
		result = result.replace(".", "");
		result = Normalizer.normalize(result, Normalizer.Form.NFD);
		result = result.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
		result = result.toLowerCase();
		
		return result;
	}
	
	static boolean esPalindrom(String str) {
		byte indexInici, indexFinal;
		boolean siPalindrom;
		String result;
		
		result = tractarText(str);

		siPalindrom = true;
		indexInici = 0;
		indexFinal = (byte) (result.length() - 1);
		
		do {
			if (result.charAt(indexInici) == result.charAt(indexFinal)) {
				indexInici ++;
				indexFinal --;	
			}
			else {
				siPalindrom = false;
			}
		} while ((indexInici < indexFinal) && siPalindrom);
		
		return siPalindrom;
	}

	public static void main(String[] args) {
	
		if (esPalindrom(Teclado.leerString("Escriu un text: "))) {
			System.out.println ("SI" + " és un palíndrom" );
		}
		else {
			System.out.println ("NO" + " és un palíndrom" );
		}	
	}
}
