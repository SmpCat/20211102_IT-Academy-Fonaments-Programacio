package cat.ajbarcelona.fdpl;

public class M7_1_Exercici_7 {
	
	static void imprimirPerPantalla(char chr, int num) {
		
		for (byte x = 1; x <= num; x++) {
			for (byte y = 1; y < num; y++) {
				System.out.print(chr);
				System.out.print(" ");
			}
			System.out.println(chr);
			System.out.println(" ");
		}	
	}
	
	public static void main(String[] args) {
		
		char chr;
		int num;
		
		chr = Teclado.leerChar("Escriu un caracter: ");
		num = Teclado.leerInt("Escriu un número: ");
		
		imprimirPerPantalla(chr, num);
	}	
}
