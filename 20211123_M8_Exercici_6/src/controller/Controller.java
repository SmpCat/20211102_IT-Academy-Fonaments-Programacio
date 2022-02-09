package controller;

import model.DTOCotxe;
import model.DTOEmpleat;
import model.FacadeCotxe;
import model.FacadeEmpleat;
import model.FacadeEscuderia;
import view.ViewCotxe;
import view.ViewEmpleat;
import view.ViewEscuderia;
import view.ViewMain;

public class Controller {
	
	private ViewMain viewMain;
	private ViewEmpleat viewEmpleat;
	private ViewCotxe viewCotxe;
	private ViewEscuderia viewEscuderia;
	private FacadeEmpleat facadeEmpleat;
	private FacadeCotxe facadeCotxe;
	private FacadeEscuderia facadeEscuderia;
	
	public Controller() {
		this.viewMain = new ViewMain();
		this.viewEmpleat = new ViewEmpleat();
		this.viewCotxe = new ViewCotxe();
		this.viewEscuderia = new ViewEscuderia();
		this.facadeEmpleat = new FacadeEmpleat();
		this.facadeCotxe = new FacadeCotxe();
		this.facadeEscuderia = new FacadeEscuderia();
	}
	
	public String consultarEmpleat() {
		
		String missatge = "";
		
		String nom = viewEmpleat.obtenirNomEmpleat();
		if (nom == "") {
			missatge = facadeEmpleat.mostrarDadesEmpleat();
		} else {
			missatge = facadeEmpleat.mostrarDadesEmpleat(nom);
		}
		return missatge;
	}
	
	public String consultarCotxe() {
		
		String missatge = "";
		
		String model = viewCotxe.obtenirModelCotxe();
		if (model == "") {
			missatge = facadeCotxe.mostrarDadesCotxe();
		} else {
			missatge = facadeCotxe.mostrarDadesCotxe(model);
		}
		return missatge;
	}
	
	public String consultarEscuderia() {
		
		String missatge = "";
		
		String nom = viewEscuderia.obtenirNomEscuderia();
		if (nom == "") {
			missatge = facadeEscuderia.mostrarDadesEscuderia();
		} else {
			missatge = facadeEscuderia.mostrarDadesEscuderia(nom);
		}
		return missatge;
	}
	
	public String afegirEmpleatEscuderia() {
		
		DTOEmpleat empleat;
		int indexEscuderia = -1;
		String missatge = "", nomEmpleat="", nomEscuderia = "";
		boolean error = false;
		
		nomEmpleat = viewEmpleat.obtenirNomEmpleat();
		empleat = facadeEmpleat.obtenirEmpleat(nomEmpleat);
		if (empleat == null) {
			missatge = "L'empleat " + nomEmpleat + " no es troba al sistema ";
			error = true;
		} 
		if (!error) {
			nomEscuderia = viewEscuderia.obtenirNomEscuderia();
			indexEscuderia = facadeEscuderia.obtenirPosicioEscuderia(nomEscuderia);
			if (indexEscuderia < 0) {
				missatge = "La escuderia " + nomEscuderia + " no es troba al sistema ";
				error = true;
			} 
		}
		if (!error) {
			missatge = facadeEscuderia.afegirEmpleatEscuderia(empleat, indexEscuderia);
		}
		return missatge;
	}
	
	public String afegirCotxeEscuderia() {
		
		DTOCotxe cotxe;
		int indexEscuderia = -1;
		String missatge = "", nomCotxe="", nomEscuderia = "";
		boolean error = false;
		
		nomCotxe = viewCotxe.obtenirModelCotxe();
		cotxe = facadeCotxe.obtenirCotxe(nomCotxe);
		if (cotxe == null) {
			missatge = "El cotxe " + nomCotxe + " no es troba al sistema ";
			error = true;
		} 
		if (!error) {
			nomEscuderia = viewEscuderia.obtenirNomEscuderia();
			indexEscuderia = facadeEscuderia.obtenirPosicioEscuderia(nomEscuderia);
			if (indexEscuderia < 0) {
				missatge = "La escuderia " + nomEscuderia + " no es troba al sistema ";
				error = true;
			} 
		}
		if (!error) {
			missatge = facadeEscuderia.afegirCotxeEscuderia(cotxe, indexEscuderia);
		}
		return missatge;
	}
	
	public void tractarPeticions() {
		boolean sortir = false;
       
        do{
            switch(viewMain.menuPrincipal()){
            	case 0: 
            		System.out.println("Gràcies per utilitzar l'aplicació");
            		sortir = true;
            		break;
                case 1: 
                	System.out.println(facadeEmpleat.altaEmpleat(viewEmpleat.altaEmpleat()));
                	break;
                case 2: 
                	System.out.println(facadeEmpleat.baixaEmpleat(viewEmpleat.obtenirNomEmpleat()));
                	break;
                case 3: 
                	System.out.println(consultarEmpleat());
                	break;
                case 4: 
                	System.out.println(facadeCotxe.altaCotxe(viewCotxe.altaCotxe()));
                	break;
                case 5: 
                	System.out.println(facadeCotxe.baixaCotxe(viewCotxe.obtenirModelCotxe()));
                	break;
                case 6: 
                	System.out.println(consultarCotxe());
                	break;
                case 7: 
                	System.out.println(facadeEscuderia.altaEscuderia(viewEscuderia.altaEscuderia()));
                	break;
                case 8: 
                	System.out.println(facadeEscuderia.baixaEscuderia(viewEscuderia.obtenirNomEscuderia()));
                	break;
                case 9: 
                	System.out.println(consultarEscuderia());
                	break;
                case 10: 
                	System.out.println(afegirEmpleatEscuderia());
                	break;
                case 11: 
                	System.out.println(afegirCotxeEscuderia());
                	break;
            }
        }while(!sortir);   
	}
}
