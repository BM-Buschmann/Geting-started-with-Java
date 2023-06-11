/**    
*    File: e:\OneDrive\University\1. Fächer\2. Semester\9. Informatik II\Java Code\2023.05.28 CurrencyConversionCalculator\src\CurrencyConversionCalculator.java
*    Project: e:\OneDrive\University\1. Fächer\2. Semester\9. Informatik II\Java Code\2023.05.28 CurrencyConversionCalculator\src
*    Created Date: Sunday, May 28th 2023, 11:26:17 pm
*    Author: Björn Metzger
*    -----
*    Last Modified: Mon May 29 2023
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
 * A program to perform currency conversions between Euro, Dollar, and swissFranc.
 */
public class CurrencyConversionCalculator {

    /**
     * Main method to run the currency conversion calculator.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean startOver = true;

        while (startOver) {
            // Create Converter instances for Dollar and swissFranc currencies
            Converter dollar = new Converter(1.19);
            Converter swissFranc = new Converter(1.08);
            
            // Perform currency conversions Dollar to Euro
            System.out.print("Enter amount to convert to Euro (Dollar): ");
            double amountInDollar = scanner.nextDouble();
            double euroAmountDollar = dollar.convertToEuro(amountInDollar);
            System.out.println("Converted amount to Euro: " + euroAmountDollar);
            
            // Perform currency conversions swissFranc to Euro
            System.out.print("Enter amount to convert to Euro (swissFranc): ");
            double amountInSwissFranc = scanner.nextDouble();
            double euroAmountSwissFranc = swissFranc.convertToEuro(amountInSwissFranc);
            System.out.println("Converted amount to Euro: " + euroAmountSwissFranc);
            
            // Perform currency conversions Euro to swissFranc && Dollar
            System.out.print("Enter amount to convert to Foreign Currencies (Euro): ");
            double amountInEuro = scanner.nextDouble();

            double foreignAmountSwissFranc = swissFranc.convertToForeign(amountInEuro);
            System.out.println("Converted amount to Foreign (swissFranc): " + foreignAmountSwissFranc);

            double foreignAmountUSDollar = dollar.convertToForeign(amountInEuro);
            System.out.println("Converted amount to Foreign (Dollar): " + foreignAmountUSDollar);

            System.out.print("Do you want to start over? (Y/N): ");
            String answer = scanner.next();

            if (!answer.equalsIgnoreCase("Y")) {
                startOver = false;
            }
        }
        
        scanner.close();
    }
}

