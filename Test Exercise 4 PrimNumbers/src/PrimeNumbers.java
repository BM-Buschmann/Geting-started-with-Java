/**    
*    File: e:\OneDrive\University\1. Fächer\2. Semester\9. Informatik II\Java Code\Test Exercise 4 PrimNumbers\src\App.java
*    Project: e:\OneDrive\University\1. Fächer\2. Semester\9. Informatik II\Java Code\Test Exercise 4 PrimNumbers\src
*    Created Date: Sunday, June 11th 2023, 4:52:00 pm
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
 * Searches for prime numbers.
 */
public class PrimeNumbers {
    /**
     * Main method to execute the program.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        int max = 100;
        int primeCount = countPrimes(max);

        System.out.println("Number of primes between 1 and " + max + ": " + primeCount);
    }

    /**
     * Counts the number of prime numbers in the range between 1 and max.
     *
     * @param max The upper bound of the range.
     * @return The count of prime numbers.
     */
    public static int countPrimes(int max) {
        int count = 0;
        for (int i = 1; i <= max; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    /**
     * Checks if a number is prime.
     *
     * @param n The number to check.
     * @return True if the number is prime, false otherwise.
     */
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
