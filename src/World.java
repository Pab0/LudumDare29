//Central class - holds everything from the game either directly (e.g. Scenes) or indirectly (e.g. Scenes.Enemies)
//Acts like a hub in the game logic, mostly everything points to here
//This is also where the main Game Loop will be located
public class World {

	GameWindow gameWindow;
	
	Scene[] scenes;
	Scene currentScene;
	Battle currentBattle;
	Character player;
	
}
