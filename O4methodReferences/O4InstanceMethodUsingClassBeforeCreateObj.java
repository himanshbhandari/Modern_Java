package O4methodReferences;

import java.util.function.BiFunction;
import java.util.function.Function;

class MathUtil{
    public int multiple(int a ){
        return a*a;
    }
}

public class O4InstanceMethodUsingClassBeforeCreateObj {
    public static void main(String []args){

        BiFunction<MathUtil, Integer, Integer> getMultiply = MathUtil::multiple;
        MathUtil mathUtil=new MathUtil();
        int result = getMultiply.apply(mathUtil, 3);
        System.out.println("Multiplication Result: " + result); // Output: 15
    }
}
