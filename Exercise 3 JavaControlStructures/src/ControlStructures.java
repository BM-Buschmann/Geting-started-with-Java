/**    
*    File: e:\OneDrive\University\1. Fächer\2. Semester\9. Informatik II\Java Code\Exercise 3 Java control structures\src\App.java
*    Project: e:\OneDrive\University\1. Fächer\2. Semester\9. Informatik II\Java Code\Exercise 3 Java control structures\src
*    Created Date: Sunday, June 11th 2023, 2:37:18 pm
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





public class ControlStructures {
    public static void main(String[] args) throws Exception {
        // Task 1
        //
        // Output of the loop and interpretation by the compiler:
        // The loop in the code provided will not execute because of the semicolon (;) immediately after the while condition.
        // It acts as an empty statement, separating the while condition from the block of code that should be executed in the loop.
        // As a result, the block of code inside the curly braces is treated as a separate unrelated block, which will execute only once after the loop terminates.
        
        int i1 = 0;
        while (i1 < 10); {  // Note the extra semicolon after the while condition
            i1++;
            System.out.println("Value = " + i1);
        }

        // To fix the code and the semicolon (;) after the while condition needs to be removed:
        int i12 = 0;
        while (i12 < 10) {
            i12++;
            System.out.println("Value = " + i12);
        }
        // The corrected code outputs the numbers from 1 to 10, each on a separate line.
        

        // Task 2
        // Initialization of d for an infinite loop:
        // In the given code, the loop will become an infinite loop if d is initialized with the value Double.POSITIVE_INFINITY. 
        // When d is equal to positive infinity, adding 1 to it still results in positive infinity, and the loop condition d == d + 1 remains true indefinitely.

        double d2 = Double.POSITIVE_INFINITY;
        while (d2 == d2 + 1)
        System.out.println("runs");

        // The loop will keep printing "runs" endlessly.
    
        // Task 3
        // Initialization of d for an infinite loop:
        // The loop in the code will become an infinite loop if d is initialized with the value Double.NaN (Not-a-Number). 
        // The reason is that NaN is not equal to any value, including itself (d != d is true for NaN). 
        // Therefore, the loop condition d != d will always be true, resulting in an infinite loop.

        double d3 = Double.NaN;
        while (d3 != d3)
            System.out.println("runs");
        // The loop will keep printing "runs" endlessly.

        // Task 4
        // Compiling different control structures:
        // Only the for loop will compile correctly among the provided constructs. 
        // The other two (while and do-while) will result in compilation errors because the variable n is not initialized before it is used.
        
        int n = 1, a = 5;
        // while (a < 10) {
        //     n = 1;
        //     a++;
        // }
        // do {
        //     n = 1;
        //     a++;
        // } while (a < 10);
        for (int i = 0; i < 10; i++) {
            n = 10;
        }
        int b = n;  // Compilation error: Variable 'n' might not have been initialized
            
        // To fix the compilation errors, you need to initialize the variable n before using it in the while and do-while loops:

        int n42 = 0, a42 = 5;
        while (a < 10) {
            n42 = 1;
            a42++;
        }
        do {
            n42 = 1;
            a42++;
        } while (a < 10);

        for (int i42 = 0; i42 < 10; i42++) {
            n42 = 10;
        }
        int b42 = n42;  // Now it will compile correctly
    
        // In the fixed code, the variable n is initialized to 0 before the loops, ensuring there are no compilation errors.
    }
}
