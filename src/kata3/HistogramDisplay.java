package kata3;

import java.awt.Dimension;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class HistogramDisplay extends ApplicationFrame{

    public HistogramDisplay() {
        super("Histograma");
        setContentPane(createPane());
        pack();
    }
    
    private ChartPanel createPane() {
        ChartPanel chartPanel = new ChartPanel(createChart(createDataSet()));
        chartPanel.setPreferredSize(new Dimension(500, 450));
        return chartPanel;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataset) {
        JFreeChart chart = ChartFactory.createBarChart(
                "Histograma de dominios",
                "DOMINIOS",
                "Nº EMAIL",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false);
        return chart;
    }
    
    public void execute() {
        setVisible(true);
    }

    private DefaultCategoryDataset createDataSet() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10, "ENERO", "gmail.com");
        dataset.addValue(7, "ENERO", "ulpgc.es");
        dataset.addValue(4, "ENERO", "ull.es");
        dataset.addValue(8, "ENERO", "hotmail.com");
        dataset.addValue(9, "FEBRERO", "gmail.com");
        dataset.addValue(6, "FEBRERO", "ulpgc.es");
        dataset.addValue(3, "FEBRERO", "ull.es");
        dataset.addValue(1, "FEBRERO", "hotmail.com");
        dataset.addValue(8, "MARZO", "gmail.com");
        dataset.addValue(9, "MARZO", "ulpgc.es");
        dataset.addValue(10, "MARZO", "ull.es");
        dataset.addValue(7, "MARZO", "hotmail.com");
        
        return dataset;
    }
}
