package gui;

import java.util.ArrayList;

import com.csvreader.CsvReader;

public class AnalysesFacade {
	
	public boolean yearCheck(int from, int to) {
		return (from > to) ? false : true;
	}
	
	public boolean exclusionListCheck(String country) {
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
