/**    
*    File: e:\OneDrive\University\1. Fächer\2. Semester\9. Informatik II\Java Code\2023.05.28 FinancialCalculator\src\App.java
*    Project: e:\OneDrive\University\1. Fächer\2. Semester\9. Informatik II\Java Code\2023.05.28 FinancialCalculator\src
*    Created Date: Sunday, May 28th 2023, 4:41:15 pm
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
*    2023-05-28	BM  Reorganized module sub-associations from indirect imports to explicit imports.	
*/    


import java.util.Scanner;

import modules.CompoundInterestCalculation_Submethods;
import modules.RetirementCalculation_Submethods;

/**
 * This class represents the main application.
 */
public class FinancialCalculator_Submethods {
    /**
     * The main entry point of the application.
     *
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        /**
        * Prompts the user to choose which class to execute: CompoundInterestCalculation or RetirementCalculation.
        */
        Scanner scanner = new Scanner(System.in);
        
        boolean startOver = true;
        
        while (startOver) {
            System.out.println("Which class do you want to execute?");
            System.out.println("1. CompoundInterestCalculation");
            System.out.println("2. RetirementCalculation");
            System.out.print("Enter the corresponding number: ");
            
            int selection = scanner.nextInt();
            
            switch (selection) {
                case 1:
                    CompoundInterestCalculation_Submethods.main(scanner);
                    break;
                case 2:
                    RetirementCalculation_Submethods.main(scanner);
                    break;
                default:
                    System.out.println("Invalid selection.");
                    break;
            }
            
            System.out.print("Do you want to start over? (Y/N): ");
            String answer = scanner.next();
            
            if (!answer.equalsIgnoreCase("Y")) {
                startOver = false;
            }
        }
        
        scanner.close();
    }
}
