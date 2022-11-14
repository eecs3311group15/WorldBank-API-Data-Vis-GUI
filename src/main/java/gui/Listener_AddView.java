package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;

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
		String _method = String.valueOf(methodsList.getSelectedItem());
		String selectedFrom = String.valueOf (from.getSelectedItem());   
		String selectedTo = String.valueOf (to.getSelectedItem());  
		int _from = Integer.parseInt(selectedFrom);
		int _to = Integer.parseInt(selectedTo);
		
		System.out.println("add buttom");
		String viewerType = String.valueOf(viewsList.getSelectedItem());
		MainUI.viewers.add(ViewerFactory.createViewer(viewerType, _method, _country, _from, _to));
		
		for (Viewer i : MainUI.viewers) {
			i.addToPanel(MainUI.west);
		}
		
		MainUI.getInstance().validate();
		MainUI.getInstance().repaint();

	}

}
