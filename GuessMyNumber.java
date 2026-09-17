import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {

    public static void main(String[] args) {
        // pick a random number
        int userNumber;
        int difference;
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        Scanner in = new Scanner(System.in);
        System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?" );
        System.out.print("Type a number: " );
        userNumber = in.nextInt();
        System.out.println("Your guess is: " + userNumber);
        System.out.println("The number I was thinking of is: " + number);
        difference = Math.abs(userNumber-number);
        System.out.print("You were off by " + difference);
                
        
    }
}
