package view;

public class View {

	public View() {
		
	}
	
	public byte menuPrincipal(){
        byte opcio;
        final byte MINIMO = 0;
        final byte MAXIMO = 10;

        do{
            System.out.println("MENÚ PRINCIPAL:");
            System.out.println("\t0.- Sortir de l'aplicació");
            System.out.println("\t1.- Alta hotel");
            System.out.println("\t2.- Baixa hotel");
            System.out.println("\t3.- Mostrar dades hotel");
            System.out.println("\t4.- Alta hospital");
            System.out.println("\t5.- Baixa hospital");
            System.out.println("\t6.- Actualitzar dades hospital");
            System.out.println("\t7.- Mostrar dades hospital");
            System.out.println("\t8.- Alta cinema");
            System.out.println("\t9.- Baixa cinema");
            System.out.println("\t10.- Mostrar dades cinema");
            
            opcio = Teclado.leerByte("? ");
            if(opcio < MINIMO || opcio > MAXIMO){
                System.out.println("Escull una opció vàlida ");
            }
        }while(opcio < MINIMO || opcio > MAXIMO);
        return opcio;
    }
	
	public String preguntarNom() {
		return (Teclado.leerString("Escriu el nom: "));
	}
	
	public int preguntarNumPlantes() {
		return (Teclado.leerInt("Escriu el número de plantes: "));
	}
	
	public int preguntarSuperficie() {
		return (Teclado.leerInt("Escriu la superficie: "));
	}
	
	public int preguntarNumHabitacions() {
		return (Teclado.leerInt("Escriu el número d'habitacions: "));
	}
	
	public int preguntarNumRacions() {
		return (Teclado.leerInt("Escriu el número de racions: "));
	}
	
	public int preguntarNumMalalts() {
		return (Teclado.leerInt("Escriu el número de malalts: "));
	}
	
	public int preguntarAforament() {
		return (Teclado.leerInt("Escriu l'aforament: "));
	}
	
	public int preguntarNumAssistents() {
		return (Teclado.leerInt("Número d'assistents a la sessio: "));
	}
	
	public float preguntarPreuEntrada() {
		return (Teclado.leerFloat("Preu de l'entrada: "));
	}
	
	public void mostrarMissatge(String missatge) {
		System.out.println(missatge);
	}
}
