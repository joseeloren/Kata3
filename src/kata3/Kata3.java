package kata3;

public class Kata3 {
    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<>();
        for (int i=0;i<10;i++) {
            histogram.increment("gmail.com");
        }
        for (int i=0;i<7;i++) {
            histogram.increment("ulpgc.es");
        }
        for (int i=0;i<4;i++) {
            histogram.increment("ull.es");
        }
        for (int i=0;i<8;i++) {
            histogram.increment("hotmail.com");
        }
        
        HistogramDisplay histogramDisplay = new HistogramDisplay(histogram);
        histogramDisplay.execute();
    }
}
