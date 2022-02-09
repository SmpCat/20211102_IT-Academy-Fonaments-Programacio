package cat.ajbarcelona.fdpl;

public class M5_Exercici_4 {
	
	public static void main(String[] args) {
		
		byte numAleatori;
		int numIntents, comptador, numOportunitats;
		boolean numEncertat = false;
		
		numAleatori = (byte) Math.ceil((Math.random() * 10));
		
		System.out.println("Has d'esbrinar el número que he pensat.");
		numIntents = Teclado.leerInt("Escriu el número d'intents que vols fer per esbrinar-lo:");
		
		System.out.println("Comença el joc!");
		
		comptador = numIntents;
		
		do {
			
			if (numAleatori == Teclado.leerInt("Tens " + comptador + " intents. " + "Escriu el número que creus que és:")) {
				numEncertat = true;
			}
			
			comptador = comptador - 1;
			
		} while (!numEncertat && comptador > 0 );
		
		if (numEncertat) {
			numOportunitats = (numIntents - comptador);
			System.out.println("Enhorabona, el número és " + numAleatori + " i has necessitat " + numOportunitats + " intents per encertar-lo");
		} else {
			System.out.println("Has utilitzat massa intents! El número és " + numAleatori);
		}
	}	
}
