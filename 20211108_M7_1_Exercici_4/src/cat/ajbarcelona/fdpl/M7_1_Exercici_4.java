package cat.ajbarcelona.fdpl;

public class M7_1_Exercici_4 {
	
	static void calcularSiUnEsNegatiu (int numero1, int numero2) {
		
		if ((numero1 < 0 && numero2 >= 0) || (numero1 >= 0 && numero2 < 0)) {
			System.out.println ("Un dels dos números és negatiu");
		}
	}
	
	public static void main(String[] args) {
		
		int numero1, numero2;
		
		numero1 = Teclado.leerInt("Escriu el número 1: ");
		numero2 = Teclado.leerInt("Escriu el número 2: ");
		calcularSiUnEsNegatiu (numero1, numero2);
	}	
}
