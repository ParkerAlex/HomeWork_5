package eu.senla.homework_5;

public class Cone implements Container{
	
	    int coneFlag = 0;
	    int coneFlag_2 = 0;
	    int coneHigh = 20;
	
	double coneMassa = 0;
	
	@Override
	public double Volume() {
		
		 if (coneHigh < 100 && coneHigh > 10 && coneFlag == 0 && coneFlag_2 == 0) {
			 coneMassa = (coneHigh /3) * 3.1415 * (SmallD / 2) * (SmallD / 2) * Density_1;
		 }
		 else if (coneHigh < 100 && coneHigh > 10 && coneFlag == 1 && coneFlag_2 == 0) {
			 coneMassa = (coneHigh /3) * 3.1415 * (SmallD / 2) * (SmallD / 2) * Density_2;
		 }
		 else if (coneHigh < 100 && coneHigh > 10 && coneFlag == 0 && coneFlag_2 == 1) {
			 coneMassa = (coneHigh /3) * 3.1415 * (BigD / 2) * (BigD / 2) * Density_1;
		 }
		 else if (coneHigh < 100 && coneHigh > 10 && coneFlag == 0 && coneFlag_2 == 1) {
			 coneMassa = (coneHigh /3) * 3.1415 * (BigD / 2) * (BigD / 2) * Density_2;
		 }
		return coneMassa;
		 
		 
	}

	



}
