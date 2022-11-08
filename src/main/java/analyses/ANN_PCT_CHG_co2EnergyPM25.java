package analyses;

import java.text.DecimalFormat;
import java.util.ArrayList;

import com.google.gson.JsonArray;

import datafetcher.*;

public class ANN_PCT_CHG_co2EnergyPM25 extends Analysis{
	
	private final String co2code = "EN.ATM.CO2E.PC";
	private final String energycode = "EG.USE.PCAP.KG.OE";
	private final String pm25code = "EN.ATM.PM25.MC.M3";
	
	ArrayList<Double> co2_result = new ArrayList<Double>();
	ArrayList<Double> energy_result = new ArrayList<Double>();
	ArrayList<Double> pm25_result = new ArrayList<Double>();
	
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
			int year = DataFetcherHelper.getYear(co2, i);
			
			double co2Value = DataFetcherHelper.getValue(co2, i);
			double prev_co2Value = DataFetcherHelper.getValue(co2, i - 1);
			double co2_diff = co2Value - prev_co2Value;
			
			double energyValue = DataFetcherHelper.getValue(energy, i);
			double prev_energyValue = DataFetcherHelper.getValue(energy, i - 1);
			double energy_diff = energyValue - prev_energyValue;
						
			double pm25Value = DataFetcherHelper.getValue(pm25, i);
			double prev_pm25Value = DataFetcherHelper.getValue(pm25, i - 1);
			double pm25_diff = pm25Value - prev_pm25Value;
			
			
			double co2_pct = (co2_diff/co2Value) * 100.0;
			co2_result.add(co2_pct);
			double energy_pct = (energy_diff/energyValue) * 100.0;
			energy_result.add(energy_pct);
			double pm25_pct = (pm25_diff/pm25Value) * 100.0;
			pm25_result.add(pm25_pct);		
		}
		printResult();
	}
	
	public void printResult() {
		int year = from;
		DecimalFormat f = new DecimalFormat("##0.00000");
		for (int i = 0; i < co2_result.size(); i++) {
			System.out.println("The annual percentage change of CO2 emission in " + year + " is " + f.format(co2_result.get(i)) + "%");
			System.out.println("The annual percentage change of Energy use in " + year + " is " + f.format(energy_result.get(i)) + "%");
			System.out.println("The annual percentage change of PM2.5 in " + year + " is " + f.format(pm25_result.get(i)) + "%");
			year++;
		}
		
	}
}
