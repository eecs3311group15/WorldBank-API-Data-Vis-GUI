package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import analyses.AnalysisFactory;
import viewers.Viewer;

class Listener_AddView implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
		MainUI.west.removeAll();
		MainUI.west.validate();
		MainUI.west.repaint();
		
		//MainUI.countriesList.setEnabled(false);	
		//MainUI.fromList.setEnabled(false);
		//MainUI.toList.setEnabled(false);
		MainUI.methodsList.setEnabled(false);
		
		String _country = String.valueOf(MainUI.countriesList.getSelectedItem());
		
		String analysisType = String.valueOf(MainUI.methodsList.getSelectedItem()); 		
		String viewerType = String.valueOf(MainUI.viewsList.getSelectedItem());			
		/*compatibility check*/	
		
		AnalysisFacade.analysis = AnalysisFactory.getAnalysis(analysisType);
		HashMap<String, Boolean> compatibility = AnalysisFacade.analysis.getCompatibility();
		
		if(compatibility.get(viewerType)) {		
			AnalysisFacade.selectedStrategies.add(viewerType);
			AnalysisFacade.viewers.add(new Viewer(analysisType));				
			
		}else {				
			Helper.popupMsg(analysisType + " is not compatible with " + viewerType);
		}			
			
		
		for (Viewer i : AnalysisFacade.viewers) {
			i.addToPanel(MainUI.west);
		}
		MainUI.getInstance().validate();
		MainUI.getInstance().repaint();		

	}

}
