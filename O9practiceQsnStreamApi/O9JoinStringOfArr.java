package O9practiceQsnStreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class O9JoinStringOfArr {
    public static void main(String[] args) {
        List<String> fruits= Arrays.asList("Apple", "ange", "Grapes", "Banana","klj","juiok");
        System.out.println(fruits.stream().collect(Collectors.joining(" , ")));
    }
}
