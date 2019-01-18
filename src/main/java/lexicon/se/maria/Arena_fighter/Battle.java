package lexicon.se.maria.Arena_fighter;

import lexicon.se.maria.randomgenerator.RandomNumberGenerator;

/******************************************
 * Battle – for the battle itself,        
 * should contain the log of the battle,  
 * as well as references to both the      
 * player and the opponent                
 * 
 * ****************************************/

public class Battle {
	//Fields
	
	private Gladiator player;
	private Gladiator opponent;
	private String log [];
	private int roundNumber = 0;
	
	//Constructors
	
	public Battle () {}
	
	public Battle(Gladiator player, Gladiator opponent) {
		this.player = player;
		this.opponent = opponent;
		this.log = new String [11];
	}
	
	//Declaration of local variables
	int D6;
	String winner;
	
	//Declaration of Gladiators
	
	Gladiator titan = new Gladiator("Titan", 6, 10, true);
	Gladiator omnius = new Gladiator("Omnius", 4, 5, true);
	Gladiator homerus = new Gladiator("Homerus", 5, 7, true);
	Gladiator hercules = new Gladiator("Hercules", 6, 6, true);
	Gladiator atlas = new Gladiator("Atlas", 5, 8, true);
	Gladiator gladius = new Gladiator("Gladius", 4, 4, true);

	

	//Methods
	
	public void printGladiators() {
		System.out.println("Your opponents:");
		System.out.println("Gladiator: \t Name: "+ titan.getFullName() + " \t Strength: "+ titan.getStrength());
		System.out.println("Gladiator: \t Name: "+ omnius.getFullName() + " \t Strength: "+ omnius.getStrength());
		System.out.println("Gladiator: \t Name: "+ homerus.getFullName() + " \t Strength: "+ homerus.getStrength());
		System.out.println("Gladiator: \t Name: "+ hercules.getFullName() + "  Strength: "+ hercules.getStrength());
		System.out.println("Gladiator: \t Name: "+ atlas.getFullName() + " \t Strength: "+ atlas.getStrength());
		System.out.println("Gladiator: \t Name: "+ gladius.getFullName() + " \t Strength: "+ gladius.getStrength() + "\n");
		return;
	}
	
	public void chooseOpponent(){
		RandomNumberGenerator rng = RandomNumberGenerator.getInstance();
		
		D6 = (rng.getRandomIntBetween(1, 6));
		
			if (D6 == 1) {
				setOpponent(titan);
			}else if (D6 ==2) {
				setOpponent(omnius);
			}else if (D6 ==3) {
				setOpponent(homerus);
			}else if (D6 ==4) {
				setOpponent(hercules);
			}else if (D6 ==5) {
				setOpponent(atlas);
			}else if (D6 ==6) {
				setOpponent(gladius);
			}
		
		return;
	}
	
	
	
	public void startBattle() {
		do {
			log[roundNumber] = new Round().getResult((roundNumber + 1), player, opponent);
			//System.out.println(log[roundNumber]);
			roundNumber ++;
		}while(player.isAlive() && opponent.isAlive() && roundNumber < 10);		
		System.out.println("\nResult:");
		for (int i = 0; i < roundNumber; i++){
			System.out.println("Round " + (i+1) + ":" + log[i]);
			}
		}
	
	//Getters and setters
	

		public String getPlayerName () {
			return player.getFullName();
		}
		
		public String getOpponentName () {
			return opponent.getFullName();
		}
		
		
		public int getPlayerStrength () {
			return player.getStrength();
		}
		
		public int getOpponentStrength () {
			return opponent.getStrength();
		}
		
		
		public Gladiator getPlayer() {
			return player;
		}

		public void setPlayer(Gladiator player) {
			this.player = player;
		}

		
		public Gladiator getOpponent() {
			return opponent;
		}

		public void setOpponent(Gladiator opponent) {
			this.opponent = opponent;
		}

		public String[] getLog() {
			return log;
		}

		public void setLog(String[] log) {
			this.log = log;
		}

		
}
