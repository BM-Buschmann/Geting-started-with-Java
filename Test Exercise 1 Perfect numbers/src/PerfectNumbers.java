/**    
*    File: e:\OneDrive\University\1. Fächer\2. Semester\9. Informatik II\Java Code\Test Execrcise 1 Perfect numbers\src\PerfectNumbers.java
*    Project: e:\OneDrive\University\1. Fächer\2. Semester\9. Informatik II\Java Code\Test Execrcise 1 Perfect numbers\src
*    Created Date: Sunday, June 11th 2023, 3:19:37 pm
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






/**
 * Program to calculate perfect numbers.
 */
public class PerfectNumbers {
    /**
     * Main method to execute the program.
     *
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {
        int limit = 500;
        findPerfectNumbers(limit);
    }
    
    /**
     * Finds and prints all perfect numbers up to the given limit.
     *
     * @param limit The upper limit to check for perfect numbers.
     */
    public static void findPerfectNumbers(int limit) {
        System.out.println("Perfect numbers up to " + limit + ":");
        for (int i = 1; i <= limit; i++) {
            if (isPerfectNumber(i)) {
                System.out.println(i);
            }
        }
    }

    /**
     * Checks if a number is perfect.
     *
     * @param number The number to check.
     * @return True if the number is perfect, false otherwise.
     */
    public static boolean isPerfectNumber(int number) {
        int sum = 1; // Start with 1 since it's always a divisor

        // Find divisors and add them to the sum
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                sum += i;
                int otherDivisor = number / i;
                if (otherDivisor != i) {
                    sum += otherDivisor;
                }
            }
        }
        
        // Check if the sum is equal to twice the number
        return sum == 2 * number;
    }
}
