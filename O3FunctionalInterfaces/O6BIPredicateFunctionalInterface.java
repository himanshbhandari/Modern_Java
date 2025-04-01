package O3FunctionalInterfaces;
import java.util.function.BiPredicate;

public class O6BIPredicateFunctionalInterface {
    public static void main(String[]args){

        //BiPredicate two T type input and return Boolean value as output;
        BiPredicate<Integer, Integer>isBothNumEqual=(a, b)-> a==b;
        System.out.println(isBothNumEqual.test(10,10));
    }
}
