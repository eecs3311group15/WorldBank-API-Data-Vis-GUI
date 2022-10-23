package analyses;

import java.text.DecimalFormat;

import com.google.gson.JsonArray;

import datafetcher.DataFetcher;

public class ANN_PCT_CHG_co2EnergyPM25 extends Analysis{
	
	private final String co2code = "EN.ATM.CO2E.PC";
	private final String energycode = "EG.USE.PCAP.KG.OE";
	private final String pm25code = "EN.ATM.PM25.MC.M3";
	
	public ANN_PCT_CHG_co2EnergyPM25(String country, int from, int to) {
		super(country, from, to);
	}
	
	public void runAnalyses() {
		int _from = from -1;
		
		JsonArray co2 = dataFetcher.getJsonObject(co2code, country, _from, to);
		JsonArray energy = dataFetcher.getJsonObject(energycode, country, _from, to);
		JsonArray pm25 = dataFetcher.getJsonObject(pm25code, country, _from, to);
		
		int sizeOfResults = co2.get(1).getAsJsonArray().size();
		for (int i = 1; i < sizeOfResults-1; i++) {
			int year = co2.get(1).getAsJsonArray().get(i).getAsJsonObject().get("date").getAsInt();
			
			double co2Value = co2.get(1).getAsJsonArray().get(i).getAsJsonObject().get("value").getAsDouble();
			double prev_co2Value = co2.get(1).getAsJsonArray().get(i-1).getAsJsonObject().get("value").getAsDouble();
			double co2_diff = co2Value - prev_co2Value;
			
			double energyValue = energy.get(1).getAsJsonArray().get(i).getAsJsonObject().get("value").getAsDouble();
			double prev_energyValue = energy.get(1).getAsJsonArray().get(i-1).getAsJsonObject().get("value").getAsDouble();
			double energy_diff = energyValue - prev_energyValue;
						
			double pm25Value = pm25.get(1).getAsJsonArray().get(i).getAsJsonObject().get("value").getAsDouble();
			double prev_pm25Value = pm25.get(1).getAsJsonArray().get(i).getAsJsonObject().get("value").getAsDouble();
			double pm25_diff = pm25Value - prev_pm25Value;
			
			DecimalFormat f = new DecimalFormat("##0.00000");
			double co2_pct = (co2_diff/co2Value) * 100.0;
			double energy_pct = (energy_diff/energyValue) * 100.0;
			double pm25_pct = (pm25_diff/pm25Value) * 100.0;
			System.out.println("The annual percentage change of CO2 emission in " + year + " is " + f.format(co2_pct) + "%");
			System.out.println("The annual percentage change of Energy use in " + year + " is " + f.format(energy_pct) + "%");
			System.out.println("The annual percentage change of PM2.5 in " + year + " is " + f.format(pm25_pct) + "%");
		}
	}
}
