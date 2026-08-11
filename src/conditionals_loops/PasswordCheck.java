package conditionals_loops;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctPassword = "12345";

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if (password.equals(correctPassword)) {
            System.out.println("Password is correct!");
        } else {
            System.out.println("Wrong password!");
        }

        sc.close();
    }
}