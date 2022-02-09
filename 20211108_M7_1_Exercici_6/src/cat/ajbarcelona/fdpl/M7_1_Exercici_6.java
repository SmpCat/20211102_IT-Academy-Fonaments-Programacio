package cat.ajbarcelona.fdpl;

public class M7_1_Exercici_6 {
	
	static void calcularTaulaMultiplicar(byte numero) {
		
		for (byte x = 1; x < 11; x++) {
			System.out.println(numero + " x " + x + " = " + numero * x);
		}	
	}
	
	public static void main(String[] args) {
		
		byte numero;
		boolean numeroNoValid;
		
		do {
			numero = Teclado.leerByte("Escriu un número ente l'1 i el 10: ");
			if ((numero < 1) || (numero > 10)) {
				numeroNoValid = true;
				System.out.println("Número incorrecte!. Rang del número entre l'1 i el 10");
			} else {
				numeroNoValid = false;
			}
		} while (numeroNoValid);
		
		calcularTaulaMultiplicar(numero);
	}	
}
