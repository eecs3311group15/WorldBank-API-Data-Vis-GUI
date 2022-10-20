package analyses;

public class RunAnalyses {


	public static void main(String[] args) {
		RATIO_co2GDP test = new RATIO_co2GDP("CAN", 2000, 2001);
		test.runAnalyses();
		
		ANN_PCT_CHG_co2EnergyPM25 test2 = new ANN_PCT_CHG_co2EnergyPM25("CAN", 2010, 2015);
		test2.runAnalyses();

	}

}
