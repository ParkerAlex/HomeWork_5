package eu.senla.homework_5;

public class Main {
	
	public static void main(String[] args) {
		
		//	Container container = new Cylinder();
		//		Container container = new Cone();
		
				Container container = new Box();
		        System.out.println(container.Volume());
		        
		        Port port = new Port();
		        
		        int[] ship = port.getShip();
		        int i = port.getI();
		      
		        
				for(i = 0; i < ship.length; i++){  
				   			  		      
					System.out.println(ship[i]);
			   }
 
	}

}
