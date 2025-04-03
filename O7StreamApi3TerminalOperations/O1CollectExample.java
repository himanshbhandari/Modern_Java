package O7StreamApi3TerminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class O1CollectExample {
    public static void main(String[] args) {
        //Terminal operations in Java end the stream and produce a final result (like a List, Set, Map, sum, count, etc.).
        // Once a terminal operation is applied, the stream cannot be reused.
        Set<Integer> scores= Arrays.asList(100,200, 200, 100,23,1,21).stream().collect(Collectors.toSet());//unique elment
        System.out.println(scores);

        //convert into map
        List<String>names=Arrays.asList("Mohit", "ravi","Aman", "himanshu");
        Map<String , Integer>namesWithLen=names.stream()
                .collect(Collectors.toMap(name->name, String::length));
        System.out.println(namesWithLen);
    }
}
