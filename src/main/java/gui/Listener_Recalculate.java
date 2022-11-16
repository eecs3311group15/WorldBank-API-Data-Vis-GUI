package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;

import analyses.Analysis;
import analyses.AnalysisFactory;
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
		analysis.addObservers(MainUI.viewers);
		analysis.runAnalyses();
		analysis.updateObservers();
		
		
		for (Viewer i : analysis.getObservers()) {
			i.addToPanel(MainUI.west);
		}
		
		MainUI.getInstance().validate();
		MainUI.getInstance().repaint();
	}

}
