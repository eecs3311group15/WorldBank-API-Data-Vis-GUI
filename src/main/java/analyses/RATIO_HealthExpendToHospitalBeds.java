package analyses;

import java.util.ArrayList;

import com.google.gson.JsonArray;

import datafetcher.DataFetcher;
import datafetcher.DataFetcherHelper;

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
			int year = DataFetcherHelper.getYear(healthExp, i);
			double healthExpValue = DataFetcherHelper.getValue(healthExp, i);
			double hospitalBedsValue = DataFetcherHelper.getValue(hospitalBeds, i);
			
			//System.out.println("Government Expenditure for health services in " + year + " is " + healthExpValue);
			//System.out.println("Hospital beds (per 1,000 people) " + year + " is " + hospitalBedsValue);
			
			double ratio = (healthExpValue/hospitalBedsValue) * 100.0;
			//DecimalFormat f = new DecimalFormat("##0.00000");
			//System.out.println("Ratio of Government Health Expenditure per hospital beds in " + year + " is " + f.format(ratio) + "%\n");
			ArrayList<Double> thisYearData = new ArrayList<Double>();
			thisYearData.add(ratio);
			resultMap.put(""+year, thisYearData);
		}
	}

}
