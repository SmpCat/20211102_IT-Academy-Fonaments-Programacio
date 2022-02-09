package cat.ajbarcelona.fdpl;

public class Main {

	public static void main(String[] args) {
		
	
		Ordinador ordinador1 = new Ordinador("Apple", "Imac 27");
		Ordinador ordinador2 = new Ordinador("Microsoft", "Surface","i7 10 gen.","16Gb","512Gb");
		
		System.out.println(ordinador1.getMarca());
		System.out.println(ordinador1.getModel());
		System.out.println(ordinador1.getProcessador());
		System.out.println(ordinador1.getQuantitatRam());
		System.out.println(ordinador1.getCapacitatDiscDur());
		
		System.out.println(ordinador2.getMarca());
		System.out.println(ordinador2.getModel());
		System.out.println(ordinador2.getProcessador());
		System.out.println(ordinador2.getQuantitatRam());
		System.out.println(ordinador2.getCapacitatDiscDur());
		
		ordinador1.setProcessador("M1");
		ordinador1.setQuantitatRam("16Gb");
		ordinador1.setCapacitatDiscDur("1Tb");
		
		System.out.println(ordinador1.mostrarMissatge("OSx"));
		System.out.println(ordinador2.mostrarMissatge("Windows 11"));
		
		System.out.println(ordinador1.toString());
		System.out.println(ordinador2.toString());

	}

}
