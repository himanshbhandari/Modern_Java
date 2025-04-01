package O1practiceQsnLambdaExpression;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class SortOfListUsingMethodReference {
    public static void main(String[]args){
        List<String>players= Arrays.asList("mohit", "ravi", "aman","suman");
        Consumer<List> sortArr= Collections::sort;
        sortArr.accept(players);
        System.out.println(players);
    }
}
