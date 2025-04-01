package O6StreamApi2IntermediateOperation;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class O2MapExample {
    public static void main(String[] args) {
        Set<Integer>numSet=Set.of(2,3,1,5,6);

        //The map() function is used to transform each element in a stream. It applies a function and returns a new stream with modified data.
        // Use case: Useful for transforming data like converting currency, changing case, extracting part of data, etc.
        Set<Integer>sqSet=numSet.stream()
                            .map(num->num*num) //map(Function<T,R>) use this internally
                            .collect(Collectors.toSet());
        System.out.println(sqSet);

        List<String>names= Arrays.asList("mohit", "shyam", "amit", "raman", "Aman","Abhishek");
        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        List<String>namesWithA=names.stream()
                .map(String::toUpperCase)
                .filter(name->name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.print(namesWithA);
    }
}
