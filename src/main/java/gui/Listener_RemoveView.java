package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import viewers.Viewer;

public class Listener_RemoveView implements ActionListener{

	public void actionPerformed(ActionEvent e) {
		int size = AnalysisFacade.viewers.size();
		if(size >= 1) {
			AnalysisFacade.selectedStrategies.remove(size -1);			
			AnalysisFacade.viewers.remove(size - 1);
			
			MainUI.west.removeAll();
			MainUI.west.validate();
			MainUI.west.repaint();
			for (Viewer i : AnalysisFacade.viewers) {
				i.addToPanel(MainUI.west);
			}			
			MainUI.getInstance().validate();
			MainUI.getInstance().repaint();
			
		}else {
			Helper.popupMsg("There are no Viewer on screen.");
		}		
	}

}
