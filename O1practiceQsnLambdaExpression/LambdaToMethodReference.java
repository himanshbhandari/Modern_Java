package O1practiceQsnLambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaToMethodReference {

    public static void main(String[]args){
        Consumer<String>printMsg=System.out::println;
        printMsg.accept("hey");

        List<String> names=new ArrayList<>(Arrays.asList("raman", "mohit", "sachin"));
        names.replaceAll(name-> name.toUpperCase());
        System.out.println(names);
    }
}
