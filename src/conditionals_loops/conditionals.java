package conditionals_loops;

public class conditionals {
    public static void main(String[] args) {
        /*
            if(boolean experations){
                //body   *you can write any thing here like return or you can also print the output
            } else{
                //body *or suppose your if statement is encorrect then this condition run and in this body also you can return and print the output
            }
        */
        int salary = 35840;
//        if(salary > 10000){
//            salary = salary + 2000;
//        }else{
//            salary = salary + 1000;
//        }
//        System.out.println(salary);

        if (salary > 20000) {
            salary += 3000;
        }
        else if (salary > 10000) {
            salary += 2000;
        }
        else {
            salary += 1000;
        }

        System.out.println(salary);
    }
}
                                           