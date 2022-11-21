package viewers;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

import analyses.DataContainer;

public class Strategy_Bar extends Strategy{
		
	public Strategy_Bar(String viewerTitle) {
		super(viewerTitle);	
	}

	public JPanel updateGraph(DataContainer data) {		
		HashMap<String, ArrayList<Double>> resultMap = data.getData();
		ArrayList<String> description = data.getDescription();
		
		ChartPanel chartPanel;
		ArrayList<DefaultCategoryDataset> lines = new ArrayList<DefaultCategoryDataset>();
		int size = description.size();	
		for(int i = 0; i < size; i++) {
			DefaultCategoryDataset temp = new DefaultCategoryDataset();				
			for(String k : resultMap.keySet()) {			
				ArrayList<Double> thisYearData = resultMap.get(k);
				temp.setValue(thisYearData.get(i), description.get(i), k);
			}
			lines.add(temp);
		}
		
		CategoryPlot plot = new CategoryPlot();
		BarRenderer barrenderer1 = new BarRenderer();
		BarRenderer barrenderer2 = new BarRenderer();

		plot.setDataset(0, lines.get(0));
		plot.setRenderer(0, barrenderer1);
		CategoryAxis domainAxis = new CategoryAxis("Year");
		plot.setDomainAxis(domainAxis);
		plot.setRangeAxis(new NumberAxis(""));

		plot.setDataset(1, lines.get(1));
		plot.setRenderer(1, barrenderer2);
		plot.setRangeAxis(1, new NumberAxis("US$"));

		plot.mapDatasetToRangeAxis(0, 0);// 1st dataset to 1st y-axis
		plot.mapDatasetToRangeAxis(1, 1); // 2nd dataset to 2nd y-axis

		JFreeChart barChart = new JFreeChart(viewerTitle,
				new Font("Serif", java.awt.Font.BOLD, 18), plot, true);

		chartPanel = new ChartPanel(barChart);
		chartPanel.setPreferredSize(new Dimension(400, 300));
		chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		chartPanel.setBackground(Color.white);
		viewerPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15)); 
		viewerPanel.add(chartPanel);
		return viewerPanel;
	
	}
}
