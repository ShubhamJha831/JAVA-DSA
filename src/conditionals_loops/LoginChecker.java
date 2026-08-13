package conditionals_loops;

import java.util.Scanner;

public class LoginChecker {
    public static void main(String[] args) {

        // Stored username and password
        String storedUsername = "admin";
        String storedPassword = "1234";

        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        // Check input against stored credentials
        if (username.equals(storedUsername) && password.equals(storedPassword)) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Invalid Username or Password");
        }

        sc.close();
    }
}