package JavaDSALearning;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        float num = sc.nextFloat();
//        System.out.println(num);

        int num = (int) (65.85);
        System.out.println(num);
        System.out.println(((Object) num).getClass().getSimpleName());
    }
}
