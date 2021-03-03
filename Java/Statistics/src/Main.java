import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        DataSet dataSet = new DataSet("res/numbers2.txt");
        System.out.println(dataSet);
        System.out.println(dataSet.getAverage());
        System.out.println(Arrays.toString(dataSet.getModes()));
    }
}
