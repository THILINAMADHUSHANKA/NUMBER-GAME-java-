import java.util.*;

public class numberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;

        System.out.println("Welcome to the game!");

        while (playAgain) {
            int secretNumber = 50;
            int attempts = 0;
            final int maxAttempts = 3;

            System.out.println("\n Can you guess One Number? (0 to 100)");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess == secretNumber) {
                    System.out.println("Congratulations! You've guessed the number " + secretNumber + " correctly in " + attempts + " attempts!");
                    break;
                } else if (guess < secretNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }

                if (attempts == maxAttempts) {
                    System.out.println("Sorry, you've used all your attempts. The correct number was " + secretNumber + ".");
                }

                secretNumber++;
            }

            System.out.print("\nDo you want to play again? (yes/no): ");
            Scanner input = new Scanner(System.in);
            String c = input.next();
            playAgain = c.equals("yes");
        }

        System.out.println("Thanks for playing game!");
        scanner.close();
    }
}
