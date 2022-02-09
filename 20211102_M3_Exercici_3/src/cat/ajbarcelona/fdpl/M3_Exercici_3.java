package cat.ajbarcelona.fdpl;

import java.text.DecimalFormat;
import java.util.Scanner;

public class M3_Exercici_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String cadena;
		boolean isNumeric, rangoIncorrecto;
		int[] nota = new int[3];
		DecimalFormat formato1 = new DecimalFormat("#.00");
		float mitja;
		
		for (byte x=1; x<=3; x++) {
			
			do {
				rangoIncorrecto=false;
				System.out.println("Escriu la nota " + x + ": ");	
				cadena = sc.nextLine();
				isNumeric = cadena.matches("[+-]?\\d*(\\.\\d+)?");
				
				if(!isNumeric) {
					System.out.println("Nota no numèrica. Introduir de nou.");
				} else if(Integer.parseInt(cadena)<0 || Integer.parseInt(cadena)>10) {
					rangoIncorrecto=true;
					System.out.println("Rang de la nota incorrecte. Introduir un valor del 0 al 10.");
				}
				
			} while (!isNumeric || rangoIncorrecto);
			
			nota[x-1]= Integer.parseInt(cadena);
		}
		
		mitja = (nota[0] + nota[1] + nota[2])/3;
		System.out.println("La nota mitja és: " + formato1.format(mitja));
		
		sc.close();
	}
	
}