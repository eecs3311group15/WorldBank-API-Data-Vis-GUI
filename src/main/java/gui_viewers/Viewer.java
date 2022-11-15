package gui_viewers;

import javax.swing.JPanel;

public class Viewer {
	
	protected String viewerTitle;
	private String country;
	private int from;
	private int to;
	
	Viewer(String viewerTitle, String country, int from, int to){
		this.viewerTitle = viewerTitle;
		this.country = country;
		this.from = from;
		this.to = to;
	}
	
	public void addToPanel(JPanel west) {};
}
