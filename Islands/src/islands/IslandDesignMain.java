package islands;

import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
import javax.swing.*;

public class IslandDesignMain extends Canvas {

	JRadioButton rb1,rb2;    
	JButton b;
	JFrame f= new JFrame();  
	
	 
	IslandDesignMain(){      
		rb1=new JRadioButton("Island_1");    
		rb1.setBounds(100,50,100,30);      
		rb2=new JRadioButton("Island_2");    
		rb2.setBounds(100,100,100,30);   
		 
		ButtonGroup bg=new ButtonGroup();    
		bg.add(rb1);bg.add(rb2);    
		b=new JButton("Choose");    
		b.setBounds(100,150,80,30);    
		f.add(rb1);f.add(rb2);f.add(b);    
		f.setSize(300,300); 
		
		StructureDecider island1=new Island1();
		
		IslandDesigner islanddesigner= new IslandDesigner(island1);
		
		islanddesigner.buildIsland();
		
		IslandStructure island_1=islanddesigner.getIsland();
		
	 
		String flora="Flora: "+island_1.getFlora();
		String fauna="Fauna: "+island_1.getFauna();
		String environment="Environment: "+island_1.getEnvironment();
		String hut="Hut Structure: "+island_1.getHut();

		
		StructureDecider island2=new Island2();
		
		IslandDesigner islanddesigner2= new IslandDesigner(island2);
		
		islanddesigner2.buildIsland();
		
		IslandStructure island_2=islanddesigner2.getIsland();
		
	 
		String flora2="Flora: "+island_2.getFlora();
		String fauna2="Fauna: "+island_2.getFauna();
		String environment2="Environment: "+island_2.getEnvironment();
		String hut2="Hut Structure: "+island_2.getHut();
		
		
		
		b.addActionListener(new ActionListener(){  
			  public void actionPerformed(ActionEvent e){   
				   
					if(rb1.isSelected()){    
 
						 	JFrame frame = new JFrame("Island 1");  
					        JPanel panel = new JPanel();  
					        panel.setLayout(new FlowLayout());  
					       
					        JLabel label2 = new JLabel(flora);
					        JLabel label3 = new JLabel(fauna);
					        JLabel label4 = new JLabel(environment);
					        JLabel label5 = new JLabel(hut);
					       
					        panel.add(label2);
					        panel.add(label3);  
					        panel.add(label4);
					        panel.add(label5);
					         
					        frame.add(panel);  
					        frame.setSize(175, 300);  
					        frame.setLocationRelativeTo(null);  
					        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
					        frame.setVisible(true);  
						
						}    
					
						if(rb2.isSelected()){    
						  
							JFrame frame = new JFrame("Island 2");  
					        JPanel panel = new JPanel();  
					        panel.setLayout(new FlowLayout());  
					         
					        JLabel label2 = new JLabel(flora2);
					        JLabel label3 = new JLabel(fauna2);
					        JLabel label4 = new JLabel(environment2);
					        JLabel label5 = new JLabel(hut2);
					         
					        panel.add(label2);
					        panel.add(label3);  
					        panel.add(label4);
					        panel.add(label5);
					         
					        frame.add(panel);  
					        frame.setSize(225, 300);  
					        frame.setLocationRelativeTo(null);  
					        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
					        frame.setVisible(true);  
						
						}    
				  
			  }});  
		
		   
		f.setLayout(null);    
		f.setVisible(true);
		//f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    
	}
	
	
		
public static void IslandMain() {
	
	 	new IslandDesignMain();
	 	
	 	/*boolean toReturn=true;
		
		System.out.println("Which Island do you want to explore?");
		 
		Scanner input = new Scanner(System.in);
		String island_name=input.nextLine();
		
		if(island_name.equals("island1"))
		{
		StructureDecider island1=new Island1();
		
		IslandDesigner islanddesigner= new IslandDesigner(island1);
		
		islanddesigner.buildIsland();
		
		IslandStructure island_1=islanddesigner.getIsland();
		
		System.out.println("Structure of Island 1");
		System.out.println("");
		
		System.out.println("Flora: "+island_1.getFlora());
		System.out.println("Fauna: "+island_1.getFauna());
		System.out.println("Environment: "+island_1.getEnvironment());
		System.out.println("Hut Structure: "+island_1.getHut());
		
		
		
		System.out.println("");
		
		}
		
		else if(island_name.equals("island2"))
		{
		
		StructureDecider island2=new Island2();
		
		IslandDesigner islanddesigner2= new IslandDesigner(island2);
		
		islanddesigner2.buildIsland();
		
		IslandStructure island_2=islanddesigner2.getIsland();
		
		System.out.println("Structure of Island 2");
		System.out.println("");
		
		System.out.println("Flora: "+island_2.getFlora());
		System.out.println("Fauna: "+island_2.getFauna());
		System.out.println("Environment: "+island_2.getEnvironment());
		System.out.println("Hut Structure: "+island_2.getHut());
		
		
		}
		
		else
		{
			System.out.println("No such island exists");
			toReturn=false;
		}
		
		return toReturn;*/
			

	}
 
}
