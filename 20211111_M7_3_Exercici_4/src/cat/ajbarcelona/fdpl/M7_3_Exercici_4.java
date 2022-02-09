package cat.ajbarcelona.fdpl;

public class M7_3_Exercici_4 {

	static boolean validarLletraNIF(String numNIF, char lletraNIF) {
		
		char lletraNif[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		boolean isValida;
		char lletraValida;
		
		lletraValida = lletraNif[Integer.parseInt(numNIF) % 23];
		
		if (lletraValida == Character.toUpperCase(lletraNIF)) {
			isValida = true;
		} else {
			isValida = false;
			System.out.println("Lletra de NIF incorrecta. La lletra de NIF correcta seria la: " + lletraValida);
		}
		
		return isValida;
	}
	
	static boolean validNIF(String nif) {
		
		boolean isValid;
		String numNIF = null;
		char lletraNIF = 0;
		
		if (nif.length() == 9) {
			numNIF = nif.substring(0, 8);
			lletraNIF = nif.charAt(8);
			isValid = numNIF.chars().allMatch(Character::isDigit);
		} else {
			isValid = false;
		}
		
		if(isValid) {
			isValid = validarLletraNIF(numNIF, lletraNIF);
		} 
		else {
			System.out.println("Format de NIF incorrecte!. El NIF es compon de: 8 dígits numèrics + 1 dígit de control");
		}
		
		return isValid;
	}
		
	public static void main(String[] args) {
	
		String nif;
		
		do {
			nif = Teclado.leerString("Escriu el NIF: ");	
		} while (!validNIF(nif));
		
		System.out.println("NIF correcte. Fi de la validació");
	}
}
