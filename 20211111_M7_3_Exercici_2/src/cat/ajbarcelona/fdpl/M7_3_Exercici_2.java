package cat.ajbarcelona.fdpl;

public class M7_3_Exercici_2 {

	static String donarLaVoltaText(String str) {
		byte longitut = (byte) str.length();
		String resultat="";
		
		for(byte x = (byte) (longitut - 1); x >= 0; x--) {
			resultat = resultat + str.charAt(x);
		}
		
		return resultat;
	}

	public static void main(String[] args) {
		String str;
	
		str = Teclado.leerString("Escriu un text: ");
		System.out.println ("El text a l'inrevés és: " + donarLaVoltaText(str));
	}
}
