//Each Scene is one level, with its own enemies, background, map etc.
public class Scene {
	
	Enemy[] enemies;
	World lnkWorld;
	
	int numOfEnemies = 2;
	boolean[][] collisionMap;		//false means no collision, true means collision
	
	Scene(World lnkWorld)
	{
		this.lnkWorld = lnkWorld;
		enemies = new Enemy[this.numOfEnemies];
		for (int i=0; i<this.numOfEnemies; i++)
		{
			enemies[i] = new Enemy();
		}
	}

}
