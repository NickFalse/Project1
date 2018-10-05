/**
 * 
 * @author Nick True
 * @author Raymond Martin
 * @version 9/27/2018
 * 
 */
public class Banking extends Card{
	private int bet;
	
	/**
	 * @param numOfPlayers
	 * @param title
	 * @param genre
	 * @param ageRecommend
	 * @param estimatedTime
	 * @param numOfCards
	 */
	public Banking(String title, String genre,int numOfPlayers, int bet, String ageRecommend, String estimatedTime, int numOfCards) {
		super(title, genre,numOfPlayers,  ageRecommend, estimatedTime, numOfCards);
		this.bet = bet;
	}
	public String deal() {
		return "the dealer places a card on the table";
	}
	public String goBroke() {
		return "you dip into your child's college fund for one last bet knowing it isn't your last...";//go dark
	}
	@Override
	public String toString() {
		return "Banking [bet=" + bet + ", numOfCards=" + numOfCards + ", numOfPlayers=" + numOfPlayers + ", title="
				+ title + ", genre=" + genre + ", ageRecommend=" + ageRecommend + ", estimatedTime=" + estimatedTime
				+ ", win=" + win + "]";
	}
	
}
