package O1practiceQsnLambdaExpression;

import java.util.function.BinaryOperator;

public class FindMaxOfTwoNumbers {
    public static void main(String[]args){
        BinaryOperator<Integer>maxOfTwo=(a,b)->Math.max(a, b);
        System.out.println(maxOfTwo.apply(4,7));
    }
}
