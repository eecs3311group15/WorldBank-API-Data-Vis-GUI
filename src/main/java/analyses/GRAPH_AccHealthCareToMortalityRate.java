package analyses;

import java.util.ArrayList;

import com.google.gson.JsonArray;

import datafetcher.DataFetcher;

public class GRAPH_AccHealthCareToMortalityRate extends Analysis{

	private final String accessCode= "SH.ACS.MONY.Q1.ZS";
	private final String mortalityCode = "SP.DYN.IMRT.IN";

	public GRAPH_AccHealthCareToMortalityRate(){
		compatibility.put("Pie Chart", true);
		compatibility.put("Line Chart", true);
		compatibility.put("Bar Chart", true);
		compatibility.put("Scatter Chart", true);
		compatibility.put("Time Chart", true);
		compatibility.put("Report", true);
	}
	
	public void runAnalyses(String country, int from, int to) {
		JsonArray accHealthCare = DataFetcher.getJsonObject(accessCode, country, from, to);
		JsonArray moratlityRate = DataFetcher.getJsonObject(mortalityCode, country, from, to);
		
		analysis_description.add(DataFetcher.getDescription(accHealthCare));
		analysis_description.add(DataFetcher.getDescription(moratlityRate));
		
		int sizeOfResults = accHealthCare.get(1).getAsJsonArray().size();
		for (int i = 0; i < sizeOfResults; i++) {
			int year = DataFetcher.getYear(accHealthCare, i);
			
			double accHealthCareValue = DataFetcher.getValue(accHealthCare, i);
			double moratlityRateValue = DataFetcher.getValue(moratlityRate, i);
			
			System.out.println("1: " + accHealthCareValue  + "   2:  " + moratlityRateValue);
			if(accHealthCareValue == -999 || moratlityRateValue == -999) {
				continue;
			}
			
			ArrayList<Double> thisYearData = new ArrayList<Double>();
			thisYearData.add(accHealthCareValue);
			thisYearData.add(moratlityRateValue);
			resultMap.put(""+year, thisYearData);
		}
	}

}
