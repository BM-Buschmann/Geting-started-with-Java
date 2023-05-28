package modules;
/**    
*    File: e:\OneDrive\University\1. Fächer\2. Semester\9. Informatik II\Java Code\2023.05.28 FinancialCalculator\src\RetirementCalculation.java
*    Project: e:\OneDrive\University\1. Fächer\2. Semester\9. Informatik II\Java Code\2023.05.28 FinancialCalculator\src
*    Created Date: Sunday, May 28th 2023, 4:47:37 pm
*    Author: Björn Metzger
*    -----
*    Last Modified: Sun May 28 2023
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
*    2023-05-28	BM  Refactored the code to consolidate the prompt for user inputs into a unified sub-method, improving code organization.	
*    2023-05-28	BM  Modularized most actions by sorting and grouping operation steps, enhancing code clarity and maintainability.
*/    






import java.util.Scanner;

/**
 * This program calculates the retirement duration based on initial capital, interest rate, and annual withdrawal.
 */
public class RetirementCalculation_Submethods {
    /**
     * @param scanner       the scanner object for user input
     */
    public static void main(Scanner scanner) {
        clearScreen();        
        double capital = promptForInput(scanner, "Initial capital");        
        double interestRate = promptForInput(scanner, "Interest Rate");
        
        boolean validWithdrawal = false;
        
        // Prompt the user for annual withdrawal until a valid value is entered
        while (!validWithdrawal) {
            double withdrawal = promptForInput(scanner, "Annual Withdrawal");
            
            
            // Check if the withdrawal amount is greater than the product of initial capital and interest rate
            if (withdrawal > capital * interestRate) {
                validWithdrawal = true;
                calculateRetirementDuration(capital, interestRate, withdrawal);
            } else {
                System.out.println("\n\n" + "In this scenario, the interest rate on your funds is higher than the amount you spend annually.\n As a result, your funds will never run out because the interest earned on the capital will cover or exceed your annual expenses." + "\n\n");
            }
        }
    }
    /**
     * Calculates the retirement duration based on initial capital, interest rate, and annual withdrawal.
     * 
     * @param capital       the initial capital
     * @param interestRate  the interest rate
     * @param withdrawal    the annual withdrawal
     */
    private static void calculateRetirementDuration(double capital, double interestRate, double withdrawal) {
        int year = 0;
        while (0 < (capital + (capital * interestRate) - withdrawal)){
            year++;
            
            // Calculate the new capital after one year
            capital += capital * interestRate - withdrawal;
            
            // Display the capital after each year
            // System.out.println("\n" + "Capital after Year " + year + ": " + roundToTwoDecimalPlaces(capital)); // comment this out as i assume the calculation steps are irrelevant to the user
        };
        
        
        // Display the total duration until the capital is depleted

        clearScreen();
        System.out.println("The capital would last " + year + " years. The Balance would be:"+ roundToTwoDecimalPlaces(capital) + "\nThe Year following you would have a negativ balance.\n\n");
    }
    /**
     * Prompts the user to enter a numeric input value.
     * 
     * @param scanner the Scanner object for input
     * @param prompt the prompt message
     * @return the numeric value entered by the user
     */
    private static double promptForInput(Scanner scanner, String prompt) {
        System.out.print(prompt + ": ");
        return scanner.nextDouble();
    }
    /**
     * Rounds a double value to two decimal places.
     * 
     * @param value the value to round
     * @return the rounded value
     */
    private static double roundToTwoDecimalPlaces(double value) {
        return Math.round(value * 100.0) / 100.0;
    }
    /**
     * Scrolls to the top of the terminal.
     */
    private static void clearScreen() {
        // Prints multiple newline characters to clear the screen
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
