package cat.ajbarcelona.fdpl;

public class M7_2_Exercici_6 {
	
	static boolean esPrimo(long num) {
		
		boolean encontradoDivisor = true;
		
		if (num > 1) {
			encontradoDivisor = false;
			
			for(long x = 2; (x < num && !encontradoDivisor); x++) {
				if (num % x == 0) {
					encontradoDivisor = true;
				}
			}
		}
		return !encontradoDivisor;
		
	}
	
	public static void main(String[] args) {
		
		long num;
		
		do {
		
			num = Teclado.leerLong("Escriu un número positiu: ");
			if (num < 0) {
				System.out.println ("El número ha d'èsser positiu");
			}
			
		} while((num < 0) || !esPrimo(num));
		
		
		System.out.println("Exacte, el número " + num + " és primer!");
	}
}
