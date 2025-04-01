package O1practiceQsnLambdaExpression;

import java.util.function.Predicate;

public class isGreaterThan50UsingPredicate {
    public static void main(String[]args){

        Predicate<Integer>isGreaterThanFifty=num->num>50;
        System.out.println(isGreaterThanFifty.test(56));
        System.out.println(isGreaterThanFifty.test(45));

    }
}
