import java.util.Scanner;

public class RunofIntegers {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your starting number");
        int currentNumber = s.nextInt();
        System.out.println("Enter your ending number");
        int num2 = s.nextInt();
        while(currentNumber<=num2){
            System.out.println(currentNumber);
            currentNumber++;
        }
    }
}
