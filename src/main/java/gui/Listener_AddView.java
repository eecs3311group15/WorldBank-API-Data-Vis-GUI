package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JComboBox;

import analyses.Analysis;
import analyses.AnalysisFactory;
import gui_viewers.Viewer;
import gui_viewers.ViewerFactory;

class Listener_AddView implements ActionListener{
	
	private JComboBox<String> viewsList;
	private JComboBox<String> methodsList;
	private JComboBox<String> country;
	private JComboBox<String> from;
	private JComboBox<String> to;
	
	public Listener_AddView(JComboBox<String> viewsList, JComboBox<String> methodsList, JComboBox<String> country, JComboBox<String> from, JComboBox<String> to) {
		this.viewsList = viewsList;
		this.methodsList = methodsList;
		this.country = country;
		this.from = from;
		this.to = to;
	}
	
	public void actionPerformed(ActionEvent e) {
		MainUI.west.removeAll();
		MainUI.west.validate();
		MainUI.west.repaint();
		
		String _country = String.valueOf(country.getSelectedItem());
		if(!AnalysesFacade.exclusionListCheck(_country)) {
			//Need to implement pop up window for this
			System.out.println(_country + "'s data is unavailable, please select another country");
		}else {
			///////////////Parameters from GUI/////////////
			String _countryCode = MainUI.countryHashMap.get(_country);
			String analysisType = String.valueOf(methodsList.getSelectedItem());
			String selectedFrom = String.valueOf (from.getSelectedItem());   
			String selectedTo = String.valueOf (to.getSelectedItem());  
			int _from = Integer.parseInt(selectedFrom);
			int _to = Integer.parseInt(selectedTo);		
			String viewerType = String.valueOf(viewsList.getSelectedItem());
			/////////////////////////////////////////////////
			
			/*compatibility check*/			
			Analysis temp = AnalysisFactory.getAnalysis(analysisType, _country, _from, _to);
			HashMap<String, Boolean> compatibility = temp.getCompatibility();
			
			if(compatibility.get(viewerType)) {
				MainUI.viewers.add(ViewerFactory.createViewer(viewerType, analysisType, _countryCode, _from, _to));				
				
			}else {				
				System.out.println(analysisType + " is not compatible with " + viewerType);
			}			
			
		}
		for (Viewer i : MainUI.viewers) {
			i.addToPanel(MainUI.west);
		}
		MainUI.getInstance().validate();
		MainUI.getInstance().repaint();
		
		
		

	}

}
