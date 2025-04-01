package O3FunctionalInterfaces;
import java.util.function.UnaryOperator;

public class O7UnaryOperatorFunctionalInterface {
    public static void main(String[]args){

        //it take same type input and return same type output it use converting text and transform it and modifying values;
        UnaryOperator<String>convertLowerCase=str->str.toLowerCase();
        System.out.println(convertLowerCase.apply("HIMANSHU"));
    }
}
