package lexicon.se.maria.Arena_fighter;



import org.junit.Test;
import static org.junit.Assert.*;




public class Arena_fighterTest {
	
	@Test
	public void test_playerwinner() {
		Gladiator player = new Gladiator("Atlas", 16, 8, true);
		Gladiator opponent = new Gladiator("Titan", 6, 1, true);
		Round round = new Round();
		
		String expectedReturn = "Atlas";
		
		round.getResult(1, player, opponent);
		String actualReturn = round.calculateWinner(player, opponent);
		
		assertEquals(expectedReturn,actualReturn);
		assertFalse(opponent.isAlive());		
	}
	
	@Test
	public void test_opponentwinner() {
		Gladiator player = new Gladiator("Omnius", 4, 1, true);
		Gladiator opponent = new Gladiator("Hercules", 16, 5, true);
		Round round = new Round();
		
		String expectedReturn = "Hercules";
		
		round.getResult(2, player, opponent);
		String actualReturn = round.calculateWinner(player, opponent);
		
		assertEquals(expectedReturn,actualReturn);
		assertFalse(player.isAlive());
	}
}
