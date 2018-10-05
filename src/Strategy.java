/**
 * 
 * @author Nick True
 * @author Raymond Martin
 * @version 9/27/2018
 *
 */
public class Strategy extends Board{
	private int numOfPiecesRemaining;
	public Strategy(int numOfPiecesRemaining) {
		this.numOfPiecesRemaining = numOfPiecesRemaining;
	}
	
	//when you gamble your pieces you loss everything
	public String gambleYourPieces() {
		return "you've lost everything";
	}
	
	//after charging forward you loss half of your soldiers
	public String chargeForward() {
		return "you've just lost half of your soldiers";
	}
}
