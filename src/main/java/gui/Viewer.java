package gui;

import javax.swing.JPanel;

class Viewer {
	
	private String viewerTitle;
	private String country;
	private int from;
	private int to;
	
	Viewer(String viewerTitle, String country, int from, int to){
		this.viewerTitle = viewerTitle;
		this.country = country;
		this.from = from;
		this.to = to;
	}
	
	protected void addToPanel(JPanel west) {};
}
