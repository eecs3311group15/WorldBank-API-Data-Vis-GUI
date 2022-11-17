package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import viewers.*;

public class MainUI extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static MainUI instance;

	static HashMap<String, String> countryHashMap = new HashMap<String, String>(); //Key: country name, value: country code
	
	protected static JPanel west;
	protected static JButton recalculate;
	protected static JButton reset;
	protected static JButton addView;		
	protected static JButton removeView;
	
	protected static JComboBox<String> viewsList;
	protected static JComboBox<String> fromList;
	protected static JComboBox<String> toList;
	protected static JComboBox<String> countriesList;
	protected static JComboBox<String> methodsList;
	
	public static MainUI getInstance(){
		if (instance == null)
			instance = new MainUI();
		return instance;
	}

	private MainUI(){		
		// Set window title
		super("Country Statistics");
		
		try {
			AnalysisFacade.loadCountryData();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		// Set top bar
		JLabel chooseCountryLabel = new JLabel("Choose a country: ");
		Vector<String> countriesNames = new Vector<String>();
		for (String i : countryHashMap.keySet()) {
			countriesNames.add(i);
		}       	
		countriesNames.sort(null);
		countriesList = new JComboBox<String>(countriesNames);

		JLabel from = new JLabel("From");
		JLabel to = new JLabel("To");
		Vector<String> yearsDown = new Vector<String>();
		for (int i = 2021; i >= 2010; i--) {
			yearsDown.add("" + i);
		}
		Vector<String> yearsUp = new Vector<String>();
		for (int i = 2010; i <= 2021; i++) {
			yearsUp.add("" + i);
		}
		fromList = new JComboBox<String>(yearsUp);
		toList = new JComboBox<String>(yearsDown);

		JPanel north = new JPanel();
		north.add(chooseCountryLabel);
		north.add(countriesList);
		north.add(from);
		north.add(fromList);
		north.add(to);
		north.add(toList);

		// Set bottom bar
		recalculate = new JButton("Recalculate");
		reset = new JButton("Reset");
		JLabel viewsLabel = new JLabel("Available Views: ");

		Vector<String> viewsNames = new Vector<String>();
		viewsNames.add("Pie Chart");
		viewsNames.add("Line Chart");
		viewsNames.add("Bar Chart");
		viewsNames.add("Scatter Chart");
		viewsNames.add("Time Chart");
		viewsNames.add("Report");
		viewsList = new JComboBox<String>(viewsNames);
		addView = new JButton("+");		
		removeView = new JButton("-");

		JLabel methodLabel = new JLabel("        Choose analysis method: ");

		Vector<String> methodsNames = new Vector<String>();
		methodsNames.add("Annual % change of CO2 - Energy use - PM2.5");
		methodsNames.add("Annual % change of education expenditure - health expenditure");
		methodsNames.add("Annual % change of PM2.5 - Forest area");
		methodsNames.add("Average of education expenditure");
		methodsNames.add("Average of Forest - Land");
		methodsNames.add("Accessing health care problem - Mortality rate, infant");
		methodsNames.add("Ratio of CO2 - GDP");
		methodsNames.add("Ratio of HealthExpend - hospitalBeds");				

		methodsList = new JComboBox<String>(methodsNames);

		JPanel south = new JPanel();
		south.add(viewsLabel);
		south.add(viewsList);
		south.add(addView);
		south.add(removeView);

		south.add(methodLabel);
		south.add(methodsList);
		south.add(recalculate);
		south.add(reset);
				
		ActionListener actionListener = new Listener_Recalculate();
		recalculate.addActionListener(actionListener);

		JPanel east = new JPanel();

		// Set charts region
		west = new JPanel();
		west.setLayout(new GridLayout(0, 2));
		JScrollPane scrollPane = new JScrollPane(west);

		getContentPane().add(north, BorderLayout.NORTH);
		getContentPane().add(east, BorderLayout.EAST);
		getContentPane().add(south, BorderLayout.SOUTH);
		getContentPane().add(scrollPane, BorderLayout.WEST);
		
		ActionListener addViewListener = new Listener_AddView();
		addView.addActionListener(addViewListener);
		
		ActionListener removeViewListener = new Listener_RemoveView();
		removeView.addActionListener(removeViewListener);
		
		ActionListener resetListener = new Listener_Reset();
		reset.addActionListener(resetListener);
	}	

	
	public static void startMainUI() throws IOException {

		JFrame frame = MainUI.getInstance();
		frame.setPreferredSize(new Dimension(1100, 600));
		//frame.setSize(900, 800);
		frame.pack();
		frame.setVisible(true);
	}
	// TODO Auto-generated method stub

}