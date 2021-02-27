public class DataSet {
    private int[] data;

    public DataSet(String fileName) {
        data = DataReader.readData(fileName);
    }
    public double getAverage(){
        int total =0;
        for (int part:
             data) {
            total+=part;
        }
        return total / (double)data.length;
    }
    public double getStandardDeviation(){
        double mean = getAverage();
        double deviationSum = 0;
        for (int datum : data) {
            deviationSum += Math.pow((datum - mean), 2);
        }
        return Math.sqrt(deviationSum/(data.length-1));
    }

}
