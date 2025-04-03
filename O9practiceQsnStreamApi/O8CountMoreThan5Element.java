package O9practiceQsnStreamApi;

import java.util.Arrays;
import java.util.List;

public class O8CountMoreThan5Element {
    public static void main(String[] args) {
        List<String>fruits= Arrays.asList("Apple", "ange", "Grapes", "Banana","klj","juiok");
        System.out.println(fruits.stream().filter(fruit->fruit.length()>=5).count());
    }
}
