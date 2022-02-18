package userinput;
import java.util.Scanner;

public class userInput 
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = input.nextInt();
    System.out.println("Your number is " + num);
    System.out.println("Enter a string: ");     // user input   
    String str = input.next();
    System.out.println("Your string is " + str);

    }

}
