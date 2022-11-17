package viewers;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

import analyses.DataContainer;

public class Viewer implements DataObserver{
	JPanel main;
	String viewerTitle;
	GraphStrategy strategy;
	DataContainer data;
	
	public Viewer(String viewerTitle){
		this.viewerTitle = viewerTitle;
		main = new JPanel();
		JLabel text = new JLabel("Please press Recalculate to display analysis results");
		main.add(text);
		main.setPreferredSize(new Dimension(400, 300));
		main.setBorder(BorderFactory.createTitledBorder(viewerTitle));
		main.setBackground(Color.white);
	}
	
	public void setStrategy(GraphStrategy strategy) {
		this.strategy = strategy;
		this.main = strategy.updateGraph(data);
	}
	
	public void addToPanel(JPanel west) { 
		west.add(main); 
	}
	
	public void update(DataContainer data) {
		this.data = data;
	}
}
