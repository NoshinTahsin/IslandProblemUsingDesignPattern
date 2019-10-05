package islands;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;

public class Couples extends WindowAdapter {
	
	JFrame f=new JFrame();
	
	Couples()
	{
		
		 f.addWindowListener((WindowListener) this);  
		 f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	}
	
	public void takeVow() 
    { 
		JOptionPane.showMessageDialog(f,"Taken the vow");
        //System.out.println("Taken the vow"); 
    } 
    public void breakVow() 
    { 
    	JOptionPane.showMessageDialog(f,"Broken the vow");
    	//System.out.println("Broken the vow"); 
    } 
    
    public void windowClosing(WindowEvent e)
 	  {  
 		  int a=JOptionPane.showConfirmDialog(f,"Are you sure?");  
 		  if(a==JOptionPane.YES_OPTION){  
 			  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
 	  }  }
 		  
 		 public static void CoupleMain()
 	    { 
 	       
 			new Couples();
  
 	         
 	     } 
}
