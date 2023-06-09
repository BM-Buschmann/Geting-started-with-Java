/**    
*    File: e:\OneDrive\University\1. Fächer\2. Semester\9. Informatik II\Java Code\2023.05.28 SwichCase\src\App.java
*    Project: e:\OneDrive\University\1. Fächer\2. Semester\9. Informatik II\Java Code\2023.05.28 SwichCase\src
*    Created Date: Sunday, May 28th 2023, 4:15:59 pm
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
 * This class allows the user to input a number between 0 and 9 and displays the corresponding range.
 * 
 * If the break statement within the swich case is forgotten in each case of the switch statement, a phenomenon called "fall-through" would occur. 
 * Fall-through means that the code execution will continue to the next case even if the current case matches. 
 * It would result in executing the code of all subsequent cases until a break statement is encountered or the end of the switch block is reached.
 * 
 */
public class SwichCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continueInput;

        /**
         * Keeps prompting the user for input until they choose to exit.
         */
        do {
            System.out.print("Please enter a number between 0 and 9: ");
            int number = scanner.nextInt();

            /**
             * Displays the range based on the input number.
             */
            switch (number) {
                case 0:
                case 1:
                case 2:
                case 3:
                    System.out.println("Range: Zero to Three");
                    break; 
                case 4:
                case 5:
                case 6:
                case 7:
                    System.out.println("Range: Four to Seven");
                    break;
                case 8:
                case 9:
                    System.out.println("Range: Eight to Nine");
                    break;
                default:
                    System.out.println("Invalid number input");
                    break;
            }

            System.out.print("Would you like to enter another number? (Y/N): ");
            continueInput = scanner.next().charAt(0);
        } while (Character.toUpperCase(continueInput) == 'Y');

        System.out.println("The program has been terminated.");
        scanner.close();
    }
}
