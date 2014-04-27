import javax.swing.JPanel;

public class GraphicPanel extends JPanel{

	GraphicManager graphicManager;
	
	GraphicPanel(World lnkWorld)
	{
		this.graphicManager = new GraphicManager(this, lnkWorld);
	}
}
