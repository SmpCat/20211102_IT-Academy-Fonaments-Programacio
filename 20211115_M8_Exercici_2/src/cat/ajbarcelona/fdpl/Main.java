package cat.ajbarcelona.fdpl;

public class Main {

	public static void main(String[] args) {
		
		String nom;
		int numHabitacions, numPlantes, superficie; 
		
		GestionarHotels gestionarHotels = new GestionarHotels();
		
		gestionarHotels.crearHotel("Hilton", 2000, 200, 1000);
		
		nom = Teclado.leerString("Escriu el nom de l'hotel?: ");
		numHabitacions = Teclado.leerInt("Escriu el número d'habitacions de l'hotel?: ");
		numPlantes = Teclado.leerInt("Escriu el número de plantes de l'hotel?: ");
		superficie = Teclado.leerInt("Escriu la superfície en metres quadrats de l'hotel?: ");
		gestionarHotels.crearHotel(nom, numHabitacions, numPlantes, superficie);

		gestionarHotels.veureHotel(Teclado.leerString("Escriu el nom de l'hotel que vols veure: "));
		
		gestionarHotels.donarDeBaixaHotel(Teclado.leerString("Escriu el nom de l'hotel que vols donar de baixa: "));
		
		gestionarHotels.veureHotel(Teclado.leerString("Escriu el nom de l'hotel que vols veure: "));
		
		gestionarHotels.modificarHotel(Teclado.leerString("Escriu el nom de l'hotel al que vols modificar les dades: "));
		
		gestionarHotels.donarDeBaixaHotel(Teclado.leerString("Escriu el nom de l'hotel que vols donar de baixa: "));
		
	}
}
