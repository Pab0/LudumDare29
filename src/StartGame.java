import java.awt.Dimension;

//Is used only in the beginning to instantiate everything
public class StartGame {

	private static final String GAME_NAME = "Not yet determined";
	protected static final int WINDOW_WIDTH = 500;
	protected static final int WINDOW_HEIGHT = 400;
	
	static World world;
	static GameWindow gameWindow;
	
	public static void main(String[] args) {
		System.out.println("Starting " + GAME_NAME);
		//Create World (and recursively the rest of the game logic)
		world = new World();
		//Create GameWindow (and recursively the rest of the display objects)
		gameWindow = new GameWindow(new Dimension(StartGame.WINDOW_WIDTH, StartGame.WINDOW_HEIGHT), world);
		System.out.println("Game set up.");
		world.gameLoop();
	}

}
