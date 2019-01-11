package lexicon.se.maria.Arena_fighter;

/**************************************************
 *                                                
 * Round – one round of dice rolling;             
 * should correspond to a post in the battle log  
 * Ronderna fortsätter tills någon är död
 * 
 * Ronden håller reda på spelarna, vem som vinner/
 * förlorar, vem som tilldelats skada etc.
 *                                                
 **************************************************/

public class Round {
	//Fields
	private String log[];

	
	//Constructors
	public Round() {};
	
	public Round(String[] log) {
		this.log = log;
	}

	
	//Getters and setters
	public String[] getLog() {
		return log;
	}

	public void setLog(String[] log) {
		this.log = log;
	}
	
	
	
		
	//Methods


}
