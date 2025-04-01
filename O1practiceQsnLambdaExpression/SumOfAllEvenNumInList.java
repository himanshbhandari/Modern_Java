package O1practiceQsnLambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;

public class SumOfAllEvenNumInList {
    public static void main(String[]args){
        List<Integer>numbers=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        Predicate<Integer>isEven=num->num%2==0;
        var sum=new AtomicInteger(0);
        numbers.forEach(num->{
            if(isEven.test(num))
                sum.addAndGet(num);
        });
        System.out.println(sum);
    }
}
