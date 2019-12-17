/**
 * 
 * @author drawde
 *
 * A game where two players battle to get the most Google hits.
 * 
 * Rules: Every round, the game randomly selects a letter. The players are supposed to find a word of at least
 * 3 letters that has the most hits on Google. After 11 rounds, the game ends. The person with the highest score wins.
 *
 */
import java.util.Random;

public class GoogleGame {
	private Player playerOne;
	private Player playerTwo;
	private char letter;
	private Random rand;
	private String alphabet;
	private int round;
	
	public GoogleGame(Player playerOne, Player playerTwo) {
		this.playerOne = playerOne;
		this.playerTwo = playerTwo;
		round = 0;
		alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	}
	public void generateLetter() {
		//Throws an error at the moment
		char letter = alphabet.charAt(rand.nextInt(alphabet.length()));
		round++;
	}
	public char getLetter() {
		return letter;
	}
	public int getRound() {
		return round;
	}
	public Player getLeader() {
		if (playerOne.getScore() == playerTwo.getScore()) {
			return null;
		}
		if (playerOne.getScore() > playerTwo.getScore()) {
			return playerOne;
		} else {
			return playerTwo;
		} 
	}
	public void startGame() {
		
	}
	public static void main (String args[]) {
		
		//Test of one round
		
		Player p1 = new Player("Steve");
		Player p2 = new Player("Freddy");
		GoogleGame game = new GoogleGame(p1, p2);
		
		game.generateLetter();
		System.out.println(game.getLetter());
	}
}
