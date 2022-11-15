package analyses;

import java.text.DecimalFormat;
import java.util.ArrayList;

import com.google.gson.JsonArray;

import datafetcher.DataFetcherHelper;

public class RATIO_co2GDP extends Analysis{
	
	private final String co2code = "EN.ATM.CO2E.PC";
	private final String gdpcode = "NY.GDP.PCAP.CD";
	
	ArrayList<Double> result = new ArrayList<Double>();
	
	public RATIO_co2GDP(String country, int from, int to){
		super(country, from, to);
	}
	
	public void runAnalyses() {
		
		JsonArray co2 = dataFetcher.getJsonObject(co2code, country, from, to);
		JsonArray gdp = dataFetcher.getJsonObject(gdpcode, country, from, to);
		
		int sizeOfResults = co2.get(1).getAsJsonArray().size();
		for (int i = 0; i < sizeOfResults; i++) {
			double co2Value = DataFetcherHelper.getValue(co2, i);
			double gdpValue = DataFetcherHelper.getValue(gdp, i);
										
			double ratio = (co2Value/gdpValue) * 100.0;
			result.add(ratio);			
			
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

	@Override
	public ArrayList<String> getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<ArrayList<Double>> getResult() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
