package viewers;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

import analyses.DataContainer;

public class Viewer implements DataObserver{
	JPanel viewPanel;
	String viewerTitle;
	GraphStrategy strategy;
	DataContainer data;
	
	public Viewer(String viewerTitle){
		this.viewerTitle = viewerTitle;
		viewPanel = new JPanel();
		JLabel text = new JLabel("Please press Recalculate to display analysis results");
		viewPanel.add(text);
		viewPanel.setPreferredSize(new Dimension(400, 300));
		viewPanel.setBorder(BorderFactory.createTitledBorder(viewerTitle));
		viewPanel.setBackground(Color.white);
	}
	
	public void setStrategy(GraphStrategy strategy) {
		this.strategy = strategy;
		this.viewPanel = strategy.updateGraph(data);
	}
	
	public void addToPanel(JPanel west) { 
		west.add(viewPanel); 
	}
	
	public void update(DataContainer data) {
		this.data = data;
	}
}
