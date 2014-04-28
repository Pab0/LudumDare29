//Drawing logic goes here - what to draw, where
import java.awt.*;
public class GraphicManager {

	private BufferedImage img = new BufferedImage(StartGame.WINDOW_WIDTH,StartGame.WINDOW_HEIGHT, BufferedImage.Type_INT_RGB)

	GraphicPanel lnkGraphicPanel;
	World lnkWorld;
	
	GraphicManager(GraphicPanel lnkGraphicPanel, World lnkWorld)
	{
		this.lnkGraphicPanel = lnkGraphicPanel;
		this.lnkWorld = lnkWorld;
	}

	Graphics g = img.getGraphics(); 

	public void render();{
	
	//g.drawImage(img, int x, int y, Image Observer)
	//lnkworld.currentscene.tiles
	for(int i = 0; i < tiles.length; i++){
	for(int j = 0; j < tiles[].length; j++){

	//to-do: draw the tiles	
	

			}
		}


	}

}
