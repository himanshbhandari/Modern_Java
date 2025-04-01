package O3FunctionalInterfaces;

import java.util.function.Function;

public class O4FunctionFunctionalInterface {

    public static void main(String []args){

        //it take T data type input and return R type output
        //Use case: When you want to transform one type of data into another (e.g., converting a name to uppercase).
        // Parsing a string to an integer, formatting text, applying transformations.
        Function<String , Integer> getStrLength=str -> str.length();
        System.out.println(getStrLength.apply("Himanshu"));

        Function<String , String> convertUpperCase=str -> str.toUpperCase();
        System.out.println(convertUpperCase.apply("bhandari"));
    }
}
