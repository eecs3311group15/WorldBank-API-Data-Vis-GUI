package gui;

public class ViewerFactory {
	
	public static Viewer createViewer(String type) {
		if(type.equals("Bar Chart")) {
			return new Viewer_Bar();
			
		}else if(type.equals("Line Chart")) {
			return new Viewer_Line();
			
		}else if(type.equals("Pie Chart")) {
			return new Viewer_Pie();
			
		}else if(type.equals("Report")) {
			return new Viewer_Report();
			
		}else if(type.equals("Scatter Chart")) {
			return new Viewer_Scatter();
			
		}else if(type.equals("Time")) {
			return new Viewer_Time();			
		}
		return null;
	}
}
