package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Listener_RemoveView implements ActionListener{

	public void actionPerformed(ActionEvent e) {
		int size = MainUI.viewers.size();
		if(size >= 1) {
			MainUI.viewers.remove(size - 1);
			
			MainUI.west.removeAll();
			MainUI.west.validate();
			MainUI.west.repaint();
			for (Viewer i : MainUI.viewers) {
				i.addToPanel(MainUI.west);
			}
			
			MainUI.getInstance().validate();
			MainUI.getInstance().repaint();
			
		}else {
			System.out.println("Array of viewers is empty");
		}		
	}

}
