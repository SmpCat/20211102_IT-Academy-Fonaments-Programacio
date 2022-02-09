package cat.ajbarcelona.fdpl;

import java.text.DecimalFormat;

public class M7_1_Exercici_8 {
	
	static void calcularFahrenheit(double celsius) {
		
		DecimalFormat formato1 = new DecimalFormat("#.0");
		
		double fahrenheit = ((celsius * 9) / 5) + 32;
		System.out.println(celsius + "°C" + " = "+ formato1.format(fahrenheit) + "°F");
	}
	
	public static void main(String[] args) {
		
		calcularFahrenheit(Teclado.leerDouble("Escriu la temperatura en ºC: "));
	}	
}
