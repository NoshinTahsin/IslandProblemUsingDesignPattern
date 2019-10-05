package islands;

public class Couple {
	protected String Bride;
	protected String Bridegroom;
	protected int BrideID, BridegroomID;
	
	
	public Couple(int BrideID, int BridegroomID , String Bride, String Bridegroom) {
		this.BrideID = BrideID;
		this.BridegroomID = BridegroomID;
		this.Bride = Bride;
		this.Bridegroom = Bridegroom;
	}
	
	
	public int getBrideID() {
		return BrideID;
	}
	
	public int getBridegroomID() {
		return BridegroomID;
	}
	
	public String getBridegroom() {
		return Bridegroom;
	}

	public String getBride() {
		return Bride;
	}

	public void takeVow() {

		System.out.println("Taking vow of "+Bridegroom+" and "+Bride);
		
	}

}
