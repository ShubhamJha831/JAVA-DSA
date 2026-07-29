package conditionals_loops;

public class Reversenims {
    public static void main() {
        int num = 12345678;

        int ans = 0;

        while(num > 0){
            int rem = num % 10;
            num /= 10;

            ans = ans * 10 + rem;
        }

        System.out.println(ans);
    }
}
