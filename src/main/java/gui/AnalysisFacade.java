package gui;

import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

import com.csvreader.CsvReader;

import analyses.Analysis;
import viewers.Strategy;
import viewers.Strategy_Bar;
import viewers.Strategy_Line;
import viewers.Strategy_Pie;
import viewers.Strategy_Report;
import viewers.Strategy_Scatter;
import viewers.Strategy_Time;
import viewers.Viewer;

class AnalysisFacade {
	
	protected static ArrayList<String> selectedStrategies = new ArrayList<String>();
	protected static ArrayList<Viewer> viewers = new ArrayList<Viewer>();
	protected static Analysis analysis;
	
	
	protected static void popupMsg(String msg) {
		JOptionPane.showMessageDialog(null, msg);
	}
	
	protected static void loadUserData(String path) throws Exception{
	    	
	    CsvReader reader = new CsvReader(path); 
	    reader.readHeaders();
	    while(reader.readRecord()){
	    	LoginModule.emails.add(reader.get("email"));
	    	LoginModule.passwords.add(reader.get("password"));
	    }
	   
	}
	
	protected static void loadCountryData() throws Exception{
		String countryPath = "all_countries.csv";
		
		CsvReader reader;
		MainUI.countryHashMap = new HashMap<String, String>();
		
		reader = new CsvReader(countryPath);
		reader.readHeaders();
		while(reader.readRecord()){
			String country = reader.get("name");
			String code = reader.get("country");
			MainUI.countryHashMap.put(country, code);
        } 	
   
	}
	
	protected static void setStrategy(String analysisType) {
		for(int i = 0; i < AnalysisFacade.viewers.size(); i++) {
			Strategy strategy = null;
			
			if(AnalysisFacade.selectedStrategies.get(i).equals("Bar Chart")) {
				strategy = new Strategy_Bar(analysisType);
				
			}else if(AnalysisFacade.selectedStrategies.get(i).equals("Line Chart")) {
				strategy = new Strategy_Line(analysisType);
				
			}else if(AnalysisFacade.selectedStrategies.get(i).equals("Pie Chart")) {
				strategy = new Strategy_Pie(analysisType);
				
			}else if(AnalysisFacade.selectedStrategies.get(i).equals("Report")) {
				strategy = new Strategy_Report(analysisType);
				
			}else if(AnalysisFacade.selectedStrategies.get(i).equals("Scatter Chart")) {
				strategy = new Strategy_Scatter(analysisType);
				
			}else if(AnalysisFacade.selectedStrategies.get(i).equals("Time Chart")) {
				strategy = new Strategy_Time(analysisType);			
			}
			
			AnalysisFacade.viewers.get(i).setStrategy(strategy);			
			AnalysisFacade.viewers.get(i).addToPanel(MainUI.west);
		}
	}
	
	public static boolean yearCheck(int from, int to) {
		return (from > to) ? false : true;
	}
	
	public static boolean passExclusionCheck(String country) {
		String path = "excluded_countries.csv";
		ArrayList<String> excludedCountries = new ArrayList<String>();
		
		CsvReader reader;
		try {
			reader = new CsvReader(path);
			reader.readHeaders();
		    while(reader.readRecord()){
		    	excludedCountries.add(reader.get("name"));
		    }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	    	    
		return (excludedCountries.contains(country)) ? false : true;
		
	}
	
	
}
