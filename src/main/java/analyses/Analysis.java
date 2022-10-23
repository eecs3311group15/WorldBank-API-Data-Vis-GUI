package analyses;

public abstract class Analysis {
	protected String country;
	protected int from;
	protected int to;
	
	protected Analysis(String country, int from, int to){

		this.country = country ;
		this.from = from;
		this.to = to;
	}
}
