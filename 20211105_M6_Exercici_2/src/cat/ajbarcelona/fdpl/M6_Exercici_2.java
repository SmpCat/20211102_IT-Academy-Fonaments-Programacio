package cat.ajbarcelona.fdpl;

public class M6_Exercici_2 {
	
	static float demanarIcalcularEdatMitjana (byte numPersones) {
		
		int edatIndividual,edatTotal = 0;
		float edatMitjana;
		boolean edatNoValida;
		
		for (byte x = 1; x <= numPersones; x++) {
			
			do {
				edatIndividual = Teclado.leerInt("Si us plau, 'persona " + x + "' " + "escriu la teva edat: ");
				if ((edatIndividual < 0) || (edatIndividual > 120)) {
					edatNoValida = true;
					System.out.println("Rang d'edat erroni. El rang d'edat vàlid va de 0 a 120");
				} else {
					edatNoValida = false;
					edatTotal = edatTotal + edatIndividual;
				}
			} while (edatNoValida);
		}
		
		edatMitjana = edatTotal/numPersones;
		return edatMitjana;
	}
	
	public static void main(String[] args) {
		
		byte numPersones;
		float edatMitjana;
		
		numPersones = Teclado.leerByte("Escriu el número de persones a qui s'ha de demanar l'edat:");
		
		edatMitjana = demanarIcalcularEdatMitjana(numPersones);
		System.out.println ("L'edat mitjana de les " + numPersones + " persones és " + edatMitjana);
	}	
}
