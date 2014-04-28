import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameWindow extends JFrame{

	public static final int START_PANEL = 0;
	public static final int TEXT_MODE = 1;
	public static final int GRAPHIC_MODE = 2;
	public static final int END_PANEL = 10;

	private int currentMode;
	World lnkWorld;
	JPanel panel;
	GraphicPanel graphicPanel;
	TextPanel textPanel;
	SplashScreen splashPanel;

	GameWindow(Dimension d, World lnkWorld)
	{
		this.lnkWorld = lnkWorld;
		this.setFocusable(false);

		this.graphicPanel = new GraphicPanel(lnkWorld);
		this.textPanel = new TextPanel(lnkWorld);
		this.splashPanel = new SplashScreen(GameWindow.START_PANEL, this);

		this.currentMode = this.START_PANEL;
		this.populate();

		this.setSize(d);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	private void populate()
	{
		switch (currentMode)
		{
		case GameWindow.START_PANEL:
			this.add(this.splashPanel);
			System.out.println("Changing to Start Panel");
			break;
		case GameWindow.TEXT_MODE:
			this.add(this.textPanel);
			System.out.println("Changing to Text Panel");
			break;
		case GameWindow.GRAPHIC_MODE:
			this.add(this.graphicPanel);
			System.out.println("Changing to Graphic Panel");
			break;
		case GameWindow.END_PANEL:
			this.add(this.splashPanel);
			System.out.println("Changing to End Panel");
			break;
		}
		this.repaint();
	}
	
	protected void setCurrentMode(int mode)
	{
		this.remove(this.splashPanel);
		int oldMode = this.currentMode;
		this.removePanel(oldMode);
		this.currentMode = mode;
		this.populate();
	}
	
	private void removePanel(int mode)
	{
		//TODO: Make it work for every situation
		this.remove(this.splashPanel);
	}
}
