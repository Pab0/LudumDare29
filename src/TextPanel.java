import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextPanel extends JPanel{

	TextManager textManager;
	JScrollPane scrollPane;
	JTextArea tArea;
	
	TextPanel(World lnkWorld)
	{
		this.tArea = new JTextArea();
		this.scrollPane = new JScrollPane(tArea);
		this.add(this.scrollPane);
		this.scrollPane.setPreferredSize(new Dimension(StartGame.WINDOW_WIDTH, StartGame.WINDOW_HEIGHT));
		
		this.textManager = new TextManager(this, lnkWorld);
		this.setBackground(Color.BLUE);
	}
}
