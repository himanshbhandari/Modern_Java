package O1practiceQsnLambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class DoubleListUsingUnaryOperator {
    public static void main(String[]args){
        UnaryOperator<Integer>doubleValue=(num)->num*num;
        List<Integer> scores= Arrays.asList(5,2,3,6,1);
       scores.replaceAll(doubleValue);
        System.out.println(scores);
    }
}
