/**    
*    File: e:\OneDrive\University\1. Fächer\2. Semester\9. Informatik II\Java Code\2023.06.05 FractionCalculator\src\modules\Fraction.java
*    Project: e:\OneDrive\University\1. Fächer\2. Semester\9. Informatik II\Java Code\2023.06.05 FractionCalculator\src\modules
*    Created Date: Sunday, June 11th 2023, 12:30:03 pm
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





package modules;

/**
 * Represents a fraction with a numerator and a denominator.
 */
public class Fraction {
    private int numerator;
    private int denominator;

    /**
     * Constructs a Fraction object with default values of 1 for numerator and denominator.
     */
    public Fraction() {
        this(1, 1);
    }

    /**
     * Constructs a Fraction object with the given numerator and denominator.
     *
     * @param numerator   The numerator of the fraction.
     * @param denominator The denominator of the fraction.
     */
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    /**
     * Displays the fraction in the form of "numerator/denominator".
     */
    public void show() {
        System.out.println(numerator + "/" + denominator);
    }

    /**
     * Returns the reciprocal of the fraction.
     *
     * @return The reciprocal of the fraction.
     */
    public Fraction reciprocal() {
        return new Fraction(denominator, numerator);
    }

    /**
     * Returns the negation of the fraction.
     *
     * @return The negation of the fraction.
     */
    public Fraction negate() {
        return new Fraction(-numerator, denominator);
    }

    /**
     * Finds the greatest common divisor (GCD) of two numbers.
     *
     * @param a The first number.
     * @param b The second number.
     * @return The GCD of a and b.
     */
    private int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    /**
     * Reduces the fraction to its simplest form.
     *
     * @return The reduced fraction.
     */
    public Fraction reduce() {
        int divisor = gcd(numerator, denominator);
        return new Fraction(numerator / divisor, denominator / divisor);
    }

    /**
     * Adds two fractions.
     *
     * @param fraction1 The first fraction.
     * @param fraction2 The second fraction.
     * @return The sum of the two fractions.
     */
    public static Fraction add(Fraction fraction1, Fraction fraction2) {
        int newNumerator = fraction1.numerator * fraction2.denominator + fraction2.numerator * fraction1.denominator;
        int newDenominator = fraction1.denominator * fraction2.denominator;
        Fraction result = new Fraction(newNumerator, newDenominator);
        return result.reduce();
    }

    /**
     * Adds the given fraction to this fraction.
     *
     * @param fraction The fraction to be added.
     * @return The sum of this fraction and the given fraction.
     */
    public Fraction add(Fraction fraction) {
        return add(this, fraction);
    }

    /**
     * Subtracts the given fraction from this fraction.
     *
     * @param fraction The fraction to be subtracted.
     * @return The difference between this fraction and the given fraction.
     */
    public Fraction subtract(Fraction fraction) {
        return add(this, fraction.negate());
    }

    /**
     * Multiplies two fractions.
     *
     * @param fraction The fraction to be multiplied with this fraction.
     * @return The product of the two fractions.
     */
    public Fraction multiply(Fraction fraction) {
        int newNumerator = numerator * fraction.numerator;
        int newDenominator = denominator * fraction.denominator;
        Fraction result = new Fraction(newNumerator, newDenominator);
        return result.reduce();
    }

    /**
     * Divides this fraction by the given fraction.
     *
     * @param fraction The fraction to divide by.
     * @return The quotient of this fraction divided by the given fraction.
     */
    public Fraction divide(Fraction fraction) {
        return multiply(fraction.reciprocal());
    }

    /**
     * Calculates the power of this fraction to the given exponent.
     *
     * @param exponent The exponent.
     * @return The result of raising this fraction to the power of the exponent.
     */
    public Fraction power(int exponent) {
        if (exponent == 0)
            return new Fraction(1, 1);
        Fraction result = new Fraction(numerator, denominator);
        for (int i = 1; i < Math.abs(exponent); i++) {
            result = result.multiply(this);
        }
        if (exponent < 0)
            result = result.reciprocal();
        return result;
    }

    /**
     * Checks if the given fraction is equal to this fraction.
     *
     * @param fraction The fraction to compare.
     * @return true if the fractions are equal, false otherwise.
     */
    public boolean isEqual(Fraction fraction) {
        return (numerator == fraction.numerator && denominator == fraction.denominator);
    }
}