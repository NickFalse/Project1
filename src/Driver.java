import java.util.*;
import java.lang.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.io.*;
/**
 * 
 * @author Raymond Martin
 * @author Nick True
 * @version 9/27/2018
 * 
 */
public class Driver {
	List<Banking> bankingList = new ArrayList<Banking>();
	List<Trick> trickList = new ArrayList();
	List<Patience> patienceList = new ArrayList();
	List<Tile> tileList = new ArrayList();
	List<Capture> captureList = new ArrayList();
	List<Strategy> strategyList = new ArrayList();
	List<FPS> fpsList = new ArrayList();
	List<RPG> rpgList = new ArrayList();
	List<Sport> sportList = new ArrayList();
	
	/**
	 * 
	 */
	
	public Driver() {
		// TODO Auto-generated constructor stub
	}
	public void addItem(String[] arr){
		String cl = arr[1];
		
		if(cl.equals("Banking")) {
			Banking obj = new Banking(arr[0],arr[1],Integer.parseInt(arr[2]),Integer.parseInt(arr[3])
					,arr[4],arr[5],Integer.parseInt(arr[6]));
			System.out.println("hi");
			bankingList.add(obj);
			//System.out.print(bankingList.toString());
			
		}
		if(cl.equals("Trick")) {
			Trick obj = new Trick(arr[0],arr[1],Integer.parseInt(arr[2]),Integer.parseInt(arr[3])
					,arr[4],arr[5],Integer.parseInt(arr[6]));
			trickList.add(obj);
		}
		if(cl.equals("Patience")) {
			Patience obj = new Patience(arr[0],arr[1],Integer.parseInt(arr[2]),Integer.parseInt(arr[3])
					,arr[4],arr[5],Integer.parseInt(arr[6]));
			patienceList.add(obj);
		}
		if(cl.equals("Tile")) {
			Tile obj = new Tile(arr[0],arr[1],Integer.parseInt(arr[2]),Integer.parseInt(arr[3])
					,arr[4],arr[5],arr[6],Integer.parseInt(arr[7]));
			tileList.add(obj);
		}
		if(cl.equals("Capture")) {
			Capture obj = new Capture(arr[0],arr[1],Integer.parseInt(arr[2]),arr[3]
					,arr[4],arr[5],arr[6],Integer.parseInt(arr[7]));
			captureList.add(obj);
		}
		if(cl.equals("Strategy")) {
			Strategy obj = new Strategy(arr[0],arr[1],Integer.parseInt(arr[2]),Integer.parseInt(arr[3])
					,arr[4],arr[5],arr[6],Integer.parseInt(arr[7]));
			strategyList.add(obj);
		}
		if(cl.equals("FPS")) {
			FPS obj = new FPS(arr[0],arr[1],Integer.parseInt(arr[2]),Integer.parseInt(arr[3])
					,arr[4],arr[5],arr[6],arr[7]);
			fpsList.add(obj);
		}
		if(cl.equals("RPG")) {
			RPG obj = new RPG(arr[0],arr[1],Integer.parseInt(arr[2]),Integer.parseInt(arr[3])
					,arr[4],arr[5],arr[6],arr[7]);
			rpgList.add(obj);
		}
		if(cl.equals("Sport")) {
			Sport obj = new Sport(arr[0],arr[1],Integer.parseInt(arr[2]),arr[3]
					,arr[4],arr[5],arr[6],arr[7]);
			sportList.add(obj);
		}
	}
	
	public List<Banking> getBankingList() {
		return bankingList;
	}
	public List<Trick> getTrickList() {
		return trickList;
	}
	public List<Patience> getPatienceList() {
		return patienceList;
	}
	public List<Tile> getTileList() {
		return tileList;
	}
	public List<Capture> getCaptureList() {
		return captureList;
	}
	public List<Strategy> getStrategyList() {
		return strategyList;
	}
	public List<FPS> getFpsList() {
		return fpsList;
	}
	public List<RPG> getRpgList() {
		return rpgList;
	}
	public List<Sport> getSportList() {
		return sportList;
	}
	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws SecurityException 
	 * @throws NoSuchMethodException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws InvocationTargetException 
	 * @throws IllegalArgumentException 
	 */
	public static void main(String[] args) {
		//<title,genre,num of p, game specific, age, time, parrent 1, parrent 2>
		Driver dvr = new Driver();
		try { 
			Scanner scan = new Scanner(new File("test.txt"));
			while (scan.hasNextLine()) {
				String line =scan.nextLine();
				String[] arr = line.split(", ");
				System.out.println(Arrays.toString(arr));
				dvr.addItem(arr);
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	  
	    
		
		
	}

}
