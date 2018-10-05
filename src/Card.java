/**
 * 
 * @author Nick True
 * @author Raymond Martin
 * @version 10/4/2018
 * 
 */
public class Card extends Game{

	//variables
	
	int numOfCards;
	
	//getters and setters
	
	public Card(String title, String genre, int numOfPlayers,  String ageRecommend, String estimatedTime, int numOfCards) {
		super(numOfPlayers, title, genre, ageRecommend, estimatedTime);
		this.numOfCards = numOfCards;
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the numOfCards
	 */
	public int getNumOfCards() {
		return numOfCards;
	}

	/**
	 * @param numOfCards the numOfCards to set
	 */
	public void setNumOfCards(int numOfCards) {
		this.numOfCards = numOfCards;
	}

	@Override
	public String toString() {
		return "Card [numOfCards=" + numOfCards + ", numOfPlayers=" + numOfPlayers + ", title=" + title + ", genre="
				+ genre + ", ageRecommend=" + ageRecommend + ", estimatedTime=" + estimatedTime + ", win=" + win + "]";
	}
	
}
