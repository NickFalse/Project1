/**
 * 
 * @author Nick True
 * @author Raymond Martin
 * @version 9/27/2018
 * 
 */
public class Banking extends Card{
	private int bet;
	public Banking(int bet) {
		this.bet=bet;
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
