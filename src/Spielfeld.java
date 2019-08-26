import java.util.Random;

public class Spielbrett {

	int zeilen = 8;
	int spalten = 8;
	int anzahlBomben = 4;
	private Zelle[][] zellen;
	boolean spielzuende;
	
	Random zufall = new Random();
	
	
	public void generiereSpielbrett() {

		zellen = new Zelle[zeilen][spalten];
		
		for(int i = 0; i < zeilen; i++) {
			for(int j=0; j < spalten; j++) {
				zellen[i][j] = new Zelle();
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public void verteileMinen() {
		for(int i=0; i<4; i++) {
			int randX = zufall.nextInt(zeilen);
	        int randY = zufall.nextInt(spalten);
	        
	        Zelle zelle = new Zelle();
	        zelle = zellen[randY][randY];
	        
	        System.out.print(randX + " " + randY + " ");
	        
	        if (!zellen[randX][randY].istMine()) {
	            zelle.setzeMine(true);
	            ersetzeZelle(randX,randY);
	           
	            
		}
		}
}
	public void ersetzeZelle(int x, int y) {
		zellen[x][y] = new Zelle();
		Zelle zelle = zellen[x][y];
	}
	
	
	public void oeffneFeld(){
		if(Eingabe.aOderM == 'O') {
	Zelle zelle = zellen[Eingabe.eingabeZeile][Eingabe.eingabeSpalte];
	if(zelle.istMine()) {
		System.out.print("*");
	}
}	
	}
	
	public void zeigeSpielfeld() {
		
	 for (int i = 0; i < zeilen; i++) {
	            for (int j = 0; j < spalten; j++) {
	                Zelle zelle = zellen[i][j];
	                if(zelle.istMine())
	                {
	                	 System.out.print("[]");
	                }
	               
	            }
	            System.out.println();
	 }
	}
	/*public void zeigeSpielfeld() {
		for(int i = 0; i < zeilen; i++) {
			for(int j=0; j < spalten; j++) {
				zellen[i][j];
			}
			System.out.println();
		}
	}*/
	
}
