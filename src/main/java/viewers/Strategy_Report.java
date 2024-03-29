package viewers;

import java.awt.Color;
import java.awt.Dimension;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import analyses.DataContainer;

public class Strategy_Report extends Strategy{
	private int from, to;
	private boolean avgAnalysis;
	
	public Strategy_Report(String viewerTitle) {
		super(viewerTitle);	
		avgAnalysis = false;
	}
	public Strategy_Report(String viewerTitle, int from, int to) {
		super(viewerTitle);		
		this.from = from;
		this.to = to;
		avgAnalysis = true;
	}
	
	public JPanel updateGraph(DataContainer data) {
		HashMap<String, ArrayList<Double>> resultMap = data.getData();
		ArrayList<String> description = data.getDescription();
		
		JScrollPane outputScrollPane;
		ArrayList<String> lines = new ArrayList<String>();
		int size = description.size();	
		for(int i = 0; i < size; i++) {
			String temp = description.get(i) + "\n";				
			for(String k : resultMap.keySet()) {	
				if(avgAnalysis == true) {
					temp = temp + "The Average between " + from + " to " + to + " is ";
				}else {
					temp = temp + "For year " + k + ": ";
				}
				ArrayList<Double> thisYearData = resultMap.get(k);
				DecimalFormat df = new DecimalFormat("####0.00");
				temp = temp + df.format(thisYearData.get(i))   + "\n";
			}
			temp = temp + ".\n";
			lines.add(temp);
		}
		String reportMessage = "";
		for(int i = 0; i < size; i++) {
			reportMessage = reportMessage + lines.get(i);
		}
		
		JTextArea report = new JTextArea();
		report.setEditable(false);
		report.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		report.setBackground(Color.white);	
		
		report.setText(reportMessage);
		report.setLineWrap(true);
		report.setWrapStyleWord(true);
		
		outputScrollPane = new JScrollPane(report, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		outputScrollPane.setPreferredSize(new Dimension(400, 300));
		viewerPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15)); 
		viewerPanel.add(outputScrollPane);
		return viewerPanel;
		
	}
}
