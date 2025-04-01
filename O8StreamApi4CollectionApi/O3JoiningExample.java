package O8StreamApi4CollectionApi;

import java.util.Arrays;
import java.util.stream.Collectors;

public class O3JoiningExample {
    public static void main(String[] args) {
        //Convert a List of Strings into a Single String
        //This method is used to join strings with or without a separator.
        //Joining(Function<T, R>) use function interface internally
        //T → Input type (Stream element).
        //✔ R → Output type (Converted string representation).
        String names= Arrays.asList("my", "name", "is", "himanshu").stream()
                .collect(Collectors.joining(" - "));
        System.out.println(names);


        //Joining With prefix and suffix
        String namesWithPredAndSuf=Arrays.asList("my", "name", "is", "himanshu").stream()
                .collect(Collectors.joining(", ","[","]"));
        System.out.println(namesWithPredAndSuf);
    }
}
