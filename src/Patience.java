/**
 * 
 * @author Nick True
 * @author Raymond Martin
 * @version 9/27/2018
 * 
 */
public class Patience extends Card{
	private int remainingCards;
	
	/**
	 * @param numOfPlayers
	 * @param title
	 * @param genre
	 * @param ageRecommend
	 * @param estimatedTime
	 * @param numOfCards
	 */
	public Patience(String title, String genre,int numOfPlayers, int remainingCards, String ageRecommend, String estimatedTime, int numOfCards) {
		super(title, genre,numOfPlayers,  ageRecommend, estimatedTime, numOfCards);
		this.remainingCards = remainingCards;
	}

	public void throwCard() {
		remainingCards--;
	}
	public String shuffleDeck() {
		return "you put all the cards on the table and mix them in shame knowing you cant shuffle";
	}

	@Override
	public String toString() {
		return "Patience [remainingCards=" + remainingCards + ", numOfCards=" + numOfCards + ", numOfPlayers="
				+ numOfPlayers + ", title=" + title + ", genre=" + genre + ", ageRecommend=" + ageRecommend
				+ ", estimatedTime=" + estimatedTime + ", win=" + win + "]";
	}
	
}
