package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;

public class RecalculateListener implements ActionListener{
	
	private JComboBox<String> country;
	private JComboBox<String> from;
	private JComboBox<String> to;
	
	public RecalculateListener (JComboBox<String> country, JComboBox<String> from, JComboBox<String> to) {
				
		this.country = country;
		this.from = from;
		this.to = to;
	}
	
	
	public void actionPerformed(ActionEvent e) {
		String _country = String.valueOf(country.getSelectedItem());
		String selectedFrom = String.valueOf (from.getSelectedItem());   
		String selectedTo = String.valueOf (to.getSelectedItem());  
		int _from = Integer.parseInt(selectedFrom);
		int _to = Integer.parseInt(selectedTo);
		
		System.out.println(_country + " " + _from + " " + _to);
		
	}

}
