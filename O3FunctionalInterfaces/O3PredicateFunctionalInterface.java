package O3FunctionalInterfaces;
import java.util.function.Predicate;

public class O3PredicateFunctionalInterface {

    public static void main(String[]args){

        //it take input of any type but return only boolean value
        //🚀 Real-world Example: Filtering a list, validating input fields, checking conditions.
        Predicate<Integer>isEven=num->num%2==0;
        System.out.println(isEven.test(4));

    }
}
