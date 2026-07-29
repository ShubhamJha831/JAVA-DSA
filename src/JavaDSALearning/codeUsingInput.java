package JavaDSALearning;
import java.util.Scanner;
import java.util.Random;

public class codeUsingInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // Array of quotes
        String[] quotes = {
                "Believe in yourself!",
                "Every day is a new opportunity.",
                "Success comes to those who never give up.",
                "Dream big and work hard.",
                "Stay positive and keep learning."
        };

        // Take user input
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Generate random index
        int index = random.nextInt(quotes.length);

        // Print greeting with random quote
        System.out.println();
        System.out.println("Hello, " + name + "!");
        System.out.println("Your quote for today:");
        System.out.println("\"" + quotes[index] + "\"");

        sc.close();
    }
}