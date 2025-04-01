package O1practiceQsnLambdaExpression;

import java.util.function.UnaryOperator;

public class SquareOfNumUsingMethodReference {
    public static int getSquare(int num){
        return num*num;
    }

    public static void main(String[]args){
        UnaryOperator<Integer>square=SquareOfNumUsingMethodReference::getSquare;
        System.out.println(square.apply(3));

        UnaryOperator<String>convertLower=String::toLowerCase;
        System.out.println(convertLower.apply("HIMANSHU"));

    }
}
