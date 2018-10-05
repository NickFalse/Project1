/**
 * 
 * @author Nick True
 * @author Raymond Martin
 * @version 9/27/2018
 * 
 */
public class Capture extends Board{
	private String currentBoardState;
	public Capture(String currentBoardState) {
		this.currentBoardState = currentBoardState;
	}
	
	//it's game over when you flip the board
	public String gameOver() {
		return "flip the board upside down";
	}
	
	//when you secure the flag you win the game
	public String flagSecured() {
		return "You've won the game";
	}
	
}
