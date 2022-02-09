package cat.ajbarcelona.fdpl;

import java.util.Scanner;

public class M4_Exercici_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean isNumeric;
		String edat, missatge;
		int edatInt;
		
		do {
			System.out.println("Edad: ");	
			edat = sc.nextLine();
			isNumeric = edat.matches("[+-]?\\d*(\\.\\d+)?");
			if(!isNumeric) {
				System.out.println("Edat errònia. Introduir de nou.");
			}
		} while (!isNumeric);
		
		edatInt = Integer.parseInt(edat);
		
		if(edatInt<=5) {
			missatge="preescolar";
		} else if(edatInt>=6 && edatInt<=11) {
			missatge="primària";
		} else if(edatInt>=12 && edatInt<=15) {
			missatge="ESO";
		} else if(edatInt>=16 && edatInt<=17) {
			missatge="Batxillerat";
		} else {
			missatge="FP o Universitat";
		}
		
		System.out.println(edatInt + "---> " + missatge);
	
		sc.close();
	}	
}
