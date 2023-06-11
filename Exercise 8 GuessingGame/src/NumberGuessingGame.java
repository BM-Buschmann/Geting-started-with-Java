/**    
*    File: e:\OneDrive\University\1. Fächer\2. Semester\9. Informatik II\Java Code\Exercise 8 GuessingGame\src\App.java
*    Project: e:\OneDrive\University\1. Fächer\2. Semester\9. Informatik II\Java Code\Exercise 8 GuessingGame\src
*    Created Date: Sunday, June 11th 2023, 4:32:10 pm
*    Author: Björn Metzger
*    -----
*    Last Modified: Sun Jun 11 2023
*    Modified By: Björn Metzger
*    -----
*    Copyright (c) 2023 Desma.Africa
*    
*    MIT License
*    For more information, please refer to the Licence File included in the root folder.
*    -----
*    HISTORY:
*    Date      	By	Comments
*    ----------	---	----------------------------------------------------------
*/    





import java.util.Scanner;

/**
 * NumberGuessingGame is a simple game where the player tries to guess a random number.
 */
public class NumberGuessingGame {
    /**
     * The main method to execute the game.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        int secretNumber = (int) (100 * Math.random() + 1);
        int guess;
        int attempt = 1;
        
        System.out.println("Welcome to the Number Guessing Game!");
        Scanner scanner = new Scanner(System.in);
        
        do {
            System.out.println("Attempt #" + attempt);
            guess = readInt("Enter your guess: ", scanner);

            if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number: " + secretNumber);
            }

            attempt++;
        } while (guess != secretNumber);
        scanner.close();
        System.out.println("Game over.");
    }

    /**
     * Reads an integer input from the user.
     *
     * @param message The prompt message to display to the user.
     * @return The integer value entered by the user.
     */
    public static int readInt(String message, Scanner scanner) {
        System.out.print(message);
        return scanner.nextInt();
    }
}

