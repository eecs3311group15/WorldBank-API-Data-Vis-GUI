package gui_viewers;

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

public class Viewer_Pie extends Viewer{
	
	protected ChartPanel chartPanel;
	
	protected Viewer_Pie(String viewerTitle) {
		super(viewerTitle);

		JFreeChart pieChart = ChartFactory.createMultiplePieChart(viewerTitle, null,
				TableOrder.BY_COLUMN, true, true, false);

		chartPanel = new ChartPanel(pieChart);
		chartPanel.setPreferredSize(new Dimension(400, 300));

		
		chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		chartPanel.setBackground(Color.white);

	}

	public void addToPanel(JPanel west) {
		west.add(chartPanel);
	}
	@Override
	public void update(DataContainer data) {
		HashMap<String, ArrayList<Double>> resultMap = data.getData();
		ArrayList<String> description = data.getDescription();
		
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
		/*DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		dataset.addValue(3.946, "Unemployed", "Men");
		dataset.addValue(96.054, "Employed", "Men");
		dataset.addValue(3.837, "Unemployed", "Women");
		dataset.addValue(96.163, "Employed", "Women");

		JFreeChart pieChart = ChartFactory.createMultiplePieChart(viewerTitle, dataset,
				TableOrder.BY_COLUMN, true, true, false);

		chartPanel = new ChartPanel(pieChart);
		chartPanel.setPreferredSize(new Dimension(400, 300));

		
		chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		chartPanel.setBackground(Color.white);*/
		
	}
}
