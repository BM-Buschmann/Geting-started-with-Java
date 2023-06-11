public class HarmonicSeries {
    public static void main(String[] args) {
        // Task 1: Calculating the Harmonic Series with float precision

        // From bottom to top
        float sumFromBottom = 0.0f;
        for (int n = 1; n <= 10000; n++) {
            sumFromBottom += 1.0f / n;
        }
        System.out.println("Sum from bottom to top (float): " + sumFromBottom);

        // From top to bottom
        float sumFromTop = 0.0f;
        for (int n = 10000; n >= 1; n--) {
            sumFromTop += 1.0f / n;
        }
        System.out.println("Sum from top to bottom (float): " + sumFromTop);

        // Task 2: Calculating the Harmonic Series with double precision

        // From bottom to top
        double doubleSumFromBottom = 0.0;
        for (int n = 1; n <= 10000; n++) {
            doubleSumFromBottom += 1.0 / n;
        }
        System.out.println("Sum from bottom to top (double): " + doubleSumFromBottom);

        // From top to bottom
        double doubleSumFromTop = 0.0;
        for (int n = 10000; n >= 1; n--) {
            doubleSumFromTop += 1.0 / n;
        }
        System.out.println("Sum from top to bottom (double): " + doubleSumFromTop);

        // Task 3: Calculating the Harmonic Series from bottom to top with increasing values

        float floatSumIncreasing = 0.0f;
        for (int n = 1_000_000; n <= 100_000_000; n += 1_000_000) {
            floatSumIncreasing += 1.0f / n;
        }
        System.out.println("Sum from bottom to top with increasing values (float): " + floatSumIncreasing);
    }
}
