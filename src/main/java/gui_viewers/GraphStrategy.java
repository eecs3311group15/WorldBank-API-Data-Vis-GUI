package gui_viewers;

import javax.swing.JPanel;

import analyses.DataContainer;

public interface GraphStrategy {
	JPanel updateGraph(DataContainer data);
}
