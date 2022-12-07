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
	
	@Test
	public void ANN_PCT_CHG_Test() {
		boolean expected = true;
		boolean actual = false;
		Analysis test = new ANN_PCT_CHG_co2EnergyPM25();
		test.runAnalyses("CA", 2010, 2019);
		double co2 = test.resultMap.get("2012").get(0);
		if(co2 == -0.66088205886719) {
			actual = true;
		}		
		assertEquals(expected, actual);
	}
	
	@Test
	public void Ratio_Test() {
		boolean expected = true;
		boolean actual = false;
		Analysis test = new RATIO_co2GDP();
		test.runAnalyses("CA", 2010, 2019);
		double ratio = test.resultMap.get("2016").get(0);
		if(ratio == 0.036441880447490534) {
			actual = true;
		}		
		assertEquals(expected, actual);
	}
	
	@Test
	public void AVG_Test() {
		boolean expected = true;
		boolean actual = false;
		Analysis test = new AVG_forestToLand();
		test.runAnalyses("CA", 2010, 2019);
		double ratio = test.resultMap.get("2019").get(0);
		if(ratio == 38.71910270266652) {
			actual = true;
		}		
		assertEquals(expected, actual);
	}
}
