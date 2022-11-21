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
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.time.Year;

import analyses.DataContainer;

public class Strategy_Scatter extends Strategy{
	
	public Strategy_Scatter(String viewerTitle) {
		super(viewerTitle);
	}

	public JPanel updateGraph(DataContainer data) {
		HashMap<String, ArrayList<Double>> resultMap = data.getData();
		ArrayList<String> description = data.getDescription();
		
		ChartPanel chartPanel;
		ArrayList<TimeSeries> lines = new ArrayList<TimeSeries>();
		int size = description.size();	
		for(int i = 0; i < size; i++) {
			TimeSeries temp = new TimeSeries(description.get(i));				
			for(String k : resultMap.keySet()) {			
				ArrayList<Double> thisYearData = resultMap.get(k);
				temp.add(new Year(Integer. parseInt(k)), thisYearData.get(i));
			}
			lines.add(temp);
		}
		TimeSeriesCollection dataset2 = new TimeSeriesCollection();
		dataset2.addSeries(lines.get(1));
		TimeSeriesCollection dataset = new TimeSeriesCollection();
		dataset.addSeries(lines.get(0));
		dataset.addSeries(lines.get(2));
		
		XYPlot plot = new XYPlot();
		XYItemRenderer itemrenderer1 = new XYLineAndShapeRenderer(false, true);
		XYItemRenderer itemrenderer2 = new XYLineAndShapeRenderer(false, true);

		plot.setDataset(0, dataset);
		plot.setRenderer(0, itemrenderer1);
		DateAxis domainAxis = new DateAxis("Year");
		plot.setDomainAxis(domainAxis);
		plot.setRangeAxis(new NumberAxis(""));

		plot.setDataset(1, dataset2);
		plot.setRenderer(1, itemrenderer2);
		plot.setRangeAxis(1, new NumberAxis("US$"));

		plot.mapDatasetToRangeAxis(0, 0);// 1st dataset to 1st y-axis
		plot.mapDatasetToRangeAxis(1, 1); // 2nd dataset to 2nd y-axis

		JFreeChart scatterChart = new JFreeChart(viewerTitle,
				new Font("Serif", java.awt.Font.BOLD, 18), plot, true);
		
		chartPanel = new ChartPanel(scatterChart);
		chartPanel.setPreferredSize(new Dimension(400, 300));
		
		chartPanel.setBackground(Color.white);
		viewerPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15)); 
		viewerPanel.add(chartPanel);
		return viewerPanel;
		
	}

}
