package gui;

import java.util.HashMap;
import com.csvreader.CsvReader;

class Helper {
	
	
	
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
	
	
	
}
