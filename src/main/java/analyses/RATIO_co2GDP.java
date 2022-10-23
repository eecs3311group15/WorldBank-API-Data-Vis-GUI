package analyses;

import java.text.DecimalFormat;

import com.google.gson.JsonArray;

import datafetcher.DataFetcher;

public class RATIO_co2GDP extends Analysis{
	
	private final String co2code = "EN.ATM.CO2E.PC";
	private final String gdpcode = "NY.GDP.PCAP.CD";
	
	private static DataFetcher dataFetcher = new DataFetcher();
	
	public RATIO_co2GDP(String country, int from, int to){
		super(country, from, to);
	}
	
	public void runAnalyses() {
		
		JsonArray co2 = dataFetcher.getJsonObject(co2code, country, from, to);
		JsonArray gdp = dataFetcher.getJsonObject(gdpcode, country, from, to);
		
		int sizeOfResults = co2.get(1).getAsJsonArray().size();
		for (int i = 0; i < sizeOfResults; i++) {
			double co2Value = co2.get(1).getAsJsonArray().get(i).getAsJsonObject().get("value").getAsDouble();
			double gdpValue = gdp.get(1).getAsJsonArray().get(i).getAsJsonObject().get("value").getAsDouble();
			int year = co2.get(1).getAsJsonArray().get(i).getAsJsonObject().get("date").getAsInt();
			
			System.out.println("CO2 emissions (metric tons per capita) in " + year + " is " + co2Value);
			System.out.println("GDP per capita (current US$) in " + year + " is " + gdpValue);
			
			double ratio = (co2Value/gdpValue) * 100.0;
			DecimalFormat f = new DecimalFormat("##0.00000");
			System.out.println("Ratio of CO2 per GDP in " + year + " is " + f.format(ratio) + "%\n");
			
		}
	}
	
}
