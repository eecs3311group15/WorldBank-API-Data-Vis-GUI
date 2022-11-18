package analyses;

import java.util.ArrayList;

import com.google.gson.JsonArray;

import datafetcher.DataFetcher;
import datafetcher.DataFetcherHelper;

public class ANN_PCT_CHG_EducationToHealth extends Analysis{


	private final String educationCode= "SE.XPD.TOTL.GD.ZS";
	private final String healthCode = "SH.XPD.CHEX.GD.ZS";
	
	public ANN_PCT_CHG_EducationToHealth(){		
		compatibility.put("Pie Chart", false);
		compatibility.put("Line Chart", true);
		compatibility.put("Bar Chart", true);
		compatibility.put("Scatter Chart", true);
		compatibility.put("Time Chart", true);
		compatibility.put("Report", true);
	}
	
	public void runAnalyses(String country, int from, int to) {
		int _from = from -1;
		JsonArray educationExp = DataFetcher.getJsonObject(educationCode, country, _from, to);
		JsonArray healthExpenditure = DataFetcher.getJsonObject(healthCode, country, _from, to);	
		analysis_description.add(DataFetcherHelper.getDescription(educationExp));
		analysis_description.add(DataFetcherHelper.getDescription(healthExpenditure));
		
		int sizeOfResults = to - from;	
		for (int i = 1; i < sizeOfResults - 1; i++) {
			int year = DataFetcherHelper.getYear(educationExp, i);
			
			double educationExpValue = DataFetcherHelper.getValue(educationExp, i);
			double prev_EducationExpValue = DataFetcherHelper.getValue(educationExp, i - 1);
			double educationExpValue_diff = educationExpValue - prev_EducationExpValue;
			
			double healthExpenditureValue = DataFetcherHelper.getValue(healthExpenditure, i);
			double prev_HealthExpenditureValue = DataFetcherHelper.getValue(healthExpenditure, i - 1);
			double healthExpenditureValue_diff = healthExpenditureValue - prev_HealthExpenditureValue;
			
			double educationExpValue_pct = (educationExpValue_diff/educationExpValue) * 100.0;
			double healthExpenditureValue_pct = (healthExpenditureValue_diff/healthExpenditureValue) * 100.0;
			
			if(educationExpValue == -999 || healthExpenditureValue == -999) {
				continue;
			}
			
			ArrayList<Double> thisYearData = new ArrayList<Double>();
			thisYearData.add(educationExpValue_pct);
			thisYearData.add(healthExpenditureValue_pct);
			resultMap.put(""+year, thisYearData);
			
		}
	}


}
