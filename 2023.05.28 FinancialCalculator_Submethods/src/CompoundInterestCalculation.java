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
*    2023-05-28	BM  Modulised most actions into sub methods by sourting grouping opperation steps	
*/    






import java.util.Scanner;

/**
 * This program calculates compound interest.
 */
public class CompoundInterestCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for input values
        double capital = promptForInitialCapital(scanner);
        double interestRate = promptForInterestRate(scanner);
        int investmentPeriod = promptForInvestmentPeriod(scanner);
        
        // Calculate and display compound interest
        calculateCompoundInterest(capital, interestRate, investmentPeriod);
        
        scanner.close();
    }
    
    /**
     * Prompts the user to enter the initial capital.
     * 
     * @param scanner the Scanner object for input
     * @return the initial capital entered by the user
     */
    public static double promptForInitialCapital(Scanner scanner) {
        System.out.print("Initial capital: ");
        return scanner.nextDouble();
    }
    
    /**
     * Prompts the user to enter the interest rate.
     * 
     * @param scanner the Scanner object for input
     * @return the interest rate entered by the user
     */
    public static double promptForInterestRate(Scanner scanner) {
        System.out.print("Interest rate: ");
        return scanner.nextDouble();
    }
    
    /**
     * Prompts the user to enter the investment period in years.
     * 
     * @param scanner the Scanner object for input
     * @return the investment period entered by the user
     */
    public static int promptForInvestmentPeriod(Scanner scanner) {
        System.out.print("Investment period (years): ");
        return scanner.nextInt();
    }
    
    /**
     * Calculates and displays compound interest for each year of the investment period.
     * 
     * @param capital the initial capital
     * @param interestRate the interest rate
     * @param investmentPeriod the investment period in years
     */
    public static void calculateCompoundInterest(double capital, double interestRate, int investmentPeriod) {
        int year;
        for (year = 1; year <= investmentPeriod; year++) {
            // Calculate the new capital after one year using compound interest formula
            capital += capital * interestRate;
            
            // Display the capital after each year
            System.out.println("Capital after year " + year + ": " + roundToTwoDecimalPlaces(capital));
        }
        
        // Display the total duration until the capital is depleted
        year--;
        System.out.println("The capital after year " + year + ": " + roundToTwoDecimalPlaces(capital));
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



