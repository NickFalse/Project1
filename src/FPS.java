/**
 * 
 * @author Nick True
 * @author Raymond Martin
 * @version 9/27/2018
 *
 */
public class FPS extends Video{
	private int numOfAngry14YearOlds;
	public FPS(int numOfAngry14YearOlds) {
		this.numOfAngry14YearOlds = numOfAngry14YearOlds;
	}
	
	//If you camp in a corner you're going to get yelled at
	public String campInCorner() {
		return "You have been yelled at through your mic"; 	
	}
	
	//When you shot a water gun it goes pew pew
	public String waterGun() {
		return "pew pew";
	}
	
}
