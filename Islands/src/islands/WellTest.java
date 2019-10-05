package islands;

import java.util.LinkedList;

import javax.swing.*;

public class WellTest {
	
	public static void WellMain() {
		
		JFrame f=new JFrame();
		boolean loop=true;
		
		while(loop)
			{
			Singleton newInstance = Singleton.getInstance();
	 
		//progressbar e length
		System.out.println(newInstance.getWaterList());
		
		int length=newInstance.getWaterList().size();
		
		if(length>8)
		{
			//Insert 7 from field
			LinkedList<String> fetchWaterInhabitant = newInstance.getWater(7);
		 
			//System.out.println(newInstance.getLetterList());
			length=newInstance.getWaterList().size();
			 JOptionPane.showMessageDialog(f,"Water remaining "+length+" unit");  
		}
		
		else
		{
			loop=false;
			//System.out.println("Praying for rain");
			 JOptionPane.showMessageDialog(f,"Praying for rain");  
		}
	}
		
	}
	
}