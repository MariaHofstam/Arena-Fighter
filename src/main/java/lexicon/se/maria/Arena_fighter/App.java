package lexicon.se.maria.Arena_fighter;

import java.util.Scanner;

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
		//Kolla igenom inhämtningen från playern om jag kan förbättra den med ngn kontroll
		
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
    	
    	//Declaration of Gladiators
    	Gladiator titan = new Gladiator("Titan", 6, 0, true);
		Gladiator omnius = new Gladiator("Omnius", 4, 0, true);
		Gladiator homerus = new Gladiator("Homerus", 5, 0, true);
		Gladiator hercules = new Gladiator("Hercules", 6, 0, true);
		Gladiator atlas = new Gladiator("Atlas", 5, 0, true);
		Gladiator gladius = new Gladiator("Gladius", 4, 0, true);
		
		//Declaration of Players own Gladiator
		Gladiator player = new Gladiator ();
		player.setLevelOfDamage(0);
    	player.setAlive(true);
    	
    	
    	System.out.println("****************************************\n"
    					 + "*   Arena Fighter - a Gladiator game   *\n"
    					 + "****************************************\n");
    	
		System.out.println("Do you want to play? Y/N ");
		valid = menu();
		
		if (valid) {					//Player wants to play
			
			System.out.println("Your opponents:");
			System.out.println("Gladiator: \t Name: "+ titan.getFullName() + " \t Strength: "+ titan.getStrength());
			System.out.println("Gladiator: \t Name: "+ omnius.getFullName() + " \t Strength: "+ omnius.getStrength());
			System.out.println("Gladiator: \t Name: "+ homerus.getFullName() + " \t Strength: "+ homerus.getStrength());
			System.out.println("Gladiator: \t Name: "+ hercules.getFullName() + "  Strength: "+ hercules.getStrength());
			System.out.println("Gladiator: \t Name: "+ atlas.getFullName() + " \t Strength: "+ atlas.getStrength());
			System.out.println("Gladiator: \t Name: "+ gladius.getFullName() + " \t Strength: "+ gladius.getStrength() + "\n");
			
			System.out.println("You will now create your own gladiator ");
			System.out.println("Enter your Gladiators Full Name");	
			nameOfPlayer = getStringFromUser();
			player.setFullName(nameOfPlayer);
			
			System.out.println("Enter your Gladiators Strength");	
			player.setStrength(getIntFromUser());
	    	System.out.println("Player: \t Name: "+ player.getFullName() + " \t Strength: "+ player.getStrength() + "\n");
	    	
	    	//---------------------First Battle-----------------------------
	    	
//	    	Let the dice decide - who are the opponent?
//	    	Example of opponent Gladiator - "Homerus"
	    	
	    	Battle firstBattle = new Battle(player, homerus);
	    	
	    	System.out.println("First battle: " + firstBattle.getPlayerName() + " versus " + firstBattle.getOpponentName());
	       	
	    	//-----------------------First Round---------------------------------------------
	    	
	    	//Round firstRound = new Round ();
	    	// Get the strength of the gladiators
	    	
	    	//System.out.println("First Round:\t" + player.getFullName() + " Strengt: " + player.getStrength() + "\t" 
	    	//				+ homerus.getFullName() + " Strengt: " + homerus.getStrength());
	    	
	    	// Player roll the dice
	    	// New strength: player strength + value of the dice
	    	// player.setStrength = New Strength
	    	
	    	// Opponent rolls the dice
	    	// New strength: opponent strength + value of the dice
	    	// homerus.setStrength = New Strength
	    	
	    	//if (player.getStrength() < homerus.getStrength()) {
	    		//System.out.println("Winner is:" + "...");
	    	//}
	    	
	    	
		}else {							//Player do NOT want to play
			System.out.println("Welcome back!"); 				
		}
		
	}
}

