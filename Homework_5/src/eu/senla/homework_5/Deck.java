package eu.senla.homework_5;

public class Deck {

	
	public int deck;
	public int containerFlag;
	
	  public int deck() {
		
			if (containerFlag == 0) {	
				deck = 2;
				}	
			if (containerFlag == 1) {	
				deck = 4;
			    }
				return deck;
			}
	
	
	
	
}
