package analyses;

import java.util.ArrayList;

import datafetcher.*;

public abstract class Analysis {
	protected String country;
	protected int from;
	protected int to;
	protected DataFetcher dataFetcher = new DataFetcher();
	
	protected Analysis(String country, int from, int to){

		this.country = country ;
		this.from = from;
		this.to = to;
	}
	
	public abstract void runAnalyses();
	public abstract ArrayList<String> getDescription();
	public abstract ArrayList<ArrayList<Double>> getResult();
}
