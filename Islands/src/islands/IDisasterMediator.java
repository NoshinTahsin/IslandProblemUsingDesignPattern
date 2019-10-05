package islands;

public interface IDisasterMediator {
	
	public void informAboutDisaster(Disaster disaster); 
    
    public void informInhabitants(Inhabitant inhabitant); 
  
    public boolean shouldMoveToShelter(); 
  
    public void setMoveToShelterStatus(boolean status);
}
