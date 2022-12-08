package analyses;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UC8 {

	@Before
	public void setUp() throws Exception {


	}

	@After
	public void tearDown() throws Exception {

	}
	
	@Test
	public void pieCompatibilityCheck1() {
		
		ANN_PCT_CHG_co2EnergyPM25 c02 = new ANN_PCT_CHG_co2EnergyPM25();
		
		Boolean actual = false;
		
		Boolean pieC = c02.compatibility.get("Pie Chart");
		Boolean graphC = (c02.compatibility.get("Line Chart") && c02.compatibility.get("Bar Chart") && c02.compatibility.get("Scatter Chart") && c02.compatibility.get("Time Chart"));
		
		
		if (pieC == false && graphC == true ) {
			
			actual = true;
			
		}
		
		assertEquals(true, actual);
		
	}
	

	@Test
	public void pieCompatibilityCheck2() {
		
		AVG_EducationExpenditureToGDP education = new AVG_EducationExpenditureToGDP();
		Boolean actual = false;
		
		Boolean pieC = education.compatibility.get("Pie Chart");
		Boolean graphC = (education.compatibility.get("Line Chart") ^ education.compatibility.get("Bar Chart") ^ education.compatibility.get("Scatter Chart") ^ education.compatibility.get("Time Chart"));
		
		if (pieC == true && graphC == false ) {
			
			actual = true;
			
		}
		assertEquals(true, actual);
		
	}
	
	@Test
	public void pieCompatibilityCheck3() {
		
		AVG_forestToLand forest = new AVG_forestToLand();
		Boolean actual = false;
		
		Boolean pieC = forest.compatibility.get("Pie Chart");
		Boolean graphC = (forest.compatibility.get("Line Chart") ^ forest.compatibility.get("Bar Chart") ^ forest.compatibility.get("Scatter Chart") ^ forest.compatibility.get("Time Chart"));
		
		
		if (pieC == true && graphC == false ) {
			
			actual = true;
			
		}
		
		assertEquals(true, actual);
		
	}
	
	@Test
	public void pieCompatibilityCheck4() {
		
		RATIO_co2GDP ratioC02 = new RATIO_co2GDP();
		
		Boolean actual = false;
		Boolean pieC = ratioC02.compatibility.get("Pie Chart");
		Boolean graphC = (ratioC02.compatibility.get("Line Chart") && ratioC02.compatibility.get("Bar Chart") && ratioC02.compatibility.get("Scatter Chart") && ratioC02.compatibility.get("Time Chart"));
		
	
		if (pieC == false && graphC == true ) {
			
			actual = true;
			
		}

		assertEquals(true, actual);
		
	}
	
	@Test
	public void pieCompatibilityCheck5() {
		
		ANN_PCT_CHG_EducationToHealth eddHealth = new ANN_PCT_CHG_EducationToHealth();
	
		Boolean actual = false;
		
		Boolean pieC = eddHealth.compatibility.get("Pie Chart");
		Boolean graphC = (eddHealth.compatibility.get("Line Chart") && eddHealth.compatibility.get("Bar Chart") && eddHealth.compatibility.get("Scatter Chart") && eddHealth.compatibility.get("Time Chart"));

	if (pieC == false && graphC == true ) {
			
			actual = true;
			
		}
		
		assertEquals(true, actual);
	}
	
	@Test
	public void pieCompatibilityCheck6() {
		
		GRAPH_AccHealthCareToMortalityRate healthMR = new GRAPH_AccHealthCareToMortalityRate();
	
		Boolean actual = false;
		
		Boolean pieC = healthMR.compatibility.get("Pie Chart");
		Boolean graphC = (healthMR.compatibility.get("Line Chart") && healthMR.compatibility.get("Bar Chart") && healthMR.compatibility.get("Scatter Chart") && healthMR.compatibility.get("Time Chart"));

	if (pieC == true && graphC == true ) {
			
			actual = true;
			
		}
		
		assertEquals(true, actual);
	}
	
	@Test
	public void pieCompatibilityCheck7() {
		
		ANN_PCT_CHG_pm25Forest forestPCT = new ANN_PCT_CHG_pm25Forest();
	
		Boolean actual = false;
		
		Boolean pieC = forestPCT.compatibility.get("Pie Chart");
		Boolean graphC = (forestPCT.compatibility.get("Line Chart") && forestPCT.compatibility.get("Bar Chart") && forestPCT.compatibility.get("Scatter Chart") && forestPCT.compatibility.get("Time Chart"));

	if (pieC == false && graphC == true ) {
			
			actual = true;
			
		}
		
		assertEquals(true, actual);
	}
	
	@Test
	public void pieCompatibilityCheck8() {
		
		RATIO_HealthExpendToHospitalBeds hosBeds = new RATIO_HealthExpendToHospitalBeds();
	
		Boolean actual = false;
		
		Boolean pieC = hosBeds.compatibility.get("Pie Chart");
		Boolean graphC = (hosBeds.compatibility.get("Line Chart") && hosBeds.compatibility.get("Bar Chart") && hosBeds.compatibility.get("Scatter Chart") && hosBeds.compatibility.get("Time Chart"));

	if (pieC == false && graphC == true ) {
			
			actual = true;
			
		}
		
		assertEquals(true, actual);
	}
	

}