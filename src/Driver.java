import java.util.*;
import java.io.*;
/**
 * 
 * @author Raymond Martin
 * @author Nick True
 * @version 9/27/2018
 * 
 */
public class Driver {

	/**
	 * 
	 */
	public Driver() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//File file = new File();
		ArrayList bankingList = new ArrayList();
		ArrayList trickList = new ArrayList();
		ArrayList patienceList = new ArrayList();
		ArrayList tileList = new ArrayList();
		ArrayList captureList = new ArrayList();
		ArrayList strategyList = new ArrayList();
		ArrayList fpsList = new ArrayList();
		ArrayList rpgList = new ArrayList();
		ArrayList sportList = new ArrayList();
		// pass the path to the file as a parameter 
		try { 
			Scanner scan = new Scanner(new File("test.txt"));
			while (scan.hasNextLine()) {
				String shitshow =scan.nextLine();
				String[] hek = shitshow.split(",");
			      System.out.println(Arrays.toString(hek)); 
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	  
	    

		
		
	}

}
