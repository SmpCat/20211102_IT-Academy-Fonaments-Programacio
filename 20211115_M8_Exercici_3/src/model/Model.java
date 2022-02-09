package model;

import java.util.ArrayList;
import java.util.List;

public class Model {

	private List<Cliente> clientes;
	private static int comptadorComptes; 
	
	public Model() {
		clientes = new ArrayList<Cliente>();
		comptadorComptes = 0;
	}
	
	public String[] buscarClient(String nomClient) {
		
		String[] argsClient = new String[] {"false","0"};
		boolean trobat = false;
		
		for (int i=0; ((i < clientes.size()) && !trobat); i++) {
			
			Cliente cliente = clientes.get(i);
			
			if (cliente.getNombre().equalsIgnoreCase(nomClient)) {
				argsClient[0]= "true";
				argsClient[1]= String.valueOf(i);
			}
		}
		
		return argsClient;
	}
	
	public String[] buscarCompte(List<Cuenta> comptes, int numCompte) {
		
		String[] argsCompte = new String[] {"false","0"};
		boolean trobat = false;
		
		for (int i=0; ((i < comptes.size()) && !trobat); i++) {
			
			Cuenta cuenta = comptes.get(i);
			
			if (cuenta.getNumCuenta() == numCompte) {
				argsCompte[0]= "true";
				argsCompte[1]= String.valueOf(i);
			}
		}
		
		return argsCompte;
	}
   
	public String crearClient(String nomClient, String cognomClient){
		
		String missatge = new String();
    	String[] argsClient = buscarClient(nomClient);
		boolean trobat =  Boolean.parseBoolean(argsClient[0]);
		
		if (trobat) {
			missatge = "El client " + nomClient + " no s'ha donat d'alta perquè ja es troba donat d'alta al sistema";
		} else {
			 Cliente cliente = new Cliente(nomClient, cognomClient);
			 this.clientes.add(cliente);
			 missatge = "El client " + nomClient + " " + cognomClient + " ha estat donat d'alta";
		}
		
		return missatge; 
    }
	
    public String eliminarClient(String nomClient){
    	
    	String missatge = new String();
    	String[] argsClient = buscarClient(nomClient);
		boolean trobat =  Boolean.parseBoolean(argsClient[0]);
		int i = Integer.parseInt(argsClient[1]);
		
		if (trobat) {
			clientes.remove(i);
			missatge = "Sha donat de baixa al client " + nomClient;
		} else {
			missatge = "El client " + nomClient + " no es troba al sistema";
		}
		
		return missatge;
       
    }
   
    public String crearCompteClient(String nomClient){
    	
    	String missatge = new String();
    	String[] argsClient = buscarClient(nomClient);
		boolean trobat =  Boolean.parseBoolean(argsClient[0]);
		int i = Integer.parseInt(argsClient[1]);
		
		if (trobat) {
			comptadorComptes = comptadorComptes + 1;
	    	Cuenta cuenta = new Cuenta(comptadorComptes, 0);
	    	clientes.get(i).setCuentas(cuenta);
	    	missatge = "El compte " + comptadorComptes + " se li ha creat satisfactoriament al client " + nomClient;	
		} else {
			missatge = "El client " + nomClient + " no es troba al sistema";
		}
		
		return missatge;
    }
    
    public String ingressarEuros(String nomClient, int numCompte, int quantitat){
    	
    	String missatge = new String();
    	String[] argsClient = buscarClient(nomClient);
		boolean trobatClient =  Boolean.parseBoolean(argsClient[0]);
		int i = Integer.parseInt(argsClient[1]);
		
		if (trobatClient) {
			List<Cuenta> comptes = clientes.get(i).getCuentas();
	    	String[] argsCompte = buscarCompte(comptes, numCompte);
	    	boolean trobatCompte =  Boolean.parseBoolean(argsCompte[0]);
	    	int j = Integer.parseInt(argsCompte[1]);
	    	
	    	if (trobatCompte) {
				int saldo = comptes.get(j).ingresar(quantitat);
				missatge = "El compte " + numCompte + " del client " + nomClient + " disposa d'un saldo de " + saldo;
				
			} else {
				missatge = "El compte " + numCompte + " del client " + nomClient + " no es troba al sistema";
			}		
		} else {
				missatge = "El client " + nomClient + " no es troba al sistema";
		}
		
		return missatge;
    	
    }
    
    public String retirarEuros(String nomClient, int numCompte, int quantitat){
    	
    	String missatge = new String();
    	String[] argsClient = buscarClient(nomClient);
		boolean trobatClient =  Boolean.parseBoolean(argsClient[0]);
		int i = Integer.parseInt(argsClient[1]);
		
		if (trobatClient) {
			List<Cuenta> comptes = clientes.get(i).getCuentas();
	    	String[] argsCompte = buscarCompte(comptes, numCompte);
	    	boolean trobatCompte =  Boolean.parseBoolean(argsCompte[0]);
	    	int j = Integer.parseInt(argsCompte[1]);
	    	
	    	if (trobatCompte) {
				int saldo = comptes.get(j).retirar(quantitat);
				missatge = "El compte " + numCompte + " del client " + nomClient + " disposa d'un saldo de " + saldo;
				
			} else {
				missatge = "El compte " + numCompte + " del client " + nomClient + " no es troba al sistema";
			}		
		} else {
			missatge = "El client " + nomClient + " no es troba al sistema";
		}
		
		return missatge;
    }
    
    public Cliente consultarUnClient(String nomClient){
    	
    	Cliente client = null;
    	String[] argsClient = buscarClient(nomClient);
		boolean trobatClient =  Boolean.parseBoolean(argsClient[0]);
		int i = Integer.parseInt(argsClient[1]);
		
		if (trobatClient) {
			client = clientes.get(i);	
		} 
		return client;
    }
    
    public List<Cliente> consultarTotsElsClients() {
    	
    	return clientes;
    }

}
