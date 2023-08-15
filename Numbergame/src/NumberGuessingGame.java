import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 7;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have generated a random number between " + minRange + " and " + maxRange + ". Try to guess it!");
        
        int totalRounds = 0;
        int totalScore = 0;
        
        boolean playAgain = true;
        
        while (playAgain) {
            int generatedNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = 0;
            boolean hasGuessedCorrectly = false;
            
            while (attempts < maxAttempts && !hasGuessedCorrectly) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;
                
                if (userGuess == generatedNumber) {
                    hasGuessedCorrectly = true;
                    int roundScore = maxAttempts - attempts + 1;
                    totalScore += roundScore;
                    System.out.println("Congratulations! You've guessed the number " + generatedNumber + " correctly.");
                    System.out.println("It took you " + attempts + " attempts in this round.");
                    System.out.println("Your score for this round: " + roundScore);
                } else if (userGuess < generatedNumber) {
                    System.out.println("Your guess is too low. Try again.");
                } else {
                    System.out.println("Your guess is too high. Try again.");
                }
            }
            
            if (!hasGuessedCorrectly) {
                System.out.println("Oops! You've used all your attempts. The correct number was: " + generatedNumber);
            }
            
            totalRounds++;
            
            System.out.print("Do you want to play another round? (yes/no): ");
            String playAgainInput = scanner.next();
            playAgain = playAgainInput.equalsIgnoreCase("yes");
        }
        
        System.out.println("Game over! You played " + totalRounds + " rounds.");
        System.out.println("Your total score: " + totalScore);
        
        scanner.close();
    }
}
