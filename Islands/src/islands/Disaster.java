package islands;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Disaster implements DisasterManagementCommand{
	
	private IDisasterMediator disasterMediator; 
	  
    public Disaster(IDisasterMediator disasterMediator)  
    { 
        this.disasterMediator = disasterMediator; 
        disasterMediator.setMoveToShelterStatus(true); 
    } 
   
    public void move()  
    { 
    	JFrame frame = new JFrame("Disaster Center");  
        JPanel panel = new JPanel();  
        panel.setLayout(new FlowLayout());  
         
        JLabel label2 = new JLabel("Quickly move to shelter nearby");
         
        panel.add(label2);
      
        frame.add(panel);  
        frame.setSize(500, 300);  
        frame.setLocationRelativeTo(null);  
      //  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setVisible(true);  
	
    } 

}

