package eu.senla.homework_5;

import java.util.Arrays;

public class Port {
	
	int i = 0;
	int n = 10;
	int[] ship = new int [n];

	public int ship() {
		 
		 for(int i = 0; i < ship.length; i++){	 
			 ship[i] = i + 1;                     //(int) (Math.random() * ship.length + 1);	 
		 }
	
			return ship[i];
	 }
	
	//////////////////////////////////////////////////

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int[] getShip() {
		return ship;
	}

	public void setShip(int[] ship) {
		this.ship = ship;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
	
}
