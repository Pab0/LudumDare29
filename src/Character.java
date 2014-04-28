import java.awt.Dimension;

//Characters are non-enemy characters, like the player, or an old, wise man
public class Character {
	
	World lnkWorld;
	Scene currentScene;
	
	Dimension position;
	String name;
	
	boolean moveNorth;
	boolean moveSouth;
	boolean moveEast;
	boolean moveWest;
	
	Character(String name, Scene scene, int height, int width, World lnkWorld)
	{
		this.lnkWorld = lnkWorld;
		this.name = name;
		this.placeOnScene(scene, height, width);
	}
	
	protected void placeOnScene(Scene scene, int height, int width)
	{
		this.currentScene = scene;
		if (this.checkTile(height, width))
		{
			placeOnTile(height, width);
		}
	}
	
	protected void placeOnTile(int height, int width)
	{
		//Different from moving there, since it "magically" places the character on the tile
			this.position.height = height;
			this.position.width = width;
	}
	
	protected void moveToTile(int height, int width)
	{
		//Moves slowly from one tile over to the next. Might not be able to do that - in that case, just let the character "magically" appear on the neighbouring tile:
		//this.placeOnTile(int posx, int posy);
	}
	
	private boolean checkTile(int height, int width)
	{
		boolean canPass = false;
		//TODO: Check for collisions, return true if tile is free
		return canPass;
	}

}
