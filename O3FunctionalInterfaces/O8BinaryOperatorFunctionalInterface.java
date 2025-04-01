package O3FunctionalInterfaces;

import java.util.function.BinaryOperator;

public class O8BinaryOperatorFunctionalInterface {
    public static void main(String[]args){
        //it take two input and return one output but all threes data type should be same it use for combining same type data.
        BinaryOperator<Integer>multiply=(a, b)->a*b;
        System.out.println(multiply.apply(5,4));
    }
}
