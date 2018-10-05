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
	@Override
	public String toString() {
		return "Banking [bet=" + bet + ", numOfCards=" + numOfCards + ", numOfPlayers=" + numOfPlayers + ", title="
				+ title + ", genre=" + genre + ", ageRecommend=" + ageRecommend + ", estimatedTime=" + estimatedTime
				+ ", win=" + win + "]";
	}
	


	//when you count cards at a casino you get kicked out 
	public String countingCards() {
		return "you've been kicked out";
	}
	
	//when you have error counting people will tell you to go back to school
	public String errorCounting() {
		return "you need to go back to elementary school";
	}
	
} 

