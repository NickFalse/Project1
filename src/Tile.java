/**
 * 
 * @author Nick True
 * @author Raymond Martin
 * @version 9/27/2018
 *
 */
public class Tile extends Board{
	private int numOfTiles;
	
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
	public Tile(String title, String genre,int numOfPlayers, int numOfTiles, String ageRecommend, String estimatedTime, String boardSize, int numberOfPieces) {
		super(numOfPlayers, title, genre, ageRecommend, estimatedTime, boardSize, numberOfPieces);
		this.numOfTiles=numOfTiles;
	}
	
	//the noice you hear when knocking over a tile
	public String knockOver() {
		return "bup bop cling clang bam";
	}
	
	//the noice it makes when you connect tiles
	public String connectPieces() {
		return "ka chunk";
	}

	@Override
	public String toString() {
		return "Tile [numOfTiles=" + numOfTiles + ", boardSize=" + boardSize + ", numberOfPieces=" + numberOfPieces
				+ ", numOfPlayers=" + numOfPlayers + ", title=" + title + ", genre=" + genre + ", ageRecommend="
				+ ageRecommend + ", estimatedTime=" + estimatedTime + ", win=" + win + "]";
	}
	
}
