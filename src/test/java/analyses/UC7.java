package analyses;

import static org.junit.Assert.*;

import org.junit.Test;

import com.csvreader.CsvReader;

public class UC7 {

	@Test
	public void hasDataTrue() {
		boolean expected = true;
		boolean actual = false;
		Analysis test = new ANN_PCT_CHG_co2EnergyPM25();
		test.runAnalyses("CA", 2015, 2016);
		actual = test.hasData();
		assertEquals(expected, actual);
	}
	
	@Test
	public void hasDataFalse() {
		boolean expected = false;
		boolean actual = true;
		Analysis test = new GRAPH_AccHealthCareToMortalityRate();
		try {
			test.runAnalyses("BQ", 2015, 2017);
			actual = test.hasData();
		} catch (Exception e) {
			actual = false;
		} 
		assertEquals(expected, actual);
	}
}
