package viewers;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.block.BlockBorder;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import analyses.DataContainer;

public class Strategy_Line extends Strategy{
	
	public Strategy_Line(String viewerTitle) {
		super(viewerTitle);
	}

	public JPanel updateGraph(DataContainer data) {
		HashMap<String, ArrayList<Double>> resultMap = data.getData();
		ArrayList<String> description = data.getDescription();
		
		ChartPanel chartPanel;
		JFreeChart chart;
		ArrayList<XYSeries> lines = new ArrayList<XYSeries>();
		int size = description.size();
		for(int i = 0; i < size; i++) {
			XYSeries temp = new XYSeries(description.get(i));							
			lines.add(temp);
		}
		
		for(String k : resultMap.keySet()) {			
			ArrayList<Double> thisYearData = resultMap.get(k);
			for(int i = 0; i < thisYearData.size(); i++) {
				lines.get(i).add(Integer. parseInt(k), thisYearData.get(i));
			}	
		}

		XYSeriesCollection dataset = new XYSeriesCollection();
		for(int i = 0; i < size; i++) {
			dataset.addSeries(lines.get(i));
		}

		chart = ChartFactory.createXYLineChart("", "Year", "", dataset,
				PlotOrientation.VERTICAL, true, true, false);

		XYPlot plot = chart.getXYPlot();

		XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
		renderer.setSeriesPaint(0, Color.RED);
		renderer.setSeriesStroke(0, new BasicStroke(2.0f));

		plot.setRenderer(renderer);
		plot.setBackgroundPaint(Color.white);

		plot.setRangeGridlinesVisible(true);
		plot.setRangeGridlinePaint(Color.BLACK);

		plot.setDomainGridlinesVisible(true);
		plot.setDomainGridlinePaint(Color.BLACK);

		chart.getLegend().setFrame(BlockBorder.NONE);

		chart.setTitle(
				new TextTitle(viewerTitle, new Font("Serif", java.awt.Font.BOLD, 18)));

		chartPanel = new ChartPanel(chart);
		chartPanel.setPreferredSize(new Dimension(400, 300));
		chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		chartPanel.setBackground(Color.white);
		viewerPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15)); 
		viewerPanel.add(chartPanel);
		return viewerPanel;
	}
}
