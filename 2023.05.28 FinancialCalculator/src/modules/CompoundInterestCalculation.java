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
*/    






import java.util.Scanner;


/**
 * This program calculates compound interest.
 */
public class CompoundInterestCalculation {
    static void main(Scanner scanner) {
        
        // Prompt the user to enter the initial capital
        System.out.print("Initial capital: ");
        double capital = scanner.nextDouble();
        
        // Prompt the user to enter the interest rate
        System.out.print("Interest rate: ");
        double interestRate = scanner.nextDouble();
        
        // Prompt the user to enter the investment period in years
        System.out.print("Investment period (years): ");
        int investmentPeriod = scanner.nextInt();
        
        // Calculate compound interest for each year of the investment period
        int year = 0;
        for (year = 1; year <= investmentPeriod; year++) {
            // Calculate the new capital after one year using compound interest formula
            capital += capital * interestRate;
            
            // Display the capital after each year
            System.out.println("Capital after year " + year + ": " + roundToTwoDecimalPlaces(capital));
        }
        // Display the total duration until the capital is depleted
        year--;
        System.out.println("\n\n" + "The Capital after year " + year + ": " + roundToTwoDecimalPlaces(capital) + "\n\n" );
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
}
