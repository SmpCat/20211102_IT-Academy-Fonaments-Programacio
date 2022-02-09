package cat.ajbarcelona.fdpl;

public class M7_2_Exercici_1 {
	
	static void imprimirPerPantalla(int num) {
		
		for (byte x = 1; x <= num; x++) {
			for (byte y = 1; y <= x; y++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}	
	}
	
	public static void main(String[] args) {
		
		int num;
		
		num = Teclado.leerInt("Escriu un número: ");
		
		imprimirPerPantalla(num);
	}	
}
