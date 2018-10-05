/**
 * 
 * @author Nick True
 * @author Raymond Martin
 * @version 9/27/2018
 *
 */
public class FPS extends Video{
	private int numOfAngry14YearOlds;
	
	/**
	 * @param numOfPlayers
	 * @param title
	 * @param genre
	 * @param ageRecommend
	 * @param estimatedTime
	 * @param console
	 * @param installationSize
	 */
	public FPS(String title, String genre,int numOfPlayers, int numOfAngry14YearOlds, String ageRecommend, String estimatedTime, String console,
			String installationSize) {
		super(numOfPlayers, title, genre, ageRecommend, estimatedTime, console, installationSize);
		this.numOfAngry14YearOlds = numOfAngry14YearOlds;
	}


	//If you camp in a corner you're going to get yelled at
	public String campInCorner() {
		return "You have been yelled at through your mic"; 	
	}
	
	//When you shoot a water gun it goes pew pew
	public String waterGun() {
		return "pew pew";
	}
	
}
