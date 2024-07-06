import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame 
{
    private static final int MAX_ATTEMPTS = 10;
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain;
        do 
        {
            int targetNumber = random.nextInt(100) + 1;
            int attempts = 0;
            boolean guessedCorrectly = false;
            System.out.println("I have generated a random number between 1 and 100. Try to guess it!");

            while (attempts < MAX_ATTEMPTS && !guessedCorrectly)
             {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;
                if (guess == targetNumber)
                {
                    guessedCorrectly = true;
                    System.out.println("Congratulations! You've guessed the correct number in " + attempts + " attempts.");
                } 
                else if (guess < targetNumber) 
                {
                    System.out.println("Too low. Try again.");
                } 
                else 
                {
                    System.out.println("Too high. Try again.");
                }
            }
            if (!guessedCorrectly) 
            {
                System.out.println("Sorry, you've used all your attempts. The correct number was " + targetNumber + ".");
            }
            System.out.print("Do you want to play again? (yes/no): ");
            String response = scanner.next();
            playAgain = response.equalsIgnoreCase("yes");
        } 
        while (playAgain);
        System.out.println("Thank you for playing! Goodbye.");
        scanner.close();
    }
}

