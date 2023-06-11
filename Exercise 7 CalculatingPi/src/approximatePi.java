/**    
*    File: e:\OneDrive\University\1. Fächer\2. Semester\9. Informatik II\Java Code\Exercise 7 CalculatingPi\src\approximatePi.java
*    Project: e:\OneDrive\University\1. Fächer\2. Semester\9. Informatik II\Java Code\Exercise 7 CalculatingPi\src
*    Created Date: Sunday, June 11th 2023, 3:47:14 pm
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
 * @class approximatePi
 *
 * @brief This class implements the Monte Carlo method to approximate the value of Pi.
 */
public class approximatePi {
    /**
     * Main method to execute the program.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        int iterations = 1000000;
        double approximation = approximatePi(iterations);

        System.out.println("Approximation of Pi: " + approximation);
        System.out.println("Math.PI value: " + Math.PI);
    }

    /**
     * Approximates the value of Pi using the Monte Carlo method.
     *
     * @param n The number of iterations.
     * @return The approximation of Pi.
     */
    public static double approximatePi(int n) {
        int count = 0;

        for (int i = 0; i < n; i++) {
            double x = Math.random();
            double y = Math.random();
            double dist = x * x + y * y;

            if (dist <= 1.0) {
                count++;
            }
        }

        double approximation = 4.0 * count / n;
        return approximation;
    }
}