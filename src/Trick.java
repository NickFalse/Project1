/**
 * 
 * @author Raymond Martin
 * @author Nick True
 * @version 9/27/2018
 * 
 */
public class Trick extends Card{
	private int numOfTricks;
	
	/**
	 * @param numOfPlayers
	 * @param title
	 * @param genre
	 * @param ageRecommend
	 * @param estimatedTime
	 * @param numOfCards
	 */
	public Trick(String title, String genre,int numOfPlayers, int numOfTricks, String ageRecommend, String estimatedTime, int numOfCards) {
		super(title, genre,numOfPlayers,  ageRecommend, estimatedTime, numOfCards);
		this.numOfTricks = numOfTricks;
	}

	/**If you peek the person next to you
	 * catches you looking at their cards
	 * 
	 * @return
	 */
	public String peek() {
		return "the person next to you catches you looking at their cards";
	}
	/**
	 * by adding a trick you increase the number of tricks by one 
	 */
	public void addTrick() {
		numOfTricks++;
	}

	@Override
	public String toString() {
		return "Trick [numOfTricks=" + numOfTricks + ", numOfCards=" + numOfCards + ", numOfPlayers=" + numOfPlayers
				+ ", title=" + title + ", genre=" + genre + ", ageRecommend=" + ageRecommend + ", estimatedTime="
				+ estimatedTime + ", win=" + win + "]";
	}
	

}
