package analyses;

import java.text.DecimalFormat;

import com.google.gson.JsonArray;

import datafetcher.DataFetcher;

public class PM25ToForest {

	
	private final String pm25code = "EN.ATM.PM25.MC.M3";
	private final String forestcode = "AG.LND.FRST.ZS";
	
	private static DataFetcher dataFetcher = new DataFetcher();
	private String country;
	private int from;
	private int to;
	
	public PM25ToForest(String country, int from, int to){

		this.country = country ;
		this.from = from;
		this.to = to;
	}
	
	public void runAnalyses() {
		
		JsonArray pm25 = dataFetcher.getJsonObject(pm25code, country, from, to);
		JsonArray forest = dataFetcher.getJsonObject(forestcode, country, from, to);
		
		int sizeOfResults = pm25.get(1).getAsJsonArray().size();
		for (int i = 0; i < sizeOfResults; i++) {
			double pm25Value = pm25.get(1).getAsJsonArray().get(i).getAsJsonObject().get("value").getAsDouble();
			double forestValue = forest.get(1).getAsJsonArray().get(i).getAsJsonObject().get("value").getAsDouble();
			int year = pm25.get(1).getAsJsonArray().get(i).getAsJsonObject().get("date").getAsInt();
			
			System.out.println("PM2.5 air pollution, mean annual exposure (as micrograms per cubic meter)  in " + year + " is " + pm25Value);
			System.out.println("Forest area (as % of land area) in " + year + " is " + forestValue);
			
			double ratio = (pm25Value/forestValue) * 100.0;
			DecimalFormat f = new DecimalFormat("##0.00000");
			System.out.println("Annual Percentage change of PM2.5 air pollution to Forest area in " + year + " is " + f.format(ratio) + "%\n");
			
		}
	}
}
