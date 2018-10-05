/**
 * 
 * @author Nick True
 * @author Raymond Martin
 * @version 9/27/2018
 * 
 */
public class Patience extends Card{
	private int remainingCards;
	public Patience(int remainingCards) {
		this.remainingCards = remainingCards;
	}
	
	//You say Oof when your cards fall over
	public String cardsFallOver() {
		return "Oof";
	}
	
	//when you loss patience its game over
	public String patienceLost() {
		return "game over";
	}
}
