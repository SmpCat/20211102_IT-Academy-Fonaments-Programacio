package cat.ajbarcelona.fdpl;

public class M7_3_Exercici_6 {
	
	static void calcularSuma (String textNormalitzat) {
		
		int parells = 0, senars = 0, num;
		
		for(char chr: textNormalitzat.toCharArray()) {
			
			num = Character.getNumericValue(chr);
			
			if (num % 2 == 0) {
				parells = parells + num;
			}
			else {
				senars = senars + num;
			}
		}
		
		System.out.println ("\tLa suma de números parells és = " + parells);
		System.out.println ("\tLa suma de números senars és = " + senars);
	}
	
	static String normalitzarText (String text) {
		
		text = text.replace(" ", "");
		text = text.replace(",", "");
		text = text.replace(".", "");
		text = text.replace("-", "");
		
		System.out.print ("La seqüència de números normalitzada és: ");
		System.out.println (text);
		return text;
	}
	
	static void sumarParellsSenars (String text) {
		
		String textNormalitzat = normalitzarText (text);
		
		if (!textNormalitzat.chars().allMatch(Character::isDigit)) {
			System.out.println("\tLa sequència no és correcta!. Només han d'haver números.");
		}
		else {
			calcularSuma (textNormalitzat);	
		}
	}
		
	public static void main(String[] args) {
	
		String text = Teclado.leerString("Escriu una seqüència de números: ");
		
		sumarParellsSenars(text);
	}
}
