package analyses;

import java.util.ArrayList;

import com.google.gson.JsonArray;

import datafetcher.DataFetcher;
import datafetcher.DataFetcherHelper;

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
		
		analysis_description.add(DataFetcherHelper.getDescription(accHealthCare));
		analysis_description.add(DataFetcherHelper.getDescription(moratlityRate));
		
		int sizeOfResults = accHealthCare.get(1).getAsJsonArray().size();
		for (int i = 0; i < sizeOfResults; i++) {
			int year = DataFetcherHelper.getYear(accHealthCare, i);
			
			double accHealthCareValue = DataFetcherHelper.getValue(accHealthCare, i);
			double moratlityRateValue = DataFetcherHelper.getValue(moratlityRate, i);
			
			ArrayList<Double> thisYearData = new ArrayList<Double>();
			thisYearData.add(accHealthCareValue);
			thisYearData.add(moratlityRateValue);
			resultMap.put(""+year, thisYearData);
			//System.out.println("Problems in accessing health care (% of women) in " + year + " is " + accHealthCareValue);
			//System.out.println("Maternal mortality eation (per 100,00 live births) in " + year + " is " + moratlityRateValue);
			
			//double ratio = accHealthCareValue/moratlityRateValue;
			//DecimalFormat f = new DecimalFormat("##0.00000");
			//System.out.println("Ratio of problems in accessing health care to maternal mortality in " + year + " is " + f.format(ratio) + "%\n");
			
		}
	}

}
