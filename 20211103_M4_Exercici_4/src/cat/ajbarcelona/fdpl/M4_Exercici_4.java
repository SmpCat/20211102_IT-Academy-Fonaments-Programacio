package cat.ajbarcelona.fdpl;

import java.util.Scanner;

public class M4_Exercici_4 {

	public static boolean esNumeroCorrecte (String cadena, int rangInferior, int rangSuperior) {
		
		if (cadena.matches("[+-]?\\d*(\\.\\d+)?")) {
			if (Integer.parseInt(cadena) >= rangInferior && Integer.parseInt(cadena) <= rangSuperior) {
				return true;
			} else {
				System.out.println("El valor introduit ha de ser un número entre 1 i 12.");	
				return false;
			}
		} else {
			System.out.println("El valor introduit ha de ser un número");	
			return false;
		}
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean validacioCorrecta;
		String cadena;
		byte mes = 0;
		
		do {
			System.out.println("Mes: ");	
			cadena = sc.nextLine();
			
			if(esNumeroCorrecte(cadena, 1, 12)) {
				validacioCorrecta=true;
				mes = Byte.parseByte(cadena);
			} else {
				validacioCorrecta=false;
			}
			
		} while (!validacioCorrecta);
		
		sc.close();
		
		switch (mes) {
			case 1:
				System.out.println("El mes de gener té 31 dies");
				break;
			case 2:
				System.out.println("El mes de febrer té 28 dies o 29 dies si és un any de traspàs");
				break;
			case 3:
				System.out.println("El mes de març té 31 dies");
				break;
			case 4:
				System.out.println("El mes d'abril té 30 dies");
				break;
			case 5:
				System.out.println("El mes de maig té 31 dies");
				break;
			case 6:
				System.out.println("El mes de juny té 30 dies");
				break;
			case 7:
				System.out.println("El mes de juliol té 31 dies");
				break;
			case 8:
				System.out.println("El mes d'agost té 31 dies");
			    break;
			case 9:
				System.out.println("El mes de setembre té 30 dies");
			    break;
			case 10:
				System.out.println("El mes d'octubre té 31 dies");
			    break;
			case 11:
				System.out.println("El mes de novembre té 30 dies");
			    break;
			case 12:
				System.out.println("El mes de desembre té 31 dies");
			    break;
			default:
				
		}
	}	
}
