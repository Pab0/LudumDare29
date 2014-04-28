import java.awt.Dimension;
import java.awt.image.BufferedImage;

public class Tile {

	private static final char GRASS_TYPE = 'G';
	private static final char DIRT_TYPE = 'D';
	private static final char RIVER_BANK_TYPE = 'R';
	private static final char FLOOR_TYPE = 'F';
	
	Dimension position;
	Enemy lnkEnemy;				//may be null
	Character lnkCharacter;		//may be null
	WorldObject lnkWorldObject;	//may be null
	BufferedImage background;
	boolean collision;
	
	public Tile(int height, int width)
	{
		this.position = new Dimension(width, height);
	}
	
	public Tile(int width, int height, char bgType)
	{
		this(height, width);
		this.setBackground(bgType);
	}
	
	protected void setBackground(char bgType)
	{
		if (bgType==Tile.GRASS_TYPE)
		{
			//TODO: Load Grass tile image in background
		}
		else if (bgType==Tile.DIRT_TYPE)
		{
			//etc...
		}
	}
	
	protected void addEnemy(Enemy lnkEnemy)
	{
		this.lnkEnemy = lnkEnemy;
		collision = true;
	}
	
	protected void removeEnemy()
	{
		this.lnkEnemy = null;
		collision = false;
	}
	
	protected void addCharacter(Character lnkCharacter)
	{
		this.lnkCharacter = lnkCharacter;
		collision = true;
	}
	
	protected void removeCharacter()
	{
		this.lnkCharacter = null;
		collision = false;
	}
	
	protected void addWorldObject(WorldObject lnkWorldObject)
	{
		this.lnkWorldObject = lnkWorldObject;
		collision = true;
	}
	
	protected void removeWorldObject(WorldObject lnkWorldObject)
	{
		this.lnkWorldObject = null;
		collision = false;
	}
}
