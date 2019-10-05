package islands;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.*;

public class GetWater extends JFrame implements Runnable {
	 
	JFrame f=new JFrame();
     
	public void run(){
 
			Singleton newInstance = Singleton.getInstance();
			 
			//ProgressBar=letterList er length
			int progressLength=newInstance.getWaterList().size();
			//jb.setValue(progressLength);  
			
			//Take input 7 from input field
			
			LinkedList<String> fetchWaterInhabitant = newInstance.getWater(7);  
				        	    
			JOptionPane.showMessageDialog(f,"Got water");  
				        
	}
	
}