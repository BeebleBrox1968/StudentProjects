import java.util.Scanner;

public class SequentialSum {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int sum=0;
        System.out.println("Enter your starting number");
        int currentNumber = s.nextInt();
        System.out.println("Enter your ending number");
        int endingNumber = s.nextInt();
        while(currentNumber<=endingNumber){
            sum+=currentNumber;
            currentNumber++;
        }
        System.out.println(sum);
    }


}
