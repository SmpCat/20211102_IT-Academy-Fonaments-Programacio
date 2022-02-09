package cat.ajbarcelona.fdpl;

public class M7_1_Exercici_1 {
	
	static float demanarIcalcularNotaMitjana () {
		
		float notaIndividual, notaTotal = 0;
		boolean notaNoValida;
		
		for (byte x = 1; x <= 3; x++) {
			
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
		
		return notaTotal/3;
	}
	
	public static void main(String[] args) {
		
		float notaMitja;
		
		notaMitja = demanarIcalcularNotaMitjana();
		
		if (notaMitja < 5) {
			System.out.println("La nota mitja és: " + notaMitja + " ---> No has superat el curs. Has de recuperar");
		}
		else if (notaMitja >= 5 && notaMitja <= 7) {
			System.out.println("La nota mitja és: " + notaMitja + " ---> Enhorabona! Has aprovat però hauries de seguir practicant");
		}
		else if (notaMitja > 7) {
			System.out.println("La nota mitja és: " + notaMitja + " ---> Enhorabona! Has superat el curs! Passa ja al següent nivell!");
		}
		else {
			System.out.println("La nota mitja és: " + notaMitja + " ---> S'ha produït algun error en el càlcul de la nota mitjana");
		}	
	}	
	
}
