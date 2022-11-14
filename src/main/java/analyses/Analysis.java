package analyses;

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
	
	protected void getData() {
		System.out.println("test");
	}

	protected abstract void runAnalyses();
}
