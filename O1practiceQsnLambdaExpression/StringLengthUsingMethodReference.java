package O1practiceQsnLambdaExpression;

import java.util.function.Function;

public class StringLengthUsingMethodReference {
    public static void main(String[]args){

        Function<String , Integer>strLength = String::length;
        System.out.println(strLength.apply("Tunu"));

    }
}
