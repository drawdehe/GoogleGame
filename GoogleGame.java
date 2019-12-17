/**
 * 
 * @author drawde
 *
 * A game where two players battle to get the most Google hits.
 * 
 * Rules: Every round, the game randomly selects a letter. The players are supposed to find a word of at least
 * three letters that has the most hits on Google. The person with the most hits wins.
 *
 */

public class GoogleGame {
	private Player playerOne;
	private Player playerTwo;
	private String letter;
	
	public GoogleGame(Player playerOne, Player playerTwo) {
		this.playerOne = playerOne;
		this.playerTwo = playerTwo;
	}
	public void setLetter(String newLetter) {
		letter = newLetter;
	}
	public String getLetter() {
		return letter;
	}
	public Player getWinner() {
		if (playerOne.getHits() > playerTwo.getHits()) {
			return playerOne;
		} else {
			return playerTwo;
		} //Add case if hits are equal
	}
	public static void main (String args[]) {
		
	}
}
