package gui_viewers;

import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JPanel;

import analyses.DataContainer;

public abstract class Viewer implements DataObserver, Strategy{
	
	protected String viewerTitle;

	
	Viewer(String viewerTitle){
		this.viewerTitle = viewerTitle;
	}
	
	public void addToPanel(JPanel west) {}

	public abstract void update(DataContainer data);

	public Viewer addViewer() {

		return this;
	};
}
