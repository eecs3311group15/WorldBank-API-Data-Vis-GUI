package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Listener_Recalculate implements ActionListener{
		
	public void actionPerformed(ActionEvent e) {
			
		String country = String.valueOf(MainUI.countriesList.getSelectedItem());
		String countryCode = MainUI.countryHashMap.get(country);
		
		int from = Integer.parseInt(String.valueOf (MainUI.fromList.getSelectedItem()));
		int to = Integer.parseInt(String.valueOf (MainUI.toList.getSelectedItem()));
		String analysisType = String.valueOf(MainUI.methodsList.getSelectedItem());
		
		AnalysisFacade.startAnalysis(analysisType, country, countryCode, from, to);
							
		MainUI.getInstance().validate();
		MainUI.getInstance().repaint();
	}

}
