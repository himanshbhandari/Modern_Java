package O1practiceQsnLambdaExpression;

import java.util.function.BinaryOperator;

public class StringConcatination {

    public static void main(String[]args){
        String firstName="Himanshu";
        String lastName="Bhandari";
        BinaryOperator<String>concatinateName=(a,b)->a+"_"+b;
        System.out.println(concatinateName.apply(firstName, lastName));
    }
}
