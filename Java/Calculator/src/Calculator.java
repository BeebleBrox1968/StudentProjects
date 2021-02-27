import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the operation you want to perform");
        String operationChoice = scanner.next();
        System.out.println("Choose your first number");
        int num1 = scanner.nextInt();
        System.out.println("Choose your second number");
        int num2 = scanner.nextInt();
        if (operationChoice.equals("Multiplication")) {
            System.out.println("The product is: " + (num1 * num2));
        } else if (operationChoice.equals("Addition")) {
            System.out.println("The sum is: " + (num1 + num2));
        } else if (operationChoice.equals("Subtraction")) {
            System.out.println("The difference is: " + (num1 - num2));
        } else if (operationChoice.equals("Division")) {
            System.out.println("The quotient is: " + (num1 / num2));
        } else {
            System.out.println("I don't know that operation...");
        }
    }
}
