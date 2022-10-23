package analyses;

import java.text.DecimalFormat;

import com.google.gson.JsonArray;

import datafetcher.DataFetcher;

public class ForestAreaToLand extends Analysis{
	private final String forestCode = "AG.LND.FRST.ZS";
//	private final String landCode = "NY.GDP.PCAP.CD";
	
	public ForestAreaToLand(String country, int from, int to){
		super(country, from, to);
	}
	
	public void runAnalyses() {
		
		JsonArray forest = dataFetcher.getJsonObject(forestCode, country, from, to);
		//JsonArray gdp = dataFetcher.getJsonObject(gdpcode, country, from, to);
		
		int sizeOfResults = forest.get(1).getAsJsonArray().size();
		for (int i = 0; i < sizeOfResults; i++) {
			double forestValue = forest.get(1).getAsJsonArray().get(i).getAsJsonObject().get("value").getAsDouble();
			//double gdpValue = gdp.get(1).getAsJsonArray().get(i).getAsJsonObject().get("value").getAsDouble();
			int year = forest.get(1).getAsJsonArray().get(i).getAsJsonObject().get("date").getAsInt();
			
			System.out.println("Forest area (% of land area) in " + year + " is " + forestValue);
			System.out.println("Other land area in " + year + " is " +( 100-forestValue));
			
			double ratio = forestValue;
			DecimalFormat f = new DecimalFormat("##0.00000");
			System.out.println("Avergae Forest area (as % of land area) in " + year + " is " + f.format(ratio) + "%\n");
			
		}
	}
}
