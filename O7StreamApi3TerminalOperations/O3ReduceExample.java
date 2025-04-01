package O7StreamApi3TerminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class O3ReduceExample {
    public static void main(String[] args) {
        //reduce- Perform Aggregation (sum, max, min, avg)
        //reduce internally use binary opeartor reduce(BinaryOprator<T>);

        //Find array sum using reduce->
        //normal way
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println(sum);
        //using reduce->
        int sumOfList = Arrays.asList(1, 2, 3, 4, 5)
                .stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println(sum);

        //greater element using normal way->
        int[] numbersArr = {3, 7, 1, 9, 5};
        int max = Integer.MIN_VALUE;
        for (int num : numbersArr) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println(max);
        //using reduce->
        int GreaterNumber=Arrays.asList(4,2,23,45,6,7).stream()
                .reduce(Integer.MIN_VALUE, (a, b)->a>b?a:b);
        System.out.println(GreaterNumber);

        double avg=Arrays.asList(1, 2, 3, 4, 5)
                .stream()
                        .mapToInt(Integer::intValue)
                                .average()
                                        .orElse(0);
        System.out.println(avg);

    }
}
