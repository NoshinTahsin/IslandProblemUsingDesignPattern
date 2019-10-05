package islands;

import java.awt.event.*;

import javax.swing.*;

public class PriestTest extends WindowAdapter{
	
	Priest priest = new Priest(); 
    Couples couple = new Couples();
    JFrame f=new JFrame("Meet the priest");  
    
	PriestTest()
	{ 
			JButton MakeVow=new JButton("Make a vow");
			JButton BreakVow=new JButton("Break the vow");
			
			MakeVow.setBounds(50,200,130,40);  
			MakeVow.addActionListener(new ActionListener(){  
				public void actionPerformed(ActionEvent e){  
		           
					 priest.setCommand(new TakeVowCommand(couple)); 
					 priest.PriestMadeVow(); 
		        }  
		    });  
			
			f.addWindowListener(this);  
		    
		    BreakVow.setBounds(200,200,130,40);  
			
		    BreakVow.addActionListener(new ActionListener(){  
				public void actionPerformed(ActionEvent e){  
					
					 priest.setCommand(new
				                BreakTheVowCommand(couple)); 
				     priest.PriestMadeVow(); 
				        
		        }  
		    });  
			 
			f.add(MakeVow); 
		    f.add(BreakVow);
		    
		    f.setSize(400,400);  
		    f.setLayout(null);    
		      
		    f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);  
		    f.setVisible(true); 
		 
	}
	
	  
   	  public void windowClosing(WindowEvent e)
   	  {  
   		  int a=JOptionPane.showConfirmDialog(f,"Are you sure?");  
   		  if(a==JOptionPane.YES_OPTION){  
   			  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
   	  }  
   	  }  
	 
	public static void PriestMain()
    { 
       
		new PriestTest();
         
     } 

}
