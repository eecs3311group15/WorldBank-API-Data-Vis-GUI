package gui;

import java.util.HashMap;

import com.csvreader.CsvReader;

public class Helper {
	
	protected static void loadUserData(String path) throws Exception{
	    	
	    CsvReader reader = new CsvReader(path); 
	    reader.readHeaders();
	    while(reader.readRecord()){
	    	LoginModule.emails.add(reader.get("email"));
	    	LoginModule.passwords.add(reader.get("password"));
	    }
	   
	}
	
	protected static HashMap<String, String> loadCountryData(String path) throws Exception{
    	
		CsvReader reader;
		HashMap<String, String> countryHashMap = new HashMap<String, String>();
		
		reader = new CsvReader(path);
		reader.readHeaders();
		while(reader.readRecord()){
			String country = reader.get("name");
			String code = reader.get("country");
			countryHashMap.put(country, code);
        } 	
		return countryHashMap;	   
	}
}
