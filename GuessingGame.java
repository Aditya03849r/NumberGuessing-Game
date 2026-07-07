package GuessingGame;
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Step 1: Generate a random number between 1 and 100
        int secretNumber = random.nextInt(100)+1;
        int guess = 0;
        int attempts = 0;
        boolean hasWon = false;

        System.out.println("I'm thinking of a number between 1 and 100!");

        // Step 2: Loop until the player guesses correctly
        while (secretNumber != guess) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            // Step 3: Compare guess to secretNumber and print a hint
            if (secretNumber<guess) {
                System.out.println("Too high! Try again.");
            } else if (secretNumber>guess) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("You got it in " + attempts + " attempts!");
                hasWon = true;
            }
        }
        scanner.close();
    }
}