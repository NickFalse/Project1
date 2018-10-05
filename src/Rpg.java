/**
 * 
 * @author Nick True
 * @author Raymond Martin
 * @version 9/27/2018
 *
 */
public class Rpg extends Video{
	private int numOfStrangeCharacters;
	public Rpg(int numOfStrangeCharacters) {
		this.numOfStrangeCharacters = numOfStrangeCharacters;
	}
	
	//after i get stabStab'd i say ouch ouch
	public String stabStab() {
		return "ouch ouch";
	}
	
	//after you hit something you get hit back
	public String hit() {
		return "hit an opponent and let your hit opponent hit you";
	}
	
	
	
}
