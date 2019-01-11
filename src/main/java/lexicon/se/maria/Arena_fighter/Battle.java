package lexicon.se.maria.Arena_fighter;

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
	private int roundnr;
	private String log [];
	
	//Constructors
	
	public Battle () {}
	
	public Battle(Gladiator player, Gladiator opponent) {
		this.player = player;
		this.opponent = opponent;
		this.log = new String [10];
	}

	public String getPlayerName () {
		return player.getFullName();
	}
	
	public String getOpponentName () {
		return opponent.getFullName();
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

	
	//Getters and setters
	
	
	
}
