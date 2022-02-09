package cat.ajbarcelona.fdpl;

public class M7_2_Exercici_5 {
	
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
		String siNo;
		
		do {
		
			num = Teclado.leerLong("Escriu un número positiu: ");
			if (num < 0) {
				System.out.println ("El número ha d'èsser positiu");
			}
			
		} while(num < 0);
		
		if (esPrimo(num)) {
			siNo = "SI";
		}
		else {
			siNo = "NO";
		}
		
		System.out.println("El número " + num + " " + siNo + " es primo.");
	}
}
