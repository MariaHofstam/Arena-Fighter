package lexicon.se.maria.Arena_fighter;

/*****************************************************
 * Character – for both the player and the opponents *
 *****************************************************/

public class Gladiator {
	//Fields
	
	private String fullName;
	private int strength;
	private int levelOfDamage;
	private boolean alive;
	
	//Constructor
	
	public Gladiator(String fullName, int strength, int levelOfDamage, boolean alive) {

		this.fullName = fullName;
		this.strength = strength;
		this.levelOfDamage = levelOfDamage;
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

	public int getLevelOfDamage() {
		return levelOfDamage;
	}

	public void setLevelOfDamage(int levelOfDamage) {
		this.levelOfDamage = levelOfDamage;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	
	
	//Methods

}
