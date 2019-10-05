package islands;

public class Island1 implements StructureDecider {
	
	private IslandStructure island1;
	
	public Island1() {
		
		this.island1=new IslandStructure();
	}
	
	public void decideFlora() {
		island1.setFlora("Tropical Flora");
	}

	public void decideFauna() {
		island1.setFauna("Tropical Fauna");
	}

	public void decideEnvironment() {
		island1.setEnvironment("Tropical");
	}

	public void decideHut() {
		island1.setHut("Cabana");
	}

	public IslandStructure getIsland() {
		return this.island1;
	}

}
