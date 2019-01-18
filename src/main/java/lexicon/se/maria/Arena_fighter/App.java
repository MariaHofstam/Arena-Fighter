package lexicon.se.maria.Arena_fighter;

import java.util.Scanner;

import lexicon.se.maria.randomgenerator.RandomNumberGenerator;

/*******************
 *                 *
 * Arena Fighter!  *
 *                 *
 ******************/

public class App {
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static boolean menu () {								//method menu
		boolean valid = false;
		String answer = getStringFromUser();
		valid = playing(answer);	
		return valid;
	}
	
	public static boolean playing(String answer) {				//method Y/N
		String upperCaseString = answer.toUpperCase();			//String to Upper Case
		switch(upperCaseString) {
			case "Y":
				return true;
			default:
				return false;
		}
	}	
	
	private static String getStringFromUser() {					//method getStringFromUser	
		String text = scanner.nextLine();
		
		//Maybe do a control here for checking if you got a name or just an Enter, tab etc.
		//Not so importent for now, according to Erik.
		
		return text;
	}
	
	private static int getIntFromUser() {						//method getIntFromUser
		
		boolean valid = false;
		int number = 0;
		while(!valid) {
			try {
				number = Integer.parseInt(getStringFromUser());
				valid = true;				
			}catch(NumberFormatException e) {
				System.out.println("Input was not a number");
			}
		}
		return number;
	}
	
	
	
//****************************** MAIN *************************************
	
    public static void main( String[] args ){
    	boolean valid;
    	String nameOfPlayer;
  
    	
    	System.out.println("****************************************\n"
    					 + "*   Arena Fighter - a Gladiator game   *\n"
    					 + "****************************************\n");
    	
		System.out.println("Do you want to play? Y/N ");
		valid = menu();
		
		if (valid) {					//Player wants to play
			
			//Declaration of Players own Gladiator
			
			System.out.println("You will now create your own gladiator ");
			Gladiator player = new Gladiator ();
			player.setHealth(10);
	    	player.setAlive(true);
			
			System.out.println("Enter your Gladiators Full Name");	
			nameOfPlayer = getStringFromUser();
			player.setFullName(nameOfPlayer);
			
			System.out.println("Enter your Gladiators Strength (1-6)");	
			player.setStrength(getIntFromUser());
	    	System.out.println("Player: \t Name: "+ player.getFullName() + " \t Strength: "+ player.getStrength() + "\n");
	    	do {		//Creating and setting the states of a battle
	    		
	    		Battle battle = new Battle();
	    		battle.printGladiators();
	    		battle.setPlayer(player);
	    		
	    		battle.chooseOpponent();		//randomized choice of opponent
	    		
	    		String[] log = new String [11];
	    		battle.setLog(log);
	    	
	    		System.out.println("Battle: " + battle.getPlayerName() + " versus " + battle.getOpponentName() + "\n");
	    		battle.startBattle();			//Start Battle
	    		
	    	}while (player.isAlive());
		}else {							//Player do NOT want to play
			System.out.println("Welcome back!"); 				
		}
		
	}
}

