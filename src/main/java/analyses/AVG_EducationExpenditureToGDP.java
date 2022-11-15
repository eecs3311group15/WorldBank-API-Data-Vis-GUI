package analyses;

import java.text.DecimalFormat;
import java.util.ArrayList;

import com.google.gson.JsonArray;

import datafetcher.DataFetcher;
import datafetcher.DataFetcherHelper;

public class AVG_EducationExpenditureToGDP extends Analysis{

	private final String educationCode= "SE.XPD.TOTL.GD.ZS";

	private JsonArray educationExp;
	
	public AVG_EducationExpenditureToGDP(String country, int from, int to){
		super(country, from, to);
		educationExp = DataFetcher.getJsonObject(educationCode, country, from, to);
		
		analysis_description.add(DataFetcherHelper.getDescription(educationExp));
		analysis_description.add("All other purposes");
		
		compatibility.put("Pie Chart", true);
		compatibility.put("Line Chart", false);
		compatibility.put("Bar Chart", false);
		compatibility.put("Scatter Chart", false);
		compatibility.put("Time Chart", false);
		compatibility.put("Report", true);

	}
	
	public void runAnalyses() {
	
		int sizeOfResults = educationExp.get(1).getAsJsonArray().size();
		double sum = 0;
		for (int i = 0; i < sizeOfResults; i++) {
			double educationExpValue = DataFetcherHelper.getValue(educationExp, i);			
			//double ratio = educationExpValue;
			//DecimalFormat f = new DecimalFormat("##0.00000");
			//System.out.println("Teh avergae Government expenditure on education(as % of GDP) in " + year + " is " + f.format(ratio) + "%\n");
			sum = sum + educationExpValue;
		}
		double avg_result = sum / (double)sizeOfResults;
		double rest_result = 100.0 - avg_result;
		ArrayList<Double> thisYearData = new ArrayList<Double>();
		thisYearData.add(avg_result);
		thisYearData.add(rest_result);
		
		int year = DataFetcherHelper.getYear(educationExp, 0);
		resultMap.put(""+year, thisYearData);
	}


}
