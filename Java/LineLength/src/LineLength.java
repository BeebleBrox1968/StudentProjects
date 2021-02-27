import java.util.Scanner;

public class LineLength {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your total length");
        int totalLength=s.nextInt();
        System.out.println("Enter your first word");
        String firstWord = s.next();
        System.out.println("Enter your second word");
        String endindWord = s.next();
        System.out.print(firstWord);
        int numOfDots = totalLength - firstWord.length() - endindWord.length();
        int i=0;
        while(i<numOfDots){
            System.out.print('.');
            i++;
        }
        System.out.print(endindWord);




    }


}
