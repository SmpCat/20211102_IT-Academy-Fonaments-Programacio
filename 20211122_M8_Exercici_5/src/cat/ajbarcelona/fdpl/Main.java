package cat.ajbarcelona.fdpl;

public class Main {
	
	static Cercle circulo1 = new Cercle();
	static Cercle circulo2 = new Cercle();
	static Punt punto1 = new Punt();
	static Punt punto2 = new Punt();
	
	public Main() {
		
	}

	public static void main(String[] args) {
		
		System.out.println("FORMULARIO CÍRCULO 1");
		punto1.setPosicioX(Teclado.leerInt("C(P(x,y),r) P(x): "));
		punto1.setPosicioY(Teclado.leerInt("C(P(x,y),r) P(y): "));
		circulo1.setRadi(Teclado.leerInt("C(P(x,y),r) r: "));
		circulo1.setCentre(punto1);
		System.out.println("");	
		
		System.out.println("FORMULARIO CÍRCULO 2");
		punto2.setPosicioX(Teclado.leerInt("C(P(x,y),r) P(x): "));
		punto2.setPosicioY(Teclado.leerInt("C(P(x,y),r) P(y): "));
		circulo2.setRadi(Teclado.leerInt("C(P(x,y),r) r: "));
		circulo2.setCentre(punto2);
		System.out.println("");	
		
		System.out.println("DATOS DEL CÍRCULO 1");
		System.out.println("Punto x: " + circulo1.getCentre().getPosicioX());
		System.out.println("Punto y: " + circulo1.getCentre().getPosicioY());
		System.out.println("Radio: " + circulo1.getRadi());
		System.out.println("");	
		
		System.out.println("DATOS DEL CÍRCULO 2");
		System.out.println("Punto x: " + circulo2.getCentre().getPosicioX());
		System.out.println("Punto y: " + circulo2.getCentre().getPosicioY());
		System.out.println("Radio: " + circulo2.getRadi());
		System.out.println("");	
		
		System.out.println("MÉTODOS");
		System.out.println("");	
		
		System.out.print("Distancia centros: ");
		System.out.println(circulo1.distanciaCentres(circulo2));
		
		System.out.print("Son iguales?: ");
		System.out.println(circulo1.equals(circulo2));
		
		System.out.print("Son concéntricos?: ");
		System.out.println(circulo1.sonConcentrics(circulo2));
		
		System.out.print("Tienen el mismo radio?: ");
		System.out.println(circulo1.tenenIgualRadi(circulo2));
		
		System.out.print("Son tangentes?: ");
		System.out.println(circulo1.sonTangents(circulo2));
		
		System.out.print("Son secantes?: ");
		System.out.println(circulo1.sonSecants(circulo2));
		
		System.out.print("No se tocan?: ");
		System.out.println(circulo1.noEsToquen(circulo2));
	}
}
