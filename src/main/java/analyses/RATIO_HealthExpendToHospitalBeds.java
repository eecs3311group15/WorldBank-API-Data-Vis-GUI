package analyses;

import java.util.ArrayList;

import com.google.gson.JsonArray;

import datafetcher.DataFetcher;

public class RATIO_HealthExpendToHospitalBeds extends Analysis{

	private final String healthCode= "SH.XPD.CHEX.PC.CD";
	private final String bedsCode = "SH.MED.BEDS.ZS";
	
	public RATIO_HealthExpendToHospitalBeds(){	
		compatibility.put("Pie Chart", false);
		compatibility.put("Line Chart", true);
		compatibility.put("Bar Chart", true);
		compatibility.put("Scatter Chart", true);
		compatibility.put("Time Chart", true);
		compatibility.put("Report", true);
	}
	
	public void runAnalyses(String country, int from, int to) {
		JsonArray healthExp = DataFetcher.getJsonObject(healthCode, country, from, to);
		JsonArray hospitalBeds = DataFetcher.getJsonObject(bedsCode, country, from, to);
		
		analysis_description.add("Health expenditure / Hospital bed ratio");
		
		int sizeOfResults = healthExp.get(1).getAsJsonArray().size();
		for (int i = 0; i < sizeOfResults; i++) {
			int year = DataFetcher.getYear(healthExp, i);
			double healthExpValue = DataFetcher.getValue(healthExp, i);
			double hospitalBedsValue = DataFetcher.getValue(hospitalBeds, i);
			
			if(healthExpValue == -999 || hospitalBedsValue == -999) {
				continue;
			}
			
			double ratio = (healthExpValue/hospitalBedsValue) * 100.0;
			ArrayList<Double> thisYearData = new ArrayList<Double>();
			thisYearData.add(ratio);
			resultMap.put(""+year, thisYearData);
		}
	}

}
