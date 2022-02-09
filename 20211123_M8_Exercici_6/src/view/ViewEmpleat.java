package view;

import model.DTOEmpleat;
import model.DTOMecanic;
import model.DTOPilot;

public class ViewEmpleat {

	public ViewEmpleat() {
		
	}
	
	public DTOEmpleat altaEmpleat() {
		char chr;
		DTOEmpleat empleat;
		
		do {
			chr = Teclado.leerChar("Qué vols donar d'alta un pilot o un mecànic? (P-Pilot / M-Mecànic): ");
		} while (chr != 'p' && chr != 'P' && chr != 'm' && chr != 'M');
		
		String nom = Teclado.leerString("Escriu el nom de l'empleat: ");
		String primerCognom = Teclado.leerString("Escriu el primer cognom de l'empleat: ");
		int edat = Teclado.leerInt("Escriu l'edat de l'empleat: ");
		int antiguitat = 0;
		
		if (chr == 'p' || chr == 'P') {
			empleat = altaPilot(nom, primerCognom, edat, antiguitat);	
		} else {
			empleat = altaMecanic(nom, primerCognom, edat, antiguitat);
		}
		return empleat;
	}
	
	public DTOEmpleat altaPilot(String nom, String primerCognom, int edat, int antiguitat) {
		int estatura = Teclado.leerInt("Escriu l'alçada del pilot: ");
		int pes = Teclado.leerInt("Escriu el pes del pilot: ");
		DTOEmpleat pilot = new DTOPilot(nom, primerCognom, edat, antiguitat, estatura, pes);
		return pilot;
	}
	
	public DTOEmpleat altaMecanic(String nom, String primerCognom, int edat, int antiguitat) {
		boolean estudisSuperiors = Teclado.leerSiNo("Té estudis superiors el mecànic? (S-Si / N-No): ");
		DTOEmpleat mecanic = new DTOMecanic(nom, primerCognom, edat, antiguitat, estudisSuperiors);
		return mecanic;
	}
	
	public String obtenirNomEmpleat() {
		
		String nom = "";
		nom = Teclado.leerString("Escriu el nom de l'empleat: ");
		return nom;
	}
}
