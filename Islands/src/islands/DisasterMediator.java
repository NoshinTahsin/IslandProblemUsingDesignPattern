package islands;

public class DisasterMediator implements IDisasterMediator {
	
	 	private Inhabitant inhabitant; 
	    private Disaster disaster; 
	    public boolean moveToShelter; 
	  
	    public void informAboutDisaster(Disaster disaster)  
	    { 
	        this.disaster = disaster; 
	    } 
	  
	    public void informInhabitants(Inhabitant inhabitant)  
	    { 
	        this.inhabitant = inhabitant; 
	    } 
	  
	    public boolean shouldMoveToShelter()  
	    { 
	        return moveToShelter; 
	    } 
	  
	    public void setMoveToShelterStatus(boolean status)  
	    { 
	        moveToShelter = status; 
	    } 

}

