package eu.senla.homework_5;

public class Box implements Container{
	
	int boxFlag = 0;
    int boxFlag_2 = 0;
    int boxHigh = 11;

double boxMassa = 0;
	

	@Override
	public double Volume() {

	
		 if (boxHigh < 100 && boxHigh > 10 && boxFlag == 0 && boxFlag_2 == 0) {
			 boxMassa = (SmallD / Math.sqrt(2)) * (SmallD / Math.sqrt(2)) * boxHigh * Density_1;
		 }
		 else if (boxHigh < 100 && boxHigh > 10 && boxFlag == 1 && boxFlag_2 == 0) {
			 boxMassa = (SmallD / Math.sqrt(2)) * (SmallD / Math.sqrt(2)) * boxHigh * Density_2;
		 }
		 else if (boxHigh < 100 && boxHigh > 10 && boxFlag == 0 && boxFlag_2 == 1) {
			 boxMassa = (BigD / Math.sqrt(2)) * (BigD / Math.sqrt(2)) * boxHigh * Density_1;
		 }
		 else if (boxHigh < 100 && boxHigh > 10 && boxFlag == 0 && boxFlag_2 == 1) {
			 boxMassa = (BigD / Math.sqrt(2)) * (BigD / Math.sqrt(2)) * boxHigh * Density_2;
		 }
		return boxMassa;

		
}
}
