package guessing;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int min = 1;
        int max = 100;

        // Choose difficulty
        System.out.println("Choose a difficulty level: ");
        System.out.println("1. Easy (1-50)");
        System.out.println("2. Medium (1-100)");
        System.out.println("3. Hard (1-200)");

        try {
            int difficulty = input.nextInt();
            switch (difficulty) {
                case 1 -> max = 50;
                case 2 -> max = 100;
                case 3 -> max = 200;
                default -> {
                    System.out.println("Invalid choice. Defaulting to Medium.");
                    max = 100;
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Defaulting to Medium.");
            max = 100;
            input.next(); // clear invalid input
        }

        boolean playAgain;
        do {
            playGame(input, min, max);
            playAgain = askPlayAgain(input);
        } while (playAgain);

        System.out.println("Thanks for playing!");
        input.close();
    }

    private static void playGame(Scanner input, int min, int max) {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(max - min + 1) + min;
        int numGuesses = 0;
        boolean guessed = false;

        System.out.println("Guess a number between " + min + " and " + max + ":");

        while (!guessed) {
            try {
                int guess = input.nextInt();
                numGuesses++;

                if (guess == numberToGuess) {
                    System.out.println("Congratulations! You guessed the number in " + numGuesses + " guesses.");
                    guessed = true;
                } else if (guess < numberToGuess) {
                    System.out.print("Too low, try again: ");
                } else {
                    System.out.print("Too high, try again: ");
                }

            } catch (InputMismatchException e) {
                System.out.print("Invalid input. Please enter a valid number: ");
                input.next(); // clear invalid input
            }
        }
    }

    private static boolean askPlayAgain(Scanner input) {
        while (true) {
            System.out.print("Do you want to play again? (yes/no): ");
            String response = input.next().trim().toLowerCase();
            if (response.equals("yes") || response.equals("y")) {
                return true;
            } else if (response.equals("no") || response.equals("n")) {
                return false;
            } else {
                System.out.println("Invalid response. Please type 'yes' or 'no'.");
            }
        }
    }
}
