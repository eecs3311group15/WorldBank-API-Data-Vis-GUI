package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Listener_Reset implements ActionListener{

	public void actionPerformed(ActionEvent e) {
		
		AnalysisFacade.selectedStrategies.clear();
		AnalysisFacade.viewers.clear();
		AnalysisFacade.analysis = null;
		
		MainUI.countriesList.setEnabled(true);	
		MainUI.fromList.setEnabled(true);
		MainUI.toList.setEnabled(true);
		MainUI.methodsList.setEnabled(true);
		MainUI.recalculate.setEnabled(true);
		MainUI.viewsList.setEnabled(true);
		MainUI.addView.setEnabled(true);
		MainUI.removeView.setEnabled(true);
		
		MainUI.west.removeAll();
		MainUI.getInstance().validate();
		MainUI.getInstance().repaint();
	}

}
