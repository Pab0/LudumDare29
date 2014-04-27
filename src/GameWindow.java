import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameWindow extends JFrame{

	World lnkWorld;
	GraphicPanel graphicPanel;
	TextPanel textPanel;
	SplashScreen splashPanel;
	
	GameWindow(Dimension d, World lnkWorld)
	{
		this.lnkWorld = lnkWorld;
		
		this.graphicPanel = new GraphicPanel(lnkWorld);
		this.textPanel = new TextPanel(lnkWorld);
		this.splashPanel = new SplashScreen(SplashScreen.STARTING_PANEL);
		
		this.swapPanel(this.splashPanel);
		
		this.setSize(d);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
	}
	
	private void swapPanel(JPanel panel)	//removes current panels and adds a new one
	{
		this.removeAll();
		this.add(panel);
	}
}
