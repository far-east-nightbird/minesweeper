import java.util.ArrayList;
import java.util.Scanner;


public class Eingabe {
	
    static Scanner scanner = new Scanner(System.in);
    
    public static String spielerklaerung = "Willkommen zu Minesweeper" + "/n" +
    "Wenn Sie ein Feld aufdecken wollen, geben Sie A die Spalte und die Zeile ein. zB: A56" + "/n" +
    "Wenn Sie ein Feld markieren wollen, in dem sich eine Mine befindet, geben Sie M die Spalte und die Zeile ein. zB: A56";
 
     public String eingabe;
     static String[] zeichen;
     static int eingabeSpalte;
     static int eingabeZeile;
     
     public void speichereEingabe() {
    		String eingabe = scanner.nextLine();
    		zeichen = eingabe.split("");
    		eingabeSpalte = Integer.parseInt(zeichen[1]); 
    		eingabeZeile = Integer.parseInt(zeichen[1]); 
    		} 
    	      
     static boolean istKorrekt = ((zeichen[0] == "A") && (eingabeSpalte < 8) && (eingabeZeile < 8)) ||
    		((zeichen[0] == "M") && (eingabeSpalte < 8) && (eingabeZeile < 8));
     
     public void fehlermeldung() {
    	 if(!istKorrekt) {
    		System.out.println("Bitte überprüfen Sie Ihre Eingabe" + "/n" + "Sie sollte zB. so aussehen: A47") ; 
    	 }
     }
  
    
	
			
			
	}

