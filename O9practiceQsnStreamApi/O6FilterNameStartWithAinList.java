package O9practiceQsnStreamApi;

import java.util.Arrays;
import java.util.List;

public class O6FilterNameStartWithAinList {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Mohan", "Sumit","manisha", "rohit", "himanshu","mohit","mob");
        System.out.println(names.stream().map(String::toLowerCase).filter(name->name.startsWith("m")).toList());
    }
}
