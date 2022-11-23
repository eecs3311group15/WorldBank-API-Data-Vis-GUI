package analyses;

public class RunAnalyses {


	public static void main(String[] args) {
		
		int from = 2010; int to = 2015; String countryCode = "CAN";
		
		Analysis test = new ANN_PCT_CHG_co2EnergyPM25();
		test.runAnalyses(countryCode, from, to);
		test.displayData();

		Analysis test2 = new ANN_PCT_CHG_EducationToHealth();
		test2.runAnalyses(countryCode, from, to);
		test2.displayData();
		
		Analysis test3 = new ANN_PCT_CHG_pm25Forest();
		test3.runAnalyses(countryCode, from, to);
		test3.displayData();
		
		Analysis test4 = new AVG_EducationExpenditureToGDP();
		test4.runAnalyses(countryCode, from, to);
		test4.displayData();
		
		Analysis test5 = new AVG_forestToLand();
		test5.runAnalyses(countryCode, from, to);
		test5.displayData();
		
		Analysis test6 = new GRAPH_AccHealthCareToMortalityRate();
		test6.runAnalyses(countryCode, from, to);
		test6.displayData();
		
		Analysis test7 = new RATIO_co2GDP();
		test7.runAnalyses(countryCode, from, to);
		test7.displayData();
		
		Analysis test8 = new RATIO_HealthExpendToHospitalBeds();
		test8.runAnalyses(countryCode, from, to);
		test8.displayData();

	}

}
