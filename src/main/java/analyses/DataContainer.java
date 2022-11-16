package analyses;

import java.util.ArrayList;
import java.util.HashMap;

public class DataContainer {
	
	
	protected ArrayList<String> analysis_description = new ArrayList<String>();
	protected HashMap<String, ArrayList<Double>> resultMap = new HashMap<String, ArrayList<Double>>(); //Key: year, value: each year's data
		
	public DataContainer(ArrayList<String> analysis_description, HashMap<String, ArrayList<Double>> resultMap) {
		this.analysis_description = analysis_description;
		this.resultMap = resultMap;
	}
	
	public ArrayList<String> getDescription() { return analysis_description; }
	public HashMap<String, ArrayList<Double>> getData(){ return resultMap; };

}
