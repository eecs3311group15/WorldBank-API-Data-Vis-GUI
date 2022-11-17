package gui_viewers;

import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import analyses.DataContainer;

public abstract class Strategy implements GraphStrategy{
	
	
	String viewerTitle = "";
	JPanel main = new JPanel();
	
	Strategy(String viewerTitle){
		this.viewerTitle = viewerTitle;
	}


}
