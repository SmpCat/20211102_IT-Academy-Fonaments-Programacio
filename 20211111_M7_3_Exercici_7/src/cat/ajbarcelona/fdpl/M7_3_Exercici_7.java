package cat.ajbarcelona.fdpl;

import java.text.DecimalFormat;

public class M7_3_Exercici_7 {
	
	
	public static void main(String[] args) {
	
		final float KG_FIDEOS_PER_4_PERSONES = 0.5f;
		final float KG_GAMBES_PER_4_PERSONES = 0.2f;
		final float KG_CALAMARS_PER_4_PERSONES = 0.4f;
		final byte PERSONES = 4;
		
		byte comensals;
		float preuFideus, preuGambes, preuCalamars;
		float totalKgFideus, totalKgGambes,totalKgCalamars;
		float preuFinal, preuPerPersona;
		
		DecimalFormat formato1 = new DecimalFormat("###,###.##");
		
		do {
			preuFideus = Teclado.leerFloat("Escriu el preu per kg dels fideus: ");
			if (preuFideus <= 0) {
				System.out.println("El preu ha d'èsser superior a zero");
			}
		} while (preuFideus <= 0);
		
		do {
			preuGambes = Teclado.leerFloat("Escriu el preu per kg de les gambes: ");
			if (preuGambes <= 0) {
				System.out.println("El preu ha d'èsser superior a zero");
			}
		} while (preuGambes <= 0);
		
		do {
			preuCalamars = Teclado.leerFloat("Escriu el preu per kg dels calamars: ");
			if (preuCalamars <= 0) {
				System.out.println("El preu ha d'èsser superior a zero");
			}
		} while (preuCalamars <= 0);
		
		do {
			comensals = Teclado.leerByte("Escriu el número de comensals: ");
			if (comensals < 1) {
				System.out.println("El número de comensals ha d'èsser més gran o igual a 1");
			}
		} while (comensals < 1);
		
		totalKgFideus = (KG_FIDEOS_PER_4_PERSONES / PERSONES) * comensals;
		totalKgGambes = (KG_GAMBES_PER_4_PERSONES / PERSONES) * comensals;
		totalKgCalamars = (KG_CALAMARS_PER_4_PERSONES / PERSONES) * comensals;
		
		preuFinal = (preuFideus * totalKgFideus) + (preuGambes * totalKgGambes) + (preuCalamars * totalKgCalamars);
		preuPerPersona = preuFinal / comensals;
		
		System.out.println ("Els Kg de fideus necessaris són: " + formato1.format(totalKgFideus) + " kg.");
		System.out.println ("Els Kg de gambes necessaris són: " + formato1.format(totalKgGambes) + " kg.");
		System.out.println ("Els Kg de calamars necessaris són: " + formato1.format(totalKgCalamars) + " kg.");
		System.out.println ("El preu per persona és: " + formato1.format(preuPerPersona) + " €.");
		System.out.println ("El preu final és: " + formato1.format(preuFinal) + " €.");	
	}	
		
}
