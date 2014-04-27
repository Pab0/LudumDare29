import java.awt.Dimension;

//Central class - holds everything from the game either directly (e.g. Scenes) or indirectly (e.g. Scenes.Enemies)
//Acts like a hub in the game logic, mostly everything points to here
//This is also where the main Game Loop will be located
public class World {

	public static final int NUMBER_OF_SCENES = 1;
	Scene[] scenes;
	Scene currentScene;
	Battle currentBattle;
	Character player;

	public World()
	{
		scenes = new Scene[World.NUMBER_OF_SCENES];
		for (int i=0; i<World.NUMBER_OF_SCENES; i++)
		{
			scenes[i] = new Scene(this);
		}
		this.setCurrentScene(scenes[0]);
		player = new Character("Player", currentScene, 0, 0, this);
	}
	
	private void setCurrentScene(Scene scene)
	{
		this.currentScene = scene;
	}
	
	public void gameLoop()
	{
		//Kwsta diko sou
	}
	
	

}
