package islands;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;  

public class TestMain extends Canvas {

	JMenu menu;  
    JMenuItem Explore_Island, Get_Water, Disaster_Center, Visit_Cyber_Cafe,Meet_the_Priest;
    boolean proceed;
    
    TestMain(){   
    JFrame f= new JFrame("Explore Island");  
    JMenuBar mb=new JMenuBar();  
    menu=new JMenu("Menu");
    
    
    Explore_Island=new JMenuItem("Explore_Island");  
    Get_Water=new JMenuItem("Get_Water");  
    Disaster_Center=new JMenuItem("Disaster_Center");  
    Visit_Cyber_Cafe=new JMenuItem("Visit_Cyber_Cafe");
    Meet_the_Priest=new JMenuItem("Meet_the_Priest");
    
   /* Explore_Island.addActionListener((ActionListener) this);    
    Get_Water.addActionListener(this);    
    Disaster_Center.addActionListener(this);    
    Visit_Cyber_Cafe.addActionListener(this);*/  
    
    

    Explore_Island.addActionListener(new ActionListener(){  
		  public void actionPerformed(ActionEvent e){   
			 	 try{  
			 		 IslandDesignMain islandDesignMain =new IslandDesignMain();
			 		 //proceed= islandDesignMain.IslandMain();
			  		}catch(Exception ex){System.out.println(ex);}  
		          } 
		  
		      });  
    
    Get_Water.addActionListener(new ActionListener(){  
		  public void actionPerformed(ActionEvent e){   
			 	 try{  
			 		WellTest well_test=new WellTest();
			 		well_test.WellMain();
					
			  		}catch(Exception ex){System.out.println(ex);}  
		          } 
		  
		      }); 
    
    Disaster_Center.addActionListener(new ActionListener(){  
		  public void actionPerformed(ActionEvent e){   
			 	 try{  
			 		MediatorDisasterMain medDisMain=new MediatorDisasterMain();
					medDisMain.disaster_main();
					
			  		}catch(Exception ex){System.out.println(ex);}  
		          } 
		  
		      });  
    
    Visit_Cyber_Cafe.addActionListener(new ActionListener(){  
		  public void actionPerformed(ActionEvent e){   
			 	 try{  
			 		ProxyMain cyberCafe=new ProxyMain();
					cyberCafe.proxy_main();
					
			  		}catch(Exception ex){System.out.println(ex);}  
		          } 
		  
		      });  
    
    Meet_the_Priest.addActionListener(new ActionListener(){  
		  public void actionPerformed(ActionEvent e){   
			 	 try{  
			 		PriestTest priest_test=new PriestTest();
			 		priest_test.PriestMain();
					
			  		}catch(Exception ex){System.out.println(ex);}  
		          } 
		  
		      });  
	  
	  
	
    menu.add(Explore_Island); menu.add(Get_Water); 
    menu.add(Disaster_Center);menu.add(Visit_Cyber_Cafe);
    menu.add(Meet_the_Priest);
    
    mb.add(menu);  
    
    f.setJMenuBar(mb);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);
   // f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    
	
	/*if(proceed)
	{
		ProxyMain cyberCafe=new ProxyMain();
		cyberCafe.proxy_main();
		
		MediatorDisasterMain medDisMain=new MediatorDisasterMain();
		medDisMain.disaster_main();
		
		 
		
		
	}*/
	
   }
    

   

public static void main(String[] args) {
	new TestMain();
}

}