package lexicon.se.maria.Arena_fighter;

import lexicon.se.maria.randomgenerator.RandomNumberGenerator;

/**************************************************
 *                                                
 * Round – one round of dice rolling;             
 * should correspond to a post in the battle log  
 *                                                
 **************************************************/

public class Round {
	//Fields
	private String winner;

	
	//Constructors
	public Round() {
		this.winner = "";
	}
	
	
	int newPlayerStrength, newOpponentStrength;
	Gladiator player, opponent;
	
	//Methods
	
	public int rollDice(){
		System.out.println("\nRoll the dice...");
		RandomNumberGenerator rng = RandomNumberGenerator.getInstance();
		int D6 = (rng.getRandomIntBetween(1, 6));
		return D6;
	}
	
	public String calculateWinner(int newPlayerStrength, int newOpponentStrength) {
		if (newPlayerStrength > newOpponentStrength) {
			//System.out.println("\nWinner is: " + player.getFullName());
			this.winner = player.getFullName();
		
		}else if(newPlayerStrength < newOpponentStrength){
			//System.out.println("\nWinner is: " + opponent.getFullName());
			this.winner = opponent.getFullName();
		}else {
			
			//System.out.println("\nNo winner - the results are equal");
			this.winner = "No winner";
		}
		return this.winner;
	}

	public String getResult(int roundNumber, Gladiator player, Gladiator opponent) {
		
		// Printing out each gladiators strength before the fight
		
		System.out.println("Round: " + (roundNumber) + "\tStrength before the fight\n" 
				 + "******************************************\n" 
				 + player.getFullName() + "\tStrengt: " + player.getStrength() + "\n" 
				 + opponent.getFullName() + "\tStrengt: " + opponent.getStrength());
		
		
		// ******************* The fight - Rolling the dices ************************
		
		int DicePlayer = rollDice();				// Player rolls the dice
		System.out.println(player.getFullName() + " gets the value of: " + DicePlayer);
		newPlayerStrength = player.getStrength() + DicePlayer;
		
		int DiceOpponent = rollDice();				// Opponent rolls the dice
		System.out.println(opponent.getFullName() + " gets the value of: " + DiceOpponent);
		newOpponentStrength = opponent.getStrength() + DiceOpponent;
		
		// ************************* The fight ended ********************************

		// Printing out each gladiators strength after the fight
		
		System.out.println("\nResult round: \n*********************\n" 
							+ player.getFullName() + " New Strength: " + newPlayerStrength + "\n" 
							+ opponent.getFullName() + " New Strength: " + newOpponentStrength);
		
		//Calculating who is the winner
		calculateWinner(newPlayerStrength, newOpponentStrength);
		
		return calculateWinner(newPlayerStrength, newOpponentStrength);
	}

	
	
}
