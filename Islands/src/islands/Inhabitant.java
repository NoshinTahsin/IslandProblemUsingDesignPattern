package islands;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Inhabitant implements DisasterManagementCommand{
	
	private IDisasterMediator idisasterMediator; 
	  
    public Inhabitant(IDisasterMediator idisasterMediator)  
    { 
        this.idisasterMediator = idisasterMediator; 
    } 
  
    public void move()  
    { 
        if (idisasterMediator.shouldMoveToShelter())  
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
    	
            //System.out.println("Quickly move to shelter nearby."); 
            idisasterMediator.setMoveToShelterStatus(true); 
        } 
        else {
        	JFrame frame = new JFrame("Disaster Center");  
            JPanel panel = new JPanel();  
            panel.setLayout(new FlowLayout());  
             
            JLabel label2 = new JLabel("Not necessary to move, No risk!");
            
            panel.add(label2);
            
            frame.add(panel);  
            frame.setSize(500, 300);  
            frame.setLocationRelativeTo(null);  
          //  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
            frame.setVisible(true);  
    	
            //System.out.println("Quickly move to shelter nearby."); 
            idisasterMediator.setMoveToShelterStatus(true); 
        }
            //System.out.println("Not necessary to move, No risk!"); 
    } 
  
    public void getPrepared()  
    { 
    	JFrame frame = new JFrame("Disaster Center");  
        JPanel panel = new JPanel();  
        panel.setLayout(new FlowLayout());  
         
        JLabel label2 = new JLabel("Disaster is coming.");
         
        panel.add(label2);
         
        frame.add(panel);  
        frame.setSize(175, 300);  
        frame.setLocationRelativeTo(null);  
       // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setVisible(true);  
	
        //System.out.println("Disaster is coming."); 
    } 
  
}
