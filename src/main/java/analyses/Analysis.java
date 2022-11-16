package analyses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import datafetcher.*;
import gui_viewers.*
;
public abstract class Analysis {
	protected String country;
	protected int from;
	protected int to;
	protected DataFetcher dataFetcher = new DataFetcher();
	protected ArrayList<String> analysis_description = new ArrayList<String>();
	protected HashMap<String, ArrayList<Double>> resultMap = new HashMap<String, ArrayList<Double>>(); //Key: year, value: each year's data
	protected HashMap<String, Boolean> compatibility = new HashMap<String, Boolean>();
	
	protected ArrayList<Viewer> observers = new ArrayList<Viewer>();
	
	protected Analysis(String country, int from, int to){
		this.country = country ;
		this.from = from;
		this.to = to;	
		
	}
	public ArrayList<String> getDescription() { return analysis_description; }
	public HashMap<String, ArrayList<Double>> returnData(){ return resultMap; };
	public HashMap<String, Boolean> getCompatibility(){ return compatibility; };
	
	
	public abstract void runAnalyses();
	public void updateObservers() {
		for(Viewer view : observers) {
			view.update(resultMap);
		}
	}
	
	
	public void addObservers(ArrayList<Viewer> viewers) { observers = viewers; }
	public ArrayList<Viewer> getObservers() { return observers; }
	
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
}
