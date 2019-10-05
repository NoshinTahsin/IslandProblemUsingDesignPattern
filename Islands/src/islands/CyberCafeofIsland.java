package islands;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CyberCafeofIsland implements CyberCafe{
	
	JFrame f=new JFrame();
	JFrame f2=new JFrame();
	
	public void sendMessage(String personID) 
    { 
		  
			JOptionPane.showMessageDialog(f,"Sending message");
			//System.out.println("Sending message by "+ personID); 
    } 
	
	public void receiveMessage(String personID) 
    { 
		JOptionPane.showMessageDialog(f2,"Receiving message");
    }
}
