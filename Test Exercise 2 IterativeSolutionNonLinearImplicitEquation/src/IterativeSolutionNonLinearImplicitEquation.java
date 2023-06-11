/**    
*    File: e:\OneDrive\University\1. Fächer\2. Semester\9. Informatik II\Java Code\Test Exercise 2 IterativeSolutionNonLinearImplicitEquation\src\IterativeSolutionNonLinearImplicitEquation.java
*    Project: e:\OneDrive\University\1. Fächer\2. Semester\9. Informatik II\Java Code\Test Exercise 2 IterativeSolutionNonLinearImplicitEquation\src
*    Created Date: Sunday, June 11th 2023, 3:35:07 pm
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
 * Program to solve the equation: x = 2 - e^(-x)
 */
public class IterativeSolutionNonLinearImplicitEquation {
    
    /**
     * Main method to execute the program.
     *
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {
        double x = 1.0; // Initial value of x
        double threshold = 1E-6; // Threshold for terminating the iteration
        
        // Perform iterations until the desired accuracy is achieved
        while (true) {
            double result = 2 - Math.exp(-x); // Substitute x into the equation
            double difference = Math.abs(x - result); // Calculate the difference
            
            if (difference < threshold) {
                break; // Terminate the iteration if the desired accuracy is reached
            }
            
            x = result; // Update the value of x for the next iteration
        }
        
        System.out.println("The solution for the equation x = 2 - e^(-x) is: " + x);
    }
}