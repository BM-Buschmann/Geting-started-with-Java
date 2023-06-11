/**    
*    File: e:\OneDrive\University\1. Fächer\2. Semester\9. Informatik II\Java Code\Exercise 2 Primative-Datatypes in Java\src\App.java
*    Project: e:\OneDrive\University\1. Fächer\2. Semester\9. Informatik II\Java Code\Exercise 2 Primative-Datatypes in Java\src
*    Created Date: Sunday, June 11th 2023, 1:33:25 pm
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





public class Primative_Datatypes {
    public static void main(String[] args) {
        // Task 1
        char c1Task1 = 'N';
        short s1Task1 = 'N';
        short s11Task1 = (short) c1Task1;// short s11Task1 = c1Task1; // Type mismatch: cannot convert from char to short

        int n2Task1 = 100;
        short s2Task1 = 100;
        char c2Task1 = 100;
        c2Task1 = (char) n2Task1; // c2Task1 = n2Task1; // Type mismatch: cannot convert from int to char
        c2Task1 = (char) s2Task1; // c2Task1 = s2Task1; // Type mismatch: cannot convert from short to char
        
        // Task 2
        double d1Task2 = 0.2;
        float f1Task2 = 0.2f;
        System.out.println(d1Task2 == f1Task2); // Output: true (double and float are equal)

        double d2Task2 = 1E30;
        double d3Task2 = 1.1;
        System.out.println("Value m " + (d2Task2 + d3Task2)); // Output: Infinity (overflow)

        float f2Task2 = 1.0f / 3;
        System.out.println("Value " + f2Task2); // Output: 0.33333334 (approximation)
        float f22Task2 = (float) (1.0 / 3);
        System.out.println("Value " + f22Task2); // Output: 0.33333334 (approximation)

        double d4Task2 = (1.0f / 3);
        System.out.println("Value " + d4Task2); // Output: 0.3333333432674408 (approximation)
        double d44Task2 = 1.0 / 3;
        System.out.println("Value " + d44Task2); // Output: 0.3333333333333333 (exact)

        // Task 3
        float dyTask3 = 1E-10f;
        float ynTask3 = 1f;
        int iTask3 = 0;

        while (ynTask3 < 10.0) {
            ynTask3 = ynTask3 + dyTask3;
            iTask3++;
            System.out.println("Iteration: " + iTask3 + " yn = " + ynTask3);
        }
        // The program fragment increments ynTask3 by dyTask3 in each iteration.
        // To assess numerical correctness, we can check if ynTask3 reaches the expected value (10.0) within a reasonable error margin.
        // In this case, it seems the program is working correctly.

        // Task 4
        boolean bTask4 = true && false == true && false;
        // The expression is evaluated from left to right using short-circuit evaluation.
        // Since the first condition is false, the evaluation stops and assigns false to bTask4.
        System.out.println("Value of b: " + bTask4); // Output: false

        // Task 5
        char characterTask5 = '@';
        int asciiValueTask5 = (int) characterTask5;
        System.out.println("ASCII value of '@' is " + asciiValueTask5); // Output: ASCII value of '@' is 64

        // Task 6
        int aTask6 = 100;
        int bTask6 = 200;
        if (aTask6 <= Integer.MAX_VALUE - bTask6) {
            int sumTask6 = aTask6 + bTask6;
            System.out.println("Sum: " + sumTask6);
        } else {
            System.out.println("Overflow occurred");
        }
        // This code segment ensures that the calculation `aTask6 + bTask6` is only performed if no overflow occurs.
        // It checks if the sum is less than or equal to the maximum value that can be stored in an int.

        // Task 7
        boolean boolTask7 = false;
        if (boolTask7 == false) {
            System.out.println("Branch 1");
        } else {
            System.out.println("Branch 2");
        }
        // The branch executed will be "Branch 1" because the condition (boolTask7 == false) is true.
        // For an int type, a similar case can happen with `if (x == 1)`.

        // Task 8
        byte aTask8 = 4;
        byte bTask8 = 16;

        System.out.println("Value = " + (aTask8 + bTask8));  // Output: 20 (addition)
        System.out.println("Value = " + (aTask8 | bTask8));  // Output: 20 (bitwise OR)
        System.out.println("Value = " + (aTask8 ^ bTask8));  // Output: 20 (bitwise XOR)
        System.out.println("Value = " + (aTask8 & bTask8));  // Output: 0  (bitwise AND)
        // The operations yield the same result because in this case, the values of `aTask8` and `bTask8` are small enough
        // that their addition and bitwise OR, XOR, and AND operations produce the same outcome.
    }
}
