package eu.senla.homework_5;

public interface Container {

	    final static int Density_1 = 1000;    // flag == 0  плотность воды
	    final static int Density_2 = 2000;    // flag == 1  плотность воды
	    
	    final static int SmallD = 10;         // flag_2 == 0
	    final static int BigD = 20;           // flag_2 == 1
	    
	   
	     
	double Volume();
	 
	 
//	Container container_2 = new Cylinder();
//	Container container_3 = new Cone();
//	  double container = container_2.Volume() + container_3.Volume();

	
}
