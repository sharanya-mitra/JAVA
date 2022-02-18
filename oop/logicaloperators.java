import java.util.Scanner;

public class logicaloperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter please ");
        String response = scanner.next();
        if(response.equals("q")||response.equals("Q"))
        {
            System.out.println("Your quite the game");
        }
        else
        {
            System.out.println("let's go");
        }
    }
}
//name.isBlank() here name is string if the string is empty then the output will be true.
