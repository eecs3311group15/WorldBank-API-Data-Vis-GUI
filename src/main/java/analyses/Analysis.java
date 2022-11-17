package analyses;

import java.util.ArrayList;
import java.util.HashMap;

import viewers.*;

public abstract class Analysis {

	protected ArrayList<String> analysis_description = new ArrayList<String>();
	protected HashMap<String, ArrayList<Double>> resultMap = new HashMap<String, ArrayList<Double>>(); //Key: year, value: each year's data
	protected HashMap<String, Boolean> compatibility = new HashMap<String, Boolean>();
	protected DataContainer data;
	

	public HashMap<String, Boolean> getCompatibility(){ return compatibility; };
	
	public void updateObservers(ArrayList<Viewer> observers) {
		data = new DataContainer(analysis_description, resultMap);
		for(Viewer view : observers) {
			view.update(data);
		}
	}
	
	public void displayData() {
		int size = analysis_description.size();			
		for(int i = 0; i < size; i++) {
			System.out.println(analysis_description.get(i));
			for(String k : resultMap.keySet()) {
				System.out.println(k);
				ArrayList<Double> thisYearData = resultMap.get(k);
				for(int j = 0; j < thisYearData.size(); j++) {
					System.out.println(thisYearData.get(j) + " ");
				}
			}
		}
	}
	public abstract void runAnalyses(String country, int from, int to);
}
