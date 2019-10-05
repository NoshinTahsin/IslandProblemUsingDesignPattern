package islands;

public class Priest {
	
	CoupleCommand vow;   
	  
    public Priest() 
    { 
    } 
  
    public void setCommand(CoupleCommand command) 
    { 
        vow = command; 
    } 
  
    public void PriestMadeVow() 
    { 
        vow.execute(); 
    } 

}
