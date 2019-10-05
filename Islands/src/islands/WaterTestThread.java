package islands;

public class WaterTestThread{
	
	public static void main(String[] args){
		 
		Runnable getWater = new GetWater();
				
		Runnable getWaterAgain = new GetWater();
		 
		new Thread(getWater).start();
		new Thread(getWaterAgain).start();
		
	}
	
}
