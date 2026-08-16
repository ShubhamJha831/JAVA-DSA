package functionandmethod;

import java.util.Scanner;

public class NumberAnalyzer {

    static int reverseNumber(int number) {
        int reverse = 0;

        while (number != 0) {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }

        return reverse;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int reverse = reverseNumber(number);

        if (number == reverse) {
            System.out.println("The number is a Palindrome");
        } else {
            System.out.println("The number is not a Palindrome");
        }

        sc.close();
    }
}