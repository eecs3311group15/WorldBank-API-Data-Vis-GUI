package gui_viewers;

public class Strategy_Viewer {
	
	private Strategy strategy;
	
	public Strategy_Viewer(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public Viewer addViewer() {		
		return strategy.addViewer();
	}
}
