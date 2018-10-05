/**
 * 
 * @author Nick True
 * @author Raymond Martin
 * @version 9/27/2018
 *
 */
public class RPG extends Video{
	private int numOfStrangeCharacters;
	
	/**
	 * @param numOfPlayers
	 * @param title
	 * @param genre
	 * @param ageRecommend
	 * @param estimatedTime
	 * @param console
	 * @param installationSize
	 */
	public RPG(String title, String genre,int numOfPlayers, int numOfStrangeCharacters, String ageRecommend, String estimatedTime, String console,
			String installationSize) {
		super(numOfPlayers, title, genre, ageRecommend, estimatedTime, console, installationSize);
		this.numOfStrangeCharacters = numOfStrangeCharacters;
	}
	
	/**
	 * If you get stabbed say "ouch ouch"
	 * @return
	 */
	public String stabStab() {
		return "ouch ouch";
	}
	
	/**
	 * When you hit something you hit them and then get hit back
	 * @return
	 */
	public String hit() {
		return "hit an opponent and let your hit opponent hit you";
	}


	@Override
	public String toString() {
		return "RPG [numOfStrangeCharacters=" + numOfStrangeCharacters + ", console=" + console + ", installationSize="
				+ installationSize + ", numOfPlayers=" + numOfPlayers + ", title=" + title + ", genre=" + genre
				+ ", ageRecommend=" + ageRecommend + ", estimatedTime=" + estimatedTime + ", win=" + win + "]";
	}
	
	
	
}
