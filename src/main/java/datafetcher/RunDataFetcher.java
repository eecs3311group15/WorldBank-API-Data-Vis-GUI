package datafetcher;

import com.google.gson.JsonArray;

public class RunDataFetcher {

	public static void main(String[] args) {
		
		DataFetcher dataFetcher = new DataFetcher();
		
		JsonArray population = dataFetcher.getJsonObject("SP.POP.TOTL", "CAN", 2000, 2001);
		System.out.println(population.get(1).getAsJsonArray().get(0).getAsJsonObject().get("value"));
		
		JsonArray hospitalBeds = dataFetcher.getJsonObject("SH.MED.BEDS.ZS", "CAN", 2020, 2020);
		System.out.println(hospitalBeds.get(1).getAsJsonArray().get(0).getAsJsonObject().get("indicator").getAsJsonObject().get("value"));
		System.out.println(hospitalBeds.get(1).getAsJsonArray().get(0).getAsJsonObject().get("country").getAsJsonObject().get("value"));
		System.out.println(hospitalBeds.get(1).getAsJsonArray().get(0).getAsJsonObject().get("value"));


		
		return;

	}

}
