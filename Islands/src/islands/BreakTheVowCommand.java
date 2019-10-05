package islands;

public class BreakTheVowCommand implements CoupleCommand {
	
	Couples couple; 
	 
    public BreakTheVowCommand(Couples couple) 
    { 
       this.couple = couple; 
    } 
    public void execute() 
    { 
       couple.breakVow(); 
    } 
}
