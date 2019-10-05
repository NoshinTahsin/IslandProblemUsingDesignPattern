package islands;

public class Island2 implements StructureDecider {

private IslandStructure island2;
	
	public Island2() {
		
		this.island2=new IslandStructure();
	}
	
	public void decideFlora() {
		island2.setFlora("Mediterranean Flora");
	}

	public void decideFauna() {
		island2.setFauna("Mediterranean Fauna");
	}

	public void decideEnvironment() {
		island2.setEnvironment("Mediterranean");
	}

	public void decideHut() {
		island2.setHut("Earth Lodge");
	}

	public IslandStructure getIsland() {
		return this.island2;
	}
}
