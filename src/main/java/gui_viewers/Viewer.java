package gui_viewers;

import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import analyses.DataContainer;

public abstract class Viewer implements DataObserver, Strategy{
	
	protected String viewerTitle;
	protected JPanel main;
	
	Viewer(String viewerTitle){
		this.viewerTitle = viewerTitle;
		main = new JPanel();
		main.setPreferredSize(new Dimension(400, 300));
		main.setBorder(BorderFactory.createTitledBorder(viewerTitle));
		main.setBackground(Color.white);
	}
	
	public void addToPanel(JPanel west) { west.add(main); }

	public abstract void update(DataContainer data);

	public Viewer addViewer() {

		return this;
	};
}
