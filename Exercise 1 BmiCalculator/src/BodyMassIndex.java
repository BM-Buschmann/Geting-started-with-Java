/**    
*    File: e:\OneDrive\University\1. Fächer\2. Semester\9. Informatik II\Java Code\2023.05.13 BmiCalculator\src\BodyMassIndex.java
*    Project: e:\OneDrive\University\1. Fächer\2. Semester\9. Informatik II\Java Code\2023.05.13 BmiCalculator\src
*    Created Date: Saturday, May 13th 2023, 11:29:41 am
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
 * The BodyMassIndex class calculates and displays the Body Mass Index (BMI) based on user input for height and weight.
 */
public class BodyMassIndex {

    /**
     * The main method calculates the BMI and displays the result.
     *
     * @param args command-line arguments (not used in this example)
     */
    public static void main(String[] args) {

        clearScreen(); 
        String globalUserName = "";
        Scanner globalScanner = new Scanner(System.in);

        do{
            String userName = getUserNameString(globalScanner);
            globalUserName = userName;

            double height = getUserHeight(userName, globalScanner); // height in meters
            double weight = getUserWeight(userName, globalScanner); // weight in kilograms

            double bmi = 0.0; // bmi initialized as double
    
            bmi = weight / (height * height); // calculate bmi using the formula weight / (height^2)

            clearScreen();
            System.out.printf("%s your BMI Value is: \033[4m\033[1m%.2f\033[0m\n", userName, bmi);

        } while (getUserDecision(globalUserName, globalScanner));

        globalScanner.close();
    }

    /**
     * Prompts the user to enter their name in returns the value as a string.
     *
     * @return the user's Name
     */
    private static String getUserNameString(Scanner scanner){
        String userName = "";
        clearScreen();

        System.out.printf("Good Day can you please enter your \033[4m\033[1mname\033[0m:");
        userName = scanner.next();

        return userName;
    } 

    /**
     * Prompts the user to enter their height in meters and returns the value.
     *
     * @param userName the name of the person entering the values
     * @return the user's height in meters
     */
    private static double getUserHeight(String userName, Scanner scanner) {
        double height = 0.0;
        boolean isValidInput = false;
    
        while (!isValidInput) {
            clearScreen();
            System.out.printf("%s please enter your \033[4m\033[1mheight\033[0m in meters:", userName);
    
            if (scanner.hasNextDouble()) {
                height = scanner.nextDouble();
                isValidInput = true;
            } else {
                System.out.println("Invalid input. Please enter a numerical value.");
                scanner.next(); // Consume the invalid input to avoid an infinite loop
            }
        }
    
        clearScreen();
        return height;
    }
    
    /**
     * Prompts the user to enter their weight in kilograms and returns the value.
     *
     * @param userName the name of the person entering the values
     * @return the user's weight in kilograms
     */
    private static double getUserWeight(String userName, Scanner scanner) {
        double weight = 0.0;
    
        clearScreen();
        boolean validInput = false;
        while (!validInput) {
            System.out.printf("%s please enter your \033[4m\033[1mweight\033[0m in kilograms: ",userName);
            if (scanner.hasNextDouble()) {
                weight = scanner.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a numerical value for weight.");
                scanner.next(); // Consume the invalid input to avoid an infinite loop
            }
        }

        clearScreen();
        return weight;
    }
    
    /**
     * Prompts the user to make a decision to start over or exit.
     * @param userName the name of the person entering the values
     * @return true if the user chooses to start over, false if the user chooses to exit
     */
    private static boolean getUserDecision(String userName, Scanner scanner) {
        boolean userDecision = false;
        boolean validInput = false;

        while (!validInput) {
            System.out.printf("\n%s, please press \033[4m\033[1mX\033[0m to exit or \033[4m\033[1mC\033[0m to start over. Submit your choice with \033[4m\033[1mENTER\033[0m:", userName);
            String tempString = scanner.next();
            if (tempString.contains("X")) {
                System.out.println("Exiting...");
                userDecision = false;
                validInput = true;
                clearScreen();
            } else if (tempString.contains("C")) {
                System.out.println("Starting over...");
                userDecision = true;
                validInput = true;
                clearScreen();
            }else {
                System.out.println("Invalid input. Please try again.");
                scanner.next(); // Consume the invalid input to avoid an infinite loop
            }
        }

        clearScreen();
        return userDecision;
    }
    
    /**
     * Clears the console screen by printing a number of empty lines.
     */
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
