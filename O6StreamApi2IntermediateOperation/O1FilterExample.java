package O6StreamApi2IntermediateOperation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class O1FilterExample {
    public static void main(String ...args){
        List<Integer>scores= Arrays.asList(3,5,1,0,23,2,7,10,8);
        //The filter() method is used to select specific elements from a collection based on a condition.
        List<Integer>evenNum=scores.stream()
                                    .filter(num->num%2==0)//Filter(Predicate<T>) Filter internally used predicate
                                    .collect(Collectors.toList());
        System.out.println(evenNum);

        List<String>names=Arrays.asList("Aman", "mohit","sobam", "amit", "rahul", "Akash");
        names.stream()
                .filter(name->name.startsWith("A"))
                .forEach(System.out::println);

    }
}
