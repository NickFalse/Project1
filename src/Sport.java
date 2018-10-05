/**
 * 
 * @author Nick True
 * @author Raymond Martin
 * @version 9/27/2018
 *
 */
public class Sport extends Video{
	private String currentTeam;
	
	/**
	 * @param numOfPlayers
	 * @param title
	 * @param genre
	 * @param ageRecommend
	 * @param estimatedTime
	 * @param console
	 * @param installationSize
	 */
	public Sport(String title, String genre,int numOfPlayers, String currentTeam, String ageRecommend, String estimatedTime, String console,
			String installationSize) {
		super(numOfPlayers, title, genre, ageRecommend, estimatedTime, console, installationSize);
		this.currentTeam = currentTeam;
	}

	//if fakeInjury return acting like you have a fake injury
	public String fakeInjury() {
		return "o that pain, how will I live on";
		}
	
	//if tapped on shoulder return acting like life suffering damage
	public String getsTappedOnShoulder() {
		return "suffer life devastating damage";
	}

	@Override
	public String toString() {
		return "Sport [currentTeam=" + currentTeam + ", console=" + console + ", installationSize=" + installationSize
				+ ", numOfPlayers=" + numOfPlayers + ", title=" + title + ", genre=" + genre + ", ageRecommend="
				+ ageRecommend + ", estimatedTime=" + estimatedTime + ", win=" + win + "]";
	}
	
}
