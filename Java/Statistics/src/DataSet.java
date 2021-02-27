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
}
