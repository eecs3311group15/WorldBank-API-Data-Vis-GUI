package viewers;

import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import analyses.DataContainer;

public class Strategy_Report extends Strategy{

	public Strategy_Report(String viewerTitle) {
		super(viewerTitle);		
	}

	public JPanel updateGraph(DataContainer data) {
		HashMap<String, ArrayList<Double>> resultMap = data.getData();
		ArrayList<String> description = data.getDescription();
		
		JScrollPane outputScrollPane;
		ArrayList<String> lines = new ArrayList<String>();
		int size = description.size();	
		for(int i = 0; i < size; i++) {
			String temp = description.get(i) + "\n";				
			for(String k : resultMap.keySet()) {	
				temp = temp + "For year " + k + ": ";
				ArrayList<Double> thisYearData = resultMap.get(k);
				temp = temp + thisYearData.get(i) + "\n";
			}
			temp = temp + ".\n";
			lines.add(temp);
		}
		String reportMessage = "";
		for(int i = 0; i < size; i++) {
			reportMessage = reportMessage + lines.get(i);
		}
		
		JTextArea report = new JTextArea();
		report.setEditable(false);
		//report.setPreferredSize(new Dimension(400, 300));
		report.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		report.setBackground(Color.white);	
		
		report.setText(reportMessage);
		report.setLineWrap(true);
		report.setWrapStyleWord(true);
		
		outputScrollPane = new JScrollPane(report, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		outputScrollPane.setPreferredSize(new Dimension(400, 300));
		main.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15)); 
		main.add(outputScrollPane);
		return main;
		/*JTextArea report = new JTextArea();
		report.setEditable(false);
		report.setPreferredSize(new Dimension(400, 300));
		report.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		report.setBackground(Color.white);
		String reportMessage, reportMessage2;

		reportMessage = viewerTitle + "==============================\n" + "Year 2018:\n"
				+ "\tMortality/1000 births => 5.6\n" + "\tHealth Expenditure per Capita => 10624\n"
				+ "\tHospital Beds/1000 people => 2.92\n" + "\n" + "Year 2017:\n" + "\tMortality/1000 births => 5.7\n"
				+ "\tHealth Expenditure per Capita => 10209\n" + "\tHospital Beds/1000 people => 2.87\n" + "\n"
				+ "Year 2016:\n" + "\tMortality/1000 births => 5.8\n" + "\tHealth Expenditure per Capita => 9877\n"
				+ "\tHospital Beds/1000 people => 2.77\n";

		reportMessage2 = "Unemployment: Mev vs Women\n" + "==========================\n" + "Men=>\n"
				+ "\tEmployed: 96.054%\n" + "\tUnemployed: 3.946%\n" + "\n" + "Women=>\n" + "\tEmployed: 96.163%\n"
				+ "\tUnemployed: 3.837%\n";

		report.setText(reportMessage);
		outputScrollPane = new JScrollPane(report);*/
		
	}
}
