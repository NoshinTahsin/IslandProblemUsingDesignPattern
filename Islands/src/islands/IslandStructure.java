package islands;

public class IslandStructure implements IslandPlan {
	
	private String Flora;
	private String Fauna;
	private String Environment;
	private String Hut;
	
	public void setFlora(String Flora) {
		this.Flora=Flora;
	}
	
	public String getFlora() { return Flora; }

	public void setFauna(String Fauna) {
		this.Fauna=Fauna;
	}
	
	public String getFauna() { return Fauna; }

	public void setEnvironment(String Environment) {
		this.Environment=Environment;
	}
	
	public String getEnvironment() { return Environment; }

	public void setHut(String Hut) {
		this.Hut=Hut;
	}
	
	public String getHut() { return Hut; }

}

