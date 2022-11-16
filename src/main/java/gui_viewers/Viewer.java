package gui_viewers;

import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JPanel;

public class Viewer implements DataObserver{
	
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
	
	public void addToPanel(JPanel west) {}

	public void update(HashMap<String, ArrayList<Double>> resultMap) {
		// TODO Auto-generated method stub
		
	};
}
