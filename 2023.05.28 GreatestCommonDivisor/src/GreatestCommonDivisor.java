import java.util.Scanner;

/**
 * This program calculates the greatest common divisor (GCD) of two numbers using iterative and recursive methods
 * based on the Euclidean algorithm.
 */
public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean startOver = true;
        while (startOver) {
            clearScreen();
            System.out.print("Enter value for a: ");
            int a = scanner.nextInt();
            
            System.out.print("Enter value for b: ");
            int b = scanner.nextInt();
            
            int iterativeGCD = ggTIterative(a, b);
            int recursiveGCD = ggTRecursive(a, b);
            
            System.out.println("Iterative GCD: " + iterativeGCD);
            System.out.println("Recursive GCD: " + recursiveGCD);
            
            System.out.print("Do you want to start over? (Y/N): ");
            String answer = scanner.next();
            
            if (!answer.equalsIgnoreCase("Y")) {
                startOver = false;
            }
        }
        
        scanner.close();
    }

    /**
     * Calculates the greatest common divisor (GCD) of two numbers iteratively using the Euclidean algorithm.
     *
     * @param a the first number
     * @param b the second number
     * @return the GCD of the two numbers
     */
    public static int ggTIterative(int a, int b) {
        if (a == 0) {
            return b;
        } else {
            while (b != 0) {
                if (a > b) {
                    a = a - b;
                } else {
                    b = b - a;
                }
            }
            return a;
        }
        /**
         * all of the above code could hav been condensed to the following with one less if condition...
            if (a==0){
                return b;
            }else{
                while (b != 0) {
                    int temp = b;
                    b = a % b;
                    a = temp;
                }
            return a;
            }
         */
    }

    /**
     * Calculates the greatest common divisor (GCD) of two numbers recursively using the Euclidean algorithm.
     *
     * @param a the first number
     * @param b the second number
     * @return the GCD of the two numbers
     */
    public static int ggTRecursive(int a, int b) {
        if (b == 0) {
            return a;
        } else if (a == 0) {
            return b;
        } else {
            if (a > b) {
                return ggTRecursive(a - b, b);
            } else {
                return ggTRecursive(a, b - a);
            }
        }
        /**
         * all of the above code could hav been condensed to the following with one less if condition...
            if (b == 0) {
                return a;
            } else if ( a==0 ) {
                return b;
            } else {
                return ggTRekursiv(b, a % b);
            }
         */
    }
    
    public static void clearScreen() {
        // Prints multiple newline characters to clear the screen
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
