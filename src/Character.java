//Characters are non-enemy characters, like the player, or an old, wise man
public class Character {
	
	World lnkWorld;
	Scene currentScene;
	
	int posx;
	int posy;
	String name;
	
	boolean moveNorth;
	boolean moveSouth;
	boolean moveEast;
	boolean moveWest;
	
	Character(String name, Scene scene, int posx, int posy, World lnkWorld)
	{
		this.lnkWorld = lnkWorld;
		this.name = name;
		this.placeOnScene(scene, posx, posy);
	}
	
	protected void placeOnScene(Scene scene, int posx, int posy)
	{
		this.currentScene = scene;
		if (this.checkTile(posx, posy))
		{
			placeOnTile(posx, posy);
		}
	}
	
	protected void placeOnTile(int posx, int posy)
	{
		//Different from moving there, since it "magically" places the character on the tile
		this.posx = posx;
		this.posy = posy;
	}
	
	protected void moveToTile(int posx, int posy)
	{
		//Moves slowly from one tile over to the next. Might not be able to do that - in that case, just let the character "magically" appear on the neighbouring tile:
		//this.placeOnTile(int posx, int posy);
	}
	
	private boolean checkTile(int posx, int posy)
	{
		boolean canPass = false;
		//TODO: Check for collisions, return true if tile is free
		return canPass;
	}

}
