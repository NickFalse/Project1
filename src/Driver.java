import java.util.ArrayList;
import java.io.*;
/**
 * 
 * @author Raymond Martin
 * @author Nick True
 * @version 9/27/2018
 * 
 */
public class Driver {
	ArrayList bankingList = new ArrayList();
	ArrayList trickList = new ArrayList();
	ArrayList patienceList = new ArrayList();
	ArrayList tileList = new ArrayList();
	ArrayList captureList = new ArrayList();
	ArrayList strategyList = new ArrayList();
	ArrayList fpsList = new ArrayList();
	ArrayList rpgList = new ArrayList();
	ArrayList sportList = new ArrayList();
	/**
	 * 
	 */
	
	public Driver() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
		//File file = new File();
<<<<<<< HEAD
		ArrayList bankingList = new ArrayList();
		ArrayList trickList = new ArrayList();
		ArrayList patienceList = new ArrayList();
		ArrayList tileList = new ArrayList();
		ArrayList captureList = new ArrayList();
		ArrayList strategyList = new ArrayList();
		ArrayList fpsList = new ArrayList();
		ArrayList rpgList = new ArrayList();
		ArrayList sportList = new ArrayList();

=======
		
		// pass the path to the file as a parameter 
		try { 
			Scanner scan = new Scanner(new File("test.txt"));
			while (scan.hasNextLine()) {
				String shitshow =scan.nextLine();
				String[] hek = shitshow.split(", ");
			      System.out.println(Arrays.toString(hek)); 
			      System.out.println(Class.forName(hek[1]).getName());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	  
	    
>>>>>>> a3b7982b36705e74f2b8ff636e25440f1b636b1e

		
		
	}

}
