package gui_viewers;

public class ViewerFactory {
	
	public static Viewer createViewer(String viewerType, String analysisType) {
		if(viewerType.equals("Bar Chart")) {
			return new Viewer_Bar(analysisType);
			
		}else if(viewerType.equals("Line Chart")) {
			return new Viewer_Line(analysisType);
			
		}else if(viewerType.equals("Pie Chart")) {
			return new Viewer_Pie(analysisType);
			
		}else if(viewerType.equals("Report")) {
			return new Viewer_Report(analysisType);
			
		}else if(viewerType.equals("Scatter Chart")) {
			return new Viewer_Scatter(analysisType);
			
		}else if(viewerType.equals("Time Chart")) {
			return new Viewer_Time(analysisType);			
		}
		return null;
	}
}
