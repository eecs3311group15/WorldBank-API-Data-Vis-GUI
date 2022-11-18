package analyses;

import java.util.ArrayList;

import com.google.gson.JsonArray;

import datafetcher.DataFetcher;
import datafetcher.DataFetcherHelper;

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
		
		analysis_description.add(DataFetcherHelper.getDescription(pm25));
		analysis_description.add(DataFetcherHelper.getDescription(forest));
		
		int sizeOfResults = to - from;	
		for (int i = 1; i < sizeOfResults - 1; i++) {
			int year = DataFetcherHelper.getYear(pm25, i);
			
			double pm25Value = DataFetcherHelper.getValue(pm25, i);
			double prev_pm25Value = DataFetcherHelper.getValue(pm25, i - 1);
			double pm25_diff = pm25Value - prev_pm25Value;
			
			double forestValue = DataFetcherHelper.getValue(forest, i);
			double prev_forestValue = DataFetcherHelper.getValue(forest, i - 1);
			double forest_diff = forestValue - prev_forestValue;
			
			double pm25_pct = (pm25_diff/pm25Value) * 100.0;
			double forest_pct = (forest_diff/forestValue) * 100.0;
			
			ArrayList<Double> thisYearData = new ArrayList<Double>();
			thisYearData.add(pm25_pct);
			thisYearData.add(forest_pct);
			resultMap.put(""+year, thisYearData);
			/*System.out.println("PM2.5 air pollution, mean annual exposure (as micrograms per cubic meter)  in " + year + " is " + pm25Value);
			System.out.println("Forest area (as % of land area) in " + year + " is " + forestValue);
			
			double ratio = (pm25Value/forestValue) * 100.0;
			DecimalFormat f = new DecimalFormat("##0.00000");
			System.out.println("Annual Percentage change of PM2.5 air pollution to Forest area in " + year + " is " + f.format(ratio) + "%\n");*/
			
		}
	}

}
