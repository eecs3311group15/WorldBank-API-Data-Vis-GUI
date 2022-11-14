package analyses;

import java.text.DecimalFormat;

import com.google.gson.JsonArray;

import datafetcher.DataFetcherHelper;

public class AVG_forestToLand extends Analysis{
	private final String forestCode = "AG.LND.FRST.ZS";
	
	public AVG_forestToLand(String country, int from, int to){
		super(country, from, to);
	}
	
	public void runAnalyses() {
		
		JsonArray forest = dataFetcher.getJsonObject(forestCode, country, from, to);
		
		int sizeOfResults = forest.get(1).getAsJsonArray().size();
		for (int i = 0; i < sizeOfResults; i++) {
			double forestValue = DataFetcherHelper.getValue(forest, i);

			int year = DataFetcherHelper.getYear(forest, i);
			
			System.out.println("Forest area (% of land area) in " + year + " is " + forestValue);
			System.out.println("Other land area in " + year + " is " +( 100-forestValue));
			
			double ratio = forestValue;
			DecimalFormat f = new DecimalFormat("##0.00000");
			System.out.println("Avergae Forest area (as % of land area) in " + year + " is " + f.format(ratio) + "%\n");
			
		}
	}
}
