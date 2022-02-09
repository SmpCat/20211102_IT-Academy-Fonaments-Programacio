package cat.ajbarcelona.fdpl;

import java.text.DecimalFormat;

public class M7_3_Exercici_1 {

    public static void main(String[] args) {     
        
        boolean sortir = false;
       
        do{
            switch(menu()){
                case 1: calcularAreaQuadrat();
                        break;
                case 2: calcularAreaTriangle();
                        break;
                case 3: calcularAreaRectangle();
                        break;
                case 4: calcularAreaCercle();
                	break;
                case 0: System.out.println("Gràcies per utilitzar l'aplicació");
                		sortir = true;
                        break;
            }
        }while(!sortir);   
    }
   
    public static byte menu(){
        byte opcio;
        final byte MINIMO = 0;
        final byte MAXIMO = 4;

        do{
            System.out.println("MENÚ PRINCIPAL:");
            System.out.println("\t1. Quadrat");
            System.out.println("\t2. Triangle");
            System.out.println("\t3. Rectangle");
            System.out.println("\t4. Cercle");
            System.out.println("\t0. Sortir de l'aplicació.");
            opcio = Teclado.leerByte("");
            if(opcio < MINIMO || opcio > MAXIMO){
                System.out.println("Escull una opció vàlida");
            }
        }while(opcio < MINIMO || opcio > MAXIMO);
        return opcio;
    }
   
    public static void calcularAreaQuadrat(){
        int costat = Teclado.leerInt("Escriu la mida del costat del quadrat: ");
        
        System.out.println("L'àrea del quadrat és: " + Math.pow(costat,2));     
    }
   
    public static void calcularAreaTriangle(){
       int base = Teclado.leerInt("Escriu la base del triangle: ");
       int alcada = Teclado.leerInt("Escriu l'alçada del triangle: ");
       DecimalFormat formato = new DecimalFormat("###,###.##");
       
       System.out.println("L'àrea del triangle és: " + formato.format((base * alcada)/2));
       
    }
   
    public static void calcularAreaRectangle(){
    	int base = Teclado.leerInt("Escriu la base del rectangle: ");
        int alcada = Teclado.leerInt("Escriu l'alçada del rectangle: ");
        
        System.out.println("L'àrea del rectangle és: " + (base * alcada));
    }
    
    public static void calcularAreaCercle(){
    	int radi = Teclado.leerInt("Escriu el radi del cercle: ");
    	DecimalFormat formato = new DecimalFormat("###,###.##");
    	
    	System.out.println("L'àrea del cercle és: " + formato.format(Math.PI * Math.pow(radi,2)));
     }
   
}
