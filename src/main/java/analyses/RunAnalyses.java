package analyses;

public class RunAnalyses {


	public static void main(String[] args) {
		//RATIO_co2GDP test = new RATIO_co2GDP("CAN", 2000, 2001);
		//test.runAnalyses();
		
		//ANN_PCT_CHG_co2EnergyPM25 test2 = new ANN_PCT_CHG_co2EnergyPM25("CAN", 2018, 2021);
		//test2.runAnalyses();
		
		ForestAreaToLand test3 = new ForestAreaToLand("CAN", 2010, 2013);
		test3.runAnalyses();
		
		/*HealthExpendToHospitalBeds test4 = new HealthExpendToHospitalBeds("CAN", 2010, 2013);
		test4.runAnalyses();
		
		AccHealthCareToMortalityRate test5 = new AccHealthCareToMortalityRate("CAN", 2019, 2020);
		test5.runAnalyses();
		
		EducationToHealth test6 = new EducationToHealth("CAN", 2010, 2011);
		test6.runAnalyses();
		
		EducationExpenditure test7 = new EducationExpenditure("CAN", 2010, 2011);
		test7.runAnalyses();
		
		PM25ToForest test8 = new PM25ToForest("CAN", 2010, 2011);
		test8.runAnalyses();*/

	}

}
