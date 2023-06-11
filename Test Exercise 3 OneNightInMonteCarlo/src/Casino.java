/**    
*    File: e:\OneDrive\University\1. Fächer\2. Semester\9. Informatik II\Java Code\Test Exercise 3 OneNightInMonteCarlo'\src\Casino.java
*    Project: e:\OneDrive\University\1. Fächer\2. Semester\9. Informatik II\Java Code\Test Exercise 3 OneNightInMonteCarlo'\src
*    Created Date: Sunday, June 11th 2023, 4:42:21 pm
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





import java.util.Random;

/**
 * Represents a Casino game simulation.
 */
public class Casino {
    /**
     * Main method to execute the program.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        int capital = 10000;
        int bet = 10;
        int maxBet = 1000;
        int games = 100;

        simulateGames(capital, bet, maxBet, games);
    }
    
    /**
     * Simulates the specified number of games in the Casino.
     *
     * @param capital  The initial capital.
     * @param bet      The initial bet amount.
     * @param maxBet   The maximum allowed bet.
     * @param numGames The number of games to simulate.
     */
    public static void simulateGames(int capital, int bet, int maxBet, int numGames) {
        Random random = new Random();

        for (int i = 1; i <= numGames; i++) {
            int numberSpun = random.nextInt(37);
            int capitalBefore = capital;
            int betAmount = calculateBetAmount(capital, bet, maxBet);
            capital -= betAmount;

            if (numberSpun != 0 && numberSpun % 2 == 0) {
                capital += betAmount * 2; // Win
            }

            int capitalAfter = capital;

            displayGameResult(i, numberSpun, capitalBefore, betAmount, capitalAfter);
        }
    }

    /**
     * Calculates the bet amount based on the current capital.
     *
     * @param capital  The current capital.
     * @param bet      The initial bet amount.
     * @param maxBet   The maximum allowed bet.
     * @return The calculated bet amount.
     */
    public static int calculateBetAmount(int capital, int bet, int maxBet) {
        if (capital >= 10000 && bet == 10) {
            return bet;
        } else if (capital >= 10000 && bet > 10) {
            return bet * 2;
        } else {
            return Math.min(capital, maxBet);
        }
    }

    /**
     * Displays the result of a game.
     *
     * @param gameNumber   The game number.
     * @param numberSpun   The number spun.
     * @param capitalBefore The capital before the game.
     * @param betAmount    The bet amount.
     * @param capitalAfter  The capital after the game.
     */
    public static void displayGameResult(int gameNumber, int numberSpun, int capitalBefore, int betAmount, int capitalAfter) {
        System.out.println("Game Number: " + gameNumber);
        System.out.println("Number Spun: " + numberSpun);
        System.out.println("Capital Before: " + capitalBefore);
        System.out.println("Bet Amount: " + betAmount);
        System.out.println("Capital After: " + capitalAfter);
        System.out.println();
    }
}

