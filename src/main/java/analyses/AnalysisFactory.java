package analyses;

public class AnalysisFactory {
	
	public static Analysis getAnalysis(String type, String country, int from, int to) {
		
		if(type.equals("Annual % change of CO2 - Energy use - PM2.5")) {
			System.out.println("test");
			return new ANN_PCT_CHG_co2EnergyPM25(country, from, to);
			
		}else if(type.equals("Annual % change of education expenditure - health expenditure")) {
			return new ANN_PCT_CHG_EducationToHealth(country, from, to);
			
		}else if(type.equals("Annual % change of PM2.5 - Forest area")) {
			return new ANN_PCT_CHG_pm25Forest(country, from, to);
			
		}else if(type.equals("Average of education expenditure")) {
			return new AVG_EducationExpenditureToGDP(country, from, to);
			
		}else if(type.equals("Average of Forest - Land")) {
			return new AVG_forestToLand(country, from, to);
			
		}else if(type.equals("Accessing health care problem - Mortality rate, infant")) {
			return new GRAPH_AccHealthCareToMortalityRate(country, from, to);
			
		}else if(type.equals("Ratio of CO2 - GDP")) {
			return new RATIO_co2GDP(country, from, to);
			
		}else if(type.equals("Ratio of HealthExpend - hospitalBeds")) {
			return new RATIO_HealthExpendToHospitalBeds(country, from, to);
			
		}
		
		return null;
	}
}
