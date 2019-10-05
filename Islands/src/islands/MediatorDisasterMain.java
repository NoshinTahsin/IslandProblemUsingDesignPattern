package islands;

public class MediatorDisasterMain {
	 
	public static void disaster_main()  
	    { 
	  
	        IDisasterMediator disasterMediator = new DisasterMediator(); 
	        Inhabitant inhabitant1 = new Inhabitant(disasterMediator); 
	        
	        Disaster disaster1 = new Disaster(disasterMediator); 
	        
	        disasterMediator.informInhabitants(inhabitant1); 
	        disasterMediator.informAboutDisaster(disaster1); 
	        
	        //inhabitant1.getPrepared(); 
	        //disaster1.move(); 
	        inhabitant1.move(); 
	          
	    } 


}
