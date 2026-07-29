package conditionals_loops;

import java.util.Scanner;

public class conditionLoops {
    public static void main() {
        //Q:- print numbers from i to 5;
        Scanner sc = new Scanner(System.in);
////        for (int i = 0; i <= 5; i++){
////            System.out.println(i);
//          }

//        int i = 1;
//        while(i <= 5){
//            System.out.println(i);
//            i++;
//        }

        int i = 1;
        do {
            System.out.println(i);
            i++;
        }while(i <= 5);

    }
}
