package O9practiceQsnStreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class O7ArrayElementSumOfSquare {
    public static void main(String[] args) {
        List<Integer>scores= Arrays.asList(2,4,6);
        int sum=scores.stream().reduce(0,(a,b)->a+(b*b));
        System.out.println(sum);

        System.out.println(scores.stream().map(num->num*num).reduce(Integer::sum).get());
    }
}
