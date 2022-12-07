package gui;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import com.csvreader.CsvReader;

public class UC2 {
	
	
	@Test
	public void ExclusionListFileExist() {
		boolean expected = true;
		boolean actual = false;
		String path = "excluded_countries.csv";
		CsvReader reader;
		try {
			reader = new CsvReader(path);
			actual = reader.readHeaders();
		} catch (Exception e) {
			e.printStackTrace();
		} 	
		assertEquals(expected, actual);
	}
	
	@Test
	public void ExclusionListFileNotExist() {
		boolean expected = false;
		boolean actual = true;
		String path = "123.csv1";
		CsvReader reader;
		try {
			reader = new CsvReader(path);
			actual = reader.readHeaders();
		} catch (Exception e) {
			actual = false;
		} 	
		assertEquals(expected, actual);
	}
	
	@Test
	public void passExclusionListCheck() {
		boolean expected = false;
		boolean actual = AnalysisFacade.passExclusionCheck("Afghanistan");
		assertEquals(expected, actual);
	}
	
	@Test
	public void failExclusionListCheck() {
		boolean expected = true;
		boolean actual = AnalysisFacade.passExclusionCheck("Canada");
		assertEquals(expected, actual);
	}
	
	@Test
	public void ListSizeCheck() {
		boolean expected = true;
		boolean actual = false;
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
		} 	    	
		if(excludedCountries.size() == 5) {
			actual = true;
		}	
		assertEquals(expected, actual);
	}
}
