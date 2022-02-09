package cat.ajbarcelona.fdpl;

public class M6_Exercici_1 {
	
	static boolean validarOperador(char operador) {
		
		boolean operadorCorrecte;
		
		if ((operador == '+') || (operador == '-') || (operador == '*') || (operador == '/') || (operador == '%')) {
			operadorCorrecte = true;
		} else {
			operadorCorrecte = false;
			System.out.println("L'operador és incorrecte");
		}
		
		return operadorCorrecte;
		
	}
	
	static int sumar (int operand1, int operand2) {
	
		return operand1 + operand2;	
	}
	
	static int restar (int operand1, int operand2) {
		
		return operand1 - operand2;	
	}
	
	static int multiplicar (int operand1, int operand2) {
		
		return operand1 * operand2;
	}
	
	static int dividir (int operand1, int operand2) {

		return operand1 / operand2;
	}
	
	static int modul (int operand1, int operand2) {
		
		return operand1 % operand2;
	}
	
	public static void main(String[] args) {
		
		char operador;
		int operand1, operand2, resultat = 0;
		boolean operadorCorrecte = false;
		
		operand1 = Teclado.leerInt("Escribe el primer operand: ");
		operand2 = Teclado.leerInt("Escriu el segon operand: ");
		
		do {
			operador = Teclado.leerChar("Escriu l'operació que vols realitzar '+' '-' '*' '/' '%' ");
			operadorCorrecte = validarOperador(operador);
		} while (!operadorCorrecte);
		
		switch (operador) {
			case '+':
				resultat = sumar (operand1, operand2);
				break;
			case '-':
				resultat = restar (operand1, operand2);
				break;
			case '*':
				resultat = multiplicar (operand1, operand2);
				break;
			case '/':
				resultat = dividir (operand1, operand2);
				break;
			case '%':
				resultat = modul (operand1, operand2);
				break;
			default:
				System.out.println("L'operador és incorrecte");
		}
		
		System.out.println(operand1 + " " + operador + " " + operand2 + " = " + resultat);
	}	
}
