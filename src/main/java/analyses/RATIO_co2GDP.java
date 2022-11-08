package analyses;

import java.text.DecimalFormat;

import com.google.gson.JsonArray;

import datafetcher.DataFetcherHelper;

public class RATIO_co2GDP extends Analysis{
	
	private final String co2code = "EN.ATM.CO2E.PC";
	private final String gdpcode = "NY.GDP.PCAP.CD";
		
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
			
			int year = DataFetcherHelper.getYear(co2, i);
			
			System.out.println("CO2 emissions (metric tons per capita) in " + year + " is " + co2Value);
			System.out.println("GDP per capita (current US$) in " + year + " is " + gdpValue);
			
			double ratio = (co2Value/gdpValue) * 100.0;
			DecimalFormat f = new DecimalFormat("##0.00000");
			System.out.println("Ratio of CO2 per GDP in " + year + " is " + f.format(ratio) + "%\n");
			
		}
	}
	
}
