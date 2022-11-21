package gui;

import java.util.ArrayList;
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
	
	public static void startAnalysis(String analysisType, String country, String countryCode, int from, int to) {
		if(!yearCheck(from, to)) {
			Helper.popupMsg("Starting year has to be less or equal to Ending year");			
		}else {		
			if(!passExclusionCheck(country)) {
				Helper.popupMsg(country + "'s data is unavailable, please select another country");
			}else {
				MainUI.west.removeAll();
				MainUI.west.validate();
				MainUI.west.repaint();
				
				analysisType = String.valueOf(MainUI.methodsList.getSelectedItem()); 
				
				analysis.runAnalyses(countryCode, from, to);
				
				if(analysis.hasData()) {
					analysis.updateObservers(AnalysisFacade.viewers);
					
					setStrategy(analysisType); //Set Graph display strategy for existing viewers
					
					
					MainUI.countriesList.setEnabled(false);	
					MainUI.fromList.setEnabled(false);
					MainUI.toList.setEnabled(false);
					MainUI.methodsList.setEnabled(false);
					MainUI.recalculate.setEnabled(false);
					MainUI.viewsList.setEnabled(false);
					MainUI.addView.setEnabled(false);
					MainUI.removeView.setEnabled(false);
				}else {
					Helper.popupMsg("All data for selected COUNTRY/YEAR/ANALYSIS is unavailable, please select options");
				}
				
				
								
			}					
		}
	}
	
	private static void setStrategy(String analysisType) {
		for(int i = 0; i < AnalysisFacade.viewers.size(); i++) {
			Strategy strategy = null;
			
			if(AnalysisFacade.selectedStrategies.get(i).equals("Bar Chart")) {
				strategy = new Strategy_Bar(analysisType);
				
			}else if(AnalysisFacade.selectedStrategies.get(i).equals("Line Chart")) {
				strategy = new Strategy_Line(analysisType);
				
			}else if(AnalysisFacade.selectedStrategies.get(i).equals("Pie Chart")) {
				strategy = new Strategy_Pie(analysisType);
				
			}else if(AnalysisFacade.selectedStrategies.get(i).equals("Report")) {
				if(analysisType.equals("Average of education expenditure") || analysisType.equals("Average of Forest - Land")) {
					int from = Integer.parseInt(String.valueOf (MainUI.fromList.getSelectedItem()));
					int to = Integer.parseInt(String.valueOf (MainUI.toList.getSelectedItem()));
					strategy = new Strategy_Report(analysisType, from, to);
				}else {
					strategy = new Strategy_Report(analysisType);
				}
				
			}else if(AnalysisFacade.selectedStrategies.get(i).equals("Scatter Chart")) {
				strategy = new Strategy_Scatter(analysisType);
				
			}else if(AnalysisFacade.selectedStrategies.get(i).equals("Time Chart")) {
				strategy = new Strategy_Time(analysisType);			
			}
			
			AnalysisFacade.viewers.get(i).setStrategy(strategy);			
			AnalysisFacade.viewers.get(i).addToPanel(MainUI.west);
		}
	}
	
	private static boolean yearCheck(int from, int to) {
		return (from > to) ? false : true;
	}
	
	private static boolean passExclusionCheck(String country) {
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
			e.printStackTrace();
		} 	    	    
		return (excludedCountries.contains(country)) ? false : true;
		
	}
	
	
	
}
