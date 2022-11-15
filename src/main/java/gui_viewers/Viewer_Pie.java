package gui_viewers;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.util.TableOrder;
import org.jfree.data.category.DefaultCategoryDataset;

public class Viewer_Pie extends Viewer{
	
	protected ChartPanel chartPanel;
	
	protected Viewer_Pie(String viewerTitle, String country, int from, int to) {
		super(viewerTitle, country, from, to);

		JFreeChart pieChart = ChartFactory.createMultiplePieChart(viewerTitle, null,
				TableOrder.BY_COLUMN, true, true, false);

		chartPanel = new ChartPanel(pieChart);
		chartPanel.setPreferredSize(new Dimension(400, 300));

		
		chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		chartPanel.setBackground(Color.white);

	}
	public void setViewWithData() {
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		dataset.addValue(3.946, "Unemployed", "Men");
		dataset.addValue(96.054, "Employed", "Men");
		dataset.addValue(3.837, "Unemployed", "Women");
		dataset.addValue(96.163, "Employed", "Women");

		JFreeChart pieChart = ChartFactory.createMultiplePieChart(viewerTitle, dataset,
				TableOrder.BY_COLUMN, true, true, false);

		chartPanel = new ChartPanel(pieChart);
		chartPanel.setPreferredSize(new Dimension(400, 300));

		
		chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		chartPanel.setBackground(Color.white);
	}
	public void addToPanel(JPanel west) {
		west.add(chartPanel);
	}
}