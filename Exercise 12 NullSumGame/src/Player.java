/**    
*    File: e:\OneDrive\University\1. Fächer\2. Semester\9. Informatik II\Java Code\2023.05.29 NullSumGame\src\Player.java
*    Project: e:\OneDrive\University\1. Fächer\2. Semester\9. Informatik II\Java Code\2023.05.29 NullSumGame\src
*    Created Date: Monday, May 29th 2023, 12:25:42 am
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





/**
 * Represents a player in the game.
 */
class Player {
    private int money;
    private int winCount;

    /**
     * Initializes the player with the given initial money and sets win count to 0.
     *
     * @param initialMoney the initial amount of money for the player
     */
    public Player(int initialMoney) {
        money = initialMoney;
        winCount = 0;
    }

    /**
     * Updates the player's money by the given amount.
     *
     * @param amount the amount to be added or subtracted from the player's money
     */
    public void updateMoney(int amount) {
        money += amount;
    }

    /**
     * Checks if the player can continue playing (i.e., has positive money).
     *
     * @return true if the player can continue playing, false otherwise
     */
    public boolean canPlay() {
        return money > 0;
    }

    /**
     * Increases the player's win count by 1.
     */
    public void incrementWinCount() {
        winCount++;
    }

    /**
     * Returns the number of wins for the player.
     *
     * @return the number of wins for the player
     */
    public int getWinCount() {
        return winCount;
    }
}