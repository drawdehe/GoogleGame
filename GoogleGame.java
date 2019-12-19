/**
 * 
 * @author drawde
 *
 * A game where two players battle to get the most Google hits.
 * 
 * Rules: Every round, the game randomly selects a letter. The players are supposed to find a word of at least
 * 3 letters that has the most hits on Google. After 11 rounds, the game ends. The player with the highest score wins.
 *
 */
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.Timer;

public class GoogleGame {
	private Player playerOne;
	private Player playerTwo;
	private char letter;
	private Random rand = new Random();
	private Scanner scan = new Scanner(System.in);
	private Timer timer = new Timer();
	private String alphabet;
	private int round;
	
	public GoogleGame(Player playerOne, Player playerTwo) {
		this.playerOne = playerOne;
		this.playerTwo = playerTwo;
		round = 1;
		alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	}
	private void generateLetter() {
		letter = alphabet.charAt(rand.nextInt(alphabet.length()));
	}
	public char getLetter() {
		return letter;
	}
	public int getRound() {
		return round;
	}
	private void input() {
		System.out.println("Player One: ");
		playerOne.setWord(scan.next());
		System.out.println("Player Two: ");
		playerTwo.setWord(scan.next());
		System.out.print("\n");
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
	public void startRound() {
		//long startTime = System.currentTimeMillis();
		//long elapsedTime = 0;
		System.out.println("Round " + round);
		generateLetter();
		System.out.println("The letter is: " + letter + "\n");
		input();
		
		//Implement scraper that calculates hits
		
		if (playerOne.getHits() == playerTwo.getHits()) {
			return;
		}
		if (playerOne.getHits() > playerTwo.getHits()) {
			playerOne.setScore(playerOne.getScore() + 1);
		} else {
			playerTwo.setScore(playerTwo.getScore() + 1);
		}
		/*while(elapsedTime < 10*1000) {
			elapsedTime = (new Date()).getTime() - startTime;
		}*/
		round++;
	}
	public void startGame() {
		while (round < 12) {
			startRound();
		}
	}
	public static void main (String args[]) {
		
		//Test of one game
		
		Player p1 = new Player("Steve");
		Player p2 = new Player("Freddy");
		GoogleGame game = new GoogleGame(p1, p2);
		
		game.startGame();
	}
}
