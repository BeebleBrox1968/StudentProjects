import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class DataReader {
    public static int[] readData(String file) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //there is prob a better way to do this but its 1 am so sue me
        ArrayList<Integer> ints = new ArrayList<>();
        while (scanner.hasNextInt()) {
            ints.add(scanner.nextInt());
        }

        int[] nums = new int[ints.size()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = ints.get(i);
        }
        return nums;

    }
}
