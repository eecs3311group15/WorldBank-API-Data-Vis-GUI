package analyses;

import java.util.ArrayList;

import com.google.gson.JsonArray;

import datafetcher.DataFetcher;

public class ANN_PCT_CHG_pm25Forest extends Analysis{

	private final String pm25code = "EN.ATM.PM25.MC.M3";
	private final String forestcode = "AG.LND.FRST.ZS";
	
	public ANN_PCT_CHG_pm25Forest(){
		compatibility.put("Pie Chart", false);
		compatibility.put("Line Chart", true);
		compatibility.put("Bar Chart", true);
		compatibility.put("Scatter Chart", true);
		compatibility.put("Time Chart", true);
		compatibility.put("Report", true);
	}
	
	public void runAnalyses(String country, int from, int to) {
		int _from = from -1;
		
		JsonArray pm25 = DataFetcher.getJsonObject(pm25code, country, _from, to);
		JsonArray forest = DataFetcher.getJsonObject(forestcode, country, _from, to);
		
		analysis_description.add(DataFetcher.getDescription(pm25));
		analysis_description.add(DataFetcher.getDescription(forest));
		
		int sizeOfResults = to - from;	
		for (int i = 1; i < sizeOfResults - 1; i++) {
			int year = DataFetcher.getYear(pm25, i);
			
			double pm25Value = DataFetcher.getValue(pm25, i);
			double prev_pm25Value = DataFetcher.getValue(pm25, i - 1);
			double pm25_diff = pm25Value - prev_pm25Value;
			
			double forestValue = DataFetcher.getValue(forest, i);
			double prev_forestValue = DataFetcher.getValue(forest, i - 1);
			double forest_diff = forestValue - prev_forestValue;
			
			double pm25_pct = (pm25_diff/pm25Value) * 100.0;
			double forest_pct = (forest_diff/forestValue) * 100.0;
			
			if(pm25Value == -999 || forestValue == -999) {
				continue;
			}
			
			ArrayList<Double> thisYearData = new ArrayList<Double>();
			thisYearData.add(pm25_pct);
			thisYearData.add(forest_pct);
			resultMap.put(""+year, thisYearData);		
		}
	}

}
