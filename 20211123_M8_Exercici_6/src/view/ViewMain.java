package view;

public class ViewMain {
	
	public byte menuPrincipal(){
        byte opcio;
        final byte MINIMO = 0;
        final byte MAXIMO = 11;

        do{
            System.out.println("MENÚ PRINCIPAL:");
            System.out.println("\t0.- Sortir de l'aplicació");
            System.out.println("\t1.- Alta empleat");
            System.out.println("\t2.- Baixa empleat");
            System.out.println("\t3.- Mostrar dades empleat");
            System.out.println("\t4.- Alta cotxe");
            System.out.println("\t5.- Baixa cotxe");
            System.out.println("\t6.- Mostrar dades cotxe");
            System.out.println("\t7.- Alta escuderia");
            System.out.println("\t8.- Baixa escuderia");
            System.out.println("\t9.- Mostrar dades escuderia");
            System.out.println("\t10.- Afegir empleat a l'escuderia");
            System.out.println("\t11.- Afegir cotxe a l'escuderia");
            
            opcio = Teclado.leerByte("? ");
            if(opcio < MINIMO || opcio > MAXIMO){
                System.out.println("Escull una opció vàlida ");
            }
        }while(opcio < MINIMO || opcio > MAXIMO);
        return opcio;
    }
}
