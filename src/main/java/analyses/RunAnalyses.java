package analyses;

public class RunAnalyses {


	public static void main(String[] args) {
		
		//Analysis test = AnalysisFactory.getAnalysis("Ratio of CO2 - GDP", "CAN", 2000, 2001);
		//test.runAnalyses();
		
		Analysis test2 = AnalysisFactory.getAnalysis("Annual % change of CO2 - Energy use - PM2.5","CAN", 2010, 2020);
		test2.runAnalyses();
		
		/*Analysis test3 = AnalysisFactory.getAnalysis("Average of Forest - Land", "CAN", 2010, 2013);
		test3.runAnalyses();
		
		Analysis test4 = AnalysisFactory.getAnalysis("Ratio of HealthExpend - hospitalBeds", "CAN", 2010, 2013);
		test4.runAnalyses();
		
		Analysis test5 = AnalysisFactory.getAnalysis("Accessing health care problem - Mortality rate, infant", "CAN", 2019, 2020);
		test5.runAnalyses();
		
		Analysis test6 = AnalysisFactory.getAnalysis("Annual % change of education expenditure - health expenditure", "CAN", 2010, 2011);
		test6.runAnalyses();
		
		Analysis test7 = AnalysisFactory.getAnalysis("Average of education expenditure", "CAN", 2010, 2011);
		test7.runAnalyses();
		
		Analysis test8 = AnalysisFactory.getAnalysis("Annual % change of PM2.5 - Forest area", "CAN", 2010, 2011);
		test8.runAnalyses();*/

	}

}
