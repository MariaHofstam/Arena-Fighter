package lexicon.se.maria.Arena_fighter;

import lexicon.se.maria.randomgenerator.RandomNumberGenerator;

/**************************************************
 *                                                
 * Round – one round of dice rolling;             
 * should correspond to a post in the battle log  
 *                                                
 **************************************************/

public class Round {
	
	//Constructors
	public Round() {	
	}
	
	int DicePlayer, DiceOpponent;
	int newPlayerStrength, newOpponentStrength;
	String result;
	Gladiator player, opponent;
	
	//Methods
	
	public int rollDice(){
		System.out.println("\nRoll the dice...");
		RandomNumberGenerator rng = RandomNumberGenerator.getInstance();
		int D6 = (rng.getRandomIntBetween(1, 6));
		return D6;
	}
	
	public String calculateWinner(Gladiator player, Gladiator opponent) {
		if (newPlayerStrength > newOpponentStrength) {
			System.out.println("\nWinner is: " + player.getFullName());
			result = player.getFullName();
			
			//Player Gladiator knocks opponent Gladiator
			DicePlayer = rollDice();		//How hard is the punch?
			System.out.println(player.getFullName() + " knocks " + opponent.getFullName() + " with a strength of " + DicePlayer);
			int opponentHealth = opponent.getHealth() - DicePlayer;
			opponent.setHealth(opponentHealth);
			if (opponentHealth <= 0) {
				opponent.setAlive(false);
				System.out.println(opponent.getFullName() + " is dead");
			}
		}else if(newPlayerStrength < newOpponentStrength){
			System.out.println("\nWinner is: " + opponent.getFullName());
			result = opponent.getFullName();
			
			//Opponent Gladiator knocks player Gladiator
			DiceOpponent = rollDice();		//How hard is the punch?
			System.out.println(opponent.getFullName() + " knocks " + player.getFullName() + " with a strength of " + DiceOpponent);
			
			int playerHealth = player.getHealth() - DicePlayer;
			player.setHealth(playerHealth);
			if (playerHealth <= 0) {
				player.setAlive(false);
				System.out.println(player.getFullName() + " is dead");
			}
		}else {
			System.out.println("\nNo winner - the results are equal");
			result = "No winner";
		}
		return result;
	}
	
	

	public String getResult(int roundNumber, Gladiator player, Gladiator opponent) {
		
		// Printing out each gladiators strength before the fight
		
		System.out.println("\nRound: " + (roundNumber) + "\tStrength before the fight\n" 
				 + "******************************************\n" 
				 + player.getFullName() + "\tStrengt: " + player.getStrength() + "\n" 
				 + opponent.getFullName() + "\tStrengt: " + opponent.getStrength());
		
		
		// ******************* The fight - Rolling the dices ************************
		
		DicePlayer = rollDice();				// Player rolls the dice
		System.out.println(player.getFullName() + " gets the value of: " + DicePlayer);
		newPlayerStrength = player.getStrength() + DicePlayer;
		
		DiceOpponent = rollDice();				// Opponent rolls the dice
		System.out.println(opponent.getFullName() + " gets the value of: " + DiceOpponent);
		newOpponentStrength = opponent.getStrength() + DiceOpponent;
		
		// ************************* The fight ended ********************************

		// Printing out each gladiators strength after the fight
		
		System.out.println("\nResult round: " + roundNumber + " - Strength after the dice roll "
							+"\n***********************************************\n" 
							+ player.getFullName() + " New Strength: " + newPlayerStrength + "\n" 
							+ opponent.getFullName() + " New Strength: " + newOpponentStrength);
		
		//Calculating who is the winner
		result = calculateWinner(player, opponent);
		
	return result;
	}

	
}
