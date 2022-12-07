package gui;

import static org.junit.Assert.*;

import org.junit.Test;

import com.csvreader.CsvReader;

public class UC2 {
	
	
	@Test
	public void ExclusionListFileCheck() {
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
}
