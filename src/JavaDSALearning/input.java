package JavaDSALearning;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter your name: ");
//        String name = sc.nextLine();
//
//        System.out.println("Hello, how are you " + name + "?");
        System.out.print("Enter your Roll Number: ");
        int rollNo = sc.nextInt();
        System.out.println("Your roll NUMBER IS " + rollNo);

        sc.close();
    }
}
