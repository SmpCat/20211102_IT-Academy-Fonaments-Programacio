package cat.ajbarcelona.fdpl;

import java.util.ArrayList;
import java.util.List;

public class M5_Exercici_5 {
	
	public static void main(String[] args) {
		
		String nom;
		boolean titolUniversitari, atur;
		byte edat = 0, numBeques = 0;
		Alumne alumne;
		List<Alumne> alumnes = new ArrayList<Alumne>();
		
		do {
			nom = Teclado.leerString("Nom: ");
			edat = Teclado.leerByte("Edat: ");
			titolUniversitari = Teclado.leerSiNo("Tens títol universitari? (S/N): ");
			atur = Teclado.leerSiNo("Estàs a l'atur? (S/N): ");
			
			if ((edat >= 18 && titolUniversitari) || atur) {
				alumne = new Alumne(nom, edat, titolUniversitari, atur);
				alumnes.add(alumne);
				System.out.println("Beca:SI");
				numBeques ++;
			} else {
				System.out.println("Beca:NO");
			}
		} while (numBeques < 5);
		
		for (Alumne al: alumnes) {
			System.out.println(al.toString());
		}
	}	
}
