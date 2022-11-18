package analyses;

import java.util.ArrayList;

import com.google.gson.JsonArray;

import datafetcher.DataFetcher;
import datafetcher.DataFetcherHelper;

public class RATIO_co2GDP extends Analysis{
	
	private final String co2code = "EN.ATM.CO2E.PC";
	private final String gdpcode = "NY.GDP.PCAP.CD";
	
	public RATIO_co2GDP(){	
		compatibility.put("Pie Chart", false);
		compatibility.put("Line Chart", true);
		compatibility.put("Bar Chart", true);
		compatibility.put("Scatter Chart", true);
		compatibility.put("Time Chart", true);
		compatibility.put("Report", true);
	}
	
	public void runAnalyses(String country, int from, int to) {
		JsonArray co2 = DataFetcher.getJsonObject(co2code, country, from, to);
		JsonArray gdp = DataFetcher.getJsonObject(gdpcode, country, from, to);
		analysis_description.add("CO2 / GDP ratio");
		
		int sizeOfResults = co2.get(1).getAsJsonArray().size();
		for (int i = 0; i < sizeOfResults; i++) {
			int year = DataFetcherHelper.getYear(co2, i);
			double co2Value = DataFetcherHelper.getValue(co2, i);
			double gdpValue = DataFetcherHelper.getValue(gdp, i);
										
			double ratio = (co2Value/gdpValue) * 100.0;
			
			ArrayList<Double> thisYearData = new ArrayList<Double>();
			thisYearData.add(ratio);	
			resultMap.put(""+year, thisYearData);
		}

	}
	


	
}
