package analyses;

import java.text.DecimalFormat;

import com.google.gson.JsonArray;

import datafetcher.DataFetcher;

public class ANN_PCT_CHG_EducationToHealth extends Analysis{



	private final String educationCode= "SE.XPD.TOTL.GD.ZS";
	private final String healthCode = "SH.XPD.CHEX.GD.ZS";
	
	public ANN_PCT_CHG_EducationToHealth(String country, int from, int to){
		super(country, from, to);
	}
	
	public void runAnalyses() {
		
		JsonArray educationExp = dataFetcher.getJsonObject(educationCode, country, from, to);
		JsonArray healthExpenditure = dataFetcher.getJsonObject(healthCode, country, from, to);
		
		int sizeOfResults = educationExp.get(1).getAsJsonArray().size();
		for (int i = 0; i < sizeOfResults; i++) {
			double educationExpValue = educationExp.get(1).getAsJsonArray().get(i).getAsJsonObject().get("value").getAsDouble();
			double healthExpenditureValue = healthExpenditure.get(1).getAsJsonArray().get(i).getAsJsonObject().get("value").getAsDouble();
			int year = educationExp.get(1).getAsJsonArray().get(i).getAsJsonObject().get("date").getAsInt();
			
			System.out.println("Government expenditure on education, total (% of GDP) in " + year + " is " + educationExpValue);
			System.out.println("Current health expenditure (% of GDP) in " + year + " is " + healthExpenditureValue);
			
			double ratio = educationExpValue/healthExpenditureValue;
			DecimalFormat f = new DecimalFormat("##0.00000");
			System.out.println("Ratio Government expenditure on education to Health services in " + year + " is " + f.format(ratio) + "%\n");
			
		}
	}
}