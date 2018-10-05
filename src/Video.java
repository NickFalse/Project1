/**
 * 
 * @author Nick True
 * @author Raymond Martin
 * @version 9/27/2018
 *
 */
public class Video extends Game{

	//variables
	
	String console;
	String installationSize;
	
	
	//getters and setters
	
	/**
	 * @param numOfPlayers
	 * @param title
	 * @param genre
	 * @param ageRecommend
	 * @param estimatedTime
	 */
	public Video(int numOfPlayers, String title, String genre, String ageRecommend, String estimatedTime,String console, String installationSize) {
		super(numOfPlayers, title, genre, ageRecommend, estimatedTime);
		this.console = console;
		this.installationSize = installationSize;
		
	}
	/**
	 * @return the console
	 */
	public String getConsole() {
		return console;
	}
	/**
	 * @param console the console to set
	 */
	public void setConsole(String console) {
		this.console = console;
	}
	/**
	 * @return the installationSize
	 */
	public String getInstallationSize() {
		return installationSize;
	}
	/**
	 * @param installationSize the installationSize to set
	 */
	public void setInstallationSize(String installationSize) {
		this.installationSize = installationSize;
	}
	@Override
	public String toString() {
		return "Video [console=" + console + ", installationSize=" + installationSize + ", numOfPlayers=" + numOfPlayers
				+ ", title=" + title + ", genre=" + genre + ", ageRecommend=" + ageRecommend + ", estimatedTime="
				+ estimatedTime + ", win=" + win + "]";
	}
	
	
}
