package conditionals_loops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //taking input from the user till user press 'X' or 'x' (means we will run infinite while loop and when user press x or x then program will end autometically)

        int ans = 0;
        while(true){
            //take the operator as input
            System.out.println("Enter the operator: ");
            char op = sc.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '/' || op == '*' || op == '%'){
                //input two numbers
                System.out.println("Enter two numbers: ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                if (op == '+'){
                    ans = num1 + num2;
                }
                if(op == '-'){
                    ans = num1 - num2;
                }
                if(op == '*'){
                    ans = num1 * num2;
                }
                if(op == '%'){
                    ans = num1 % num2;
                }
                if(op == '/'){
                    if(num2 != 0){
                        ans = num1 / num2;
                    }
                }

            } else if (op == 'x' || op == 'X') {
                break;
            }else{
                System.out.println("Invalid Operators!");
            }
            System.out.println(ans);
        }

    }
}
