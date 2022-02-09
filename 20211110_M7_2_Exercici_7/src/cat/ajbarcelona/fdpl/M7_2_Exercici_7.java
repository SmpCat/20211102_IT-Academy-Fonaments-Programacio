package cat.ajbarcelona.fdpl;

public class M7_2_Exercici_7 {
	
	static boolean esBisiesto(long any) {
		
		boolean bisiesto = false;
		
		if (any % 400 == 0) {
			bisiesto = true;
		}
		else if ((!bisiesto) && ((any % 4 == 0) && (any % 100 != 0))) {
			bisiesto = true;
		}
		
		return bisiesto;
	}
	
	public static void main(String[] args) {
		
		long any;
		
		any = Teclado.leerLong("Escriu un any: ");
		
		if (esBisiesto(any)) {
			System.out.println ("L'any " + any + " SI és de traspàs");
		}
		else {
			System.out.println ("L'any " + any + " NO és de traspàs");
		}
	}
	
}
