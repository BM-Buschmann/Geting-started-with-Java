/**    
*    File: e:\OneDrive\University\1. Fächer\2. Semester\9. Informatik II\Java Code\2023.06.05 FractionCalculator\src\FractionCalculator.java
*    Project: e:\OneDrive\University\1. Fächer\2. Semester\9. Informatik II\Java Code\2023.06.05 FractionCalculator\src
*    Created Date: Monday, June 5th 2023, 12:58:29 pm
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

import java.util.Scanner;
import modules.Fraction;



public class FractionCalculator {
    /**
     * The main method where the fraction calculations are performed.
     *
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read inputs for fraction1
        System.out.print("Enter numerator for Fraction 1: ");
        int fraction1Numerator = scanner.nextInt();
        
        System.out.print("Enter denominator for Fraction 1: ");
        int fraction1Denominator = scanner.nextInt();

        // Read inputs for fraction2
        System.out.print("\nEnter numerator for Fraction 2: ");
        int fraction2Numerator = scanner.nextInt();

        System.out.print("Enter denominator for Fraction 2: ");
        int fraction2Denominator = scanner.nextInt();

        // Create fraction1 and fraction2 objects
        Fraction fraction1 = new Fraction(fraction1Numerator, fraction1Denominator);
        Fraction fraction2 = new Fraction(fraction2Numerator, fraction2Denominator);

        System.out.print("\nFraction 1: ");
        fraction1.show();

        System.out.print("Fraction 2: ");
        fraction2.show();

        // Add fraction1 and fraction2
        Fraction fraction3 = Fraction.add(fraction1, fraction2);
        System.out.println("\nAdd Fraction 1 and Fraction 2");
        System.out.print("Fraction 3: ");
        fraction3.show();

        // Add fraction1 and fraction2 using instance method
        Fraction fraction4 = fraction1.add(fraction2);
        System.out.println("\nAdd Fraction 1 and Fraction 2 using instance method");
        System.out.print("Fraction 4: ");
        fraction4.show();

        // Subtract fraction2 from fraction1
        Fraction fraction5 = fraction1.subtract(fraction2);
        System.out.println("\nSubtract Fraction 2 from Fraction 1");
        System.out.print("Fraction 5: ");
        fraction5.show();

        // Multiply fraction1 and fraction2
        Fraction fraction6 = fraction1.multiply(fraction2);
        System.out.println("\nMultiply Fraction 1 and Fraction 2");
        System.out.print("Fraction 6: ");
        fraction6.show();

        // Divide fraction1 by fraction2
        Fraction fraction7 = fraction1.divide(fraction2);
        System.out.println("\nDivide Fraction 1 by Fraction 2");
        System.out.print("Fraction 7: ");
        fraction7.show();
        
        // Calculate the power of fraction1
        System.out.println("\nCalculate the power of Fraction 1");
        System.out.print("Enter the exponent for Fraction 1: ");
        int exponent = scanner.nextInt();
        Fraction fraction8 = fraction1.power(exponent);
        System.out.println("Fraction 8 (Fraction 1 ^ " + exponent + "): ");
        fraction8.show();

        // Check if fraction1 and fraction2 are equal
        boolean isEqual = fraction1.isEqual(fraction2);
        System.out.println("\nCheck if Fraction 1 and Fraction 2 are equal");
        System.out.println("Fraction 1 and Fraction 2 are equal: " + isEqual);

        scanner.close();
    }
}
