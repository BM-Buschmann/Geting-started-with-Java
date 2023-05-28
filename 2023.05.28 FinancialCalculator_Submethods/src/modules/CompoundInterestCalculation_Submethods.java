package modules;
/**    
*    File: e:\OneDrive\University\1. Fächer\2. Semester\9. Informatik II\Java Code\2023.05.28 FinancialCalculator\src\CompoundInterestCalculation.java
*    Project: e:\OneDrive\University\1. Fächer\2. Semester\9. Informatik II\Java Code\2023.05.28 FinancialCalculator\src
*    Created Date: Sunday, May 28th 2023, 4:46:21 pm
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
*    2023-05-28	BM  Refactored the code to consolidate the prompt for user inputs into a unified sub-method, improving code organization. As a tradeoff, the value of the investment period now needs to be cast to a int.	
*    2023-05-28	BM  Modularized most actions by sorting and grouping operation steps, enhancing code clarity and maintainability.	
*/    






import java.util.Scanner;

/**
 * This program calculates compound interest.
 */
public class CompoundInterestCalculation_Submethods {
    public static void main(Scanner scanner) {
        clearScreen();        
        // Prompt the user for input values
        double capital = promptForInput(scanner, "Initial capital");
        double interestRate = promptForInput(scanner, "Interest rate");
        int investmentPeriod = (int)promptForInput(scanner, "Investment period (years)");
        
        // Calculate and display compound interest
        calculateCompoundInterest(capital, interestRate, investmentPeriod);
    }
    
    /**
     * Calculates and displays compound interest for each year of the investment period.
     * 
     * @param capital the initial capital
     * @param interestRate the interest rate
     * @param investmentPeriod the investment period in years
     */
    private static void calculateCompoundInterest(double capital, double interestRate, int investmentPeriod) {
        int year;
        System.out.println("\n\n");
        for (year = 1; year <= investmentPeriod; year++) {
            // Calculate the new capital after one year using compound interest formula
            capital += capital * interestRate;
            
            // Display the capital after each year
            // System.out.println("\n" + "Capital after year " + year + ": " + roundToTwoDecimalPlaces(capital)); // comment this out as i assume the calculation steps are irrelevant to the user
        }
        
        // Display the total duration until the capital is depleted
        year--;
        clearScreen();
        System.out.println("The capital after year " + year + ": " + roundToTwoDecimalPlaces(capital) + "\n\n");
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




