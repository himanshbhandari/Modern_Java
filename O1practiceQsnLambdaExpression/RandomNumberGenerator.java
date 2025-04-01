package O1practiceQsnLambdaExpression;

import java.util.Random;
import java.util.function.Supplier;

public class RandomNumberGenerator {
    public static void main(String[]args){

        Supplier<Integer>randomNum=()->new Random().nextInt(100);
        System.out.println(randomNum.get());
    }
}
