package islands;

public class IslandDesigner {
	
	private StructureDecider structureDecider;
	
	public IslandDesigner(StructureDecider structureDecider)
	{
		this.structureDecider=structureDecider;
	}
	
	public IslandStructure getIsland()
	{
		return this.structureDecider.getIsland();
	}
	
	public void buildIsland()
	{
		this.structureDecider.decideFlora();
		this.structureDecider.decideFauna();
		this.structureDecider.decideEnvironment();
		this.structureDecider.decideHut();
		
	}

}
