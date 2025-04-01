package O3FunctionalInterfaces;
import java.util.function.BiFunction;

public class O5BIFunctionFunctionalInterface {
    public static void main(String[]args){

        //BiFunction take two input and return one output
        BiFunction<Integer, Integer, Integer>sumOfTwoDigits=(a,b)->a+b;
        System.out.println(sumOfTwoDigits.apply(5,6));
    }
}
