package viewers;

import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.util.TableOrder;
import org.jfree.data.category.DefaultCategoryDataset;

import analyses.DataContainer;

public class Strategy_Pie extends Strategy{	
	
	public Strategy_Pie(String viewerTitle) {
		super(viewerTitle);
	}

	public JPanel updateGraph(DataContainer data) {
		HashMap<String, ArrayList<Double>> resultMap = data.getData();
		ArrayList<String> description = data.getDescription();
		
		ChartPanel chartPanel;
		ArrayList<Double> thisYearData = new ArrayList<Double>();
		for(String k : resultMap.keySet()) {
			thisYearData = resultMap.get(k);
		}
		
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		dataset.addValue(thisYearData.get(0), description.get(0), "");
		dataset.addValue(thisYearData.get(1), description.get(1), "");
		
		JFreeChart pieChart = ChartFactory.createMultiplePieChart(viewerTitle, dataset,
				TableOrder.BY_COLUMN, true, true, false);

		chartPanel = new ChartPanel(pieChart);
		chartPanel.setPreferredSize(new Dimension(400, 300));

		
		chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		chartPanel.setBackground(Color.white);
		viewerPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15)); 
		viewerPanel.add(chartPanel);
		return viewerPanel;
	
	}
}
