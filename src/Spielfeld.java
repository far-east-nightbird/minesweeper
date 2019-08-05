
import java.util.*;

public class Spielfeld {
	private String[][] spielfeldVerdeckt;
	private String[][] spielfeldAnzeige;
	private static final int zeile = 8;
	private static final int spalte = 8;
	spielfeldVerdeckt = new String[zeile][spalte];
	
	private Random rand = new Random();
	private int anzahlBomben = 4;
	private String flagge = "!";
	private String bombe = "*";

	public void initiiereSpielfeld() {
		
		for(int i = 0; i < zeile; i++) {
			for(int j = 0; j < spalte; j++) {
				spielfeldVerdeckt[i][j] = "_" ;
			}
		}
	}
	
	public void verteileBomben() {
		for(int i=0; i < anzahlBomben; i++) {
			int zufaelligeZeile = rand.nextInt(8);
			int zufaelligeSpalte = rand.nextInt(8);
			spielfeldVerdeckt[zufaelligeZeile][zufaelligeSpalte] = "*";
		}
	} 
	
	public void verteileZahlen() {
		
		for(int i = 0; i < zeile; i++) {
			for(int j = 0; j < (spalte +1); j++) {
				int bombenAnzeige = 0;
				if(spielfeldVerdeckt[i][j] != "*") {
					
					//Die benachbarten Zellen überprüfen
					for(int k=-1; i<4; i++) {
						for(int l=-1; i<4; i++) {
							if (spielfeldVerdeckt[i+k][j+l] == "*") {
								bombenAnzeige++;
						}
						
						}
						spielfeldVerdeckt[i][j] = Integer.toString(bombenAnzeige);
					}
				}
			}
		}
	}
		
	
	
	public void zeigeSpielfeld() {
		//Spalten
		System.out.print(" ");
		for(int i = 0; i < zeile; i++) {
			System.out.print(i + " ");
		}		
		System.out.println();
		for(int i = 0; i < zeile; i++) {
			System.out.print(i);
			for(int j = 0; j < (spalte +1); j++) {
				System.out.print(" ");
				spielfeldVerdeckt[i][j] = " "; //Füllt die Array mit " "
			}
			System.out.println();
		}
	}
	
	
	
	/**
	 * public String druckeZeileSpalte() {
		//Spalten
		String brett = "";
		for(int i = 0; i < zeile; i++) {
			brett = java.lang.String.valueOf(i) + " ";
		}
	
	
		
		for(int i = 0; i < zeile; i++) {
			brett = java.lang.String.valueOf(i);
			for(int j = 0; j < spalte; j++) {
				brett += spielfeld[i][j];
			}
		}
		return brett;
	}*/

	
	
	
	}
	

