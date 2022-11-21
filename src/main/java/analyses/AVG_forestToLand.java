package analyses;

import java.util.ArrayList;
import com.google.gson.JsonArray;
import datafetcher.DataFetcher;

public class AVG_forestToLand extends Analysis{
	
	private final String forestCode = "AG.LND.FRST.ZS";
	
	public AVG_forestToLand(){		
		compatibility.put("Pie Chart", true);
		compatibility.put("Line Chart", false);
		compatibility.put("Bar Chart", false);
		compatibility.put("Scatter Chart", false);
		compatibility.put("Time Chart", false);
		compatibility.put("Report", true);
	}
	
	public void runAnalyses(String country, int from, int to) {
		JsonArray forest = DataFetcher.getJsonObject(forestCode, country, from, to);
		analysis_description.add(DataFetcher.getDescription(forest));
		analysis_description.add("All other purposes");
		
		int sizeOfResults = forest.get(1).getAsJsonArray().size();
		double sum = 0;
		for (int i = 0; i < sizeOfResults; i++) {
			double forestValue = DataFetcher.getValue(forest, i);	
			if(forestValue == -999) {
				continue;
			}
			sum = sum + forestValue;
		}
		double avg_result = sum / (double)sizeOfResults;
		double rest_result = 100.0 - avg_result;
		ArrayList<Double> thisYearData = new ArrayList<Double>();
		thisYearData.add(avg_result);
		thisYearData.add(rest_result);
		
		int year = DataFetcher.getYear(forest, 0);
		resultMap.put(""+year, thisYearData);
	}

}
