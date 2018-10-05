/**
 * 
 * @author Nick True
 * @author Raymond Martin
 * @version 10/1/2018
 * 
 */
public abstract class Game extends Board{

	//variables 
	
	int numOfPlayers, ageRecommend, estimatedTime;
	String title, genre;
	boolean win;
	
	//getters and setters
	
	/**
	 * @return the numOfPlayers
	 */
	public int getNumOfPlayers() {
		return numOfPlayers;
	}
	/**
	 * @param numOfPlayers the numOfPlayers to set
	 */
	public void setNumOfPlayers(int numOfPlayers) {
		this.numOfPlayers = numOfPlayers;
	}
	/**
	 * @return the ageRecommend
	 */
	public int getAgeRecommend() {
		return ageRecommend;
	}
	/**
	 * @param ageRecommend the ageRecommend to set
	 */
	public void setAgeRecommend(int ageRecommend) {
		this.ageRecommend = ageRecommend;
	}
	/**
	 * @return the estimatedTime
	 */
	public int getEstimatedTime() {
		return estimatedTime;
	}
	/**
	 * @param estimatedTime the estimatedTime to set
	 */
	public void setEstimatedTime(int estimatedTime) {
		this.estimatedTime = estimatedTime;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the genre
	 */
	public String getGenre() {
		return genre;
	}
	/**
	 * @param genre the genre to set
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Board [numOfPlayers=" + numOfPlayers + ", ageRecommend=" + ageRecommend + ", estimatedTime="
				+ estimatedTime + ", title=" + title + ", genre=" + genre + "]";
	}
	/**
	 * @return the Win
	 */
	public boolean isWin() {
		return win;
	}	
	
}
