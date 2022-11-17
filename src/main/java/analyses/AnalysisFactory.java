package analyses;

public class AnalysisFactory {
	
	public static Analysis getAnalysis(String analysisType) {
		
		if(analysisType.equals("Annual % change of CO2 - Energy use - PM2.5")) {
			return new ANN_PCT_CHG_co2EnergyPM25();
			
		}else if(analysisType.equals("Annual % change of education expenditure - health expenditure")) {
			return new ANN_PCT_CHG_EducationToHealth();
			
		}else if(analysisType.equals("Annual % change of PM2.5 - Forest area")) {
			return new ANN_PCT_CHG_pm25Forest();
			
		}else if(analysisType.equals("Average of education expenditure")) {
			return new AVG_EducationExpenditureToGDP();
			
		}else if(analysisType.equals("Average of Forest - Land")) {
			return new AVG_forestToLand();
			
		}else if(analysisType.equals("Accessing health care problem - Mortality rate, infant")) {
			return new GRAPH_AccHealthCareToMortalityRate();
			
		}else if(analysisType.equals("Ratio of CO2 - GDP")) {
			return new RATIO_co2GDP();
			
		}else if(analysisType.equals("Ratio of HealthExpend - hospitalBeds")) {
			return new RATIO_HealthExpendToHospitalBeds();
			
		}
		
		return null;
	}
}
