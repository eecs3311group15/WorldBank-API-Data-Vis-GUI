package test;

import java.text.DecimalFormat;

import com.google.gson.JsonArray;

public class RunAnalyses {
	
	static DataFetcher dataFetcher = new DataFetcher();	
	
	
	public static void RATIO_co2GDP(int from, int to) {
		JsonArray co2 = dataFetcher.getJsonObject("EN.ATM.CO2E.PC", "CAN", from, to);
		JsonArray gdp = dataFetcher.getJsonObject("NY.GDP.PCAP.CD", "CAN", from, to);
		
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
	
	
	public static void ANN_PCT_CHG_co2EnergyPM25(int from, int to) {
		int _from = from -1;
		
		JsonArray co2 = dataFetcher.getJsonObject("EN.ATM.CO2E.PC", "CAN", _from, to);
		JsonArray energy = dataFetcher.getJsonObject("EG.USE.PCAP.KG.OE", "CAN", _from, to);
		JsonArray pm25 = dataFetcher.getJsonObject("EN.ATM.PM25.MC.M3", "CAN", _from, to);
		
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
	
	
	
	
	

	
	
	public static void main(String[] args) {
		RATIO_co2GDP(2000, 2001);
		//PCT_CHG_co2EnergyPM25(2010, 2015);

	}

}
