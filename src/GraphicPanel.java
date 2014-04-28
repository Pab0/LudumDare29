import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GraphicPanel extends JPanel{

	GraphicManager graphicManager;
	
	GraphicPanel(World lnkWorld)
	{
		this.graphicManager = new GraphicManager(this, lnkWorld);
		this.setBackground(Color.BLUE);//only for testing purposes
	}
	
	@Override
	public void paintComponent(Graphics g)
	{
		this.graphicManager.render();
		
	}
}
