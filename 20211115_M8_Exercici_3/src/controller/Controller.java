package controller;

import java.util.List;

import model.Cliente;
import model.Model;
import view.View;

public class Controller {
	
	private View view;
	private Model model;
	
	public Controller(View view, Model model) {
		this.view = view;
		this.model = model;
	}
	
	public void crearClient() {
		String nom = view.preguntarNomClient();
		String cognom = view.preguntarCognomClient();
		
    	System.out.println(model.crearClient(nom, cognom));
	}
	
	public void eliminarClient() {
		String nom = view.preguntarNomClient();
		
		System.out.println(model.eliminarClient(nom));
	}
	
	public void crearCompteClient() {
		String nom = view.preguntarNomClient();
		
		System.out.println(model.crearCompteClient(nom));
	}
	
	public void ingressarEuros() {
		String nomClient = view.preguntarNomClient();
		int numCompte = view.preguntarNumCompte();
		int quantitat = view.preguntarQuantitat();
		
		System.out.println(model.ingressarEuros(nomClient, numCompte, quantitat));
	}
	
	public void retirarEuros() {
		String nomClient = view.preguntarNomClient();
		int numCompte = view.preguntarNumCompte();
		int quantitat = view.preguntarQuantitat();
		
		System.out.println(model.retirarEuros(nomClient, numCompte, quantitat));
	}
	
	public void consultarUnClient() {
		String nomClient = view.preguntarNomClient();
		Cliente client = model.consultarUnClient(nomClient);
		if(client != null) {
			view.mostrarUnClient(client);
		} else {
			String missatge = "El client " + nomClient + " no es troba al sistema";
			view.mostrarMissatge(missatge);
		}
	}
	
	public void consultarTotsElsClients() {
		List<Cliente> clients = model.consultarTotsElsClients();
		if(clients.size() > 0) {
			view.mostrarTotsElsClients(clients);
		} else {
			String missatge = "No existeix cap client donat d'alta al sistema";
			view.mostrarMissatge(missatge);
		}	
	}
	
	public void tractarPeticions() {
		boolean sortir = false;
       
        do{
            switch(view.menuPrincipal()){
            	case 0: 
            		System.out.println("Gràcies per utilitzar l'aplicació");
            		sortir = true;
            		break;
                case 1: 
                	crearClient();
                	break;
                case 2: 
                	eliminarClient();
                	break;
                case 3: 
                	crearCompteClient();
                	break;
                case 4: 
                	ingressarEuros();
                	break;
                case 5: 
                	retirarEuros();
                	break;
                case 6: 
                	consultarUnClient();
                	break;
                case 7: 
                	consultarTotsElsClients();
                	break;  
            }
        }while(!sortir);   
	}
}
