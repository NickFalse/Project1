/**
 * 
 * @author Nick True
 * @author Raymond Martin
 * @version 9/27/2018
 *
 */
public class Video extends Board{

	//variables
	
	String Console;
	int installationSize;
	
	//getters and setters
	
	/**
	 * @return the console
	 */
	public String getConsole() {
		return Console;
	}
	/**
	 * @param console the console to set
	 */
	public void setConsole(String console) {
		Console = console;
	}
	/**
	 * @return the installationSize
	 */
	public int getInstallationSize() {
		return installationSize;
	}
	/**
	 * @param installationSize the installationSize to set
	 */
	public void setInstallationSize(int installationSize) {
		this.installationSize = installationSize;
	}
	
}
