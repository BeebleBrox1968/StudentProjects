import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(DataReader.readData("res/numbers.txt")));
        DataSet dataSet = new DataSet("res/numbers.txt");
        System.out.println(dataSet.getAverage());
    }
}
