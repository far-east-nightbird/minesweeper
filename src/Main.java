import java.util.Scanner;

public class Main {
	public Main() {
		
		
		
			}
	 public static void main(String[] args){ 
		
		 Eingabe eingabe = new Eingabe();
		 Spielfeld spielfeld = new Spielfeld();
		 
		 
		 
		 System.out.println("eingabe.spielerklaerung");
		 //Initiiere Spielfeld
		 spielfeld.initiiereSpielfeld();
		 spielfeld.verteileBomben();
		 spielfeld.verteileZahlen();
		 
		 
		 spielfeld.zeigeSpielfeld();
		 eingabe.speichereEingabe();
		
		 //eingabe.fehlermeldung();
		
			  }
		 
	 }
	 
	 

 