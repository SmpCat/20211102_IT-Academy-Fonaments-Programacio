package cat.ajbarcelona.fdpl;

public class M7_1_Exercici_2 {
	
	static void mostrarResultat(float notaMitjana) {
		
		if (notaMitjana < 5) {
			System.out.println("La nota mitja és: " + notaMitjana + " ---> La nota mitjana de la classe està suspesa. Els alumnes haurien de preguntar els seus dubtes i treballar més");
		}
		else if (notaMitjana >= 5 && notaMitjana < 7) {
			System.out.println("La nota mitja és: " + notaMitjana + " ---> La nota mitjana de la classe és bona, però els alumnes haurien de millorar el treball personal");
		}
		else if (notaMitjana >= 7) {
			System.out.println("La nota mitja és: " + notaMitjana + " ---> Enhorabona! La nota mitjana de la classe es correspon amb l'esforç realitzat");
		}
		else {
			System.out.println("La nota mitja és: " + notaMitjana + " ---> S'ha produït algun error en el càlcul de la nota mitjana");
		}	
	}
	
	static float demanarIcalcularNotaMitjana (int numNotes) {
		
		float notaIndividual, notaTotal = 0;
		boolean notaNoValida;
		
		for (byte x = 1; x <= numNotes; x++) {
			
			do {
				notaIndividual = Teclado.leerFloat("Introdueix la nota " + x + ": ");
				if ((notaIndividual < 0) || (notaIndividual > 10)) {
					notaNoValida = true;
					System.out.println("Nota incorrecta!. Valor correcte comprès entre 0 i 10");
				} else {
					notaNoValida = false;
					notaTotal = notaTotal + notaIndividual;
				}
			} while (notaNoValida);
		}
		
		return notaTotal/numNotes;
	}
	
	public static void main(String[] args) {
		
		int numNotes;
		float notaMitjana;
		
		numNotes = Teclado.leerInt("Escriu el número de notes que vols introduir:");
		
		if (numNotes > 0) {
			notaMitjana = demanarIcalcularNotaMitjana(numNotes);
			mostrarResultat(notaMitjana);
		}
		else {
			System.out.println("No s'ha calculat la nota Mitjana");
		}
	}	
}
