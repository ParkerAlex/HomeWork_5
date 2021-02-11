package eu.senla.homework_5;

public class Ship {

	public int deck;
	public int deckFlag;
	
	 public int ship() {
			
			if (deckFlag == 0) {	
				deck = 1;
				}	
			if (deckFlag == 1) {	
				deck = 2;
			    }
				return deck;
			}
	

}
