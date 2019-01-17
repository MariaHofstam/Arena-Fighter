package lexicon.se.maria.Arena_fighter;

/*****************************************************
 * Character – for both the player and the opponents *
 *****************************************************/

public class Gladiator {
	//Fields
	
	private String fullName;
	private int strength;
	private int health;
	private boolean alive;
	
	//Constructor
	
	public Gladiator(String fullName, int strength, int health, boolean alive) {
		
		this.fullName = fullName;
		this.strength = strength;
		this.health = health;
		this.alive = alive;
	}
	
	public Gladiator(String fullName, int strength, boolean alive) {
		
		this.fullName = fullName;
		this.strength = strength;
		this.alive = alive;
	}
	
	public Gladiator () {}

	//Getters and setters
	
	
	
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	
	
	//Methods
	

}
