package analyses;

import java.text.DecimalFormat;
import java.util.ArrayList;

import com.google.gson.JsonArray;

import datafetcher.DataFetcher;
import datafetcher.DataFetcherHelper;

public class RATIO_co2GDP extends Analysis{
	
	private final String co2code = "EN.ATM.CO2E.PC";
	private final String gdpcode = "NY.GDP.PCAP.CD";
	
	private JsonArray co2;
	private JsonArray gdp;
	
	ArrayList<Double> result = new ArrayList<Double>();
	
	public RATIO_co2GDP(String country, int from, int to){
		super(country, from, to);
		co2 = DataFetcher.getJsonObject(co2code, country, from, to);
		gdp = DataFetcher.getJsonObject(gdpcode, country, from, to);
		analysis_description.add("CO2 / GDP ratio");
		//analysis_description.add(DataFetcherHelper.getDescription(gdp));
		
		compatibility.put("Pie Chart", false);
		compatibility.put("Line Chart", true);
		compatibility.put("Bar Chart", true);
		compatibility.put("Scatter Chart", true);
		compatibility.put("Time Chart", true);
		compatibility.put("Report", true);
	}
	
	public void runAnalyses() {
			
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
		printResult();
	}
	
	public void printResult() {
		int year = from;
		DecimalFormat f = new DecimalFormat("##0.00000");
		for (int i = 0; i < result.size(); i++) {
			System.out.println("Ratio of CO2 per GDP in " + year + " is " + f.format(result.get(i)) + "%\n");
			year++;
		}		
	}


	
}
