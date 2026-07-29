package conditionals_loops;

import java.util.Scanner;

public class largestnumber {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        // Q find the largest of the three numbers

// This is good way to do this but not good for logical thinking (like if we write this code on platform like leetcode then it take more time to fatch so that this is not good practice)
//        System.out.print("Enter your first number: ");
//        int A = sc.nextInt();
//
//        System.out.print("Enter your Second number: ");
//        int B = sc.nextInt();
//
//        System.out.print("Enter your third number: ");
//        int C = sc.nextInt();
//
//        if ( A > B && A > C){
//            System.out.println("A is the largest number: " + A);
//        } else if ( B > A && B > C) {
//            System.out.println("B is the largest number: " + B);
//        }else{
//            System.out.println("C is the largest number: " + C);
//        }

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

//        int max = A;
//        if(B > max){
//            max = B;
//        }
//        if(C > max){
//            max = C;
//        }

        // another way of doing this.

        int max = Math.max(C, Math.max(A, B));

        System.out.println(max);
    }
}
