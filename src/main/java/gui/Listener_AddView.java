package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import analyses.Analysis;
import analyses.AnalysisFactory;
import gui_viewers.Viewer;

class Listener_AddView implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
		MainUI.west.removeAll();
		MainUI.west.validate();
		MainUI.west.repaint();
		
		MainUI.countriesList.setEnabled(false);	
		MainUI.fromList.setEnabled(false);
		MainUI.toList.setEnabled(false);
		MainUI.methodsList.setEnabled(false);
		
		String _country = String.valueOf(MainUI.countriesList.getSelectedItem());
		if(!AnalysesFacade.exclusionListCheck(_country)) {

			Helper.popupMsg(_country + "'s data is unavailable, please select another country");
			
			MainUI.countriesList.setEnabled(true);	
			MainUI.fromList.setEnabled(true);
			MainUI.toList.setEnabled(true);
			MainUI.methodsList.setEnabled(true);
		}else {

			String _countryCode = MainUI.countryHashMap.get(_country);
			String analysisType = String.valueOf(MainUI.methodsList.getSelectedItem()); 
			int _from = Integer.parseInt(String.valueOf (MainUI.fromList.getSelectedItem()));
			int _to = Integer.parseInt(String.valueOf (MainUI.toList.getSelectedItem()));		
			String viewerType = String.valueOf(MainUI.viewsList.getSelectedItem());
			
			/*compatibility check*/			
			Analysis temp = AnalysisFactory.getAnalysis(analysisType, _country, _from, _to);
			HashMap<String, Boolean> compatibility = temp.getCompatibility();
			
			if(compatibility.get(viewerType)) {		
				Helper.selectedStrategies.add(viewerType);
				Helper.viewers.add(new Viewer(analysisType));				
				
			}else {				
				Helper.popupMsg(analysisType + " is not compatible with " + viewerType);
			}			
			
		}
		for (Viewer i : Helper.viewers) {
			i.addToPanel(MainUI.west);
		}
		MainUI.getInstance().validate();
		MainUI.getInstance().repaint();
		
		
		

	}

}
