/**
 * 
 * @author Raymond Martin
 * @author Nick True
 * @version 9/27/2018
 *
 */
public class Board extends Game{
	
	//variables
	
	String boardSize;
	int numberOfPieces;
	
	//getters and setters
	
	/**
	 * @param numOfPlayers
	 * @param title
	 * @param genre
	 * @param ageRecommend
	 * @param estimatedTime
	 */
	public Board(int numOfPlayers, String title, String genre, String ageRecommend, String estimatedTime,String boardSize, int numberOfPieces) {
		super(numOfPlayers, title, genre, ageRecommend, estimatedTime);
		this.boardSize = boardSize;
		this.numberOfPieces = numberOfPieces;
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the boardHeight
	 */
	public String getBoardSize() {
		return boardSize;
	}

	/**
	 * @param boardHeight the boardHeight to set
	 */
	public void setBoardSize(String boardSize) {
		this.boardSize = boardSize;
	}

	/**
	 * @return the numberOfPieces
	 */
	public int getNumberOfPieces() {
		return numberOfPieces;
	}

	/**
	 * @param numberOfPieces the numberOfPieces to set
	 */
	public void setNumberOfPieces(int numberOfPieces) {
		this.numberOfPieces = numberOfPieces;
	}

	@Override
	public String toString() {
		return "Board [boardSize=" + boardSize + ", numberOfPieces=" + numberOfPieces + ", numOfPlayers=" + numOfPlayers
				+ ", title=" + title + ", genre=" + genre + ", ageRecommend=" + ageRecommend + ", estimatedTime="
				+ estimatedTime + ", win=" + win + "]";
	}
	
}
