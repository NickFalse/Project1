/**
 * 
 * @author Nick True
 * @author Raymond Martin
 * @version 9/27/2018
 *
 */
public class Sport extends Video{
	private String currentTeam;
	public Sport(String currentTeam) {
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
	
}
