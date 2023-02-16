// Importing
import java.util.Scanner;
/**
* Get the radius from the user to calculate
* the volume of a sphere.
*
* @author  Adrijan Vranjkovic
* @version 1.0
* @since   2023-02-14
*/

// Making class
public final class Logging {

    /**
     * This is a private constructor used to satisfy the style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */
    private Logging() {
        throw new IllegalStateException("Utility class.");
    }

    /**
    * This is the main method.
    *
    * @param args Unused.
    */
    public static void main(String[] args) {
        // Using scanner to get user input
        System.out.println("What is the length of the log (0.25m, 0.5m, 1m)?");
        final Scanner scanner = new Scanner(System.in);
        final String logLength = scanner.nextLine();
        try {

            // Make user input a double.
            final double logDouble = Double.parseDouble(logLength);
            // Check for valid input.
            if (logDouble == 0.25) {
                // calculate
                final double maxLogs = 1100 / (logDouble * 20);
                System.out.println("The truck can cary " + maxLogs + " logs.");
            } else if (logDouble == 0.5) {
                // calculate.
                final double maxLogs = 1100 / (logDouble * 20);
                // Print.
                System.out.println("The truck can cary " + maxLogs + " logs.");
            } else if (logDouble == 1) {
                // calculate.
                final double maxLogs = 1100 / (logDouble * 20);
                // Print.
                System.out.println("The truck can cary " + maxLogs + " logs.");
            } else {
                // Print if input is not valid.
                System.out.println("This not a possible input.");
            }

        } catch (NumberFormatException error) {
            System.out.println("Please enter a valid log length!"
                + error.getMessage());
        }
        // Close scanner.
        scanner.close();
    }
}
