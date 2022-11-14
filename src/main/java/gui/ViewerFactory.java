package gui;

import javax.swing.JPanel;

public class ViewerFactory {
	
	public static void addViewer(String type, JPanel west) {
		if(type.equals("Bar")) {
			Viewer_Bar barView = new Viewer_Bar(west);
			
		}else if(type.equals("Line")) {
			Viewer_Line lineView = new Viewer_Line(west);
			
		}else if(type.equals("Pie")) {
			Viewer_Pie pieView = new Viewer_Pie(west);
			
		}else if(type.equals("Report")) {
			Viewer_Report reportView = new Viewer_Report(west);
			
		}else if(type.equals("Scatter")) {
			Viewer_Scatter scatterView = new Viewer_Scatter(west);
			
		}else if(type.equals("Time")) {
			Viewer_Time timeView = new Viewer_Time(west);
			
		}
	}
}
