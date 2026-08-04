package conditionals_loops;

import java.util.Scanner;

public class IfElseAndLoopsExample {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the upper limit
        System.out.print("Enter the number up to which you want to check (e.g., 10): ");

        // Read the integer input
        int limit = scanner.nextInt();

        System.out.println("\nChecking numbers from 1 to " + limit + ":\n");

        // Loop from 1 to the user-defined limit
        for (int i = 1; i <= limit; i++) {

            // If-else to check Even or Odd
            if (i % 2 == 0) {
                System.out.println(i + " is EVEN.");
            } else {
                System.out.println(i + " is ODD.");
            }

            // Nested if to check multiple of 5
            if (i % 5 == 0) {
                System.out.println("  -> " + i + " is also a multiple of 5!");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
