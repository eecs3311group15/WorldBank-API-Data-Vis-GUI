package analyses;

public class RunAnalyses {


	public static void main(String[] args) {
		
		Analysis test = AnalysisFactory.getAnalysis("RATIO_co2GDP", "CAN", 2000, 2001);
		test.runAnalyses();
		
		Analysis test2 = AnalysisFactory.getAnalysis("ANN_PCT_CHG_co2EnergyPM25","CAN", 2018, 2021);
		test2.runAnalyses();
		
		Analysis test3 = AnalysisFactory.getAnalysis("AVG_forestToLand", "CAN", 2010, 2013);
		test3.runAnalyses();
		
		Analysis test4 = AnalysisFactory.getAnalysis("RATIO_HealthExpendToHospitalBeds", "CAN", 2010, 2013);
		test4.runAnalyses();
		
		Analysis test5 = AnalysisFactory.getAnalysis("GRAPH_AccHealthCareToMortalityRate", "CAN", 2019, 2020);
		test5.runAnalyses();
		
		Analysis test6 = AnalysisFactory.getAnalysis("ANN_PCT_CHG_EducationToHealth", "CAN", 2010, 2011);
		test6.runAnalyses();
		
		Analysis test7 = AnalysisFactory.getAnalysis("AVG_EducationExpenditureToGDP", "CAN", 2010, 2011);
		test7.runAnalyses();
		
		Analysis test8 = AnalysisFactory.getAnalysis("ANN_PCT_CHG_pm25Forest", "CAN", 2010, 2011);
		test8.runAnalyses();

	}

}
