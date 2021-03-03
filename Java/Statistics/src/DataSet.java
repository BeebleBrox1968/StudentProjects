import java.util.Arrays;
import java.util.List;

public class DataSet {
    private int[] data;

    public DataSet(String fileName) {
        data = DataReader.readData(fileName);
    }

    public double getAverage() {
        int total = 0;
        for (int part :
                data) {
            total += part;
        }
        return total / (double) data.length;
    }

    public double getStandardDeviation() {
        double mean = getAverage();
        double deviationSum = 0;
        for (int datum : data) {
            deviationSum += Math.pow((datum - mean), 2);
        }
        return Math.sqrt(deviationSum / (data.length - 1));
    }

    public double getMedian() {
        Arrays.sort(data);
        if (data.length % 2 == 1) {
            return data[data.length / 2];
        } else {
            return (data[data.length / 2] + data[data.length / 2 + 1]) / 2.0;
        }
    }

    public boolean contains(int element) {
        return contains(data, element);
    }

    public int get(int index) {
        return data[index];
    }

    public void set(int index, int val) {
        data[index] = val;
    }

    public int[] getModes() {

        int max = 0;
        int[] modes = new int[0];
        for (int i = 0; i < data.length; i++) {
            int count = 0;
            for (int j = 0; j < data.length; j++) {
                if (data[i] == data[j]) {
                    count++;
                }

            }
            if (count > max) {
                max = count;
                modes = new int[]{data[i]};
            }
            if (count == max) {
                if (!contains(modes, data[i])) {
                    modes = Arrays.copyOf(modes, modes.length + 1);
                    modes[modes.length - 1] = data[i];
                }
            }
        }
        return modes;
    }

    private boolean contains(int[] data, int element) {
        for (int x :
                data) {
            if (x == element) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "DataSet{\n" +
                "data=" + Arrays.toString(data) +
                "\n}";
    }
}
