package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;

import analyses.Analysis;
import analyses.AnalysisFactory;
import viewers.Strategy;
import viewers.Strategy_Bar;
import viewers.Strategy_Line;
import viewers.Strategy_Pie;
import viewers.Strategy_Report;
import viewers.Strategy_Scatter;
import viewers.Strategy_Time;
import viewers.Viewer;

class Listener_Recalculate implements ActionListener{
		
	public void actionPerformed(ActionEvent e) {
			
		String country = String.valueOf(MainUI.countriesList.getSelectedItem());
		String countryCode = MainUI.countryHashMap.get(country);
		
		int from = Integer.parseInt(String.valueOf (MainUI.fromList.getSelectedItem()));
		int to = Integer.parseInt(String.valueOf (MainUI.toList.getSelectedItem()));
				
		if(!AnalysisFacade.yearCheck(from, to)) {
			AnalysisFacade.popupMsg("Starting year has to be less or equal to Ending year");			
		}else {		
			if(!AnalysisFacade.passExclusionCheck(country)) {
				AnalysisFacade.popupMsg(country + "'s data is unavailable, please select another country");
			}else {
				MainUI.west.removeAll();
				MainUI.west.validate();
				MainUI.west.repaint();
				
				String analysisType = String.valueOf(MainUI.methodsList.getSelectedItem()); 
				
				AnalysisFacade.analysis.runAnalyses(countryCode, from, to);
				AnalysisFacade.analysis.updateObservers(AnalysisFacade.viewers);
								
				AnalysisFacade.setStrategy(analysisType); //Set Graph display strategy for existing viewers
							
				MainUI.countriesList.setEnabled(false);	
				MainUI.fromList.setEnabled(false);
				MainUI.toList.setEnabled(false);
				MainUI.methodsList.setEnabled(false);
				MainUI.recalculate.setEnabled(false);
				MainUI.viewsList.setEnabled(false);
				MainUI.addView.setEnabled(false);
				MainUI.removeView.setEnabled(false);				
			}					
		}
							
		MainUI.getInstance().validate();
		MainUI.getInstance().repaint();
	}

}
