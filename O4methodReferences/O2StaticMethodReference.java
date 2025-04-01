package O4methodReferences;

import java.util.function.Function;
import java.util.function.UnaryOperator;

class MathOperation{

    public static int cube(int a){
        return a * a* a;
    }
}
public class O2StaticMethodReference {
    public static void main(String[]args){

        Function<Integer , Integer> getCube=MathOperation::cube;
        System.out.println(getCube.apply(5));

        UnaryOperator<Integer> getCube2=MathOperation::cube;
        System.out.println(getCube2.apply(3));
    }

}
