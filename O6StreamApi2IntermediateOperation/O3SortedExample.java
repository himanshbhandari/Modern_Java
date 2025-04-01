package O6StreamApi2IntermediateOperation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class O3SortedExample {
    public static void main(String[] args) {
        //Use case: Sorting a list of employees by salary, sorting dates, arranging products by price, etc.
        List<String> names= Arrays.asList("mohit", "shyam", "amit", "raman", "Aman","Abhishek");

        names.stream()
                .sorted() //sorted(Comparator<T>) internally use this.
                .forEach(System.out::println);

        List<String>namesDesc=names.stream()
                .sorted((a,b)->b.compareTo(a))
                .collect(Collectors.toList());
        System.out.println(namesDesc);

    }
}
