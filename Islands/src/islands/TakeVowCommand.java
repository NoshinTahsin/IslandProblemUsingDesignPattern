package islands;

public class TakeVowCommand implements CoupleCommand {
	
	Couples couple; 
	  
    public TakeVowCommand(Couples couple) 
    { 
       this.couple = couple; 
    } 
    public void execute() 
    { 
       couple.takeVow(); 
    } 

}
