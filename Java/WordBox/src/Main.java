import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String word;
        String rev = "";
        System.out.print("Enter a word: ");
        word = keyboard.nextLine();
        for (int i = word.length() - 1; i >= 0; i--) {
            rev += word.charAt(i);
            //word
            //drow
        }
        System.out.println(word);
        for (int i = 1; i < word.length() - 1; i++) {
            
            System.out.print(word.charAt(i));
            for (int j = 0; j < word.length() - 2; j++) {
                System.out.print(" ");
            }
            System.out.println(word.charAt(word.length() - 1 - i));

        }
        System.out.println(rev);
    }

}
