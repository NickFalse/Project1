/**
 * 
 * @author Nick True
 * @author Raymond Martin
 * @version 9/27/2018
 *
 */
public class Strategy extends Board{
	private int numOfPiecesRemaining;
	
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
	public Strategy(String title, String genre,int numOfPlayers, int numOfPiecesRemaining, String ageRecommend, String estimatedTime, String boardSize, int numberOfPieces) {
		super(numOfPlayers, title, genre, ageRecommend, estimatedTime, boardSize, numberOfPieces);
		this.numOfPiecesRemaining = numOfPiecesRemaining;
	}

	/**
	 * When you gamble your pieces you loss everything
	 * @return
	 */
	public String gambleYourPieces() {
		return "you've lost everything";
	}
	
	/**
	 * When you charge forward you lose half of your soldiers
	 * @return
	 */
	public String chargeForward() {
		return "you've just lost half of your soldiers";
	}


	@Override
	public String toString() {
		return "Strategy [numOfPiecesRemaining=" + numOfPiecesRemaining + ", boardSize=" + boardSize
				+ ", numberOfPieces=" + numberOfPieces + ", numOfPlayers=" + numOfPlayers + ", title=" + title
				+ ", genre=" + genre + ", ageRecommend=" + ageRecommend + ", estimatedTime=" + estimatedTime + ", win="
				+ win + "]";
	}
	
}
