package O7StreamApi3TerminalOperations;

import java.util.Arrays;
import java.util.List;

public class O2CountExample {
    public static void main(String[] args) {
        //count-count the element of stream
        List<String> names= Arrays.asList("Mohit", "ravi","Aman", "himanshu");
        long totalCount=names.stream().count();
        System.out.println(totalCount);

        List<Integer>numbers=Arrays.asList(1,2,5,4,65,22,32,89);
        long evenNumbs=numbers.stream().filter(num->num%2==0).count();
        System.out.println(evenNumbs);

    }
}
