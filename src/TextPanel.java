import java.awt.Color;

import javax.swing.JPanel;

public class TextPanel extends JPanel{

	TextManager textManager;
	
	TextPanel(World lnkWorld)
	{
		this.textManager = new TextManager(this, lnkWorld);
		this.setBackground(Color.BLUE);
	}
}
