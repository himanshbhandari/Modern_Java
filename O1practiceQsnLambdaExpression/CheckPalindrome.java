package O1practiceQsnLambdaExpression;

import java.util.function.BiFunction;
import java.util.function.Predicate;

public class CheckPalindrome {

    public static void main(String[]args){

        Predicate<String>isPalindrome=str->new StringBuilder(str).toString().equals(new StringBuilder(str).reverse().toString());
        System.out.println(isPalindrome.test("abba"));
        System.out.println(isPalindrome.test("aman"));

        BiFunction<Integer, Integer, Integer>sumOfTwoDigit=(a,b)->a+b;
        System.out.println(sumOfTwoDigit.apply(5,4));

    }
}
