package analyses;

import java.text.DecimalFormat;
import java.util.ArrayList;

import com.google.gson.JsonArray;

import datafetcher.DataFetcher;

public class GRAPH_AccHealthCareToMortalityRate extends Analysis{


	private final String accessCode= "SH.ACS.MONY.Q1.ZS";
	private final String mortalityCode = "SP.DYN.IMRT.IN";
	
	public GRAPH_AccHealthCareToMortalityRate(String country, int from, int to){
		super(country, from, to);
	}
	
	public void runAnalyses() {
		
		JsonArray accHealthCare = dataFetcher.getJsonObject(accessCode, country, from, to);
		JsonArray moratlityRate = dataFetcher.getJsonObject(mortalityCode, country, from, to);
		
		int sizeOfResults = accHealthCare.get(1).getAsJsonArray().size();
		for (int i = 0; i < sizeOfResults; i++) {
			System.out.println(accHealthCare.get(1).getAsJsonArray().get(i).getAsJsonObject());
			double accHealthCareValue = accHealthCare.get(1).getAsJsonArray().get(i).getAsJsonObject().get("decimal").getAsInt();
			double moratlityRateValue = moratlityRate.get(1).getAsJsonArray().get(i).getAsJsonObject().get("value").getAsDouble();
			int year = accHealthCare.get(1).getAsJsonArray().get(i).getAsJsonObject().get("date").getAsInt();
			
			System.out.println("Problems in accessing health care (% of women) in " + year + " is " + accHealthCareValue);
			System.out.println("Maternal mortality eation (per 100,00 live births) in " + year + " is " + moratlityRateValue);
			
			double ratio = accHealthCareValue/moratlityRateValue;
			DecimalFormat f = new DecimalFormat("##0.00000");
			System.out.println("Ratio of problems in accessing health care to maternal mortality in " + year + " is " + f.format(ratio) + "%\n");
			
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
