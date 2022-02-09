package cat.ajbarcelona.fdpl;

public class M5_Exercici_2 {
	
	public static void main(String[] args) {
		
		int num1, num2, suma;
		
		num1 = Teclado.leerInt("Escriu un número: ");
		
		do {
			num2 = Teclado.leerInt("Escriu un número més gran que el anterior: ");
			if (num2 <= num1) {
				System.out.println ("El segon número ha d'èsser més gran que l'anterior");
			}
		} while (num2 <= num1);
			

		suma = 0;
		
		for (int x = num1; x <= num2; x++) {
			suma = suma + x;
		}
		
		System.out.print(num1 + " i " + num2 + " --> " + "resultat = " + num1);
		
		for (int x = num1 + 1; x <= num2; x++) {
			System.out.print(" + " + x);
		}
		
		System.out.print(" = " + suma);
	}	
}
