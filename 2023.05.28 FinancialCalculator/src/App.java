import java.util.Scanner;

/**
 * This class represents the main application.
 */
public class App {
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
                    CompoundInterestCalculation.main(scanner);
                    break;
                case 2:
                    RetirementCalculation.main(scanner);
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
