import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

//Each Scene is one level, with its own enemies, background, map etc.
public class Scene {

	Enemy[] enemies;
	World lnkWorld;

	int mapWidth = 20;
	int mapHeight = 14;
	int numOfEnemies = 2;
	Tile[][] tiles;		//The map of the level
	char[][] bgArray;
	char[][] objectArray;

	Scene(World lnkWorld)
	{
		this.lnkWorld = lnkWorld;
		enemies = new Enemy[this.numOfEnemies];
		for (int i=0; i<this.numOfEnemies; i++)
		{
			enemies[i] = new Enemy();
		}
		tiles = new Tile[mapHeight][mapWidth];
		for (int i=0; i<mapHeight; i++)		//i is the number of the line, j the number of the row
		{
			for (int j=0; j<mapWidth; j++)
			{
				tiles[i][j] = new Tile(i, j);
			}
		}
	}

	protected void fillScene(String bgFilename, String objectFilename)
	{
		this.readSceneBackgroundFile(bgFilename);
		this.readSceneObjectFile(objectFilename);
		this.setSceneBackground();
		this.setSceneObjects();
	}

	private void readSceneBackgroundFile(String filename)
	{
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filename));
			String line = null;
			this.bgArray = new char[this.mapWidth][this.mapHeight];
			int lineCounter = 0;
			while ((line = reader.readLine()) != null) {
				lineCounter++;
				bgArray[lineCounter] = line.toCharArray();
				// ...
			}
		} catch (Exception e) {
			System.out.println("Error reading Level file");
			e.printStackTrace();
		}
	}
	
	private void readSceneObjectFile(String filename)
	{
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filename));
			String line = null;
			this.bgArray = new char[this.mapWidth][this.mapHeight];
			int lineCounter = 0;
			while ((line = reader.readLine()) != null) {
				lineCounter++;
				objectArray[lineCounter] = line.toCharArray();
				// ...
			}
		} catch (Exception e) {
			System.out.println("Error reading Level file");
			e.printStackTrace();
		}
	}
	
	protected void setSceneBackground()
	{
		for (int i=0; i<this.mapHeight; i++)
		{
			for (int j=0; j<this.mapWidth; j++)
			{
				tiles[i][j].setBackground(bgArray[i][j]);
			}
		}
	}
	
	protected void setSceneObjects()
	{
		int enemyCount = 0;
		for (int i=0; i<this.mapHeight; i++)
		{
			for (int j=0; j<this.mapWidth; j++)
			{
				char c = objectArray[i][j];
				switch (c)
				{
					case Enemy.GHOST:
						this.enemies[enemyCount] = new Enemy();
						tiles[i][j].addEnemy(this.enemies[enemyCount]);
						enemyCount++;
					//TODO: Rest of enemies, characters, objects
						
				}
			}
		}
	}

}
