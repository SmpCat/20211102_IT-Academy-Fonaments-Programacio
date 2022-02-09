package controller;


import model.FacadeCinema;
import model.FacadeHospital;
import model.FacadeHotel;
import model.IFacadeCinema;
import model.IFacadeHospital;
import model.IFacadeHotel;
import view.View;

public class Controller {
	
	private View view;
	private IFacadeHotel facadeHotel;
	private IFacadeHospital facadeHospital;
	private IFacadeCinema facadeCinema;
	
	public Controller() {
		this.view = new View();
		this.facadeHotel = new FacadeHotel();
		this.facadeHospital = new FacadeHospital();
		this.facadeCinema = new FacadeCinema();
	}
	
	public void altaHotel() {
		String nom = view.preguntarNom();
		int numPlantes = view.preguntarNumPlantes();
		int superficie = view.preguntarSuperficie();
		int numHabitacions = view.preguntarNumHabitacions();
		System.out.println(facadeHotel.altaHotel(nom, numPlantes, superficie, numHabitacions));
	}
	
	public void altaHospital() {
		String nom = view.preguntarNom();
		int numPlantes = view.preguntarNumPlantes();
		int superficie = view.preguntarSuperficie();
		System.out.println(facadeHospital.altaHospital(nom, numPlantes, superficie));	
	}
	
	public void altaCinema() {
		String nom = view.preguntarNom();
		int numPlantes = view.preguntarNumPlantes();
		int superficie = view.preguntarSuperficie();
		int aforament = view.preguntarAforament();
		System.out.println(facadeCinema.altaCinema(nom, numPlantes, superficie, aforament));
	}
	
	public void baixaHotel() {
		String nom = view.preguntarNom();
		System.out.println(facadeHotel.baixaHotel(nom));	
	}
	
	public void baixaHospital() {
		String nom = view.preguntarNom();
		System.out.println(facadeHospital.baixaHospital(nom));
	}
	
	public void baixaCinema() {
		String nom = view.preguntarNom();
		System.out.println(facadeCinema.baixaCinema(nom));	
	}
	
	public void actualitzarDadesHospital() {
		String nom = view.preguntarNom();
		int numRacions = view.preguntarNumRacions();
		int numMalalts = view.preguntarNumMalalts();
		System.out.println(facadeHospital.actualitzarDadesHospital(nom, numRacions, numMalalts));	
	}
	
	public void mostrarDadesHotel() {
		String nom = view.preguntarNom();
		if (nom.equals("")) {
			System.out.println(facadeHotel.mostrarDadesHotel());
		} else {
			System.out.println(facadeHotel.mostrarDadesHotel(nom));
		}	
	}
	
	public void mostrarDadesHospital() {
		String nom = view.preguntarNom();
		if (nom.equals("")) {
			System.out.println(facadeHospital.mostrarDadesHospital());
		} else {
			System.out.println(facadeHospital.mostrarDadesHospital(nom));
		}	
	}
	
	public void mostrarDadesCinema() {
		String nom = view.preguntarNom();
		if (nom.equals("")) {
			System.out.println(facadeCinema.mostrarDadesCinema());
		} else {
			System.out.println(facadeCinema.mostrarDadesCinema(nom));
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
                	altaHotel();
                	break;
                case 2: 
                	baixaHotel();
                	break;
                case 3: 
                	mostrarDadesHotel();
                	break;
                case 4: 
                	altaHospital();
                	break;
                case 5: 
                	baixaHospital();
                	break;
                case 6: 
                	actualitzarDadesHospital();
                	break;
                case 7: 
                	mostrarDadesHospital();
                	break;
                case 8: 
                	altaCinema();
                	break;
                case 9: 
                	baixaCinema();
                	break;
                case 10: 
                	mostrarDadesCinema();
                	break;
            }
        }while(!sortir);   
	}
}
