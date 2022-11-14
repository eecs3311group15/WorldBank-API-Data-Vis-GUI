package gui;

public class ViewerFactory {
	
	public static Viewer createViewer(String viewerType, String viewerTitle, String country, int from, int to) {
		if(viewerType.equals("Bar Chart")) {
			return new Viewer_Bar(viewerTitle, country, from, to);
			
		}else if(viewerType.equals("Line Chart")) {
			return new Viewer_Line(viewerTitle, country, from, to);
			
		}else if(viewerType.equals("Pie Chart")) {
			return new Viewer_Pie(viewerTitle, country, from, to);
			
		}else if(viewerType.equals("Report")) {
			return new Viewer_Report(viewerTitle, country, from, to);
			
		}else if(viewerType.equals("Scatter Chart")) {
			return new Viewer_Scatter(viewerTitle, country, from, to);
			
		}else if(viewerType.equals("Time")) {
			return new Viewer_Time(viewerTitle, country, from, to);			
		}
		return null;
	}
}
