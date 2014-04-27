import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class SplashScreen extends JPanel{
	
	public static final int STARTING_PANEL = 0;
	public static final int ENDING_PANEL = 100;

	GameWindow lnkGameWindow;
	BufferedImage img;
	
	SplashScreen(int panelIndicator)
	{
		if (panelIndicator==SplashScreen.STARTING_PANEL)
		{
			System.out.println("Drawing the starting splash panel.");
			//drawImage of starting Screen
		}
		else if (panelIndicator==SplashScreen.ENDING_PANEL)
		{
			System.out.println("Drawing the ending splash panel.");
			//drawImage of ending Screen
		}
	}
}
