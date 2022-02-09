package cat.ajbarcelona.fdpl;

public class M5_Exercici_3 {
	
	public static void main(String[] args) {
		
		byte numAleatori;
		boolean numEncertat = false;
		
		numAleatori = (byte) Math.ceil((Math.random() * 10));
		
		System.out.println("Comença el joc!. Has d'esbrinar el número que he pensat");
		System.out.println("Has d'escriure números fins que l'encertis");
		
		do {
			
			if (numAleatori == Teclado.leerByte("Escriu el número: ")) {
				numEncertat = true;
			}
			
		} while (!numEncertat);
		
		System.out.println("Enhorabona, el número era " + numAleatori);
	}	
}
