/**
 * 
 * @author Nick True
 * @author Raymond Martin
 * @version 9/27/2018
 * 
 */
public class Capture extends Board{
	private String currentBoardState;
	
	/**
	 * @param numOfPlayers
	 * @param title
	 * @param genre
	 * @param ageRecommend
	 * @param estimatedTime
	 * @param boardHeight
	 * @param boardWidth
	 * @param numberOfPieces
	 */
	public Capture(String title, String genre,int numOfPlayers, String currentBoardState, String ageRecommend, String estimatedTime, String boardSize,
			 int numberOfPieces) {
		super(numOfPlayers, title, genre, ageRecommend, estimatedTime, boardSize, numberOfPieces);
		this.currentBoardState = currentBoardState;
	}

	/**
	 * It's game over when you flip the game board upside down
	 * @return
	 */
	public String gameOver() {
		return "flip the board upside down";
	}
	
	/**
	 * When you capture a piece you look your oppenent in the eyes 
	 * as you take their piece
	 * @return
	 */
	public String capturePiece() {
		return "You look your opponent in the eyes as you take their piece";
	}


	@Override
	public String toString() {
		return "Capture [currentBoardState=" + currentBoardState + ", boardSize=" + boardSize + ", numberOfPieces="
				+ numberOfPieces + ", numOfPlayers=" + numOfPlayers + ", title=" + title + ", genre=" + genre
				+ ", ageRecommend=" + ageRecommend + ", estimatedTime=" + estimatedTime + ", win=" + win + "]";
	}
	
}
