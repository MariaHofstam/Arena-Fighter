package lexicon.se.maria.Arena_fighter;

import lexicon.se.maria.randomgenerator.RandomNumberGenerator;

/******************************************
 * Battle – for the battle itself,        
 * should contain the log of the battle,  
 * as well as references to both the      
 * player and the opponent                
 * 
 * Matchen skapar och loggar ronder, 
 * håller reda på hälsan och om spelarna 
 * fortfarande lever. Så länge gladiatorerna 
 * lever skapas nya ronder.
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
	
	Gladiator titan = new Gladiator("Titan", 6, 4, true);
	Gladiator omnius = new Gladiator("Omnius", 4, 3, true);
	Gladiator homerus = new Gladiator("Homerus", 5, 2, true);
	Gladiator hercules = new Gladiator("Hercules", 6, 5, true);
	Gladiator atlas = new Gladiator("Atlas", 5, 1, true);
	Gladiator gladius = new Gladiator("Gladius", 4, 6, true);

	

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
			System.out.println(log[roundNumber]);
			roundNumber ++;
		}while(player.isAlive() && opponent.isAlive() && roundNumber < 10);		
		
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

		
}
