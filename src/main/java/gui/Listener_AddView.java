package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;

class Listener_AddView implements ActionListener{
	
	private JComboBox<String> viewsList;
	
	public Listener_AddView(JComboBox<String> viewsList) {
		this.viewsList = viewsList;
	}
	
	public void actionPerformed(ActionEvent e) {
		MainUI.west.removeAll();
		MainUI.west.validate();
		MainUI.west.repaint();
		
		System.out.println("add buttom");
		String viewerType = String.valueOf(viewsList.getSelectedItem());
		MainUI.viewers.add(ViewerFactory.createViewer(viewerType));
		
		for (Viewer i : MainUI.viewers) {
			i.addToPanel(MainUI.west);
		}
		
		MainUI.getInstance().validate();
		MainUI.getInstance().repaint();

	}

}
