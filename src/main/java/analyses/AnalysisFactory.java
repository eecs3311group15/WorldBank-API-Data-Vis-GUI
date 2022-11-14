package analyses;

public class AnalysisFactory {
	
	public static Analysis getAnalysis(String type, String country, int from, int to) {
		
		if(type.equals("ANN_PCT_CHG_co2EnergyPM25")) {
			return new ANN_PCT_CHG_co2EnergyPM25(country, from, to);
			
		}else if(type.equals("ANN_PCT_CHG_EducationToHealth")) {
			return new ANN_PCT_CHG_EducationToHealth(country, from, to);
			
		}else if(type.equals("ANN_PCT_CHG_pm25Forest")) {
			return new ANN_PCT_CHG_pm25Forest(country, from, to);
			
		}else if(type.equals("AVG_EducationExpenditureToGDP")) {
			return new AVG_EducationExpenditureToGDP(country, from, to);
			
		}else if(type.equals("AVG_forestToLand")) {
			return new AVG_forestToLand(country, from, to);
			
		}else if(type.equals("GRAPH_AccHealthCareToMortalityRate")) {
			return new GRAPH_AccHealthCareToMortalityRate(country, from, to);
			
		}else if(type.equals("RATIO_co2GDP")) {
			return new RATIO_co2GDP(country, from, to);
			
		}else if(type.equals("RATIO_HealthExpendToHospitalBeds")) {
			return new RATIO_HealthExpendToHospitalBeds(country, from, to);
			
		}
		
		return null;
	}
}
