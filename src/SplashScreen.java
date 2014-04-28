import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class SplashScreen extends JPanel implements KeyListener{
	
	GameWindow lnkGameWindow;
	BufferedImage img;
	
	SplashScreen(int panelIndicator, GameWindow lnkGameWindow)
	{
		this.lnkGameWindow = lnkGameWindow;
		this.setBackground(Color.BLACK);
		this.setFocusable(true);
		this.addKeyListener(this);
		if (panelIndicator==GameWindow.START_PANEL)
		{
			//drawImage of starting Screen
		}
		else if (panelIndicator==GameWindow.END_PANEL)
		{
			//drawImage of ending Screen
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("Pressed " + e.getKeyChar());
		char c = e.getKeyChar();
		if (c==' ' )	//Switching to Text Panel
		{
			lnkGameWindow.setCurrentMode(GameWindow.TEXT_MODE);
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {	
	}

	@Override
	public void keyTyped(KeyEvent e) {	
	}
}
