package viewers;

import javax.swing.JPanel;

public abstract class Strategy implements GraphStrategy{
	
	
	String viewerTitle = "";
	JPanel viewerPanel = new JPanel();
	
	Strategy(String viewerTitle){
		this.viewerTitle = viewerTitle;
	}


}
