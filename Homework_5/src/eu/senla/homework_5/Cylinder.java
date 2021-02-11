package eu.senla.homework_5;

public class Cylinder implements Container {
	
	    int cylinderFlag = 0;
	    int cylinderFlag_2 = 0;
	    int cylinderHigh = 40;
	    
	    double cylinderMassa = 0;
	    
	@Override
	public double Volume() {
		

		 if (cylinderHigh < 100 && cylinderHigh > 10 && cylinderFlag == 0 && cylinderFlag_2 == 0) {
			 cylinderMassa = 3.1415 *  SmallD / 2 *  SmallD / 2 * cylinderHigh *  Density_1;
		 }
		 else if (cylinderHigh < 100 && cylinderHigh > 10 && cylinderFlag == 1 && cylinderFlag_2 == 0) {
			 cylinderMassa = 3.1415 *  SmallD / 2 *  SmallD / 2 * cylinderHigh *  Density_2;
		 }
		 else if (cylinderHigh < 100 && cylinderHigh > 10 && cylinderFlag == 0 && cylinderFlag_2 == 1) {
			 cylinderMassa = 3.1415 *  BigD / 2 *  BigD / 2 * cylinderHigh *  Density_1;
		 }
		 else if (cylinderHigh < 100 && cylinderHigh > 10 && cylinderFlag == 0 && cylinderFlag_2 == 1) {
			 cylinderMassa = 3.1415 *  BigD / 2 * BigD / 2 * cylinderHigh *  Density_2;
		 }
		return cylinderMassa;
	
	}





	
}


