package view;

import java.util.List;

import model.Cliente;
import model.Cuenta;

public class View {

	public View() {
		
	}
	
	public byte menuPrincipal(){
        byte opcio;
        final byte MINIMO = 0;
        final byte MAXIMO = 7;

        do{
            System.out.println("MENÚ PRINCIPAL:");
            System.out.println("\t0.- Sortir de l'aplicació");
            System.out.println("\t1.- Crear client");
            System.out.println("\t2.- Eliminar client");
            System.out.println("\t3.- Crear compte d'un client");
            System.out.println("\t4.- Ingressar euros en un compte d'un client");
            System.out.println("\t5.- Retirar euros d'un compte d'un client");
            System.out.println("\t6.- Consultar dades d'un client");
            System.out.println("\t7.- Consultar dades de tots els clients");
            
            opcio = Teclado.leerByte("? ");
            if(opcio < MINIMO || opcio > MAXIMO){
                System.out.println("Escull una opció vàlida ");
            }
        }while(opcio < MINIMO || opcio > MAXIMO);
        return opcio;
    }
	
	public String preguntarNomClient() {
		return (Teclado.leerString("Escriu el nom del client "));
	}
	
	public String preguntarCognomClient() {
		return (Teclado.leerString("Escriu el cognom del client "));
	}
	
	public int preguntarNumCompte() {
		return (Teclado.leerInt("Escriu el número de compte "));
	}
	
	public int preguntarQuantitat() {
		return (Teclado.leerInt("Escriu la quantitat "));
	}
	
	public void mostrarMissatge(String missatge) {
		System.out.println(missatge);
	}
	
	public void mostrarUnClient(Cliente client){
    	
		mostrarMissatge(client.toString());
		List<Cuenta> comptes = client.getCuentas();
		if(comptes.size() > 0) {
			for(Cuenta compte: comptes) {
	    		mostrarMissatge(compte.toString());
	    	}	
		} else {
			String missatge = "El client " + client.getNombre() + " no té cap compte donada d'alta al sistema";
			mostrarMissatge(missatge);
		}	
    }
    
    public void mostrarTotsElsClients(List<Cliente> clients) {
    	
    	for(Cliente client: clients) {
    		mostrarMissatge(client.toString());
    		List<Cuenta> comptes = client.getCuentas();
    		if(comptes.size() > 0) {
    			for(Cuenta compte: comptes) {
    	    		mostrarMissatge(compte.toString());
    	    	}	
    		} else {
    			String missatge = "El client " + client.getNombre() + " no té cap compte donada d'alta al sistema";
    			mostrarMissatge(missatge);
    		}		
    	}	
    }
}
