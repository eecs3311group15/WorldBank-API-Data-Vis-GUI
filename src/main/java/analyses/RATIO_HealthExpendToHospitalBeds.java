package analyses;

import java.text.DecimalFormat;

import com.google.gson.JsonArray;

import datafetcher.DataFetcher;

public class RATIO_HealthExpendToHospitalBeds extends Analysis{

	private final String healthCode= "SH.XPD.CHEX.PC.CD";
	private final String bedsCode = "SH.MED.BEDS.ZS";
	
	
	public RATIO_HealthExpendToHospitalBeds(String country, int from, int to){
		super(country, from, to);
	}
	
	public void runAnalyses() {
		
		JsonArray healthExp = dataFetcher.getJsonObject(healthCode, country, from, to);
		JsonArray hospitalBeds = dataFetcher.getJsonObject(bedsCode, country, from, to);
		
		int sizeOfResults = healthExp.get(1).getAsJsonArray().size();
		for (int i = 0; i < sizeOfResults; i++) {
			double healthExpValue = healthExp.get(1).getAsJsonArray().get(i).getAsJsonObject().get("value").getAsDouble();
			double hospitalBedsValue = hospitalBeds.get(1).getAsJsonArray().get(i).getAsJsonObject().get("value").getAsDouble();
			int year = healthExp.get(1).getAsJsonArray().get(i).getAsJsonObject().get("date").getAsInt();
			
			System.out.println("Government Expenditure for health services in " + year + " is " + healthExpValue);
			System.out.println("Hospital beds (per 1,000 people) " + year + " is " + hospitalBedsValue);
			
			double ratio = healthExpValue/hospitalBedsValue;
			DecimalFormat f = new DecimalFormat("##0.00000");
			System.out.println("Ratio of Government Health Expenditure per hospital beds in " + year + " is " + f.format(ratio) + "%\n");
			
		}
	}
}
