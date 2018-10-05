/**
 * 
 * @author Raymond Martin
 * @author Nick True
 * @verison 9/27/2018
 * 
 */
public class Trick extends Card{
	private int numOfTricks;
	public Trick(int numOfTricks) {
		this.numOfTricks = numOfTricks;
	}
	
	//seeing a fancy trick you say "wow"
	public String fancyTrick() {
		return "wow";
	}
	
	//when you fail a trick people say you suck
	public String failTrick() {
		return "you suck";
	}
}
