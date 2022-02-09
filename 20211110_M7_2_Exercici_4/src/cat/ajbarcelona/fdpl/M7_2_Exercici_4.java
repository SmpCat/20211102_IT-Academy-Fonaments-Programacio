package cat.ajbarcelona.fdpl;

import java.text.DecimalFormat;

public class M7_2_Exercici_4 {
	
	static double factorial(int num) {
		double producte;
		
		if(num == 0) {
			producte = 1;
		}
		else {
			
			if (num > 1) {
				System.out.print(num + " x ");
			}
			else {
				System.out.print(num + " = ");
			}
			
			producte = num * factorial(num - 1);
		}
		
		return producte;
	}
	
	public static void main(String[] args) {
		
		int num;
		double producte;
		DecimalFormat formato = new DecimalFormat("###,###");
		
		do {
		
			num = Teclado.leerInt("Escriu un número positiu: ");
			if (num < 0) {
				System.out.println ("El número ha d'èsser positiu");
			}
			
		} while(num < 0);
		
		System.out.print(num + "! = ");
		producte = factorial(num);
		System.out.println (formato.format(producte));
	}	
}
