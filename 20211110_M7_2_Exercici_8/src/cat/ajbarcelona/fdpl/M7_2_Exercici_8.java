package cat.ajbarcelona.fdpl;

public class M7_2_Exercici_8 {

	static long fibonacci(long num) {
		long producte = 0, valorN_2 = 0, valorN_1 = 0;
		String serie = null;
		
		for(long x = 0; x <= num; x++) {
			
			if (x == 0) {
				valorN_2 = 0;
				producte = valorN_2;
				serie = Long.toString(valorN_2);
			}
			else if(x == 1) {
				valorN_1 = 1;
				producte = valorN_1;
				serie = serie + ", " + Long.toString(valorN_1);
			}
			else if(x > 1 && x != num) {
				producte = valorN_2 + valorN_1;
				valorN_2 = valorN_1;
				valorN_1 = producte;
				serie = serie + ", " + Long.toString(producte);
			}
			else if(x > 1 && x == num) {
				producte = valorN_2 + valorN_1;
			}
		} 
		
		if (num < 2) {
			System.out.println("F(" + num + ") = " + producte);
		}
		else {
			System.out.println("F(" + num + ") = " + serie + " = " + producte);
		}
		
		return producte;
	}

	public static void main(String[] args) {
		long num;
		
		do {

			num = Teclado.leerLong("Escriu un número positiu: ");
			if (num < 0) {
				System.out.println("El número ha d'èsser positiu");
			}

		} while (num < 0);
		
		fibonacci(num);
	}
}
