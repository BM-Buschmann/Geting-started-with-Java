import java.util.Scanner;

/**
 * This program calculates the retirement duration based on initial capital, interest rate, and annual withdrawal.
 */
public class RetirementCalculation {
    /**
     * @param scanner       the scanner object for user input
     */
    public static void main(Scanner scanner) {        
        System.out.print("Initial Capital: ");
        double capital = scanner.nextDouble();
        
        System.out.print("Interest Rate: ");
        double interestRate = scanner.nextDouble();
        
        double withdrawal;
        boolean validWithdrawal = false;
        
        // Prompt the user for annual withdrawal until a valid value is entered
        while (!validWithdrawal) {
            System.out.print("Annual Withdrawal: ");
            withdrawal = scanner.nextDouble();
            
            // Check if the withdrawal amount is greater than the product of initial capital and interest rate
            if (withdrawal > capital * interestRate) {
                validWithdrawal = true;
                calculateRetirementDuration(capital, interestRate, withdrawal);
            } else {
                System.out.println("\n\n In this scenario, the interest rate on your funds is higher than the amount you spend annually.\n As a result, your funds will never run out because the interest earned on the capital will cover or exceed your annual expenses.\n\n");
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
        while (capital >= 0) {
            year++;
            
            // Calculate the new capital after one year
            capital += capital * interestRate - withdrawal;
            
            // Display the capital after each year
            System.out.println("Capital after Year " + year + ": " + roundToTwoDecimalPlaces(capital));
        }
        
        // Display the total duration until the capital is depleted
        year--;
        System.out.println("\n\n" + "The capital is depleted after " + year + " years." + "\n\n");
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
