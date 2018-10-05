/**
 * 
 * @author Nick True
 * @author Raymond Martin
 * @version 9/27/2018
 *
 */
public class Tile extends Board{
	private int numOfTiles;
	public Tile(int numOfTiles) {
		this.numOfTiles=numOfTiles;
	}
	
	//the noice you hear when knocking over a tile
	public String knockOver() {
		return "bup bop cling clang bam";
	}
	
	//the noice it makes when you connect tiles
	public String connectPieces() {
		return "ka chunk";
	}
}
