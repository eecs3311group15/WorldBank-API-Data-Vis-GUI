package gui;

public class ViewerFactory {
	
	public static Viewer createViewer(String viewerType, String analysisType, String country, int from, int to) {
		if(viewerType.equals("Bar Chart")) {
			return new Viewer_Bar(analysisType, country, from, to);
			
		}else if(viewerType.equals("Line Chart")) {
			return new Viewer_Line(analysisType, country, from, to);
			
		}else if(viewerType.equals("Pie Chart")) {
			return new Viewer_Pie(analysisType, country, from, to);
			
		}else if(viewerType.equals("Report")) {
			return new Viewer_Report(analysisType, country, from, to);
			
		}else if(viewerType.equals("Scatter Chart")) {
			return new Viewer_Scatter(analysisType, country, from, to);
			
		}else if(viewerType.equals("Time")) {
			return new Viewer_Time(analysisType, country, from, to);			
		}
		return null;
	}
}
