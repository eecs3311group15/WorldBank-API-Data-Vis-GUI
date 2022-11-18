package analyses;

import java.util.ArrayList;

import com.google.gson.JsonArray;

import datafetcher.DataFetcher;
import datafetcher.DataFetcherHelper;

public class ANN_PCT_CHG_co2EnergyPM25 extends Analysis{
	
	private final String co2code = "EN.ATM.CO2E.PC";
	private final String energycode = "EG.USE.PCAP.KG.OE";
	private final String pm25code = "EN.ATM.PM25.MC.M3";
	
	public ANN_PCT_CHG_co2EnergyPM25() {		
		compatibility.put("Pie Chart", false);
		compatibility.put("Line Chart", true);
		compatibility.put("Bar Chart", true);
		compatibility.put("Scatter Chart", true);
		compatibility.put("Time Chart", true);
		compatibility.put("Report", true);	
	}
	
	public void runAnalyses(String country, int from, int to) {
		int _from = from -1;
		JsonArray co2 = DataFetcher.getJsonObject(co2code, country, _from, to);
		JsonArray energy = DataFetcher.getJsonObject(energycode, country, _from, to);
		JsonArray pm25 = DataFetcher.getJsonObject(pm25code, country, _from, to);
		
		analysis_description.add(DataFetcherHelper.getDescription(co2));
		analysis_description.add(DataFetcherHelper.getDescription(energy));
		analysis_description.add(DataFetcherHelper.getDescription(pm25));
		
		int sizeOfResults = to - from;
		for (int i = 1; i < sizeOfResults - 1; i++) {
			int year = DataFetcherHelper.getYear(co2, i);
			
			double co2Value = DataFetcherHelper.getValue(co2, i);
			double prev_co2Value = DataFetcherHelper.getValue(co2, i - 1);
			double co2_diff = co2Value - prev_co2Value;
			
			double energyValue = DataFetcherHelper.getValue(energy, i);
			double prev_energyValue = DataFetcherHelper.getValue(energy, i - 1);
			double energy_diff = energyValue - prev_energyValue;
						
			double pm25Value = DataFetcherHelper.getValue(pm25, i);
			double prev_pm25Value = DataFetcherHelper.getValue(pm25, i - 1);
			double pm25_diff = pm25Value - prev_pm25Value;
				
			double co2_pct = (co2_diff/co2Value) * 100.0;	
			double energy_pct = (energy_diff/energyValue) * 100.0;	
			double pm25_pct = (pm25_diff/pm25Value) * 100.0;
						
			ArrayList<Double> thisYearData = new ArrayList<Double>();
			thisYearData.add(co2_pct);
			thisYearData.add(energy_pct);
			thisYearData.add(pm25_pct);
			
			resultMap.put(""+year, thisYearData);
		}

	}
}
