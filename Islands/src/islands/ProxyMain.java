package islands;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.*;

public class ProxyMain {
 
	public static void proxy_main () 
	{ 
		CyberCafe cyberCafe = new ProxyCyberCafe(); 
		
		//jpasswordfield
		/*System.out.println("\nEnter your password here: ");
		 
		Scanner input = new Scanner(System.in);
		String personID=input.nextLine();*/
		
		 JFrame f=new JFrame("Cyber Cafe");    
		  
	     final JPasswordField value = new JPasswordField();   
	     value.setBounds(100,75,100,30);   
	          
	        JLabel l2=new JLabel("Password:");    
	        l2.setBounds(20,75, 80,30); 
	        
	        JButton b = new JButton("Login");  
	        b.setBounds(100,120, 80,30);  
	        
	        //final JTextField text = new JTextField();  
	        //text.setBounds(100,20, 100,30);    
	               
	        f.add(value);   f.add(l2); f.add(b); 
	                f.setSize(300,300);    
	                f.setLayout(null);    
	                f.setVisible(true);     
	                
	                b.addActionListener(new ActionListener() {  
	                  
					@Override
					public void actionPerformed(ActionEvent arg0) {
						 String  personID = new String(value.getPassword());  
						 cyberCafe.sendMessage(personID); 
							cyberCafe.receiveMessage(personID); 
						
					}  
	             });   
		
		 
		} 
		 
	} 

