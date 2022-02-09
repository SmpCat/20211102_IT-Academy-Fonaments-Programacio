package cat.ajbarcelona.fdpl;

public class M7_1_Exercici_3 {
	
	static void calcularParellSenar (int numero) {
		
		if (numero % 2 == 0) {
			System.out.println ("El número " + numero + " és parell");
		}
		else {
			System.out.println ("El número " + numero + " és senar");
		}
	}
	
	public static void main(String[] args) {
		
		calcularParellSenar (Teclado.leerInt("Escriu un número: "));
	}	
}
