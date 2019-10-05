package islands;
import java.util.ArrayList; 
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane; 
  
public class ProxyCyberCafe implements CyberCafe 
{ 
    private CyberCafe cyberCafe = new CyberCafeofIsland(); 
    private static List<String> SoftwareEngineersID; 
      
    static
    { 
    	SoftwareEngineersID = new ArrayList<String>(); 
    	SoftwareEngineersID.add("SE1289"); 
    	SoftwareEngineersID.add("SE1290"); 
    	SoftwareEngineersID.add("SE1291"); 
    	SoftwareEngineersID.add("SE1292"); 
    } 
      
	public void sendMessage(String personID) {
		
		if(!(SoftwareEngineersID.contains(personID))) 
        { 
            JFrame f=new JFrame();
			JOptionPane.showMessageDialog(f,"Can't send or receive message"); 
			//throw new Exception("Can't send or receive message"); 
        } 
          
		else
			cyberCafe.sendMessage(personID); 
		
	}
 
	public void receiveMessage(String personID)  {
		 
		
	}

 
  
} 

