package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;

import analyses.Analysis;
import analyses.AnalysisFactory;
import gui_viewers.Strategy;
import gui_viewers.Strategy_Bar;
import gui_viewers.Strategy_Line;
import gui_viewers.Strategy_Pie;
import gui_viewers.Strategy_Report;
import gui_viewers.Strategy_Scatter;
import gui_viewers.Strategy_Time;
import gui_viewers.Viewer;

class Listener_Recalculate implements ActionListener{
		
	public void actionPerformed(ActionEvent e) {
		MainUI.west.removeAll();
		MainUI.west.validate();
		MainUI.west.repaint();
		
		String _country = String.valueOf(MainUI.countriesList.getSelectedItem());
		String _countryCode = MainUI.countryHashMap.get(_country);
		
		int _from = Integer.parseInt(String.valueOf (MainUI.fromList.getSelectedItem()));
		int _to = Integer.parseInt(String.valueOf (MainUI.toList.getSelectedItem()));
		
		System.out.println(_country + " " + _from + " " + _to);
		
		AnalysesFacade preAnalysesCheck = new AnalysesFacade();
		System.out.println("Passed Year range check: " + preAnalysesCheck.yearCheck(_from, _to));
		System.out.println("Passed Exclusion country check: " + preAnalysesCheck.exclusionListCheck(_country));
			
		
		String analysisType = String.valueOf(MainUI.methodsList.getSelectedItem()); 
		Analysis analysis = AnalysisFactory.getAnalysis(analysisType, _countryCode, _from, _to);
		
		analysis.runAnalyses();
		analysis.updateObservers(Helper.viewers);
		
		
		for(int i = 0; i < Helper.viewers.size(); i++) {
			Strategy strategy = null;
			
			if(Helper.selectedStrategies.get(i).equals("Bar Chart")) {
				strategy = new Strategy_Bar(analysisType);
				
			}else if(Helper.selectedStrategies.get(i).equals("Line Chart")) {
				strategy = new Strategy_Line(analysisType);
				
			}else if(Helper.selectedStrategies.get(i).equals("Pie Chart")) {
				strategy = new Strategy_Pie(analysisType);
				
			}else if(Helper.selectedStrategies.get(i).equals("Report")) {
				strategy = new Strategy_Report(analysisType);
				
			}else if(Helper.selectedStrategies.get(i).equals("Scatter Chart")) {
				strategy = new Strategy_Scatter(analysisType);
				
			}else if(Helper.selectedStrategies.get(i).equals("Time Chart")) {
				strategy = new Strategy_Time(analysisType);			
			}
			
			Helper.viewers.get(i).setStrategy(strategy);			
			Helper.viewers.get(i).addToPanel(MainUI.west);
		}
		
		MainUI.getInstance().validate();
		MainUI.getInstance().repaint();
	}

}
