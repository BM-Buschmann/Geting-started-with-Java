/**    
*    File: e:\OneDrive\University\1. Fächer\2. Semester\9. Informatik II\Java Code\2023.05.28 CurrencyConversionCalculator\src\Calculator.java
*    Project: e:\OneDrive\University\1. Fächer\2. Semester\9. Informatik II\Java Code\2023.05.28 CurrencyConversionCalculator\src
*    Created Date: Sunday, May 28th 2023, 11:45:01 pm
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





/**
 * Converter class represents a currency converter with exchange rate.
 */
public class Converter {
    
    private double exchangeRate;
    
    /**
     * Constructs a Converter object with the specified exchange rate.
     * 
     * @param exchangeRate the exchange rate between currencies
     */
    public Converter(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }
    
    /**
     * Converts a foreign amount to Euro based on the exchange rate.
     * 
     * @param foreignAmount the amount in foreign currency to be converted
     * @return the equivalent amount in Euro
     */
    public double convertToEuro(double foreignAmount) {
        return foreignAmount / exchangeRate;
    }

    /**
     * Converts an amount in Euro to foreign currency based on the exchange rate.
     * 
     * @param euroAmount the amount in Euro to be converted
     * @return the equivalent amount in the foreign currency
     */
    public double convertToForeign(double euroAmount) {
        return euroAmount * exchangeRate;
    }
}
