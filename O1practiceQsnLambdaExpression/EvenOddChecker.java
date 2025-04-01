package O1practiceQsnLambdaExpression;

import java.util.function.Function;

public class EvenOddChecker {
    public static void main(String[]args){

        Function<Integer, Boolean>checkOddOrEven=num -> num%2==0;
        System.out.println(checkOddOrEven.apply(5));

        Function<Integer,Integer>squareOfNumber = num -> num*num;
        System.out.println(squareOfNumber.apply(5));
    }
}
