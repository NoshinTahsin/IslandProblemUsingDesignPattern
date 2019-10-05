package islands;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Singleton {
	
	private static Singleton firstInstance = null;
	
	String[] waterUnit = {"1", "1", "1", "1","1", "1","1", "1",
			"1", "1","1", "1","1", "1",
			"1", "1","1", "1","1", "1",
			"1", "1","1", "1","1", "1",
			"1", "1",};  
	
	private LinkedList<String> waterList = new LinkedList<String> (Arrays.asList(waterUnit));
   
     
	static boolean firstThread = true;
	 
	private Singleton() { }
	 
	public static Singleton getInstance() {
		if(firstInstance == null) {
		  
			if(firstThread){
			
				firstThread = false;
				
				try {
					Thread.currentThread();
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				
					e.printStackTrace();
				}
			}
		 
			synchronized(Singleton.class){ 
			
				if(firstInstance == null) {
				 
					firstInstance = new Singleton();
			 
					Collections.shuffle(firstInstance.waterList);
					
				}
			
			}
			
		}
	 
		return firstInstance;
	}
	
	public LinkedList<String> getWaterList(){
		
		return firstInstance.waterList;
		
	}
	
	public LinkedList<String> getWater(int numberOfUnits){
	 
		LinkedList<String> waterToTake = new LinkedList<String>();
		
		 
		for(int i = 0; i <= numberOfUnits; i++){
		
			waterToTake.add(firstInstance.waterList.remove(0));
		
		}
	 
		return waterToTake;
		
	}
	
}