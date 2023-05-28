/**    
*    File: e:\OneDrive\University\1. Fächer\2. Semester\9. Informatik II\Java Code\2023.05.29 NullSumGame\src\NullSumGame.java
*    Project: e:\OneDrive\University\1. Fächer\2. Semester\9. Informatik II\Java Code\2023.05.29 NullSumGame\src
*    Created Date: Monday, May 29th 2023, 12:23:42 am
*    Author: Björn Metzger
*    -----
*    Last Modified: Mon May 29 2023
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

public class NullSumGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for initial money for both players
        System.out.print("Enter initial money for both players: ");
        int initialMoney = scanner.nextInt();

        // Prompt for the winning probability of player A
        System.out.print("Enter the winning probability for player A (0 < p < 1): ");
        double winningProbability = scanner.nextDouble();

        // Create player objects
        Player playerA = new Player(initialMoney);
        Player playerB = new Player(initialMoney);
        
        // Run the game until one of the players is ruined
        while (playerA.canPlay() && playerB.canPlay()) {
            double random = Math.random();
            
            if (random <= winningProbability) {
                playerA.updateMoney(1);
                playerA.incrementWinCount();
                playerB.updateMoney(-1);
            } else {
                playerB.updateMoney(1);
                playerB.incrementWinCount();
                playerA.updateMoney(-1);
            }
        }
        
        // Determine the winner
        Player winner = playerA.canPlay() ? playerA : playerB;
        Player loser = playerA.canPlay() ? playerB : playerA;
        
        // Print the winner and the win ratio
        System.out.println("Winner: Player " + (playerA.canPlay() ? "A" : "B"));
        double winRatio = (double) winner.getWinCount() / loser.getWinCount();
        System.out.printf("Win Ratio (A:B): %.2f%n", winRatio);
        
        scanner.close();
    }
}
