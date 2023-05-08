package Plot;

import java.awt.Color;
import java.awt.Dimension;
import java.util.List;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.renderer.xy.XYShapeRenderer;

public class GraphPlotter {
    public static ChartPanel createChart(List<Double> x, List<Double> y) {
        // Создаем объект XYSeries для хранения данных
        XYSeries dataSeries = new XYSeries("Начальный график");
        for (int i = 0; i < x.size(); i++) {
            dataSeries.add(x.get(i), y.get(i));
        }

        // Создаем объект XYSeriesCollection для хранения коллекции данных
        XYSeriesCollection dataSet = new XYSeriesCollection();
        dataSet.addSeries(dataSeries);

        // Вычисляем коэффициенты линейной регрессии методом наименьших квадратов
        //double[] coeffs = calculateLinearRegression(x, y);

        // Создаем объект JFreeChart
        JFreeChart chart = ChartFactory.createXYLineChart(
                "", "X", "Y", dataSet, PlotOrientation.VERTICAL, true, true, false
        );


        // Добавляем линию линейной регрессии на график
        // XYSeries regressionSeries = new XYSeries("Линейная регрессия");
        //find min x
        int min = getMinElementIndex(x);
        // regressionSeries.add(x.get(min), Double.valueOf(coeffs[0] + coeffs[1] * x.get(min)));
        //find max x
        int max = getMaxElementIndex(x);
        // regressionSeries.add(x.get(max), Double.valueOf(coeffs[0] + coeffs[1] * x.get(max)));
        // dataSet.addSeries(regressionSeries);

        // Настраиваем цвет линии графика c точками
        XYPlot plot = chart.getXYPlot();
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        plot.setRenderer(renderer);
        plot.getRenderer().setSeriesPaint(0, Color.BLACK);


        // Создаем объект ChartPanel и возвращаем его
        ChartPanel chartPanel = new ChartPanel(chart);
        return chartPanel;
    }

    private static int getMinElementIndex(List<Double> list) {
        int min = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < list.get(min)) {
                min = i;
            }
        }
        return min;
    }

    private static int getMaxElementIndex(List<Double> list) {
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(max)) {
                max = i;
            }
        }
        return max;
    }
}

//    private static double[] calculateLinearRegression(List<Double> x, List<Double> y) {
//        double sumX = 0.0;
//        double sumY = 0.0;
//        double sumXY = 0.0;
//        double sumX2 = 0.0;
//        int n = x.size();
//        // Суммируем значения x, y, x^2, и xy
//        for (int i = 0; i < n; i++) {
//            double xi = x.get(i);
//            double yi = y.get(i);
//            sumX += xi;
//            sumY += yi;
//            sumX2 += xi * xi;
//            sumXY += xi * yi;
//        }





//        // Вычисляем коэффициенты линейной регрессии a и b
//        double xMean = sumX / n;
//        double yMean = sumY / n;
//        double denominator = sumX2 - sumX * xMean;
//        double slope = (sumXY - sumX * yMean) / denominator;
//        double intercept = yMean - slope * xMean;
//
//        // Возвращаем массив коэффициентов [a, b]
//        return new double[] {intercept, slope};

